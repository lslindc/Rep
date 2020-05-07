package com.menu;

import java.io.File;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.Hangar.Hangar;
import com.Planes.Cargo;
import com.Planes.Military;
import com.Planes.Passenger;
import com.Planes.Planes;
import com.exceptions.EmptyHangarException;
import com.exceptions.PlaneDataException;
import com.utils.*;

public class Menu {

	Hangar hangar = new Hangar();

	public void ShowMenu() throws Exception {

//		String path2 = String.format("C:%1$s asd %1$s", "test");
//		String path1 = String.format("C:%1$sUsers%1$sSerg%1$sDesktop%1$stext1", File.separator);

		boolean exit = false;

		do {
			try {
				System.out.println("Please select action from menu");
				System.out.println("Menu:");
				System.out.println("1 - Add new plane");
				System.out.println("2 - Remove plane");
				System.out.println("3 - Show info of planes");
				System.out.println("4 - Print info about Planes");
				System.out.println("5 - IO Writer/Reader");
				System.out.println("6 - Exit");

				Scanner in = new Scanner(System.in);
				if (in.hasNextInt()) {

					int action = in.nextInt();
					switch (action) {

					case 1:
						addPlane();
						break;
					case 2:
						removePlane();
						break;
					case 3:
						infoPlanes();
						break;
					case 4:
						printInfo();
						break;
					case 5:
						IOWriterReader();
						break;
					case 6:
						exit = true;
						System.out.println("Bye!");
						break;
					default:
						System.out.println("Default case exception. Please choose number from 1 to 5");
						break;
					}
				} else {
					System.out.println("Sorry, you must enter digit");
				}
			} catch (InputMismatchException e) {
				System.out.println("Element doesnt exist. Choose number from 1 to 5");
			} catch (PlaneDataException e) {
				System.out.println(e.getMessage());
			} catch (EmptyHangarException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			} finally {

				System.out.println("=====================");
				System.out.println("Finally block reached");
				System.out.println("=====================");

			}
		} while (!exit);
//		 in.close(); // ask
	}

	private void addPlane() throws PlaneDataException {
		Scanner in = new Scanner(System.in);
		boolean exit = false;
		try {

			System.out.println("What type of plane you want to add? ");
			System.out.println("|1 - Cargo| |2 - Passenger| |3 - Military| |4 - Exit|");
			int choosePlane = in.nextInt();

			String name;
			int speed;

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
				cargoPlane.prepareForFlight(name);

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
				passengerPlane.prepareForFlight(name);

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

				hangar.setMilitaryPlane(militaryPlane);
				militaryPlane.prepareForFlight(name);

				break;
			case 4:
				exit = true;
				break;

			default:
				System.out.println("Wrong value");
				break;
			}

		} catch (InputMismatchException e) {
			System.out.println("Element doesnt exist. Choose number from 1 to 4");
			throw new PlaneDataException();
		}
	}

	private void removePlane() {
		try {
			Scanner in = new Scanner(System.in);

			System.out.println("=====================");
			System.out.println("Enter number of the Plane that you want to delete");
			int index = in.nextInt();
			hangar.removePlane(index - 1);
			System.out.println("Successfully deleted");
		} catch (Exception e) {
			System.out.println("Error indexoutofbounds in: " + e.getMessage());
		}
	}

	private void infoPlanes() throws EmptyHangarException {
		System.out.println("=====================");
		System.out.println("Info of planes: ");
		System.out.println();
		List<Planes> planes = hangar.getListPlanes();

		if (planes.isEmpty()) {
			throw new EmptyHangarException();
		} else {
			System.out.println("List of planes: ");
			for (Planes p : planes) {
				p.printInfo();
				System.out.println();
			}
			System.out.println("Total planes created: " + Planes.getPlanesCreated());
		}
	}

	private void printInfo() {
		Hangar.printInfo(hangar.getListPlanes());
	}

	private void IOWriterReader() {
		boolean exit = false;
		do {
			try {
				Scanner in = new Scanner(System.in);

				System.out.println("What do you want to do? ");
				System.out.println(
						"|1 - Write to file| |2 - Read from file| |3 - Write property| |4 - Read Property| |5 - Exit|");
				int IOOperation = in.nextInt();

				switch (IOOperation) {

				case 1:
					IOWriterReader wf = new IOWriterReader();
					wf.writeToFile("Write to the file. Homework from Lesson11, topic IOFiles");
					System.out.println("Done");
					break;
				case 2:
					IOWriterReader rf = new IOWriterReader();
					rf.readFromFile();
					break;
				case 3:
					IOPropWriterReader fr = new IOPropWriterReader();
					fr.setValueToProperties("path", "C:\\Users\\Serg\\Desktop\\my.properties"); // use key and value!
					System.out.println("Done");
					break;
				case 4:
					String path = IOPropWriterReader.getValueFromProperties("path"); // use key
					System.out.println("Path to properties: " + path);
					break;
				case 5:
					exit = true;
					System.out.println("You are on the main menu now!");
					break;
				default:
					System.out.println("Wrong value. Please choose from 1 to 5");
					break;
				}
//				in.close();
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
		} while (!exit);
	}
}
