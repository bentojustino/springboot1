package com.bnt.project1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bnt.project1.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
