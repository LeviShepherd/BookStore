import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Levi Shepherd - lshepherd2
 * CIS175 - Spring 2021
 * Feb 13, 2021
 */

public class BookTest {
	
	Book a = new Book("Tom Sawyer", "Mark Twain", 7.95);
	Book b = new Book("Huckleberry Finn", "Mark Twain", 6.95);

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testBookAuthor() {
		String author1 = a.getAuthor();
		String author2 = b.getAuthor();
		assertEquals(author1, author2);
	}
	
	@Test
	public void testBookPrice() {
		double price1 = a.getRetailPrice();
		double price2 = b.getRetailPrice();
		assertNotEquals(price1, price2);
	}

	@Test
	public void testBookPrice2() {
		double price1 = a.getRetailPrice();
		double price2 = b.getRetailPrice();
		assertFalse(price1 == price2);
	}
	
	@Test
	public void testBookAuthor2() {
		String author1 = a.getAuthor();
		String author2 = b.getAuthor();
		assertTrue(author1 == author2);
	}
}
