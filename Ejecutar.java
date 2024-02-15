package actividad;

public class Ejecutar {
	public void iniciarPrograma() {
		
		MyStacks stack = new MyStacks(6);
		/*
		stack.push('A');
		stack.push('B');
		stack.push('C');
		stack.push('D');
		stack.push('E');
		*/ // "El stack se encuentra vacio"
		System.out.println("Pop: " + stack.pop());
		System.out.println(" ");
		
		
		MyQueues queue = new MyQueues(7);
		queue.insert('F');
		queue.insert('G');
		queue.insert('H');
		queue.insert('I');
		queue.insert('J');
		System.out.println("Delete: " + queue.delete());
		System.out.println(" ");
		
		
		String palabra = "narran";
		System.out.println("La palabra invertida es: " + stack.reverseString(palabra));
		System.out.println("La palabra: " + palabra + ", es un palindromo? " + stack.palindromo(palabra));
	}
	
	
}
