package innopolis.poporo;

public abstract class Decorator extends Page {
	protected Page p;
	public void Draw() {
		System.out.println(" Draw in class Decorator ");
	}
}
