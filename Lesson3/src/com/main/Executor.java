package com.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Scanner;
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

		Hangar hangar = new Hangar();

		boolean exit = false;

		do {
			System.out.println("Please select action from menu");
			System.out.println("Menu:");
			System.out.println("1 - Add new plane");
			System.out.println("2 - Remove plane");
			System.out.println("3 - Show info of planes");
			System.out.println("4 - Exit");
			Scanner in = new Scanner(System.in);
			int action = in.nextInt();

			/*
			 * in.close(); Can't close scanner
			 * 
			 *
			 * Main switch case initialize
			 */
			switch (action) {

			case 1:
				System.out.println("What type of plane you want to add? ");
				System.out.println("|1 - Cargo| |2 - Passenger| |3 - Military| |4 - Exit|");
				int choosePlane = in.nextInt();

				String name;
				int speed;

				/*
				 * Secondly switch case with choosing type of planes we want to add. Cargo has
				 * own property "capacity". Passenger has own property number of "passengers".
				 * Military has own property number of "seats"
				 */
				switch (choosePlane) {
				case 1:
					System.out.println("Type name of a plane: ");
					name = in.next();
					System.out.println("Type maximum speed of a plane: ");
					speed = in.nextInt();
					System.out.println("Type capacity volume: ");
					int capacity = in.nextInt();

					Cargo cargoPlane = new Cargo(speed, name);
					cargoPlane.setCapacity(capacity);
					hangar.addPlane(cargoPlane);
					hangar.addCargo(cargoPlane);

					break;
				case 2:
					System.out.println("Type name of a plane: ");
					name = in.next();
					System.out.println("Type maximum speed of a plane: ");
					speed = in.nextInt();
					System.out.println("Type number of passengers: ");
					int passengers = in.nextInt();

					Passenger passengerPlane = new Passenger(speed, name);
					passengerPlane.setPassengers(passengers);
					hangar.addPlane(passengerPlane);
					hangar.addPassenger(passengerPlane);

					break;
				case 3:
					System.out.println("Type name of a plane: ");
					name = in.next();
					System.out.println("Type maximum speed of a plane: ");
					speed = in.nextInt();
					System.out.println("Type number of seats: ");
					int seats = in.nextInt();

					Military militaryPlane = new Military(speed, name);
					militaryPlane.setSeats(seats);
					hangar.addPlane(militaryPlane);

					break;

				case 4:
					exit = true;
					break;

				default:
					System.out.println("Wrong value");
					break;
				}
				break;
			/*
			 * Value of index set with -1. To make it easier to count
			 */
			case 2:
				System.out.println("Enter number of the Plane that you want to delete");
				int index = in.nextInt();

				hangar.removePlane(index - 1);
				break;

			case 3:
				System.out.println("Info of planes: ");
				System.out.println();
				List<Planes> planes = hangar.getListPlanes();

				if (planes.isEmpty())
					System.out.println("Hangar is empty!");

				else {
					System.out.println("List of planes: ");
					for (Planes p : planes) {
						p.printInfo();
						System.out.println();

					}
				}

				break;

			case 4:
				exit = true;
				System.out.println("Bye!");
				break;

			default:
				System.out.println("Default exception");
				break;
			}
		} while (!exit);
	}
}