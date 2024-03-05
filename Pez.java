package act;
public class Pez extends Animal {
    private String tipoEscamas;
    private boolean aguaSalada;

    
    public Pez(String nombre, int edad, boolean tieneCola, String tipoEscamas, boolean aguaSalada) {
        super(nombre, edad, tieneCola);
        this.tipoEscamas = tipoEscamas;
        this.aguaSalada = aguaSalada;
    }

    
    void hacerSonido() {
        System.out.println(getNombre() + " Un pez hablando.");
    }

    
    public String getTipoEscamas() {
        return tipoEscamas;
    }

    
    public boolean aguaSalada() {
        return aguaSalada;
    }
}