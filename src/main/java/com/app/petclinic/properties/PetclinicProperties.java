package com.app.petclinic.properties;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "petclinic")
public class PetclinicProperties {
    private boolean displayOwnerWithPet = false;

    public boolean isDisplayOwnerWithPet() {
        return displayOwnerWithPet;
    }

    public void setDisplayOwnerWithPet(boolean displayOwnerWithPet) {
        this.displayOwnerWithPet = displayOwnerWithPet;
    }
}
