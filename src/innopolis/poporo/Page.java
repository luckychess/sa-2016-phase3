package innopolis.poporo;

import java.util.ArrayList;

public abstract class Page {
	protected ArrayList<ContentItem> contentItems;
	protected User pageOwner;
	
	public abstract void upload(ContentItem c);
	public abstract boolean remove(ContentItem c);
	public abstract boolean isEmptyPage();
	public abstract boolean containsContentItem(ContentItem c);
	public abstract void Draw();
}
