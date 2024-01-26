package pack;
import java.util.Scanner;

public class Cuadrado {
	public static void cuadrado() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("¿Que deseas calcular?");
		
		while(true) {
			System.out.println("1. Perimetro");
			System.out.println("2. Area");
			System.out.println("3. Diagonal");
			System.out.println("4. Regresar al menu anterior");
			System.out.println("5. Salir del programa");
			int opCuadrado = scanner .nextInt();
			
			
			switch(opCuadrado) {
			case 1:
				cuadradoPerimetro();
				break;
			case 2:
				cuadradoArea();
				break;
			case 3:
			    cuadradoDiagonal();
				break;
			case 4:
				return;
			case 5:
				System.out.println("Saliendo...");
				System.exit(0);
				break;
			default:
				System.out.println("Esta opcion no esta permitida");
			}
			System.out.println("");
        	System.out.println("¿Desea calcular algo más?");
		}
	}
	
	
	private static void cuadradoPerimetro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();
        double perimetro = lado * 4;
        System.out.println("El perimetro del cuadrado es igual a: " + perimetro);
	}
	
	
	private static void cuadradoArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();
        double area = Math.pow(lado, 2);
        System.out.println("El area del cuadrado es igual a: " + area);
	}
	
	
	private static void cuadradoDiagonal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();
        double diagonal = Math.sqrt(2) * lado;
        System.out.println("La diagonal del cuadrado es igual a: " + diagonal);
	}
	
	
}
