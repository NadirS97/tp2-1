package jeu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServicePileFaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicePileFaceApplication.class, args);
    }

}
