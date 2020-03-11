package com.akademiakodu.hrapp.service;

import com.akademiakodu.hrapp.model.Employee;
import com.akademiakodu.hrapp.model.Position;
import com.akademiakodu.hrapp.repository.EducationRepository;
import com.akademiakodu.hrapp.repository.EmployeeRepository;
import com.akademiakodu.hrapp.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionServiceImpl implements PositionService {

    private PositionRepository positionRepository;
    public Position findByName(String name){
        return positionRepository.findByName(name);
    }

    @Autowired
    public PositionServiceImpl(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;

    }

    public PositionRepository getPositionRepository() {
        return positionRepository;
    }

    public void setPositionRepository(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }

    @Override
    public Position save(Position position) {
        return positionRepository.save(position);
    }

    @Override
    public void delete(Position entity) {

    }

    @Override
    public Employee findBySurname(String Surname) {
        return null;
    }
}
