package post;

public class PostFix {
	public static int evalPostFix(String exp) {
	    LinkedStack stack = new LinkedStack();
	    String[] tokens = exp.split(" ");

	    for (int i = 0; i < tokens.length; i++) {
	        String token = tokens[i];

	        if (token.charAt(0) >= '0' && token.charAt(0) <= '9') {
	            stack.push(Integer.parseInt(token));
	        }

	        else {
	            int b = (int) stack.pop();
	            int a = (int) stack.pop();

	            if (token.equals("+")) {
	            	stack.push(a + b);
	            }
	            else if (token.equals("-")) {
	            	stack.push(a - b);
	            }
	            else if (token.equals("*")) {
	            	stack.push(a * b);
	            }
	            else if (token.equals("/")) {
	            	stack.push(a / b);
	            }
	        }
	    }

	    return (int) stack.pop();
	}


	
	public static String makePostFix(String exp) {
	    LinkedStack stack = new LinkedStack();
	    String result = "";

	    String[] tokens = exp.split(" ");

	    for (int i = 0; i < tokens.length; i++) {
	        String token = tokens[i];

	        if (token.charAt(0) >= '0' && token.charAt(0) <= '9') {
	            result += token + " ";
	        }

	        else if (token.equals("(")) {
	            stack.push(token);
	        }

	        else if (token.equals(")")) {
	            while (!stack.isEmpty() && !stack.peek().equals("(")) {
	                result += stack.pop() + " ";
	            }
	            stack.pop();
	        }

	        else {
	            while (!stack.isEmpty() &&
	                   pis((String) stack.peek()) >= pie(token)) {
	                result += stack.pop() + " ";
	            }
	            stack.push(token);
	        }
	    }

	    while (!stack.isEmpty()) {
	        result += stack.pop() + " ";
	    }

	    return result.trim();
	}

	
	private static int pis(String x) {
		if(x.equals("*") || x.equals("/"))
			return 2;
		if(x.equals("+") || x.equals("-"))
			return 1;
		if(x.equals("("))
			return 0;
		return -1;
	}
	
	private static int pie(String x) {
		if(x.equals("*") || x.equals("/"))
			return 2;
		if(x.equals("+") || x.equals("-"))
			return 1;
		if(x.equals("("))
			return 4;
		return -1;
	}

}
