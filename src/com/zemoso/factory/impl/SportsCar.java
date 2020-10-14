package com.zemoso.factory.impl;

public class SportsCar implements Car {
	private String pickup;
	private Engine engg;
	public SportsCar(Engine engg,String pickup){
		this.engg=engg;
		this.pickup=pickup;
	}
	@Override
	public void drive(){
		System.out.println("sports car with "+pickup);
	}
	@Override
	public String getEngine(){
		return engg.toString();
	}

}
