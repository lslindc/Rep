package com.Planes;

public abstract class Military extends Planes {

	private String role;

	public Military() {

	}

	public Military(int speed, int weight, String name) {
		super(speed, weight, name);
	}

	public void setRole(String value) {
		this.role = value;
	}

	public String getRole() {
		return this.role;
	}

	@Override
	public void prepareForFlight() {

		System.out.println("Tanks are fully refueled!");

		this.isReadyForFlight = true;
	}

}