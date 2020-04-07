package com.Planes;

public abstract class Cargo extends Planes implements IPlanes {

	private String role;

	public Cargo() {

	}

	public Cargo(int speed, int weight, String name) {
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

		System.out.println("Cargo was loaded!");

		this.isReadyForFlight = true;
	}
}