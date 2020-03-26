package com.planes;

public class Military extends Planes {
	
	private String Role = "Default";

	public Military() {

	}
	
	public Military(int speed, int ceiling, int weight, int capacity, int passengers, String name) {
		super(speed, ceiling, weight, capacity, passengers, name);
	}	
	
	public void setRole(String value) {
		this.Role = value;
	}
	
	public String getRole() {
		return this.Role;
	}
}
