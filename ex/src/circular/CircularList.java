package circular;

public class CircularList {
	private ListNode tail;

	public CircularList() {
		tail = null;
	}

	public int size() {
		ListNode target = tail.getLink();
		int size = 0;
		if (tail != null) {
			while (target != tail) {
				target = target.getLink();
				size++;
			}
			size++;
		}
		return size;
	}

	public void addFirst(String name) {
		if(tail == null) {
			ListNode node = new ListNode(name);
			tail = node;
			node.setLink(node);
		}
		else {
			ListNode node = new ListNode(name);
			node.setLink(tail.getLink());
			tail.setLink(node);
		}
	}

	public void addLast(String name) {
		if (tail == null) {
			ListNode node = new ListNode(name, tail);
			tail = node;
			node.setLink(node);
		} 
		else {
			ListNode node = new ListNode(name, tail.getLink());
			tail.setLink(node);
			tail = node;
		}

	}

	public ListNode listSearch(String targetName) {
		if(tail == null) {
			return null;
		}
		else {
			ListNode target = tail.getLink();
			for(int i = 0; i<size(); i++) {
				if(target.getName().equals(targetName)) {
					return target;
				}
				target = target.getLink();
			}
		}
		return null;
	}

	public void insert(ListNode target, String name) {
		if(target == null) {
			addFirst(name);
		}
		else {
			ListNode temp = target.getLink();
			ListNode node = new ListNode(name, target.getLink());
			node.setLink(temp);
			target.setLink(node);
		}
	}

	public void delete(ListNode target) {
		if(target == null) {
			return;
		}
		ListNode temp = target.getLink();
		target.setLink(temp.getLink());
		
		
	}

	public void print() {
		ListNode target;
		if (tail != null) {
			target = tail.getLink();
			while (target != tail) {
				System.out.print(target.getName() + ", ");
				target = target.getLink();
			}
			System.out.println(target.getName());
		}
	}

}
