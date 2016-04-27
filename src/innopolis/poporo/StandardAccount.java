package innopolis.poporo;

public class StandardAccount extends Account {
	
	@Override
	public User openAccount() {
		System.out.println("Opening standard account...");
		owner = new StandardUser();
		return owner;
	}

	@Override
	public void closeAccount() {
		System.out.println("Closing standard account...");
		if (accountPage != null) {
			accountPage.contentItems.clear();
		}
	}

	@Override
	public void transmit(ContentItem c) {
		System.out.println("Transmitting new ContentItem to the standard account...");
		if (accountPage == null) {
			accountPage = new StandardPage(c);
		}
		else {
			accountPage.upload(c);
		}
	}

	@Override
	public boolean contains(ContentItem c) {
		return accountPage.containsContentItem(c);
	}

}
