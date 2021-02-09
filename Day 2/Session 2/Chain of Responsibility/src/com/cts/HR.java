package com.cts;

public class HR implements LeaveRequestHandler{

	LeaveRequestHandler nextHandler;
	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		if(leaveRequest.getLeaveDays()>5) {
			System.out.println("HR approved "+leaveRequest.getLeaveDays()+" days leave for Employee: "
					+leaveRequest.getEmployeeName());
		}
		else {
			this.nextHandler.handleRequest(leaveRequest);
		}
		
	}

}
