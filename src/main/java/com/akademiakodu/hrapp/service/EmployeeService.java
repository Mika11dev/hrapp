package com.akademiakodu.hrapp.service;

import com.akademiakodu.hrapp.model.Employee;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {

    Employee save(Employee employee);
    void delete(Employee entity);

    Employee findBySurname(String Surname);


}
