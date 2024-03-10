package examen;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Menu {
    public final List<Pokemon> pokemonList;
    public Pokemon eleccionPoke;
    public final Scanner scanner;

    
    public Menu(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
        this.scanner = new Scanner(System.in);
        unPokemonRand();
    }

    
    private void unPokemonRand() {
        Random random = new Random();
        int index = random.nextInt(pokemonList.size());
        eleccionPoke = pokemonList.get(index);
    }

    
    private void hacerPregunta(Pokemon eleccionPoke) {
        System.out.println("Escoge el numero de la pregunta que quieras hacer:");
        System.out.println("1. ¿El pokemon es de un tipo en particular?");
        System.out.println("2. ¿El pokemon tiene algun ataque especifico?");
        System.out.println("3. ¿Es un pokemon especifico de la lista?");
        int opc = scanner.nextInt();

        
        switch (opc) {
            case 1 -> {
                System.out.println("Escoge uno de los 3 tipos: ");
                String type = scanner.next().toLowerCase();
                if (type.equals(eleccionPoke.getTipo())) {
                    System.out.println("¡Verdadero!");
                    pokemonList.removeIf(pokemon -> !pokemon.getTipo().equals(type));
                } else {
                    System.out.println("¡Falso!");
                    pokemonList.removeIf(pokemon -> pokemon.getTipo().equals(type));
                }
                System.out.println("Pokemones restantes:");
                pokeLista();
            }
            
            case 2 -> {
                System.out.println("Escoge uno de los ataques: ");
                String attack = scanner.next();
                if (eleccionPoke.getAtaques().contains(attack)) {
                    System.out.println("¡Verdadero!");
                    pokemonList.removeIf(pokemon -> !pokemon.getAtaques().contains(attack));
                } else {
                    System.out.println("¡Falso!");
                    pokemonList.removeIf(pokemon -> pokemon.getAtaques().contains(attack));
                }
                System.out.println("Pokemones restantes:");
                pokeLista();
                
            }
            
            case 3 -> {
                System.out.print("Escribe el nombre del Pokemon: ");
                String name = scanner.next();
                if (name.equals(eleccionPoke.getNombre())) {
                    System.out.println("¡Verdadero!");
                    pokemonList.clear();
                    System.out.println("¡Felicidades! Adivinaste el Pokemon:)");
                    System.exit(0);
                } else {
                    System.out.println("¡Falso!");
                    pokemonList.removeIf(pokemon -> pokemon.getNombre().equals(name));
                }
                System.out.println("Pokemones restantes:");
                pokeLista();
            }
        }
    }

    
    private void pokeLista() {
        for (int i = 0; i < pokemonList.size(); i++) {
            System.out.println((i + 1) + ". " + pokemonList.get(i).getNombre() + " ----(Tipo " + pokemonList.get(i).getTipo() + ")---- " + "Ataques " + pokemonList.get(i).getAtaques());
        }
    }

    
    public void comenzarJuego() {
        System.out.println("Bienvenido a ¡Adivina el Poke!");
        System.out.println("Tienes 4 preguntas para adivinar el Pokemon.");
        System.out.println("Una vez que hayas hecho las 4 preguntas, se te pedirá que elijas una de las opciones restantes.");
        System.out.println("");
        System.out.println("La siguiente lista muestra los Pokemones, sus tipos y ataques:");
        pokeLista();

        System.out.println("");
        for (int i = 0; i < 4; i++) {
            System.out.println("Pregunta numero " + (i + 1) + ": ");
            hacerPregunta(eleccionPoke);
        }
        
        System.out.println("");
        System.out.println("De las siguientes opciones, elige el numero de tu elección final:");

        for (int i = 0; i < pokemonList.size(); i++) {
            System.out.println((i + 1) + ". " + pokemonList.get(i).getNombre());
        }

        
        int userChoice = scanner.nextInt();
        if (pokemonList.get(userChoice - 1).equals(eleccionPoke)) {
            System.out.println("¡Ehhhh! Adivinaste el pokemon:).");
        } else {
            System.out.println("¡Uyyyy! No lograste adivinar, el Pokemon era: " + eleccionPoke.getNombre());
        }
    }
}	   
