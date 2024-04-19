package edu.iu.habahram.ducksservice.repository;

import edu.iu.habahram.ducksservice.model.DuckData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DuckRepository extends CrudRepository<DuckData, String> {

    List<DuckData> findAll();

    DuckData findById(int id);

}
