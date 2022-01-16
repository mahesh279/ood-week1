package decorator;

public class OnesidedDoor extends Door {
	public OnesidedDoor() {
		description = "One sided door, with glass fitting";
	}
	public double cost() {
		return 7.99;
	}
}