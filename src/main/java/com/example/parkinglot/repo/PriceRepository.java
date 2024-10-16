package com.example.parkinglot.repo;

import com.example.parkinglot.entity.Price;
import org.springframework.data.repository.CrudRepository;

public interface PriceRepository
        extends CrudRepository<Price, Double>{
}
