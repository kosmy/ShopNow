package com.shopnow.be.dto.order;

import lombok.*;

import java.util.List;


@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderListDto {
    private Long id;
    private List<OrderItemDto> items;
}
