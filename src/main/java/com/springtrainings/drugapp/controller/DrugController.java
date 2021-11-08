package com.springtrainings.drugapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springtrainings.drugapp.service.DrugService;

import lombok.AllArgsConstructor;

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

	}

	@PostMapping(path = "/drugs")
	public List<Drug> postdrugs() {

//		DrugService service = new DrugService();

		System.out.println("Drug Service hash code..... " + service.hashCode());

		List<Drug> list = service.getAllDrugs();
		return list;

	}

}
