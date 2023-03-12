package com.app.petclinic.controller;

import com.app.petclinic.model.Owner;
import com.app.petclinic.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OwnerController {
   @Autowired
   OwnerService ownerService;

   @RequestMapping(value="/find-one/{ownerId}",method = RequestMethod.GET)
   public Owner findOwner(@PathVariable Long ownerId) {
        return ownerService.findById(ownerId);
    }

   @RequestMapping(value = "/pcs")
    public String sayHello(){
        return "Welcome to petclinic world";//dispatcher servlet bunu response sayfası olarak algılar
       // bunun önüne gecmek için  @ResponseBody eklenir
    }
    @RequestMapping(value="/create-owner",method = RequestMethod.POST)
    public Owner create(@RequestBody Owner owner){
       return ownerService.createOwner(owner);
    }
}