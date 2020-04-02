package Hangar;

import com.planes.*;

public class Hangar {

	private IPlanes plane;

	public void setPlane(IPlanes plane) {
		this.plane = plane;
	}

	public IPlanes getPlane() {
		return this.plane;
	}
}