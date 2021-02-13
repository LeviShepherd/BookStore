/**
 * @author Levi Shepherd - lshepherd2
 * CIS175 - Spring 2021
 * Feb 13, 2021
 */

public class BookStore {

	private double price;
	private double total;
	private double subTotal;
	private double tax;
	private final double TAXRATE = .07;
	private final double DISCOUNT = .1;
	private final double BUYRATE = .2;
	
	/**
	 * Default no-arg constructor
	 */
	public BookStore() {
		super();
	}

	/**
	 * Non-default constructor
	 * @param price
	 */
	public BookStore(double price) {
		super();
		this.price = price;
	}
	
	/**
	 * Method used for a customer to sell a book to the store
	 * @param book
	 * @return
	 */
	public double sellBook(Book book) {
		price = book.getRetailPrice() * BUYRATE;
		subTotal = book.getRetailPrice() - price;
		total = subTotal;
		return total;
	}
	
	/**
	 * Method used for a customer to buy a book from the store
	 * @param book
	 * @return
	 */
	public double buyBook(Book book) {
		subTotal = book.getRetailPrice();
		total = subTotal + (subTotal * TAXRATE);
		return total;
	}
	
	/**
	 * Method used for a customer to buy a book from the store with a discount
	 * @param book
	 * @return
	 */
	public double buyBookDiscount(Book book) {
		price = book.getRetailPrice();
		subTotal = price - (price * DISCOUNT);
		total = subTotal + (subTotal * TAXRATE);
		return total;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
}
