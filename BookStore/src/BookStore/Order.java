package BookStore;

public class Order {
	private long id;
	private long customerId; // кому продали
	private long employeesId;
	private long[] books; // список номеров книг которие продали
	public Order(long id, long employeesId, long customerId, long[] books) {
		super();
		this.setId(id);	
		this.setemployeesId(employeesId);
		this.setCustomerId(customerId);
		this.setBooks(books);
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public long getemployeesId() {
		return employeesId;
	}
	public void setemployeesId(long employeesId) {
		this.employeesId = employeesId;
	}
	public long[] getBooks() {
		return books;
	}
	public void setBooks(long[] books) {
		this.books = books;
	}
	
}
