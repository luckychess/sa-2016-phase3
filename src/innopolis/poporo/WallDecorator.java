package innopolis.poporo;

public class WallDecorator extends Decorator {
	public WallDecorator(Page p) {
		this.p = p;
	}
	
	public void DrawWall() {
		System.out.println(" DrawWall in class WallDecorator ");
	}
	
	@Override
	public void Draw() {
		System.out.println(" Draw in class WallDecorator ");
		super.Draw();
		DrawWall();
	}

	@Override
	public void upload(ContentItem c) {
		p.upload(c);
	}

	@Override
	public boolean remove(ContentItem c) {
		return p.remove(c);
	}

	@Override
	public boolean isEmptyPage() {
		return p.isEmptyPage();
	}

	@Override
	public boolean containsContentItem(ContentItem c) {
		return p.containsContentItem(c);
	}
}
