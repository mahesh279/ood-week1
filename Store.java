package decorator;

public class Store {
	public static void main(String args[]) {
		Door door = new SlideDoor();
		Door decorativeDoor = new DecorativeDoor(door);
		Door normalDoor = new NormalDoor(decorativeDoor);
		
		System.out.println(normalDoor.getDescription()
				+ " $" + normalDoor.cost());
	}
}
