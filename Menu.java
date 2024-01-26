package pack;
import java.util.Scanner;

public class Menu {
	public static void main (String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("Bienvenido. ¿Que deseas hacer?");
			System.out.println("1. Crear un circulo");
			System.out.println("2. Crear un cuadrado");
			System.out.println("3. Salir del programa");
			
			int opcion = Integer.parseInt(scanner.nextLine());
			
			switch(opcion) {
			case 1:
				Circulo.circulo();
				break;
			case 2:
				Cuadrado.cuadrado();
				break;
			case 3:
				System.out.println("Saliendo...");
				System.exit(0);
				break;
				default:
					System.out.println("Esta opcion no esta permitida");
			}
		
		}
	}
}
