package com.springtrainings.drugapp.controller;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Drug {

	private String title;
	private double amount;
	private boolean popular;
	private String description;
	
}
