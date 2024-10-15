package com.example.parkinglot;
import com.example.parkinglot.enums.Role;
import com.example.parkinglot.entity.Car;
import com.example.parkinglot.entity.User;
import com.example.parkinglot.repo.CarRepository;
import com.example.parkinglot.repo.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class ParkinglotApplication {
    public ParkinglotApplication() {
    }

	public static void main(String[] args) {
		SpringApplication.run(ParkinglotApplication.class, args);
	}

    @Bean
    public CommandLineRunner dataLoader(final UserRepository repo, final CarRepository carRepository) {
        return new CommandLineRunner() {
            public void run(String... args) throws Exception {

                User user = new User("Marcin", "Szoska", "marszos", "1234455", "mszoska@gmail.com", Role.USER);



                Car car1 = new Car();
                car1.setModel("Tesla");
                car1.setMake("Model S");
                car1.setColor("Black");
                car1.setRegistration("ABC123");
                car1.setUser(user);

                Car car2 = new Car();
                car2.setModel("Toyota");
                car2.setMake("Corolla");
                car2.setColor("White");
                car2.setRegistration("XYZ789");
                car2.setUser(user);

                repo.save(user);
                carRepository.saveAll(Arrays.asList(car1, car2));
            }
        };
    }
}
