package com.springtrainings.drugapp.controller;

public class Drug {

	private String title;
	private double amount;
	private boolean popular;
	private String description;
	
	
	
	public Drug(String title, double amount, boolean popular, String description) {
		this.title = title;
		this.amount = amount;
		this.popular = popular;
		this.description = description;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public boolean isPopular() {
		return popular;
	}
	public void setPopular(boolean popular) {
		this.popular = popular;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
