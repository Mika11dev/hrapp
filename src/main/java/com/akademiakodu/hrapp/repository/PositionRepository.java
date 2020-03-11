package com.akademiakodu.hrapp.repository;

import com.akademiakodu.hrapp.model.Position;
import com.akademiakodu.hrapp.model.Training;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends CrudRepository<Position, Integer> {

    Position save(Position entity);
    Position findByName(String name);

    Iterable<Position> findAll();

    void delete(Position entity);

}
