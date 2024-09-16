package com.shopnow.be.repositories;

import com.shopnow.be.domain.Order;
import com.shopnow.be.domain.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
