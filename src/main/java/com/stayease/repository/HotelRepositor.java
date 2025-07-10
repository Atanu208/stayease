package com.stayease.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.stayease.model.Hotel;

public interface HotelRepositor extends JpaRepository<Hotel,Long> {
    
}
