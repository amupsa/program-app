package com.sapient.aem.service;

public class Computer {

private ComputerState state;
	
	public Computer() {
		
	}

	public Computer(ComputerState state) {
		super();
		this.state = state;
	}

	public ComputerState getState() {
		return state;
	}

	public void setState(ComputerState state) {
		this.state = state;
	}
	

}
