package com.example.parkinglot;

import com.example.parkinglot.config.ApplicationProperties;
import com.example.parkinglot.entity.Car;
import com.example.parkinglot.entity.User;
import com.example.parkinglot.enums.Role;
import com.example.parkinglot.repo.CarRepository;
import com.example.parkinglot.repo.UserRepository;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Optional;

@SpringBootApplication
@EnableConfigurationProperties({ ApplicationProperties.class })
public class ParkinglotApplication {
    public ParkinglotApplication() {
    }

	private static final Logger LOG = LoggerFactory.getLogger(ParkinglotApplication.class);

	public static void main(String[] args) {
		Environment env = SpringApplication.run(ParkinglotApplication.class, args).getEnvironment();
		logApplicationStartup(env);
	}

	private static void logApplicationStartup(Environment env) {
		String protocol = Optional.ofNullable(env.getProperty("server.ssl.key-store")).map(key -> "https").orElse("http");
		String applicationName = env.getProperty("spring.application.name");
		String serverPort = env.getProperty("server.port");
		String contextPath = Optional.ofNullable(env.getProperty("server.servlet.context-path"))
				.filter(StringUtils::isNotBlank)
				.orElse("/");
		String hostAddress = "localhost";
		try {
			hostAddress = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			LOG.warn("The host name could not be determined, using `localhost` as fallback");
		}
		LOG.info(
				"""
    
                ----------------------------------------------------------
                \tApplication '{}' is running! Access URLs:
                \tLocal: \t\t{}://localhost:{}{}
                \tExternal: \t{}://{}:{}{}
                \tProfile(s): \t{}
                ----------------------------------------------------------""",
				applicationName,
				protocol,
				serverPort,
				contextPath,
				protocol,
				hostAddress,
				serverPort,
				contextPath,
				env.getActiveProfiles().length == 0 ? env.getDefaultProfiles() : env.getActiveProfiles()
		);
	}

//    @Bean
//    public CommandLineRunner dataLoader(final UserRepository repo, final CarRepository carRepository) {
//        return new CommandLineRunner() {
//            public void run(String... args) throws Exception {
//
////                User user = new User("Marcin", "Szoska", "marszos", "1234455", "mszoska@gmail.com", Role.USER);
////
////
////
////                Car car1 = new Car();
////                car1.setModel("Tesla");
////                car1.setMake("Model S");
////                car1.setColor("Black");
////                car1.setRegistration("ABC123");
////                car1.setUser(user);
////
////                Car car2 = new Car();
////                car2.setModel("Toyota");
////                car2.setMake("Corolla");
////                car2.setColor("White");
////                car2.setRegistration("XYZ789");
////                car2.setUser(user);
////
////                repo.save(user);
////                carRepository.saveAll(Arrays.asList(car1, car2));
//            }
//        };
//    }
}
