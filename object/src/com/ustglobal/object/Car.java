package com.ustglobal.object;

public class Car {
	int cost;
	String brand;
	String color;
	public Car(int cost, String brand, String color) {
		super();
		
		this.cost = cost;
		this.brand = brand;
		this.color = color;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return cost;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "cost is "+cost+" brand is "+brand+ " color " + color;
	}
	
	

}
