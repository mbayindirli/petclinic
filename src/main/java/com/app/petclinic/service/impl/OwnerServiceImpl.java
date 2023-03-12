package com.app.petclinic.service.impl;

import com.app.petclinic.dao.OwnerRepository;
import com.app.petclinic.model.Owner;
import com.app.petclinic.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerServiceImpl implements OwnerService {
    @Autowired
    OwnerRepository ownerRepository;
    @Override
    public Owner findById(Long id) {
        return ownerRepository.findById(id).get();
    }

    @Override
    public Owner createOwner(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public Owner updateOwner(Owner owner) {
        return ownerRepository.saveAndFlush(owner);
    }

    @Override
    public List<Owner> findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }
}
