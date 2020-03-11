package com.akademiakodu.hrapp.rest;

import com.akademiakodu.hrapp.model.Education;
import com.akademiakodu.hrapp.model.Employee;
import com.akademiakodu.hrapp.service.EducationService;
import com.akademiakodu.hrapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping(value = "/employee/{surname}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Employee findBySurname(@PathVariable("surname") String Surname){
        return employeeService.findBySurname(Surname);
    }

    @RequestMapping(value = "/employee", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public Employee createEmployee(Employee employee){
        return employeeService.save(employee);
    }
}
