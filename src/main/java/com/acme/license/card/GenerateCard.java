package com.acme.license.card;

public class GenerateCard extends Card {

	private final static GenerateCard instance = new GenerateCard();
	
	

	public static GenerateCard getInstance(String validita) {
		instance.getAnnoDiValidità();
		return instance;
	}
	
	
	public static GenerateCard getInstance() {
		return instance;
	}


	@Override
	public void genera() {
		
		
	}
}
