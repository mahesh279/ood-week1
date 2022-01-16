package decorator;

public interface OSubject {
	public void bookDoor(Door d);
	public void cancelDoor(Door d);
	public void orderDoor();

}
/*
public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
*/