package com.akademiakodu.hrapp.service;

import com.akademiakodu.hrapp.model.Employee;
import com.akademiakodu.hrapp.model.Training;
import org.springframework.stereotype.Service;

@Service
public interface TrainingService {

    Training save(Training training);
    void delete(Training entity);

    Training findByName(String name);
}
