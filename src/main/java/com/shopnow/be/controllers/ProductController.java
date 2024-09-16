package com.shopnow.be.controllers;

import com.shopnow.be.domain.Product;
import com.shopnow.be.dto.product.ProductItemDto;
import com.shopnow.be.dto.product.ProductListDto;
import com.shopnow.be.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RequestMapping("/api/v1/products")
@RestController
public class ProductController {
    private ProductRepository productRepository;

//    public ProductListDto products = new ProductListDto(List.of(new ProductItemDto("1", "Product 1", "category 1"), new ProductItemDto("2", "Product 2", "category 2"), new ProductItemDto("3", "Product 3", "category 3")));

    @GetMapping
    public ProductListDto getAllProducts() {
        return null;
    }

    @GetMapping("/{id}")
    public ProductItemDto getProductById(@PathVariable String id) {
//        Optional<ProductItemDto> product = products.getItems().stream().filter(item -> item.getId().equals(id)).findFirst();

//        return product.orElse(null);
        return null;
    }

    @PostMapping
    public ProductListDto createProduct(@RequestBody ProductItemDto productDto) {
        var product = Product.builder().name(productDto.getName()).build();
        productRepository.save(product);

//        List<ProductItemDto> allProducts = this.products.getItems();
//
//        allProducts.add(productDto);
//        this.products.setItems(allProducts);
//        return this.products;
        return null;

    }
}

// GET
// products
// categories
// order items
// order

// categoryId in product

// validation
// query

// body
// exceptions (Spring web)

// Lombok add to project


// DB tasks: get product list

// endpoints: order by id; all orders; getAllProducts
