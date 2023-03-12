package com.app.petclinic.dao;

import com.app.petclinic.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository  extends JpaRepository<Pet,Long> {
}
