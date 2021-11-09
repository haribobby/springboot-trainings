package com.springtrainings.drugapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.springtrainings.drugapp.model.Drug;

@Repository // PL
public interface DrugRepository extends MongoRepository<Drug, String>{

	
}
