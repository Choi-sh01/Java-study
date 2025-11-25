package circular;

public class CircularMain {
	public static void main(String[] args) {
		CircularList cl = new CircularList();
		cl.addFirst("3");
		cl.addFirst("2");
		cl.addFirst("1");
		cl.addLast("4");
		cl.print();
		cl.insert(cl.listSearch("3"), "3.5");
		cl.print();
		cl.delete(cl.listSearch("4"));
		cl.print();
	}

}
