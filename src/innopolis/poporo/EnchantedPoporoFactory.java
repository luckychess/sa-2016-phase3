package innopolis.poporo;

public class EnchantedPoporoFactory extends PoporoFactory {

	@Override
	User createUser() {
		return new EnchantedUser();
	}

	@Override
	Account createAccount() {
		return new EnchantedAccount();
	}

	@Override
	ContentItem createContentItem() {
		return new EnchantedContentItem();
	}

	@Override
	Page createPage() {
		return new EnchantedPage();
	}

}
