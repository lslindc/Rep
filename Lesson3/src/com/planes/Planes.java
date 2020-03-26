package com.planes;

public class Planes {
		
		private int speed = 0;
				int ceiling = 0;
				int weight = 0;
				int capacity = 0;
				int passengers = 0;
				private String name = "default";

		public Planes() {

		}

		public Planes(int speed, int ceiling, int weight, int capacity, int passengers, String name) {			
			this.speed = speed;
			this.weight = weight;
			this.ceiling = ceiling;
			this.name = name;
			this.capacity = capacity;
			this.passengers = passengers;
		}
		
		protected void printInfo() {
			System.out.println("Name: " + name);
			System.out.println("Speed: " + speed + " km/h");
			System.out.println("Empty weight: " + weight + " kg");
			System.out.println("Max ceiling: " + ceiling + " m");
			
		}

	}
