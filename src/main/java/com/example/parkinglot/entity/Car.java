package com.example.parkinglot.entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carID;
    //private Long userId;
    private String model;
    private String make;
    private String color;
    private String registration;

    // Many Cars can belong to one User
    @ManyToOne
    @JoinColumn(name = "user_id") // Foreign key column in Car table
    private User user;

}
