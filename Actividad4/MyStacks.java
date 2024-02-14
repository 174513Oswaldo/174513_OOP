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
		if(top == MAX) {
			System.out.println("El stack se encuentra lleno");
		}else {
			stack[top] = obj;
			top++;
		}
	}
	
	
	public char pop() {
		if(top == 0) {
			System.out.println("El stack se encuentra vacio");
			return'#';
		}else {
			top++;
			return stack[top--];
		}
	}
	
	
}
