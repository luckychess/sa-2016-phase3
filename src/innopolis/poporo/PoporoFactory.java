package innopolis.poporo;

public abstract class PoporoFactory {
	abstract User createUser();
	abstract Account createAccount();
	abstract ContentItem createContentItem();
	abstract Page createPage();
}
