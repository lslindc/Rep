package com.Hangar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.Planes.*;

public class Hangar {

	List<Planes> listPlanes;
	List<Passenger> listPassenger;
	Set<Cargo> setOfCargo;
	Map<String, Military> militaryMap;

	public Hangar() {
		listPlanes = new ArrayList<Planes>();
		listPassenger = new LinkedList<Passenger>();
		setOfCargo = new HashSet<Cargo>();
		militaryMap = new HashMap<>();
	}

	/**
	 * Method for printing name of plane(after override with toString in Planes).
	 * 
	 * @author Serg
	 * @param list
	 */
	public static void printInfo(Collection<? extends Planes> list) {
		for (Object ls : list) {
			System.out.println("Name of plane: " + ls.toString());
			Planes.getplaneColor();
		}
	}

	public void addPlane(Planes planes) {
		listPlanes.add(planes);
	}

	/**
	 * Method for removing planes from arraylist. Value of index set with -1 in menu
	 * to make it easier to count
	 */
	public void removePlane(int index) {
		listPlanes.remove(index);
	}

	/**
	 * Getting arraylist with all planes
	 * 
	 * @return
	 */
	public List<Planes> getListPlanes() {
		return listPlanes;

	}

	public void setPlane() {
	}

	public void addCargo(Cargo cargo) {
		setOfCargo.add(cargo);
	}

	public Set<Cargo> getSetOfCargo() {
		return setOfCargo;
	}

	public void addPassenger(Passenger passenger) {
		listPassenger.add(passenger);
	}

	public void setMilitaryPlane(Military militaryPlane) {
		militaryMap.put(militaryPlane.getName(), militaryPlane);

	}
}