package com.sapient.aem.ui;

public class LocalInnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Local Inner class. This class is visible only to this method
				final class Temp{
					public void m1() {
						System.out.println("Local Inner class");
					}
							
				}
				
				Temp temp= new Temp();
				temp.m1();
	}

}
