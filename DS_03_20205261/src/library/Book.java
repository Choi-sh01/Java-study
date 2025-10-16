package library;

public class Book {
	private String name;
	private String writer;
	private int ID;
	
	public Book(String name, String writer, int ID) {
		this.name = name;
		this.writer = writer;
		this.ID = ID;
	}
	
	public void print_info() {
		System.out.println("------------------------");
		System.out.println("이름 : "+name);
		System.out.println("작가 : "+writer);
		System.out.println("ID : "+ID);
		System.out.println("------------------------");
	}
	
	public String get_name() {
		return name;
	}
	
	public String get_writer() {
		return writer;
	}
	
	public int get_ID() {
		return ID;
	}
	
	public void change_name(String name) {
		this.name = name;
	}
	
	public void change_writer(String writer) {
		this.writer = writer;
	}
	
	public void change_ID(int ID) {
		this.ID = ID;
	}
}
