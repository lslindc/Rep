package com.Planes;

public class Cargo extends Planes implements IPlanes {

	private int capacity;

	public Cargo() {
	}

	public Cargo(int speed, String name) {
		super(speed, name);
	}

	public void setCapacity(int value) {
		this.capacity = value;
	}

	public int getCapacity() {
		return this.capacity;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Capacity: " + capacity);
	}

	@Override
	public void prepareForFlight() {

		System.out.println("Cargo was loaded!");

		this.isReadyForFlight = true;
	}
}