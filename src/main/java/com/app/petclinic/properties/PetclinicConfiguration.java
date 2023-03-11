package com.app.petclinic.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class PetclinicConfiguration {
    @Autowired
    PetclinicProperties petclinicProperties;
    @PostConstruct
    public void init() {
        System.out.println("petclinic pro"+petclinicProperties.isDisplayOwnerWithPet());
    }

}
