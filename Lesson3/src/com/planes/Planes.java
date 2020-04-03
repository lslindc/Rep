package com.Planes;

public abstract class Planes implements IPlanes {

	// variables
	private int speed = 0;
	private int weight = 0;
	private String name = "default";

	boolean isFlying;
	boolean isReadyForFlight;

	// constructor
	public Planes() {
	}

	public Planes(int speed, int weight, String name) {
		this.speed = speed;
		this.weight = weight;
		this.name = name;
	}

	// getters
	public int getSpeed() {
		return this.speed;
	}

	public int getWeight() {
		return this.weight;
	}

	public String getName() {
		return this.name;
	}

	public boolean getIsFlying() {
		return isFlying;
	}

	// method
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