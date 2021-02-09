package com.cts;

public class OnePlus implements Phone{

	@Override
	public String getPhonePart() {
		
		return "Display";
	}

	@Override
	public double getPartCost() {
		
		return 5000.0;
	}

}
