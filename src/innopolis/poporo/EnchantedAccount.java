package innopolis.poporo;

public class EnchantedAccount extends Account {
	@Override
	public User openAccount() {
		System.out.println("Opening enchanted account...");
		owner = new EnchantedUser();
		return owner;
	}

	@Override
	public void closeAccount() {
		System.out.println("Closing enchanted account...");
		owner = null;
		accountPage = null;
	}

	@Override
	public void transmit(ContentItem c) {
		System.out.println("Transmitting new ContentItem to the enchanted account...");
		if (accountPage == null) {
			accountPage = new EnchantedPage(c);
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
