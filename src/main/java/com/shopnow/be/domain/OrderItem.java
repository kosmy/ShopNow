package com.shopnow.be.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "order_items")
public class OrderItem {
    @Id
    @GeneratedValue
    private Long id;

    private String productId;
    private Integer quantity;
    private Long price;

    @ManyToOne
    @JoinColumn(name = "order_item_id")
    private Order order;
}
