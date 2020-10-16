package com.zemoso.car_factory.test;

import com.zemoso.car_factory.constants.Constant;
import com.zemoso.car_factory.factory.CarFactory;
import com.zemoso.car_factory.factory.impl.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Customer1 {
    private static final Logger logger = LoggerFactory.getLogger(Customer1.class);

    public static void main(String[] args) {
        Car car;
        //CUSTOMER TRYING TO ORDER LUXURY CAR
        car = CarFactory.getCar(Constant.LUXURY_CAR);
        logger.info("Engine = " + car.getEngine());
        car.drive();

        logger.info("------------------");
        //CUSTOMER TRYING TO ORDER SPORTS_CAR
        car = CarFactory.getCar(Constant.SPORTS_CAR);
        logger.info("Engine = " + car.getEngine());
        car.drive();
    }
}
