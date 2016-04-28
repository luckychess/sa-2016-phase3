package innopolis.poporo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WallDecoratorTest {
	private WallDecorator w;
	private ContentItem c;
	private StandardPage p;
	
	@Before
	public void setUp() {
		c = new StandardContentItem();
		p = new StandardPage(c);
		w = new WallDecorator(p);
		//w.Draw();
	}
	
	@After
	public void tearDown() {
		//
	}

	@Test
	public void test01() {
		ContentItem c1 = new StandardContentItem();
		ContentItem c2 = new StandardContentItem();
		//
		w.upload(c1);
		w.comment(c1, c2);
		assertTrue(w.isDefinedAt(c1));
		assertTrue(w.has(c1,c2));
		//		
	}

	@Test
	public void test02() {
		ContentItem c1 = new StandardContentItem();
		ContentItem c2 = new StandardContentItem();
		//
		w.upload(c1);
		w.comment(c1, c2);
		assertFalse(w.containsContentItem(c2));
		//		
	}

	@Test
	public void test03() {
		ContentItem c1 = new StandardContentItem();
		ContentItem c2 = new StandardContentItem();
		//
		w.upload(c1);
		w.upload(c2);
		w.comment(c1, c2);
		assertTrue(w.containsContentItem(c1));
		assertTrue(w.containsContentItem(c2));
		assertTrue(w.isDefinedAt(c1));
		assertTrue(w.has(c1,c2));
		//		
	}

	@Test
	public void test04() {
		ContentItem c1 = new StandardContentItem();
		//
		w.upload(c1);
		w.comment(c1, c1);
		assertTrue(w.isDefinedAt(c1));
		assertTrue(w.has(c1,c1));
		//		
	}

	@Test
	public void test05() {
		for(int i=0; i<20; i++) {
			w.upload(new StandardContentItem());
		}
		ContentItem c1 = new StandardContentItem();
		assertFalse(w.containsContentItem(c1));
		//
		for(int i=0; i<20; i++) {
			w.comment(new StandardContentItem(), new StandardContentItem());
		}
		assertFalse(w.isDefinedAt(new StandardContentItem()));
		assertFalse(w.has(new StandardContentItem(),new StandardContentItem()));
		//		
	}

	@Test
	public void test06() {
		ContentItem c1 = new StandardContentItem();
		ContentItem c2 = new StandardContentItem();
		ContentItem c3 = new StandardContentItem();
		ContentItem c4 = new StandardContentItem();
		//
		w.upload(c1);
		w.upload(c2);
		w.upload(c3);
		//
		w.comment(c1, c2);
		w.comment(c1, c3);
		w.comment(c3, c4);
		//
		assertFalse(w.isDefinedAt(c2));
		assertTrue(w.containsContentItem(c2));
	}

	@Test
	public void test07() {
		ContentItem c1 = new StandardContentItem();
		ContentItem c2 = new StandardContentItem();
		//
		w.upload(c1);
		w.comment(c1, c2);
		assertFalse(w.isDefinedAt(c2));
		assertFalse(w.containsContentItem(c2));
		//
	}

	@Test
	public void test08() {
		ContentItem c1 = new StandardContentItem();
		//
		assertFalse(w.isEmptyPage());
		//
		w.upload(c1);
		assertFalse(w.isEmptyPage());
		//
		w.remove(c1);
		assertFalse(w.containsContentItem(c1));
		assertFalse(w.isEmptyPage());
	}
	
	@Test
	public void test09() {
		ContentItem c1 = new StandardContentItem();
		ContentItem c2 = new StandardContentItem();
		w.upload(c1);
		assertTrue(w.containsContentItem(c1));
		w.upload(c2);
		assertTrue(w.containsContentItem(c2));
		//
		w.remove(c1);
		assertFalse(w.containsContentItem(c1));
		//
		w.remove(c2);
		assertFalse(w.containsContentItem(c2));
	}

	@Test
	public void test10() {
		ContentItem c1 = new StandardContentItem();
		ContentItem c2 = new StandardContentItem();
		w.upload(c1);
		w.comment(c1, c2);
		assertTrue(w.has(c1, c2));
		//
		w.uncomment(c1, c2);
		assertFalse(w.has(c1, c2));
	}
	
	@Test
	public void test11() {
		ContentItem c1 = new StandardContentItem();
		ContentItem c2 = new StandardContentItem();
		w.upload(c1);
		//
		w.uncomment(c1, c2);
		assertFalse(w.has(c1, c2));
		//
		w.comment(c1, c2);
		assertTrue(w.has(c1, c2));
		//
	}

	@Test
	public void test12() {
		ContentItem c1 = new StandardContentItem();
		ContentItem c2 = new StandardContentItem();
		//
		w.upload(c1);
		w.comment(c1,c2);
		//
		boolean result = w.remove(c1);
		assertTrue(result);
	}

	@Test
	public void test13() {
		ContentItem c1 = new StandardContentItem();
		ContentItem c2 = new StandardContentItem();
		ContentItem c3 = new StandardContentItem();
		ContentItem c4 = new StandardContentItem();
		//
		w.upload(c1);
		w.upload(c2);
		//
		w.comment(c1,c3);
		assertTrue(w.has(c1, c3));
		w.comment(c2,c3);
		assertTrue(w.has(c1, c3));
		assertTrue(w.has(c2, c3));
		w.comment(c2,c4);
		assertTrue(w.has(c1, c3));
		assertTrue(w.has(c2, c3));
		assertTrue(w.has(c2, c4));
		//
		w.uncomment(c1, c4);
		assertTrue(w.has(c1, c3));
		assertTrue(w.has(c2, c3));
		assertTrue(w.has(c2, c4));
		//
		w.uncomment(c2,c3);
		assertTrue(w.has(c1, c3));
		assertTrue(w.has(c2, c4));
		//
		w.remove(c3);
		assertTrue(w.has(c1, c3));
		assertTrue(w.has(c2, c4));
		//
		w.remove(c1);;
		assertTrue(w.has(c2, c4));
		assertFalse(w.has(c1, c3));
	}


	@Test
	public void test14() {
		assertFalse(w.remove(c));
		assertFalse(w.isEmptyPage());
	}
	
}