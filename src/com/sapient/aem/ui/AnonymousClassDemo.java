package com.sapient.aem.ui;

public class AnonymousClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// An local inner class without class name
				//Anonymous inner class
				(new Object(){
					public void m1() {
						System.out.println("I am anonymous class");
					}
				}).m1();

				// class name is: AnonymousClassDemo$2		
				(new Object(){
					public void m2() {
						System.out.println("I am also anonymous class");
					}
				}).m2();
	}

}
