package actividad;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;

public class Manager {
	public void ejecutar() {
		List<Integer> listaFibonacci = Fibonacci.unFibonacci(1000000);
		List<Integer> numPares = Splitter.numerosPares(listaFibonacci);
		List<Integer> numImpares = Splitter.numerosImpares(listaFibonacci);
		
		
		PrintNumbers(listaFibonacci, "Lista Fibonacci: ");
		System.out.println("");
		PrintNumbers(numPares, "Numeros pares: ");
		System.out.println("");
		PrintNumbers(numImpares, "Numeros impares: ");
		
		
		writeToFile("lisaFibonacci.txt", listaFibonacci);
		writeToFile("numPares.txt", numPares);
		writeToFile("numImpares.txt", numImpares);
	}
	
	
	private void PrintNumbers(List<Integer> numeros, String titulo) {
		System.out.println(titulo);
		for (int numero : numeros) {
			System.out.println(numero);
		}
	}
	
	
	private void writeToFile(String filename, List<Integer> numeros) {
		try (FileWriter writer = new FileWriter(filename)){
			for (int numero : numeros) {
				writer.write(numero + "\n");
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
