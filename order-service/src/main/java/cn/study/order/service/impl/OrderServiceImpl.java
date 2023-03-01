package cn.study.order.service.impl;

import cn.study.order.client.AccountClient;
import cn.study.order.client.StorageClient;
import cn.study.order.entity.Order;
import cn.study.order.mapper.OrderMapper;
import cn.study.order.service.OrderService;
import feign.FeignException;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author dinny-xu
 * @Date 2022/9/15
 * @Time 3:32 下午
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    private final AccountClient accountClient;
    private final StorageClient storageClient;
    private final OrderMapper orderMapper;

    public OrderServiceImpl(AccountClient accountClient, StorageClient storageClient, OrderMapper orderMapper) {
        this.accountClient = accountClient;
        this.storageClient = storageClient;
        this.orderMapper = orderMapper;
    }

    @Override
//    @Transactional
    @GlobalTransactional
    public Long create(Order order) {
        // 创建订单
        orderMapper.insert(order);
        try {
            // 扣库存
            storageClient.deduct(order.getCommodityCode(), order.getCount());
            // 扣款
            accountClient.debit(order.getUserId(), order.getMoney());
        } catch (FeignException e) {
            log.error("下单失败，原因:{}", e.contentUTF8());
            throw new RuntimeException(e.contentUTF8());
        }
        return order.getId();
    }
}
