package com.springtrainings.drugapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.springtrainings.drugapp.controller.Drug;


//@Service
//@Component
//@Repository
public class DrugService { // BL +PL

	
	
	
	public List<Drug> getAllDrugs() {

		List<Drug> list = new ArrayList<>();
		Drug d1 = new Drug("Amaoxilin", 10.5, true, "desc11");
		Drug d2 = new Drug("VitaminD3", 13.5, false, "desc21");

		list.add(d1);
		list.add(d2);

		return list;
	}
}
