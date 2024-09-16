package com.shopnow.be.dto.product;

import java.util.List;

public class ProductListDto {
    private List<ProductItemDto> items;

    public ProductListDto(List<ProductItemDto> items) {
        this.items = items;
    }

    public List<ProductItemDto> getItems() {
        return items;
    }

    public void setItems(List<ProductItemDto> items) {
        this.items = items;
    }
}
