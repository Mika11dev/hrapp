package com.akademiakodu.hrapp.repository;

import com.akademiakodu.hrapp.model.Education;
import com.akademiakodu.hrapp.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepository extends CrudRepository<Education, Integer> {

    Education save(Education entity);

    Iterable<Education> findAll();

    void delete(Education entity);

    Education findByTitle(String Title);
}
