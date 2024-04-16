package com.tripplanner.discoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TripPlannerDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TripPlannerDiscoveryServiceApplication.class, args);
    }

}
