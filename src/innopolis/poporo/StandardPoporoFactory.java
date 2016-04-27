package innopolis.poporo;

public class StandardPoporoFactory extends PoporoFactory {

	@Override
	User createUser() {
		System.out.println("Creating standard User...");
		return new StandardUser();
	}

	@Override
	Account createAccount() {
		System.out.println("Creating standard Account...");
		return new StandardAccount();
	}

	@Override
	ContentItem createContentItem() {
		System.out.println("Creating standard ContentItem...");
		return new StandardContentItem();
	}

	@Override
	Page createPage() {
		System.out.println("Creating standard Page...");
		return new StandardPage(createContentItem());
	}

}
