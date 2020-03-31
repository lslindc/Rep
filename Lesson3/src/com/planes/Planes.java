package com.planes;

public abstract class Planes implements IPlanes {
		
	private String name = "default";
	int speed = 0;
	int weight = 0;	
	boolean isFlying;
		
	public Planes() {
	}

	public Planes(int speed, int weight, String name) {			
		this.speed = speed;
		this.weight = weight;
		this.name = name;
	}

	public boolean getIsFlying() {
		return isFlying;
	}

	public void printInfo() {
		System.out.println("Name: " + name);
		System.out.println("Speed: " + speed + " km/h");
		System.out.println("Empty weight: " + weight + " kg");	
		System.out.println("Is Flying: " + isFlying);		
	}

	@Override
	public void takeOff() {
		isFlying = true;
	}

	@Override
	public void land() {
		isFlying = false;
	}
}
