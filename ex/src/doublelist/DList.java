package doublelist;

public class DList {
	DNode first;
	public DList() {
		first = null;
	}
	
	public void addFirst(String name) {
		if(first == null) {
			DNode node = new DNode(name);
			first = node;
		}
		else {
			DNode node = new DNode(name, null, first);
			first.setLeftLink(node);
			first = node;
		}
	}
	
	public void delete(DNode target) {
		DNode left = target.getLeftLink();
		DNode right = target.getRightLink();
		if(left != null) {
			left.setRightLink(right);
		}
		else {
			first = right;
		}
		if(right != null) {
			right.setLeftLink(left);
		}
		
	}
	
	public void insert(DNode target, String name) {
		if(target == null) {
			return;
		}
		if(target.getRightLink() == null) {
			DNode node = new DNode(name, target, null);
			target.setRightLink(node);
		}
		else {
			DNode temp = target.getRightLink();
			DNode node = new DNode(name, target, temp);
			target.setRightLink(node);
			temp.setLeftLink(node);
		}
		
	}
	
	public DNode search(String name) {
		DNode node = first;
		while(node != null) {
			if(node.getName().equals(name)) {
				return node;
			}
			node = node.getRightLink();
		}
		return null;
	}
	
	public void print() {
		DNode target = first;
		while(target != null) {
			if(target.getRightLink() == null) {
				System.out.println(target.getName());
				break;
			}
			System.out.print(target.getName() + ", ");
			target = target.getRightLink();
		}
	}

}
