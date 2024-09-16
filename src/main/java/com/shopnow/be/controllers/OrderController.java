package com.shopnow.be.controllers;

import com.shopnow.be.domain.OrderItem;
import com.shopnow.be.dto.order.OrderListDto;
import com.shopnow.be.dto.order.OrderItemDto;
import com.shopnow.be.services.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RequestMapping("/api/v1/orders")
@RestController
public class OrderController {

    private final OrderService orderService;

    @GetMapping
    public List<OrderListDto> getAllProducts() {
        return null;
//        return List.of(new OrderListDto(List.of(new OrderItemDto("1", 1, 100L), new OrderItemDto("2", 2, 200L))));
    }

    @PostMapping
    public OrderListDto createOrder(@RequestBody OrderListDto orderList) {
        return orderService.createOrder(orderList);
    }
}
