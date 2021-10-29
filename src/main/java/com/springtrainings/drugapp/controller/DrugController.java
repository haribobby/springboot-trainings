package com.springtrainings.drugapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DrugController {
	
	
	// return all drug names
	
	
	//http:localhost:9090
	@GetMapping
	public String sayHello()
	{
		return "Hi";
	}

	

	//http:localhost:9090/drugs
	@GetMapping("/drugs")
	public List<Drug> alldrugs()
	{
		
		
		
		
//			
//		List<String> list = new ArrayList<>();
//		
//		list.add("Amaoxilin");
//		list.add("Lipitor");
//		list.add("VitaminD");
//		list.add("Tamiflu");
//		
//		System.out.println(list);
//		
//		return list;
		
		List<Drug> list = new ArrayList<>();
		Drug d1 = new Drug("Amaoxilin", 12.5, true, "desc1");
		Drug d2 = new Drug("Amaoxilin2", 13.5, false, "desc2");
		
		list.add(d1);
		list.add(d2);
		
		return list;
		
		
		
		
	}

}
