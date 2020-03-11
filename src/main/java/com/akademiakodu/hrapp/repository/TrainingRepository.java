package com.akademiakodu.hrapp.repository;

import com.akademiakodu.hrapp.model.Education;
import com.akademiakodu.hrapp.model.Training;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingRepository extends CrudRepository<Training, Integer> {

    Training save(Training entity);

    Training findByName(String name);

    Iterable<Training> findAll();

    void delete(Training entity);


}
