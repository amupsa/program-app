package com.sapient.aem.ui;

import com.sapient.aem.service.Computer;
import com.sapient.aem.service.ComputerState;

public class ComputerDemo {

	public static void main(String[] args) {
		
		Computer myComputer= new Computer();

		myComputer.setState(ComputerState.ON);
		System.out.println("Computer state: "+ myComputer.getState());
		myComputer.setState(ComputerState.OFF);
		System.out.println("Computer state: "+ myComputer.getState());


		Computer yourComputer= new Computer(ComputerState.HIBERNATE);
		System.out.println("Your computer state: " + yourComputer.getState());

		System.out.println("---------------------------------------");		
		//values() , name() and ordinal() are built-in methods of enums
		for(ComputerState cs : ComputerState.values()) {
			System.out.println(cs.name()+ ","+cs.ordinal());
		}


	}

}
