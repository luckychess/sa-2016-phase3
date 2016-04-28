package innopolis.poporo;

import java.util.ArrayList;

public class StandardContentItem extends ContentItem {
	public StandardContentItem() {
		relative = new ArrayList<ContentItem>();
	}
	
	@Override
	public void add(ContentItem c) {
		relative.add(c);
	}

	@Override
	public boolean remove(ContentItem c) {
		return relative.remove(c);
	}

	@Override
	public boolean contains(ContentItem c) {
		return relative.contains(c);
	}

	@Override
	public boolean isEmpty() {
		return relative.isEmpty();
	}

	@Override
	public void removeAll() {
		relative.clear();
	}

}
