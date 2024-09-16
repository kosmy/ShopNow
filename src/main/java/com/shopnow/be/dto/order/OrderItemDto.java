package com.shopnow.be.dto.order;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderItemDto {
    private String productId;
    private Integer quantity;
    private Long price;
    private Long id;
}
