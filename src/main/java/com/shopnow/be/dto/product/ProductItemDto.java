package com.shopnow.be.dto.product;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductItemDto {
    private String id;

    private String name;

    private String categoryId;
}