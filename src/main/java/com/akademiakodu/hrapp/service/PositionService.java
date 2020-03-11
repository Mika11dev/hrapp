package com.akademiakodu.hrapp.service;

import com.akademiakodu.hrapp.model.Employee;
import com.akademiakodu.hrapp.model.Position;
import org.springframework.stereotype.Service;

@Service
public interface PositionService {

    Position save(Position position);
    void delete(Position entity);
    Position findByName(String name);

    Employee findBySurname(String Surname);
}
