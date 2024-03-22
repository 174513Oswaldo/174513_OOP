package actividad;
import java.util.List;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a Adivina el Poke");

        while (true) {
            System.out.println("1. Crear un perfil para jugador/a");
            System.out.println("2. Jugar Adivina el Poke");
            System.out.println("3. Salir");
            System.out.print("Escoje el número de una de las opciones: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crearPerfil(scanner);
                    break;
                case 2:
                    jugarAdivinaQuien(scanner);
                    break;
                case 3:
                    System.out.println("¡Nos vemos:)!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Por favor, selecciona una de las tres opciones validas.");
            }
        }
    }

    
    private static void crearPerfil(Scanner scanner) {
        System.out.print("Ingrese el nombre del/la jugador/a: ");
        String nombre = scanner.next();
        Jugador jugador = new Jugador(nombre);
        guardarPerfil(jugador);
    }

    
    private static void guardarPerfil(Jugador jugador) {
        try (FileWriter writer = new FileWriter(jugador.getNombre() + ".txt");
             BufferedWriter bw = new BufferedWriter(writer)) {
            bw.write("Nombre: " + jugador.getNombre());
            bw.newLine();
            bw.write("Partidas jugadas: " + jugador.getPartidasJugadas());
            bw.newLine();
            bw.write("Partidas ganadas: " + jugador.getPartidasGanadas());
            bw.newLine();
            System.out.println("El perfil se ha guardado.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Hubo un problema al guardar el perfil.");
        }
    }

    
    private static Jugador cargarPerfil(String nombre) {
        File file = new File(nombre + ".txt");
        if (!file.exists()) {
            System.out.println("Perfil no encontrado. Por favor, crea un perfil primero.");
            return null;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            String playerName = null;
            int gamesPlayed = 0;
            int gamesWon = 0;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("Nombre: ")) {
                    playerName = line.substring("Nombre: ".length());
                } else if (line.startsWith("Partidas jugadas: ")) {
                    gamesPlayed = Integer.parseInt(line.substring("Partidas jugadas: ".length()));
                } else if (line.startsWith("Partidas ganadas: ")) {
                    gamesWon = Integer.parseInt(line.substring("Partidas ganadas: ".length()));
                }
            }
            return new Jugador(playerName, gamesPlayed, gamesWon);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al cargar el perfil del/la jugador/a.");
        }
        return null;
    }

    private static void jugarAdivinaQuien(Scanner scanner) {
        System.out.print("El nombre del/la jugador/a es: ");
        String nombre = scanner.next();
        Jugador jugador = cargarPerfil(nombre);

        if (jugador == null) {
            return;
        }

        int juegosJugados = jugador.getPartidasJugadas();
        int juegosGanados = jugador.getPartidasGanadas();

        List<Pokemon> pokemonList = new Ejecutar().iniciarPrograma();
        Menu menu = new Menu(pokemonList);
        menu.comenzarJuego();

        System.out.println("Estadísticas del perfil de " + jugador.getNombre() + ":");
        System.out.println("Partidas jugadas: " + juegosJugados);
        System.out.println("Partidas ganadas: " + juegosGanados);

        guardarPerfil(jugador);
    }
}

class Jugador {
    private String nombre;
    private int partidasJugadas;
    private int partidasGanadas;

    public Jugador(String nombre) {
        this(nombre, 0, 0);
    }

    public Jugador(String nombre, int partidasJugadas, int partidasGanadas) {
        this.nombre = nombre;
        this.partidasJugadas = partidasJugadas;
        this.partidasGanadas = partidasGanadas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void incrementarPartidasJugadas() {
        partidasJugadas++;
    }

    public void incrementarPartidasGanadas() {
        partidasGanadas++;
    }
}