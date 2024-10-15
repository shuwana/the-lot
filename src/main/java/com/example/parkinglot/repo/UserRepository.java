package com.example.parkinglot.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.parkinglot.entity.Users;

public interface UserRepository
        extends CrudRepository<Users, Long> {

}
