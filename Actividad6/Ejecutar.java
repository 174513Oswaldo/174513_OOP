package actividad;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.List;

class Ejecutar {
	 public  List<Pokemon> iniciarPrograma() {
	        List<Pokemon> pokemonList = new ArrayList<>();
	       
	        String[] pokesAgua = {"Squirtle", "Totodile", "Mudkip", "Froakie", "Quaxly"};
	        String[] pokesFuego = {"Charmander", "Cyndaquil", "Torchic", "Litten", "Fuecoco"};
	        String[] pokesPlanta = {"Bulbasaur", "Chikorita", "Treecko", "Rowlet", "Sprigatito"};
	        List<String> listaAtaques = Arrays.asList("HydroPump", "SolarBeam", "Eruption", "Flamethrower", "AquaJet", "Whirlpool", "Synthesis", "PetalDance");
	        
	        
	        for (String nombre : pokesAgua) {
	            List<String> pokeAtaques = ataquesAleatorios(listaAtaques);
	            Pokemon pokemon = new Agua(nombre, pokeAtaques);
	            pokemonList.add(pokemon);
	        }

	        
	        for (String nombre : pokesFuego) {
	            List<String> pokeAtaques = ataquesAleatorios(listaAtaques);
	            Pokemon pokemon = new Fuego(nombre, pokeAtaques);
	            pokemonList.add(pokemon);
	        }

	        
	        for (String nombre : pokesPlanta) {
	            List<String> pokeAtaques = ataquesAleatorios(listaAtaques);
	            Pokemon pokemon = new Planta(nombre, pokeAtaques);
	            pokemonList.add(pokemon);
	        }

	        
	        Collections.shuffle(pokemonList);
	        return pokemonList;
	    }

	 
	    private static List<String> ataquesAleatorios(List<String> listaAtaques) {
	        List<String> ataquesAleatorios = new ArrayList<>();
	        Random random = new Random();

	        for (int i = 0; i < 4; i++) {
	            int indiceAleatorio = random.nextInt(listaAtaques.size());
	            if (ataquesAleatorios.contains(listaAtaques.get(indiceAleatorio))) {
	                i--;
	                continue;
	            }
	            ataquesAleatorios.add(listaAtaques.get(indiceAleatorio));
	        }
	        return ataquesAleatorios;
	    }

	    
}
