package com.planes;

public abstract class Cargo extends Planes implements IPlanes {

	private String role;

	public int ceiling;
	public int capacity;

	public Cargo() {

	}

	public Cargo(int speed, int weight, String name) {
		super(speed, weight, name);
	}

	public void setCeiling(int value) {
		this.ceiling = value;
	}

	public int getCeiling() {
		return this.ceiling;
	}

	public void setCapacity(int value) {
		this.capacity = value;
	}

	public int getCapacity() {
		return this.capacity;
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

	public String getWork() {

		return null;
	}
}