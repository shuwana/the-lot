package com.example.parkinglot.repo;

import com.example.parkinglot.entity.Car;
import com.example.parkinglot.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long> {

    List<Car> findByUserFirstName(String firstName);

}




