package com.Planes;

public abstract class Passenger extends Planes {

	private String role;
	public int passengers;

	public Passenger() {

	}

	public Passenger(int speed, int weight, String name) {
		super(speed, weight, name);
	}

	public void setPassengers(int value) {
		this.passengers = value;
	}

	public int getPassengers() {
		return this.passengers;
	}

	public void setRole(String value) {
		this.role = value;
	}

	public String getRole() {
		return this.role;
	}

	@Override
	public void prepareForFlight() {

		System.out.println("Passengers on the board!");

		this.isReadyForFlight = true;
	}
}