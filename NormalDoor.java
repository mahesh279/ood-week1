package decorator;

public class NormalDoor extends SupremeDoor  {
	public NormalDoor(Door door) {
		this.door = door;
	}
	public String getDescription() {
		return door.getDescription() + ", Normal";
	}
	public double cost() {
		return door.cost() + 2.30; 
	}
}