package arraystack;

public class ArrayStackTest {
	
	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack();
		stack.push("1");
		stack.push("2");
		stack.push("3");
		
		System.out.println(stack.pop());
		stack.remove();
		System.out.println(stack.peek());
	}

}
