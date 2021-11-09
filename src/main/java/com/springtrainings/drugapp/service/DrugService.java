package com.springtrainings.drugapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.springtrainings.drugapp.exception.DrugNotFoudException;
import com.springtrainings.drugapp.model.Drug;
import com.springtrainings.drugapp.repository.DrugRepository;


@Service
public class DrugService { // BL 

	
	@Autowired
	DrugRepository drugRepository;
	

	
	public List<Drug> getAllDrugs() {

//		List<Drug> list = new ArrayList<>();
//		Drug d1 = new Drug("Amaoxilin", 10.5, true, "desc11");
//		Drug d2 = new Drug("VitaminD3", 13.5, false, "desc21");
//
//		list.add(d1);
//		list.add(d2);
		
//		BPEDRUG API
	
		
		List<Drug> drugList = drugRepository.findAll();
	
	
		return drugList;
	}
	
	
	
	public void addDrug(Drug drug)
	{
		drugRepository.save(drug);
		
	}
	
	
	public Drug getDrugByID(String id)
	{
		Optional<Drug> drug =  drugRepository.findById(id);
		
		if(drug.isEmpty())
		{
			throw new DrugNotFoudException("Drug is not avaible for given id "+id);	
			
			//return "Drug is not avaible for given id \"+id"; 200
		}
		
		return drug.get();
	}
	

}
