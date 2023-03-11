package com.app.petclinic;

import com.app.petclinic.properties.PetclinicProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = PetclinicProperties.class)
public class PetclinicApplication {
    public static void main(String[] args) {
        SpringApplication.run(PetclinicApplication.class, args);
    }
}