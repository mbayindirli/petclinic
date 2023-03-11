package com.app.petclinic.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Configuration
public class PetclinicConfiguration {
    @Autowired
    PetclinicProperties petclinicProperties;
    //uygulama ayağa kalkarken calış
    @PostConstruct
    public void init() throws Exception {
        System.out.println("Inıt Metot PostConstruct : " + petclinicProperties.isDisplayOwnerWithPet());
    }
//uygulama kill edilirken yani stop olduğunda çalış
    @PreDestroy
    public void preinit() throws Exception {
        System.out.println("Spring Konteyner Durdu ve preinit metodu çalıştı"+petclinicProperties.isDisplayOwnerWithPet());
    }

}
