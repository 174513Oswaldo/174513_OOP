package act;
public class Mamifero extends Animal {
    private int numPatas;
    private boolean pelo;

    
    public Mamifero(String nombre, int edad, boolean tieneCola, int numPatas, boolean pelo) {
        super(nombre, edad, tieneCola);
        this.numPatas = numPatas;
        this.pelo = pelo;
    }

 
    void hacerSonido() {
        System.out.println(getNombre() + " Un mamífero hablando.");
    }

    
    public int getNumPatas() {
        return numPatas;
    }

    
    public boolean elPelo() {
        return pelo;
    }
}
