package circular;


public class CircularList {
	private ListNode tail;

	public CircularList() {
		tail = null;
	}

	public int size() {
		int length = 1;
		ListNode p = tail.getLink();
		while (p != tail) {
			length += 1;
			p = p.getLink();
		}
		return length;
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
		if(tail == null) {
			ListNode node = new ListNode(name, tail);
			tail = node;
			node.setLink(node);
		}
		else {
			ListNode node = new ListNode(name, tail);
			node.setLink(tail.getLink());
			tail.setLink(node);
			tail = node;
		}
	}

	public ListNode listSearch(String targetName) {
		ListNode node = tail;
		for(int i = 0; i<size(); i++) {
			if (node.getName().equals(targetName)) {
				return node;
			}
			node = node.getLink();
		}
		return null;
	}

	public void insert(ListNode target, String name) {
		if (target == null) {
			addFirst(name);
			return;
		}
		ListNode node = new ListNode(name);
		if(target.getLink() == null) {
			node.setLink(target.getLink());
			target.setLink(node);
			tail = node;
		}
		else {
			node.setLink(target.getLink());
			target.setLink(node);
		}
	}

	public void delete(ListNode target) {
		ListNode node;
		if(target==null) {
			return;
		}
		else {
			node = target.getLink();
			if(node == null) {
				return;
			}
			target.setLink(node.getLink());
			if(target.getLink() == null) {
				tail = target;
			}
		}
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
