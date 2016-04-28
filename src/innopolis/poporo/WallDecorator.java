package innopolis.poporo;

public class WallDecorator extends Decorator {
	public WallDecorator(Page p) {
		this.p = p;
	}
	
	public void DrawWall() {
		p.Draw();
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
		c.removeAll();
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
	
	public void comment(ContentItem c1, ContentItem c2) {
		if (p.containsContentItem(c1)) {
			c1.add(c2);
		}
	}

	public void uncomment(ContentItem c1, ContentItem c2) {
		if (p.containsContentItem(c1)) {
			c1.remove(c2);
		}
	}

	public boolean has(ContentItem c1, ContentItem c2) {
		return c1.contains(c2);
	}

	public boolean isDefinedAt(ContentItem c1) {
		return !c1.isEmpty();
	}
}
