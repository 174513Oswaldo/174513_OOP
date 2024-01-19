package pack;

public class Main {
	public static void main(String[]args) {
		int id = 174513;
		
		Cuadrado miCuadrado = new Cuadrado(id); 
		System.out.println("Cuadrado:");
		System.out.println("El perimetro es igual a: " + miCuadrado.perimetro);
		System.out.println("El area es igual a: " + miCuadrado.area);
		System.out.println("La diagonal es igual a: " + miCuadrado.diagonal);
		
		
		Circulo miCirculo = new Circulo(id);
		System.out.println("Circulo:");
		System.out.println("La circunferencia es igual a: " + miCirculo.circunferencia);
		System.out.println("El area es igual a: " + miCirculo.area);
		
	}

}
