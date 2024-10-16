package com.example.parkinglot.repo;

import com.example.parkinglot.entity.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository
        extends CrudRepository<Reservation, Long>{
}


