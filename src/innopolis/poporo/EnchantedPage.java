package innopolis.poporo;

public class EnchantedPage extends Page {
	public EnchantedPage(ContentItem c) {
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
}
