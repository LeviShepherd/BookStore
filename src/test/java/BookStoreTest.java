import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Levi Shepherd - lshepherd2
 * CIS175 - Spring 2021
 * Feb 13, 2021
 */

public class BookStoreTest {
	Book a = new Book("Tom Sawyer", "Mark Twain", 7.95);
	Book b = new Book("Huckleberry Finn", "Mark Twain", 6.95);
	BookStore store = new BookStore();
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSellBook() {
		double actual = store.sellBook(a);
		double expected = 6.36;
		assertEquals(expected, actual, .01);
	}

	@Test
	public void testBuyBook() {
		double actual = store.buyBook(a);
		double expected = 8.51;
		assertEquals(expected, actual, .01);
	}
	
	@Test
	public void testBuyBookDiscount() {
		double actual = store.buyBookDiscount(b);
		double expected = 6.69;
		assertEquals(expected, actual, .01);
	}
	
}
