/**
 * @author Levi Shepherd - lshepherd2
 * CIS175 - Spring 2021
 * Feb 13, 2021
 */

public class Book {

	private String name;
	private String author;
	private double retailPrice;
	
	/**
	 * 
	 */
	public Book() {
		super();
	}

	/**
	 * @param name
	 * @param author
	 * @param retailPrice
	 */
	public Book(String name, String author, double retailPrice) {
		super();
		this.name = name;
		this.author = author;
		this.retailPrice = retailPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", retailPrice=" + retailPrice + "]";
	}
}
