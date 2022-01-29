package com.medicare.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicare.app.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

	List<Order> findAllByUsername(String name);
}
