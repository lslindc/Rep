package com.Planes;

public abstract class Planes implements IPlanes {

	private int speed = 0;
	private String name = "default";
	public static String planecolor = "white";
	boolean isReadyForFlight;

	private static int planesCreated = 0;

	public Planes(int speed, String name) {
		planesCreated++;
		this.speed = speed;
		this.name = name;
	}

	public void printInfo() {
		System.out.println("Name: " + name);
		System.out.println("Speed: " + speed + " km/h");

		Planes.getplaneColor();
	}

	public static void getplaneColor() {

		System.out.println("Plane color: " + planecolor);
		return;
	}

	public void prepareForFlight() {
	}

	public String getName() {
		return this.name;
	}

	public static int getPlanesCreated() {
		return planesCreated;
	}

	@Override
	public String toString() {
		return this.name;
	}

}
