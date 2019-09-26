package com.joy.movieserviceticketribbonhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MovieServiceTicketFeignLoggingApplication {
    public static void main(String[] args) {
        SpringApplication.run(MovieServiceTicketFeignLoggingApplication.class, args);
    }
}
