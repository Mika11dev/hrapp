package com.akademiakodu.hrapp.service;

import com.akademiakodu.hrapp.model.Education;
import com.akademiakodu.hrapp.repository.EducationRepository;
import com.akademiakodu.hrapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationServiceImpl implements EducationService {
    private EducationRepository educationRepository;

    @Autowired
    public EducationServiceImpl(EducationRepository educationRepository) {
        this.educationRepository = educationRepository;
    }

    @Override
    public Education save(Education education) {
        return educationRepository.save(education);
    }

    @Override
    public void delete(Education entity) {
        educationRepository.delete(entity);
    }

    @Override
    public Education findByTitle(String Title) {
        return educationRepository.findByTitle(Title);
    }
}
