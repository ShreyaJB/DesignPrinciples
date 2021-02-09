package com.cts;

public class SamsungNote implements Phone{

	@Override
	public String getPhonePart() {
		
		return "Display";
	}

	@Override
	public double getPartCost() {
		
		return 5000.0;
	}

	
}
