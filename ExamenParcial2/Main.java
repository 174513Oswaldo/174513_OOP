package examen;
import java.util.List;

public class Main {
    public static void main (String []args){
        List<Pokemon> pokemonList = new Ejecutar().iniciarPrograma();
        Menu menu = new Menu(pokemonList);
        menu.comenzarJuego();
    }


}
