package act;
public abstract class Animal {
    private String nombre;
    private int edad;
    private boolean conCola;

    
    public Animal(String nombre, int edad, boolean conCola) {
        this.nombre = nombre;
        this.edad = edad;
        this.conCola = conCola;
    }

    
    abstract void hacerSonido();

    protected void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public int getEdad() {
        return edad;
    }

    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    public boolean conCola() {
        return conCola;
    }

    
    public void setConCola(boolean conCola) {
        this.conCola = conCola;
    }
}
