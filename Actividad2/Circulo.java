package pack;

public class Circulo {
	public double circunferencia;
	public double radio;
	public double area;
	
	
	public double calcularCircunferencia(){
		circunferencia = 2*Math.PI*radio;
		return circunferencia;
	}
	
	public double calcularArea() {
		area = radio*Math.PI*radio;
		return area;
	}
	
	
	public Circulo (int id) {
		radio = id/1000.0;
		calcularCircunferencia();
		calcularArea();
	}
	
}
