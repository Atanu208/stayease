package com.stayease.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stayease.model.User;
import java.util.List;


public interface UserRepository extends JpaRepository<User,Long>{

    Optional<User> findByEmail(String email);    
} 
