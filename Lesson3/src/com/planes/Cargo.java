package com.planes;

public class Cargo extends Planes {

	private String Role = "Default";
	public int Capacity = capacity;
	public Cargo() {

	}
	
	public Cargo(int speed, int ceiling, int weight, int capacity, int passengers, String name) {
		super(speed, ceiling, weight, capacity, passengers, name);
	}
	
	public void setCapacity(int value) {
		this.capacity = value;
		}
	
	public int getCapacity() {
		return this.Capacity;
	}	
	
	public void setRole(String value) {
		this.Role = value;
	}
	
	public String getRole() {
		return this.Role;
	}
}
