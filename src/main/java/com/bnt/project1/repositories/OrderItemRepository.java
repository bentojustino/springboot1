package com.bnt.project1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bnt.project1.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
}
