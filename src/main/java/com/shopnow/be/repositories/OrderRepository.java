package com.shopnow.be.repositories;

import com.shopnow.be.domain.Order;
import com.shopnow.be.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

}
