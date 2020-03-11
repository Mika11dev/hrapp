package com.akademiakodu.hrapp.rest;


import com.akademiakodu.hrapp.model.Address;
import com.akademiakodu.hrapp.repository.EducationRepository;
import com.akademiakodu.hrapp.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressController {

    private AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @RequestMapping(value = "/address/{city}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Address findByCity(@PathVariable("city") String City){
        return addressService.findByCity(City);
    }

    @RequestMapping(value = "/address", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public Address createAddress(Address address){
        return addressService.save(address);
    }
}
