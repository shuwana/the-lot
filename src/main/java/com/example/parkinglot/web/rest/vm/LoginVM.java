package com.example.parkinglot.web.rest.vm;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record LoginVM(

        @NotNull
        @Size(min = 1, max = 50)
        String username,

        @NotNull
        @Size(min = 4, max = 100)
        String password,

        boolean rememberMe) {
}
