package com.example.parkinglot.web.rest.errors;

import java.net.URI;

public final class ErrorConstants {

    public static final String ERR_CONCURRENCY_FAILURE = "error.concurrencyFailure";
    public static final String ERR_VALIDATION = "error.validation";
    public static final URI DEFAULT_TYPE = URI.create("/problem-with-message");
    public static final URI CONSTRAINT_VIOLATION_TYPE = URI.create("/constraint-violation");
    public static final URI INVALID_PASSWORD_TYPE = URI.create("/invalid-password");
    public static final URI EMAIL_ALREADY_USED_TYPE = URI.create("/email-already-used");
    public static final URI LOGIN_ALREADY_USED_TYPE = URI.create("/login-already-used");

    private ErrorConstants() {}
}
