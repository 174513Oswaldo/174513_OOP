package examen;
import java.util.Scanner; 

public class Ejecucion {
	public void iniciarPrograma() {
		Palabras noPalindromo = new Palabras ("hasta luego cocodrilo");
		Palabras palindromo = new Palabras ("anita lava la tina");
		
		
		System.out.println("Tarea 1. Primera letra mayuscula: ");
		noPalindromo.convertirPrimeraMayuscula();
		palindromo.convertirPrimeraMayuscula();
		System.out.println("");
		
		System.out.println("Tarea 2. Invertir una oración: ");
		noPalindromo.invertirCadena();
		palindromo.invertirCadena();
		System.out.println("");
		
		System.out.println("Tarea 3. Vocales en mayuscula: ");
		noPalindromo.convertirVocalesMayuscula();
		palindromo.convertirVocalesMayuscula();
		System.out.println("");
		
		System.out.println("Tarea 4. ¿Es palindromo?");
		System.out.println("La oracion: " + noPalindromo.cadena + " es un palindromo? " + noPalindromo.checarPalindromo());
        System.out.println("La oracion: " + palindromo.cadena + " es un palindromo? " + palindromo.checarPalindromo());
		System.out.println("");
		
		System.out.println("Tarea 5. ¿Desea ejecutar el metodo FizzBuzz? (Responda con si/no)");
		Scanner scanner = new Scanner(System.in);
		String opcion = scanner.nextLine().toLowerCase();
		if(opcion.equals("si")) {
			Extra fizzBuzz = new Extra();
			fizzBuzz.crearfizzBuzz();
		}
		scanner.close();
	}

}
