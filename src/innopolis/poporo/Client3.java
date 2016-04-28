package innopolis.poporo;

public class Client3 {	
	public static void main(String[] args) {
		StandardContentItem c = new StandardContentItem();
		StandardPage p = new StandardPage(c);
		
		Page pageDecorated = new WallDecorator(p);
		pageDecorated.Draw();
	}
}