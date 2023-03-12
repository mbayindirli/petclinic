package com.app.petclinic.controller;

import com.app.petclinic.model.Owner;
import com.app.petclinic.request.OwnerRequest;
import com.app.petclinic.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OwnerController {
   @Autowired
   OwnerService ownerService;

   @RequestMapping(value="/find-one/{ownerId}",method = RequestMethod.GET)
   public Owner findOwner(@PathVariable Long ownerId) {
        return ownerService.findById(ownerId);
    }
    @RequestMapping(value = "/find-by-last-name",method = RequestMethod.GET)
    public List<Owner> findByLastName(@RequestParam("ln") String lastName){
    return ownerService.findByLastName(lastName);
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
    @RequestMapping(value = "/update-owner",method = RequestMethod.PUT)
    public Owner updateOwner(@RequestBody OwnerRequest ownerRequest ){
       Owner owner1=ownerService.findById(ownerRequest.getId());
       owner1.setFirstName(ownerRequest.getFirstName());
       owner1.setLastName(ownerRequest.getLastName());

       return ownerService.updateOwner(owner1);
    }
    @RequestMapping(value = "/delete-owner/{id}",method = RequestMethod.DELETE)
    public void deleteOwner(@PathVariable Long id){
        ownerService.deleteOwner(id);
    }
}