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
			DNode temp = first;
			DNode node = new DNode(name, null, temp);
			first.setLeftLink(node);
			first = node;
		}
	}
	
	public void delete(DNode target) {
		if(first == null) {
			return;
		}
		DNode left = target.getLeftLink();
		DNode right = target.getRightLink();
		
		if(left != null) {
			left.setRightLink(target.getRightLink());
		}
		else {
			first = right;
		}
		
		if(right != null) {
			right.setLeftLink(target.getLeftLink());
		}
	}
	
	public void insert(DNode target, String name) {
		DNode temp = target.getRightLink();
		DNode node = new DNode(name, target, temp);
		target.setRightLink(node);
		
		if(temp != null) {
			temp.setLeftLink(node);
		}
	}
	
	public DNode search(String name) {
		DNode target = first;
		while(target != null) {
			if(target.getName().equals(name)) {
				return target;
			}
			target = target.getRightLink();
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
