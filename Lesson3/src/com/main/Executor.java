package com.main;

import com.Hangar.Hangar;
import com.PlaneModels.A380;
import com.PlaneModels.C5;
import com.PlaneModels.F35;
import com.PlaneModels.Mriya;
import com.PlaneModels.SuperJet;
import com.Planes.*;
import com.main.Schedule;

public class Executor {

	public static final void main(String[] args) {
		final String DEMO_CONSTANT = "Test string constant";
		final int CEILING = 12000;
		C5 air1 = new C5(856, 172365, "Lockheed C5");
		air1.land();

		air1.printInfo();

		String Role = air1.getRole();

		air1.setRole("Strategic airlift");
		Role = air1.getRole();
		System.out.println(Role);

		System.out.println("----------------");

		F35 air2 = new F35(1960, 13290, "Lockheed F35");
		air2.takeOff();

		air2.printInfo();

		air2.setRole("Stealth fighter");

		Role = air2.getRole();
		System.out.println(Role);

		System.out.println("----------------");

		Cargo air3 = new Mriya(850, 250000, "AN 225 Mriya");
		air3.land();

		air3.printInfo();

		air3.setRole("Cargo aircraft");

		Role = air3.getRole();
		System.out.println(Role);

		System.out.println("----------------");

		Passenger air4 = new A380(800, 285000, "Airbus A380");
		air4.takeOff();

		air4.printInfo();

		air4.setPassengers(853);
		int passengers = air4.getPassengers();
		System.out.println("Max passengers: " + passengers);

		air4.setRole("Passenger aircraft");
		Role = air4.getRole();
		System.out.println(Role);

		System.out.println("----------------");

		Passenger air5 = new SuperJet(830, 24250, "Superjet Sukhoi");
		air5.printInfo();

		air5.setPassengers(108);
		int passengers2 = air5.getPassengers();
		System.out.println("Max passengers: " + passengers2);

		air5.setRole("Passenger aircraft Sukhoi");
		Role = air5.getRole();
		System.out.println(DEMO_CONSTANT);
		System.out.println("Max ceiling: " + CEILING);
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
		System.out.println("----------------");

		getSchedule(schedule);
	}

	static Schedule schedule = Schedule.SATURDAY;

	public static void getSchedule(Schedule schedule) {

		switch (schedule) {

		case MONDAY:
			System.out.println("Monday: Test flights of A380");
			break;

		case TUESDAY:
			System.out.println("Tuesday: Test flights of C5");
			break;

		case WEDNESDAY:
			System.out.println("Wednesday: Test flights of Sukhoi");
			break;

		case THURSDAY:
			System.out.println("Thursday: Test flights of Mriya");
			break;

		case FRIDAY:
			System.out.println("Friday: Test flights of F35");
			break;

		default:
			System.out.println("Aircraft maintenance");
			break;
		}
	}
}