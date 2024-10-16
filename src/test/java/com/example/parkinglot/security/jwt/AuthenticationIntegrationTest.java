package com.example.parkinglot.security.jwt;

import com.example.parkinglot.config.ApplicationProperties;
import com.example.parkinglot.config.SecurityConfiguration;
import com.example.parkinglot.config.SecurityJwtConfiguration;
import com.example.parkinglot.web.rest.AuthenticateController;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(
    properties = {
        "application.security.authentication.jwt.base64-secret=fd54a45s65fds737b9aafcb3412e07ed99b267f33413274720ddbb7f6c5e64e9f14075f2d7ed041592f0b7657baf8",
        "application.security.authentication.jwt.token-validity-in-seconds=60000",
    },
    classes = {
        ApplicationProperties.class,
        SecurityConfiguration.class,
        SecurityJwtConfiguration.class,
        AuthenticateController.class,
        JwtAuthenticationTestUtils.class,
    }
)
public @interface AuthenticationIntegrationTest {
}
