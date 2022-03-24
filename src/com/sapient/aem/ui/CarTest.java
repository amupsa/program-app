package com.sapient.aem.ui;

import java.util.Arrays;

import com.sapient.aem.service.Car;
import com.sapient.aem.service.CarService;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car cars[]= {
				new Car("BMW","Swift Dezire",8100000.00),
				new Car("RollRoyal","Verna",1100000.00),
				new Car("Toyota","Innova",2450000.00),
				new Car("Audi","Q3",4500000.00)

		};

		try {
			CarService carService = new CarService();

			System.out.println("Car Names exceeding 10 Lakhs...");	
			String[] carNames= carService.getCarNames(cars);					
			Arrays.stream(carNames).forEach(System.out::println);

			double total= carService.sumOfPrices(cars);
			System.out.println("Sum of price of all cars= "+ total);


			double maxPrice= carService.maxPrice(cars);
			System.out.println("Car with maximum price= "+ maxPrice);


		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
