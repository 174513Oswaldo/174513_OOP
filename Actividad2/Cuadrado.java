package pack;

public class Cuadrado {
	public double lado;
	public double perimetro;
	public double area;
	public double diagonal;
	
	
	
	public double calcularPerimetro() {
		this.perimetro = 4*lado;
		return perimetro;
	}
	public double calcularArea(){
		this.area = lado*lado;
		return area;
	}
	 public double calcularDiagonal() {
		this.diagonal = Math.sqrt(2)*lado;
		return diagonal;
	}
	
	
	
	public Cuadrado(int id) {
		this.lado = id/1000.0;
		calcularPerimetro();
		calcularArea();
		calcularDiagonal();
	}

}
