package actividad;
import java.util.List;
import java.util.ArrayList;

public class Splitter {
	public static List<Integer> numerosPares (List<Integer> numeros){
		List<Integer> numPares = new ArrayList<>();
		for (int numero : numeros) {
			if (numero %2 == 0) {
				numPares.add(numero);
			}
		}
		return numPares;
	}
	
	
	public static List<Integer> numerosImpares(List<Integer> numeros){
		List<Integer> numImpares = new ArrayList<>();
		for (int numero : numeros) {
			if (numero %2 != 0) {
				numImpares.add(numero);
			}
		}
		return numImpares;
	}
	
	
}
	
