package decorator;

public class DecorativeDoor extends SupremeDoor {
	public DecorativeDoor(Door door) {
		this.door = door;
	}
	public String getDescription() {
		return door.getDescription() + ", Decorative";
	}
	public double cost() {
		return door.cost(); // decoration is free
	}
}