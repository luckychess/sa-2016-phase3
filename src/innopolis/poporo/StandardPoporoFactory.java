package innopolis.poporo;

public class StandardPoporoFactory extends PoporoFactory {

	@Override
	User createUser() {
		return new StandardUser();
	}

	@Override
	Account createAccount() {
		return new StandardAccount();
	}

	@Override
	ContentItem createContentItem() {
		return new StandardContentItem();
	}

	@Override
	Page createPage() {
		return new StandardPage();
	}

}
