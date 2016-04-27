package innopolis.poporo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StandardAccountTest {
	private StandardAccount a;
	private ContentItem c;
	
	
	@Before
	public void setUp() {
		a = new StandardAccount();
		c = new StandardContentItem();
	}
	
	@After
	public void tearDown() {
		//
	}

	@Test
	public void testClosedAccountIsNull() {
		a.openAccount();
		a.transmit(c);
		a.closeAccount();
		assertFalse(a.contains(c));
		assertFalse(a.contains(new StandardContentItem()));
	}
	
	@Test
	public void testTransmitContains() {
		a.openAccount();
		a.transmit(c);
		assertTrue(a.contains(c));
	}
	
	
}