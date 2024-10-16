package com.example.parkinglot.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Floor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long floorId;

    private int name;

    @OneToMany(mappedBy = "floor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Spot> spots;
}
