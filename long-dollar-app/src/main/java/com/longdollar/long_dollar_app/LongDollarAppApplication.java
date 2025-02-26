package com.longdollar.long_dollar_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class LongDollarAppApplication {

	public static void main(String[] args) {
                Dotenv dotenv = Dotenv.load();
		SpringApplication.run(LongDollarAppApplication.class, args);
	}

          // This bean runs at startup to check if the app is connected to the database
    @Bean
    public CommandLineRunner checkDatabaseConnection() {
        return args -> {
            System.out.println("Successfully connected to the database!");
        };
    }

}
