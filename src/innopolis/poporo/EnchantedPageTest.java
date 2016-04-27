package innopolis.poporo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EnchantedPageTest {
	private EnchantedContentItem c;
	private EnchantedPage p;
	
	@Before
	public void setUp() {
		c = new EnchantedContentItem();
	}
	
	@After
	public void tearDown() {
		//
	}

	@Test
	public void testNotInitiallyEmpty() {
		p = new EnchantedPage(c);
		assertFalse(p.isEmptyPage());
	}
	

	@Test
	public void testNeverEmpty() {
		p = new EnchantedPage(c);
		assertFalse(p.isEmptyPage());
		
		EnchantedContentItem c1 = new EnchantedContentItem();
		p.upload(c1);

		EnchantedContentItem c2 = new EnchantedContentItem();
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
		p = new EnchantedPage(c);
		assertTrue(p.containsContentItem(c));
		
		EnchantedContentItem c1 = new EnchantedContentItem();
		p.upload(c1);

		assertTrue(p.containsContentItem(c1));
		assertTrue(p.containsContentItem(c));
	}

	@Test
	public void testUploadRemove() {
		p = new EnchantedPage(c);
		
		EnchantedContentItem c1 = new EnchantedContentItem();
		p.upload(c1);
		assertTrue(p.containsContentItem(c1));
		p.remove(c1);
		assertFalse(p.containsContentItem(c1));
	}

	@Test
	public void testNoDuplicates() {
		p = new EnchantedPage(c);
		
		EnchantedContentItem c1 = new EnchantedContentItem();
		p.upload(c1);
		p.upload(c1);
		p.remove(c1);
		assertFalse(p.containsContentItem(c1));
	}

}