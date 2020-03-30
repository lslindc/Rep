package com.planes;

public abstract class Cargo extends Planes implements IPlanes {

	public int ceiling;
	public int capacity;
	private String role;
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
}
