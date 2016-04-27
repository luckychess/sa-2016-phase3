package innopolis.poporo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StandardPageTest {
	private StandardContentItem c;
	private StandardPage p;
	
	@Before
	public void setUp() {
		c = new StandardContentItem();
	}
	
	@After
	public void tearDown() {
		//
	}

	@Test
	public void testNotInitiallyEmpty() {
		p = new StandardPage(c);
		assertFalse(p.isEmptyPage());
	}
	

	@Test
	public void testNeverEmpty() {
		p = new StandardPage(c);
		assertFalse(p.isEmptyPage());
		
		StandardContentItem c1 = new StandardContentItem();
		p.upload(c1);

		StandardContentItem c2 = new StandardContentItem();
		p.upload(c2);
		
		p.remove(c1);
		assertFalse(p.isEmptyPage());
		assertFalse(p.containsContentItem(c1));

		p.remove(c2);
		assertFalse(p.isEmptyPage());
		assertFalse(p.containsContentItem(c2));
		
		p.remove(c);
		assertFalse(p.isEmptyPage());
		assertTrue(p.containsContentItem(c));		
	}
	
	@Test
	public void testUploadContains() {
		p = new StandardPage(c);
		assertTrue(p.containsContentItem(c));
		
		StandardContentItem c1 = new StandardContentItem();
		p.upload(c1);

		assertTrue(p.containsContentItem(c1));
		assertTrue(p.containsContentItem(c));
	}

	@Test
	public void testUploadRemove() {
		p = new StandardPage(c);
		
		StandardContentItem c1 = new StandardContentItem();
		p.upload(c1);
		assertTrue(p.containsContentItem(c1));
		p.remove(c1);
		assertFalse(p.containsContentItem(c1));
	}

	@Test
	public void testNoDuplicates() {
		p = new StandardPage(c);
		
		StandardContentItem c1 = new StandardContentItem();
		p.upload(c1);
		p.upload(c1);
		p.remove(c1);
		assertFalse(p.containsContentItem(c1));
	}

}