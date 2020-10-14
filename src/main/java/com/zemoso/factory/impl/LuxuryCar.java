package com.zemoso.factory.impl;

import com.zemoso.test.Customer1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LuxuryCar implements Car {
	private static final Logger logger = LoggerFactory.getLogger(LuxuryCar.class);

	private final String entertainment;
	private final Engine engine;
	
	public LuxuryCar(Engine engine, String entertainment){
		this.engine = engine;
		this.entertainment=entertainment;
	}
	@Override
	public void drive(){
		logger.info("Luxury  car with "+entertainment);
	}
	@Override
	public String getEngine(){
		return engine.toString();
	}
}
