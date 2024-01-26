package pack;
import java.util.Scanner;

public class Circulo {
	public static void circulo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("¿Que deseas calcular?");
        
        while(true) {
        	System.out.println("1. Area");
        	System.out.println("2. Circunferencia");
        	System.out.println("3. Regresar al menu anterior");
        	System.out.println("4. Salir del programa");
        	int opCirculo = scanner.nextInt();
        	
        	
        	switch(opCirculo) {
        	case 1:
        		circuloArea();
        		break;
        	case 2:
        		circuloCircunferencia();
        		break;
        	case 3:
        		return;
        	case 4:
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


	private static void circuloArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el radio de tu círculo: ");
        double radio = scanner.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es igual a: " + area);
    }
	
	
	private static void circuloCircunferencia() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el radio de tu círculo: ");
        double radio = scanner.nextDouble();
        double circunferencia = 2 * Math.PI * radio;
        System.out.println("La circunferencia del círculo es igual a: " + circunferencia);
	}
	
	
}
