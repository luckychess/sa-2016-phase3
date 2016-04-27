package innopolis.poporo;

public class Client2 {
	public static void main(String[] args) {
		StandardAccount sa = new StandardAccount();
		EnchantedAccount ea = new EnchantedAccount();
		//
		StandardContentItem c1 = new StandardContentItem();
		StandardContentItem c2 = new StandardContentItem();
		//
		sa.openAccount();
		sa.transmit(c1);
		//
		ea.openAccount();
		ea.transmit(c1);
		//
		sa.closeAccount();
		ea.closeAccount();
	}
}