package com.zemoso.factory;

import com.zemoso.constants.Constant;
import com.zemoso.factory.impl.Car;
import com.zemoso.factory.impl.Engine;
import com.zemoso.factory.impl.LuxuryCar;
import com.zemoso.factory.impl.SportsCar;

public class CarFactory {
	
	public static Car getCar(String type){
		Car car;
		if(type.equals(Constant.LUXURY_CAR)){
			car=new LuxuryCar(new Engine("2400cc"), "BOSE Player");
			return car;
		}
		else if(type.equals(Constant.SPORTS_CAR)){
			car=new SportsCar(new Engine("3200cc"), "0-100MPH/4sec");
			return car;
		}
		else{
			throw new IllegalArgumentException("invalid choice");
		}
	}//method

}
