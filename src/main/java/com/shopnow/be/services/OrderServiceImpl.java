package com.shopnow.be.services;

import com.shopnow.be.domain.Order;
import com.shopnow.be.domain.OrderItem;
import com.shopnow.be.dto.order.OrderItemDto;
import com.shopnow.be.dto.order.OrderListDto;
import com.shopnow.be.repositories.OrderItemRepository;
import com.shopnow.be.repositories.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    private final OrderItemRepository orderItemRepository;

    @Override
    public OrderListDto createOrder(OrderListDto orderListDto) {
        var items = orderListDto.getItems().stream()
                .map(item -> OrderItem.builder()
                        .productId(item.getProductId())
                        .price(item.getPrice())
                        .quantity(item.getQuantity())
                        .build())
                .toList();
        var order = Order.builder()
                .items(items)
                .build();
        var persistedOrder = orderRepository.save(order);
        items.forEach(orderItem -> orderItem.setOrder(persistedOrder));

        var persistedItems = orderItemRepository.saveAll(items);

        return OrderListDto.builder()
                .id(persistedOrder.getId())
                .items(persistedItems.stream().map(item -> OrderItemDto.builder()
                                .id(item.getId())
                                .build())
                        .toList())
                .build();
    }
}
