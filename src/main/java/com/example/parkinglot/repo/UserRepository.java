package com.example.parkinglot.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.parkinglot.entity.User;

public interface UserRepository
        extends CrudRepository<User, Long> {

}
