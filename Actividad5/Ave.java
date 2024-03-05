package act;
public class Ave extends Animal {
    private boolean vuela;
    private String tipoPico;

    public Ave(String nombre, int edad, boolean tieneCola, boolean vuela, String tipoPico) {
        super(nombre, edad, tieneCola);
        this.vuela = vuela;
        this.tipoPico = tipoPico;
    }

    @Override
    void hacerSonido() {
        System.out.println(getNombre() + " Un ave hablando.");
    }

    public boolean vuela() {
        return vuela;
    }

    public String getTipoPico() {
        return tipoPico;
    }
}
