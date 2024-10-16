package com.example.parkinglot;
import com.example.parkinglot.entity.Reservation;
import com.example.parkinglot.enums.Role;
import com.example.parkinglot.entity.Car;
import com.example.parkinglot.entity.User;
import com.example.parkinglot.repo.CarRepository;
import com.example.parkinglot.repo.ReservationRepository;
import com.example.parkinglot.repo.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.Arrays;

@SpringBootApplication
public class ParkinglotApplication {
    public ParkinglotApplication() {
    }

	public static void main(String[] args) {
		SpringApplication.run(ParkinglotApplication.class, args);
	}

    @Bean
    public CommandLineRunner dataLoader(final UserRepository repo, final CarRepository carRepository, final ReservationRepository reservationRepository) {
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

                Reservation reservation1 = new Reservation();
                reservation1.setStartTime(LocalDateTime.of(2024, 10, 15, 10, 0));  // October 15, 2024, 10:00 AM
                reservation1.setEndTime(LocalDateTime.of(2024, 10, 15, 12, 0));    // October 15, 2024, 12:00 PM
                reservation1.setSpotId(1L);                                       // Example spot ID
                reservation1.setPaymentMethodId(101L);                            // Example payment method ID
                reservation1.setPrice(25.0);                                      // Example price
                reservation1.setUser(user);



                repo.save(user);
                carRepository.saveAll(Arrays.asList(car1, car2));
                reservationRepository.save(reservation1);
            }
        };
    }
}
