package com.Hangar;

import java.util.ArrayList;
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

	public Hangar() {
		listPlanes = new ArrayList<Planes>();
		listPassenger = new LinkedList<Passenger>();

		setOfCargo = new HashSet<Cargo>();
	}

	public void addPlane(Planes planes) {
		listPlanes.add(planes);
	}

	public void removePlane(int index) {
		listPlanes.remove(index);
	}

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

//	Map<String, Integer> militaryMap  = new HashMap<>();
//	{
//	militaryMap.put();
//	}	

}