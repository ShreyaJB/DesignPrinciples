package com.cts;

public class MainClient {

	public static void main(String args[]) {
		Phone phone=new OnePlus();
		ProcessPhoneRepair pr=new ProcessPhoneRepair();
		pr.repairSteps(phone);
			
	}
}
