package com.akademiakodu.hrapp.repository;

import com.akademiakodu.hrapp.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    Employee save(Employee entity); // INSERT INTO EMPLOYEE LUB UPLOAD EMPLOYEE

     // SELECT * FROM EMPLOYEE WHERE ID = ?
    Employee findBySurname(String primaryKey); // SELECT * FROM EMPLOYEE WHERE NAME = ?

    Iterable<Employee> findAll(); // SELECT * FROM EMPLOYEE

    void delete(Employee entity); // DELETE FROM EMPLOYEE WHERE =?

    }
