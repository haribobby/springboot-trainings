package com.springtrainings.drugapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.springtrainings.drugapp.model.Drug;

@Repository
public interface DrugRepository extends MongoRepository<Drug, String>{

}
