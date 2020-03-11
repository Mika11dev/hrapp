package com.akademiakodu.hrapp.service;

import com.akademiakodu.hrapp.model.Employee;
import com.akademiakodu.hrapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void delete(Employee entity) {
        employeeRepository.delete(entity);

    }

    @Override
    public Employee findBySurname(String Surname) {
        return employeeRepository.findBySurname(Surname);
    }

}
