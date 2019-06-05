package BookStore;
public class Book {
	private long id;
	private String title;
	private String author;
	private double price;
	private BookGenre genre;
	
	public Book(long id, String title, String author, double price, BookGenre genre) {
		super();
		this.setId(id);
		this.setTitle(title);
		this.setAuthor(author);
		this.setPrice(price);
		this.setGenre(genre);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public BookGenre getGenre() {
		return genre;
	}

	public void setGenre(BookGenre genre) {
		this.genre = genre;
	}
	
	
}
