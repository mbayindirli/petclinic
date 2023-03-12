package com.app.petclinic.service;

import com.app.petclinic.model.Owner;

public interface OwnerService {
    Owner findById(Long id);
    Owner createOwner(Owner owner);
}
