package com.example.parkinglot.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Reservation {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationId;

    private  LocalDateTime startTime;
    private LocalDateTime endTime;
    private Long spotId;
    private Long paymentMethodId;
    private double price;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "payment_Id")
    private PaymentMethod paymentMethod;


}
