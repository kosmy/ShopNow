package com.shopnow.be.services;

import com.shopnow.be.dto.order.OrderListDto;

public interface OrderService {
    OrderListDto createOrder(OrderListDto orderListDto);
}
