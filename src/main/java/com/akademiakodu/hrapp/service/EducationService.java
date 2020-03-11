package com.akademiakodu.hrapp.service;

import com.akademiakodu.hrapp.model.Education;
import com.akademiakodu.hrapp.model.Employee;
import org.springframework.stereotype.Service;

@Service
public interface EducationService {

    Education save(Education education);
    void delete(Education entity);

    Education findByTitle(String Title);
}
