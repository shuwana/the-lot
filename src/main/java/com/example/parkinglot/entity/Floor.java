package com.example.parkinglot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Floor {

    @Id
    private Long floorId;

    private int name;
}
