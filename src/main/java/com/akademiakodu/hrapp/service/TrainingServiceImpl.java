package com.akademiakodu.hrapp.service;

import com.akademiakodu.hrapp.model.Employee;
import com.akademiakodu.hrapp.model.Training;
import com.akademiakodu.hrapp.repository.EmployeeRepository;
import com.akademiakodu.hrapp.repository.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainingServiceImpl implements TrainingService {

    private TrainingRepository trainingRepository;

    @Autowired
    public TrainingServiceImpl(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }


    @Override
    public Training save(Training training) {
        return trainingRepository.save(training);
    }

    @Override
    public void delete(Training entity) {
        trainingRepository.delete(entity);

    }

    @Override
    public Training findByName(String name) {
        return trainingRepository.findByName(name);
    }
}
