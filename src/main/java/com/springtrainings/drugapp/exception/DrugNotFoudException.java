package com.springtrainings.drugapp.exception;

public class DrugNotFoudException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8845433152289015979L;
	
	public DrugNotFoudException()
	{
		super();
	}
	
	
	public DrugNotFoudException(String message)
	{
		super(message);
	}
	
	

}
