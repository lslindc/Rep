package com.Planes;

public class Military extends Planes {

	int seats;

	public Military() {

	}

	public Military(int speed, String name) {
		super(speed, name);
	}

	public void setSeats(int value) {
		this.seats = value;
	}

	public int getSeats() {
		return this.seats;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Number of seats: " + seats);
	}
}