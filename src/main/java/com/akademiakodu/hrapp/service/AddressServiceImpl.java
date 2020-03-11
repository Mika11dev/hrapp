package com.akademiakodu.hrapp.service;

import com.akademiakodu.hrapp.model.Address;
import com.akademiakodu.hrapp.repository.AddressRepository;
import com.akademiakodu.hrapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    private AddressRepository addressRepository;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public AddressRepository getAddressRepository() {
        return addressRepository;
    }

    @Override
    public Address save(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public void delete(Address entity) {
        addressRepository.delete(entity);
    }

    @Override
    public Address findByCity(String City) {
        return addressRepository.findByCity(City);
    }
}




