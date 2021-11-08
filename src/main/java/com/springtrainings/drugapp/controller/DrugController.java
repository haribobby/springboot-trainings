package com.springtrainings.drugapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springtrainings.drugapp.model.Drug;
import com.springtrainings.drugapp.service.DrugService;

import lombok.AllArgsConstructor;
import lombok.experimental.Delegate;

@RestController // Deligation logic
@AllArgsConstructor
public class DrugController {

//	@Autowired
//	DrugService service; // filed level  injections


	private final DrugService service;

//	public DrugController(DrugService service) { // Constructor injection
//		this.service = service;
//	}

	@GetMapping
	public String sayHello() {
		
		return "Hi";
	}

	// Deligation/ Connectivity logic
	// http:localhost:9090/drugs
//	@GetMapping(path = "/drugs", produces = MediaType.APPLICATION_XML_VALUE)

	@GetMapping(path = "/drugs")
	public List<Drug> alldrugs() {
		


//		DrugService service = new DrugService();

		System.out.println("Drug Service hash code..... " + service.hashCode());

		List<Drug> list = service.getAllDrugs();
		return list;
		
		// Java to JSON

	}
	
	
	@PostMapping("/drugs")
	public void addDrug(@RequestBody Drug drug)
	{
		//JSON to JAVA
		
		service.addDrug(drug);
		
		
	}
	
	
//	add drug   - POST - DONE
//	get drug by id - GET
//	delete drug by id - DELETE
//  update Drug	- PUT/PATCH


//	@PostMapping(path = "/drugs")
//	public List<Drug> postdrugs() {
//
////		DrugService service = new DrugService();
//
//		System.out.println("Drug Service hash code..... " + service.hashCode());
//
//		List<Drug> list = service.getAllDrugs();
//		return list;
//
//	}

}
