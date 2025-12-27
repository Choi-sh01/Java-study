package list;

public class Main {
	
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		
		/*list1.addFirst("Kim");
		list1.addFirst("Choi");
		list1.addFirst("Joo");
		list1.insert("Jeon", list1.searchNode("Choi"));
		list1.insert("Moon", list1.searchNode("Kim"));
		list1.print();*/
		
		list1.insert("Moon", null);
		list1.addFirst("Kim");
		list1.addFirst("Choi");
		list1.addFirst("Joo");
		list1.insert("Park", list1.searchNode("Joo"));
		list1.insert("Lee", list1.searchNode("Joo"));
		list1.insert("Jeon", list1.searchNode("Moon"));
		
		list1.delete(list1.searchNode("Jeon"));
		list1.invert();
		list1.print();
	}

}
