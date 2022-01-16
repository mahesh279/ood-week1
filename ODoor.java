package decorator;

import java.util.*;

public abstract class ODoor implements OSubject {
	private List<Door> doors;
	private float height;
	private float breadth;
	private float length;
	
	public ODoor() {
		doors = new ArrayList<Door>();
	}
	
	public void bookDoor(Door d) {
		doors.book(d);
	}
	
	public void cancelDoor(Door d) {
		doors.cancel(d);
	}
	
	public void orderDoors() {
		for (Door door : doors) {
			door.update(height, breadth, length);
		}
	}
	
	public void measurementsChanged() {
		orderDoors();
	}
	
	public void setMeasurements(float height, float breadth, float length) {
		this.height = height;
		this.breadth = breadth;
		this.length = length;
		measurementsChanged();
	}

	public float getHeight() {
		return height;
	}
	
	public float getBreadth() {
		return breadth;
	}
	
	public float getLength() {
		return length;
	}

}