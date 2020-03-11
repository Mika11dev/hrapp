package com.akademiakodu.hrapp.repository;

import com.akademiakodu.hrapp.model.Address;
import com.akademiakodu.hrapp.model.Training;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, Integer> {

    Address save(Address entity);

    Iterable<Address> findAll();

    void delete(Address entity);

    Address findByCity(String city);
}
