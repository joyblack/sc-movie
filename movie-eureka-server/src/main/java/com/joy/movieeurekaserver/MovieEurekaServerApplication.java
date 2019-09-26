package com.joy.movieeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 声明为eureka server.
 */
@EnableEurekaServer
@SpringBootApplication
public class MovieEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieEurekaServerApplication.class, args);
    }

}
