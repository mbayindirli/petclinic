package com.app.petclinic.service;

import com.app.petclinic.model.Owner;

import java.util.List;

public interface OwnerService {
    Owner findById(Long id);
    Owner createOwner(Owner owner);
    Owner updateOwner(Owner owner);
    List<Owner> findByLastName (String lastName);
    void deleteOwner(Long id);

}
