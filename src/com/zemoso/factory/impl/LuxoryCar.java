package com.zemoso.factory.impl;

public class LuxoryCar implements Car {
	private String entertainment;
	private Engine engg;
	
	public LuxoryCar(Engine engg,String entertainment){
		this.engg=engg;
		this.entertainment=entertainment;
	}
	@Override
	public void drive(){
		System.out.println("Luxory  car with "+entertainment);
	}
	@Override
	public String getEngine(){
		return engg.toString();
	}
}
