package com.Planes;

public class Passenger extends Planes {

	private int passengers;

	public Passenger() {

	}

	public Passenger(int speed, String name) {
		super(speed, name);
	}

	public void setPassengers(int value) {
		this.passengers = value;
	}

	public int getPassengers() {
		return this.passengers;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Passengers: " + passengers);
	}
}