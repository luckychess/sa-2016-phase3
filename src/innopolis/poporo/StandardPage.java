package innopolis.poporo;

import java.util.ArrayList;

public class StandardPage extends Page {
	public StandardPage(ContentItem c) {
		contentItems = new ArrayList<ContentItem>();
		contentItems.add(c);
	}

	@Override
	public void upload(ContentItem c) {
		if (!containsContentItem(c)) {
			contentItems.add(c);
		}
	}

	@Override
	public boolean remove(ContentItem c) {
		if (containsContentItem(c)) {
			if (contentItems.size() == 1) {
				return false;
			}
		}
		return contentItems.remove(c);
	}

	@Override
	public boolean isEmptyPage() {
		return contentItems.isEmpty();
	}

	@Override
	public boolean containsContentItem(ContentItem c) {
		return contentItems.contains(c);
	}

	@Override
	public void Draw() {
		System.out.println(" Draw in class StandardPage ");
	}
}
