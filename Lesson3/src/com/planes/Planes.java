package com.Planes;

public abstract class Planes implements IPlanes {

	private int speed = 0;
	private String name = "default";

	public Planes() {
	}

	public Planes(int speed, String name) {
		this.speed = speed;
		this.name = name;
	}

	public void printInfo() {
		System.out.println("Name: " + name);
		System.out.println("Speed: " + speed + " km/h");
	}
}