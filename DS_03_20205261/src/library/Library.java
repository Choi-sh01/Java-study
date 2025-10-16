package library;

public class Library {
	public static final int BOOK_DEFALUT_MAX = 10;
	public static final int ARRAY_INCREASE_RATE = 2;
	
	private Book[] book_list;
	private int num_of_book;
	
	public Library() {
		book_list = new Book[BOOK_DEFALUT_MAX];
		num_of_book = 0;
	}
	
	public void add_book(String name, String writer, int ID) {
		if( book_list.length < num_of_book ) {
			newBookList(book_list);
		}
		book_list[num_of_book] = new Book(name, writer, ID);
		num_of_book++;
	}
	
	public void add_book(Book newBook) {
		if( book_list.length < num_of_book ) {
			newBookList(book_list);
		}
		book_list[num_of_book] = newBook;
		num_of_book++;
	}
	
	public void print_book() {
		for(int i=0; i<book_list.length; i++) {
			if(book_list[i] == null) {
				continue;
			}
			book_list[i].print_info();
		}
	}
	
	private Book[] newBookList(Book[] old_book_list) {
		Book[] arr = new Book[old_book_list.length+ARRAY_INCREASE_RATE];
		for(int i=0; i<old_book_list.length; i++) {
			arr[i] = old_book_list[i];
		}
		return arr;
	}
	
	public Book find_book(String name) {
		System.out.println("Book Name : "+name);
		for(int i=0; i<book_list.length; i++) {
			if(book_list[i].get_name() == name) {
				return book_list[i];
			}
		}
		return null;
	}
	
	public Book find_book(int ID) {
		System.out.println("Book ID : "+ID);
		for(int i=0; i<book_list.length; i++) {
			if(book_list[i].get_ID() == ID) {
				return book_list[i];
			}
		}
		return null;
	}
	
	public Library find_writer(String writer) {
		System.out.println("Book Writer : "+writer);
		Library lib = new Library();
		for(int i=0; i<book_list.length; i++) {
			if(book_list[i] != null && book_list[i].get_writer() == writer) {
				lib.add_book(book_list[i]);
			}
		}
		return lib;
	}
	
	public void sort_ID() {
		for(int i = 0; i<book_list.length-1; i++) {
			for(int j = i+1; j<book_list.length; j++) {
				if(book_list[i] == null || book_list[j] == null) {
					continue;
				}
				if(book_list[i].get_ID() > book_list[j].get_ID()) {
					Book book = book_list[i];
					book_list[i] = book_list[j];
					book_list[j] = book;
				}
			}
		}
	}
	
	public void reverse_book_list() {
		for(int i = 0; i<book_list.length-1; i++) {
			for(int j = i+1; j<book_list.length; j++) {
				if(book_list[i] == null || book_list[j] == null) {
					continue;
				}
				if(book_list[i].get_ID() < book_list[j].get_ID()) {
					Book book = book_list[i];
					book_list[i] = book_list[j];
					book_list[j] = book;
				}
			}
		}
	}
	
	public void changeBookName(String oldName, String newName) {
		Book book = find_book(oldName);
		book.change_name(newName);
	}
	
	public void changeBookID(int oldID, int newID) {
		Book book = find_book(oldID);
		book.change_ID(newID);
	}
	
	public void changeBookWriter(String oldWriter, String newWriter) {
		Library book = find_writer(oldWriter);
		for(int i = 0; i<book.num_of_book; i++) {
			book.book_list[i].change_writer(newWriter);
		}
	}
}
