package com.shopnow.be.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue
    private Long id;

//    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    @OneToMany(mappedBy = "order")
    private List<OrderItem> items;
}
