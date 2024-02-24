package pack;
import java.util.Random;

public class Main {
	public static void main(String[]args) {
		String[] nombres = {"Oswaldo","Adrian","Carlos","Tony","Karla","Angela","Elsa","Victor","Jocelyn","Evelyn","Manuel","Omar","Irene","Javier","Isaac"};
		
		Random orden = new Random();
		int totalNombres = nombres.length;
		boolean[] imprimirNombres = new boolean[totalNombres];
		int numImpresos = 0;
		
		while(numImpresos < totalNombres) {
			int elOrden = orden.nextInt(totalNombres);
			if (!imprimirNombres[elOrden]) {
				System.out.println(nombres[elOrden]);
				imprimirNombres[elOrden] = true;
				numImpresos++;
			}
		}
	}
}
