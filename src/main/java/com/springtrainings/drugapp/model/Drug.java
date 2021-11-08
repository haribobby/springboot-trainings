package com.springtrainings.drugapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("drugs")
public class Drug {

	@Id
	private String id;
	private String title;
	private double amount;
	private boolean popular;
	private String description;
	
}
