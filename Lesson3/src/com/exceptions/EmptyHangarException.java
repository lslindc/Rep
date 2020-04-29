package com.exceptions;

import com.Planes.Planes;

public class EmptyHangarException extends Exception {

	@Override
	public String getMessage() {
		return "Hangar is empty!";
	}

}
