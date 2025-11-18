package list;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		//list1.insert("Moon", null);
		list1.addFirst("Kim");
		list1.addFirst("Choi");
		list1.addFirst("Joo");
		list1.deleteLastNode();
		/*list1.insert("Lee", list1.searchNode("Joo"));
		//list1.insert("Jeon", list1.searchNode("Moon"));
		//list1.insert("Jeon1", list1.searchNode("Jeon"));
		//list1.insert("Jeon2", list1.searchNode("Jeon1"));*/
		
		/*list1.delete(list1.searchNode("Jeon"));
		list1.invert()
		list1.print();*/
		
		LinkedList list2 = new LinkedList();
		list2.addFirst("1");
		list2.addFirst("2");
		list2.addFirst("3");
		
		LinkedList.concatList(list1,  list2).print();
	}

}

