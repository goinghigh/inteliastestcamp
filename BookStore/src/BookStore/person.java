package BookStore;

public class person {
	private long id;
	private String name;
	private int age;
	public person(long id, String name, int age) {
		super();
		this.setId(id);
		this.setName(name);
		this.setAge(age);
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
