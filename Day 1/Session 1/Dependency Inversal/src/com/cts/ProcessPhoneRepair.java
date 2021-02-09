package com.cts;

public class ProcessPhoneRepair {

	public void repairSteps(Phone phone) {
		
		String part=phone.getPhonePart();
		System.out.println("Repaired: "+part);
		
		double cost=phone.getPartCost();
		System.out.println("Repair Cost: "+cost);
	}
}
