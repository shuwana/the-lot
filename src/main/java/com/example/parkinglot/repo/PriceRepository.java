package com.example.parkinglot.repo;

import com.example.parkinglot.entity.Price;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PriceRepository
        extends CrudRepository<Price, Double>{
    List<Price> findAll();
}
