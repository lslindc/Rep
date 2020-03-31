package com.planes;

public abstract class Passenger extends Planes {

	private String role;
	public int ceiling;
	public int passengers;

	public Passenger() {

	}

	public Passenger(int speed, int weight, String name) {
		super(speed, weight, name);
	}

	public void setCeiling(int value) {
		this.ceiling = value;
	}

	public int getCeiling() {
		return this.ceiling;
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
}
