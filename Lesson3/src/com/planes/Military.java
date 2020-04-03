package com.Planes;

public abstract class Military extends Planes {

	public int ceiling;
	private String role;

	public Military() {

	}

	public Military(int speed, int weight, String name) {
		super(speed, weight, name);
	}

	public void setCeiling(int value) {
		this.ceiling = value;
	}

	public int getCeiling() {
		return this.ceiling;
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