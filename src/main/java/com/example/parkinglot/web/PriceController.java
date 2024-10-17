package com.example.parkinglot.web;


import com.example.parkinglot.entity.Price;
import com.example.parkinglot.repo.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/price")
public class PriceController {

    private final PriceRepository priceRepository;

    @Autowired
    public PriceController(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    public List<Price> getAllPrices() {

        return priceRepository.findAll();
    }

    public ResponseEntity<Price> createPrice(@RequestBody Price price) {
        Price savedPrice = priceRepository.save(price);
        return new ResponseEntity<>(savedPrice, HttpStatus.CREATED);
    }

}





