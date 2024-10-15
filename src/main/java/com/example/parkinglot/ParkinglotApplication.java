package com.example.parkinglot;

import com.example.parkinglot.entity.Users;
import com.example.parkinglot.repo.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ParkinglotApplication {
    public ParkinglotApplication() {
    }

	public static void main(String[] args) {
		SpringApplication.run(ParkinglotApplication.class, args);
	}

    @Bean
    public CommandLineRunner dataLoader(final UserRepository repo) {
        return new CommandLineRunner() {
            public void run(String... args) throws Exception {
                repo.save(new Users("marcin", "szoska", "marszos", "1234455", "mszoska@gmail.com", "User"));
            }
        };
    }
}
