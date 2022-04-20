package com.bnt.project1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bnt.project1.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
