package actividad;
import java.util.List;
import java.util.ArrayList;

public class Fibonacci {
	public static List<Integer> unFibonacci(int limit){
		List<Integer> listaFibonacci = new ArrayList<>();
		int a = 0;
		int b = 1;
		
		while(a <= limit) {
			listaFibonacci.add(a);
			int next = a + b;
			a = b;
			b = next;
		}		
		return listaFibonacci;
	}

	
}
