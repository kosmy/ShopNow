package com.shopnow.be.dto.category;

public class CategoryItemDto {
    private String id;
    private String name;
    private Integer quantity;

    public CategoryItemDto(String id, String name, Integer quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }
}
