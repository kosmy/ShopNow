package com.shopnow.be.dto.category;

import java.util.List;

public class CategoryListDto {
    private List<CategoryItemDto> items;

    public CategoryListDto(List<CategoryItemDto> items) {
        this.items = items;
    }

    public List<CategoryItemDto> getItems() {
        return items;
    }

    public void setItems(List<CategoryItemDto> items) {
        this.items = items;
    }
}
