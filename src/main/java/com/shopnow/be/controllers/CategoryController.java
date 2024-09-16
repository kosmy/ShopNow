package com.shopnow.be.controllers;

import com.shopnow.be.dto.category.CategoryItemDto;
import com.shopnow.be.dto.category.CategoryListDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/api/v1/categories")
@RestController
public class CategoryController {
    @GetMapping
    public List<CategoryListDto> getAllCategories() {
        return List.of(new CategoryListDto(List.of(new CategoryItemDto("1", "category 1", 20), new CategoryItemDto("2", "category 2", 20))));
    }
}
