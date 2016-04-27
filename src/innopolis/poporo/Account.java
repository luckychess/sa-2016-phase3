package innopolis.poporo;

public abstract class Account {
	protected User owner;
	protected Page accountPage;
	public abstract User openAccount();
	public abstract void closeAccount();
	public abstract void transmit(ContentItem c);
	public abstract boolean contains(ContentItem c);
}
