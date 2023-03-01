package cn.study.order.web;

import cn.study.order.entity.Order;
import cn.study.order.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author dinny-xu
 * @Date 2022/9/15
 * @Time 3:33 下午
 */
@RestController
@RequestMapping("order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }


    /**
     * step1: 创建订单
     * @param order
     * @return
     */
    @PostMapping
    public ResponseEntity<Long> createOrder(Order order){
        Long orderId = orderService.create(order);
        return ResponseEntity.status(HttpStatus.CREATED).body(orderId);
    }
}
