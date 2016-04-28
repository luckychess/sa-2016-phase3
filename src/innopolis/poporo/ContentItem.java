package innopolis.poporo;

import java.util.ArrayList;

public abstract class ContentItem {
	protected ArrayList<ContentItem> relative;
	public abstract void add(ContentItem c);
	public abstract boolean remove(ContentItem c);
	public abstract boolean contains(ContentItem c);
	public abstract boolean isEmpty();
	public abstract void removeAll();
}
