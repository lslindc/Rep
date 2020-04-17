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

//	List<Cargo> listCargo; 
//	List<? extends Planes> listExtendsPlanes;  
//	List<? super Cargo> listSuperPlane; 

	public Hangar() {
		listPlanes = new ArrayList<Planes>();
		listPassenger = new LinkedList<Passenger>();
		setOfCargo = new HashSet<Cargo>();
		militaryMap = new HashMap<>();

//		listExtendsPlanes = new ArrayList<Planes>();  
//
//		Planes p = new Cargo();
//		Cargo c = new Cargo();
//		
//		p = c;
//		
//		listPlanes=listCargo;
//		listCargo=listPlanes;
//		
//		listExtendsPlanes=listPlanes;
//		listExtendsPlanes=listCargo;
//		
//		listSuperPlane=listPlanes;
//		listSuperPlane=listCargo;
	}

	/**
	 * Method for printing name of plane(after override with toString in Planes).
	 * Used in demo for wildcards
	 * 
	 * @author Serg
	 * @version 1.1
	 * @param list
	 */
	public void printInfo(Collection<? extends Planes> list) {
		for (Object ls : list) {
			System.out.println("Name of plane: " + ls.toString());
		}
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

	public void setMilitaryPlane(Military militaryPlane) {
		militaryMap.put(militaryPlane.getName(), militaryPlane);

	}
}