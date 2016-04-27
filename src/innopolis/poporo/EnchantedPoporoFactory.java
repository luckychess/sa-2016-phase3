package innopolis.poporo;

public class EnchantedPoporoFactory extends PoporoFactory {

	@Override
	User createUser() {
		System.out.println("Creating enchanted User...");
		return new EnchantedUser();
	}

	@Override
	Account createAccount() {
		System.out.println("Creating enchanted Account...");
		return new EnchantedAccount();
	}

	@Override
	ContentItem createContentItem() {
		System.out.println("Creating enchanted ContentItem...");
		return new EnchantedContentItem();
	}

	@Override
	Page createPage() {
		System.out.println("Creating enchanted Page...");
		return new EnchantedPage(createContentItem());
	}

}
