package actividad;

public class MyStacks {
	
	public char[] stack;
	public int MAX;
	public int top;
	
	
	public MyStacks(int size){
		MAX = size;
		top = -1;
		stack = new char [MAX];
	}
	
	
	public void push (char obj) {
		if(top < MAX-1) {
			stack[++top] = obj;
		}else {
			System.out.println("La pila se encuentra llena");
		}
	}
	
	
	public char pop() {
		if(top >= 0) {
			return stack[top--];
		}else {
			System.out.println("La pila se encuentra vacia");
			return '#';
		}
	}
	
	
	 public boolean empty() {
	        return (top == -1);
	    }
	    
	    public String reverseString(String input) {
	        int largo = input.length();
	        StringBuilder reversed = new StringBuilder(largo);
	
	        for (int i = 0; i < largo; i++) {
	            push(input.charAt(i));
	        }
	
	        while (!empty()) {
	            reversed.append(pop());
	        }
	
	        return reversed.toString();
	    }
	
	    public boolean palindromo(String input) {
	        String reversed = reverseString(input);
	        return input.equals(reversed);
	    }
	
	    
}
