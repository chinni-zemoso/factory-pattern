package com.zemoso.test;

import com.zemoso.constants.Constant;
import com.zemoso.factory.CarFactory;
import com.zemoso.factory.impl.Car;

public class Customer1 {
    
	public static void main(String[] args) {
		Car car=null;
		//CUSTOMER TRYING TO ORDER LUXURY CAR
		car= CarFactory.getCar(Constant.LUXURY_CAR);
		System.out.println("Engine = "+car.getEngine());
		car.drive();

		System.out.println("------------------");
		//CUSTOMER TRYING TO ORDER SPORTS_CAR
		car= CarFactory.getCar(Constant.SPORTS_CAR);
		System.out.println("Engine = "+car.getEngine());
		car.drive();
	}
}
