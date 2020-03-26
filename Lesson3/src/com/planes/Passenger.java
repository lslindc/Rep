package com.planes;

public class Passenger extends Planes{

	private String Role = "Default";
	public int Passengers = passengers; 
	public Passenger() {

	}
	
	public Passenger(int speed, int ceiling, int weight, int capacity, int passengers, String name) {
		super(speed, ceiling, weight, capacity, passengers, name);
	}
	
	public void setPassengers(int value) {
		this.passengers = value;
		}
	
	public int getPassengers() {
		return this.Passengers;
	}	
	
	public void setRole(String value) {
		this.Role = value;
	}
	
	public String getRole() {
		return this.Role;
	}
}
