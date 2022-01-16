package decorator;

public abstract class Door {
	String description = "Normal Door";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();

	public void update(float height, float breadth, float length) {
		// TODO Auto-generated method stub
		
	}
}