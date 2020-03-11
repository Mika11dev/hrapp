package com.akademiakodu.hrapp.service;

import com.akademiakodu.hrapp.model.Address;
import com.akademiakodu.hrapp.model.Employee;
import org.springframework.stereotype.Service;

@Service
public interface AddressService {
    Address save(Address address);
    void delete(Address entity);

    Address findByCity(String city);
}
