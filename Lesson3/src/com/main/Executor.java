package com.main;

import com.planes.*;

import Hangar.Hangar;
import PlaneModels.A380;
import PlaneModels.C5;
import PlaneModels.F35;
import PlaneModels.Mriya;
import PlaneModels.SuperJet;

public class Executor {

	public static void main(String[] args) {

		C5 air1 = new C5(856, 172365, "Lockheed C5");
		air1.land();

		air1.printInfo();

		air1.setCeiling(12000);
		int ceiling1 = air1.getCeiling();

		System.out.println("Max ñeiling: " + ceiling1 + " m");

		String Role = air1.getRole();

		air1.setRole("Strategic airlift");
		Role = air1.getRole();
		System.out.println(Role);

		System.out.println("----------------");

		F35 air2 = new F35(1960, 13290, "Lockheed F35");
		air2.takeOff();

		air2.printInfo();

		air2.setCeiling(15000);
		int ceiling2 = air2.getCeiling();

		System.out.println("Max ñeiling: " + ceiling2 + " m");

		air2.setRole("Stealth fighter");

		Role = air2.getRole();
		System.out.println(Role);

		System.out.println("----------------");

		Cargo air3 = new Mriya(850, 250000, "AN 225 Mriya");
		air3.land();

		air3.printInfo();

		air3.setCeiling(12000);
		int ceiling = air3.getCeiling();

		System.out.println("Max ñeiling: " + ceiling + " m");

		air3.setCapacity(250000);
		int capacity = air3.getCapacity();

		System.out.println("Max ñapacity: " + capacity + " kg");

		air3.setRole("Cargo aircraft");

		Role = air3.getRole();
		System.out.println(Role);

		System.out.println("----------------");

		Passenger air4 = new A380(800, 285000, "Airbus A380");
		air4.takeOff();

		air4.printInfo();

		air4.setCeiling(11000);
		int ceiling4 = air4.getCeiling();

		System.out.println("Max ñeiling: " + ceiling4 + " m");

		air4.setPassengers(853);
		int passengers = air4.getPassengers();
		System.out.println("Max passengers: " + passengers);

		air4.setRole("Passenger aircraft");
		Role = air4.getRole();
		System.out.println(Role);

		System.out.println("----------------");

		Passenger air5 = new SuperJet(830, 24250, "Superjet Sukhoi");
		air5.printInfo();

		air5.setCeiling(12200);
		int ceiling5 = air5.getCeiling();

		System.out.println("Max ñeiling: " + ceiling5 + " m");

		air5.setPassengers(108);
		int passengers2 = air5.getPassengers();
		System.out.println("Max passengers: " + passengers2);

		air5.setRole("Passenger aircraft Sukhoi");
		Role = air5.getRole();
		System.out.println(Role);

		System.out.println("----------------");

		Hangar hangar = new Hangar();

		hangar.setPlane(air1);
		System.out.println("Preparing plane #1");
		hangar.getPlane().prepareForFlight();
		System.out.println("Plane #1 prepared to take off");

		hangar.setPlane(air3);
		System.out.println("Preparing plane #2");
		hangar.getPlane().prepareForFlight();
		System.out.println("Plane #2 prepared to take off");

		hangar.setPlane(air5);
		System.out.println("Preparing plane #3");
		hangar.getPlane().prepareForFlight();
		System.out.println("Plane #3 prepared to take off");
	}
}