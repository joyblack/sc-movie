package com.joy.movieserviceticketribbonhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableCircuitBreaker
@EnableHystrix
public class MovieServiceTicketRibbonHystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(MovieServiceTicketRibbonHystrixApplication.class, args);
    }
}
