package decorator;

public class SlideDoor extends Door {  
	public SlideDoor() {
		description = "Slide door, with glass fitting";
	}
	public double cost() {
		return 7.99;
	}
}