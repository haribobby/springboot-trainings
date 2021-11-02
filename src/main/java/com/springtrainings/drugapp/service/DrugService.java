package com.springtrainings.drugapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springtrainings.drugapp.controller.Drug;


@Service
public class DrugService { // BL +PL

	
	
	
	public List<Drug> getAllDrugs() {

		List<Drug> list = new ArrayList<>();
		Drug d1 = new Drug("Amaoxilin", 10.5, true, "desc1");
		Drug d2 = new Drug("VitaminD1", 13.5, false, "desc2");

		list.add(d1);
		list.add(d2);

		return list;
	}
}
