package com.planes;

public class Executor {

	public static void main(String[] args) {
		
		Military air1 = new Military(856, 12000, 172365, 0, 0, "Lockheed C5");
		air1.printInfo();
		
		String Role = air1.getRole();
		System.out.println(Role);
		
		air1.setRole("Strategic airlift after metod set");
		Role = air1.getRole();		
		System.out.println(Role);
		
		System.out.println("----------------");
		
		Military air2 = new Military(1960, 15000, 13290, 0, 0, "Lockheed F35");
		air2.printInfo();
		
		air2.setRole("Stealth fighter");
		Role = air2.getRole();
		System.out.println(Role);
		
		System.out.println("----------------");
		
		Cargo air3 = new Cargo(850, 12000, 250000, 250000, 0, "AN 225 Mriya");
		air3.printInfo();
		int capacity = air3.getCapacity();
		
		System.out.println("Max ñapacity: " + capacity + " kg");
				
		air3.setRole("Cargo aircraft");
		Role = air3.getRole();
		System.out.println(Role);
		
		System.out.println("----------------");
		
		Passenger air4 = new Passenger(800, 11000, 285000, 0, 853, "Airbus A380");
		air4.printInfo();
		int passengers = air4.getPassengers();
		
		System.out.println("Max passengers: " + passengers);
		
		air4.setRole("Passenger aircraft");
		Role = air4.getRole();
		System.out.println(Role);
		
		System.out.println("----------------");
		
		Passenger air5 = new Passenger(830, 12200, 24250, 0, 108,"Superjet Sukhoi");
		air5.printInfo();
		int passengers2 = air5.getPassengers();
		
		System.out.println("Max passengers: " + passengers2);		
		
		air5.setRole("Passenger aircraft Sukhoi");
		Role = air5.getRole();
		System.out.println(Role);
	}
}
