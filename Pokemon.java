package actividad;
import java.util.List;


abstract class Pokemon {
	String nombre;
    String tipo;
    List<String> ataques;

    
    public Pokemon(String nombre, String tipo, List<String> ataques) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ataques = ataques;
    }

    
    public String getNombre() {
        return nombre;
    }

    
    public String getTipo() {
        return tipo;
    }

    
    public List<String> getAtaques() {
        return ataques;
    }


}