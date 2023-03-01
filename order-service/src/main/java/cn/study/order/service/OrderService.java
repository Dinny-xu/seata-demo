package cn.study.order.service;

import cn.study.order.entity.Order;

public interface OrderService {

    /**
     * 创建订单
     * @param order 订单信息
     * @return Long
     */
    Long create(Order order);
}