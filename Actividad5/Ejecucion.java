package act;

public class Ejecucion {
	
	
    public void iniciarPrograma() {
        Animal[] animales = new Animal[10];
        for (int i = 0; i < 10; i++) {
            int randomClass = (int) (Math.random() * 3);

            
            if (randomClass == 0) {
                animales[i] = unMamifero();
            } else if (randomClass == 1) {
                animales[i] = unAve();
            } else {
                animales[i] = unPez();
            }
        }

        for (Animal animal : animales) {
            mostrarInf(animal);
        }
    }

    
    private Mamifero unMamifero() {
        return new Mamifero(
                "Mamifero" + (int) (Math.random() * 100),
                (int) (Math.random() * 10),
                Math.random() < 0.5,
                (int) (Math.random() * 4),
                Math.random() < 0.5
        );
    }

    
    private Ave unAve() {
        return new Ave(
                "Ave" + (int) (Math.random() * 100),
                (int) (Math.random() * 10),
                Math.random() < 0.5,
                Math.random() < 0.5,
                "Pico" + (int) (Math.random() * 5)
        );
    }

    
    private Pez unPez() {
        return new Pez(
                "Pez" + (int) (Math.random() * 100),
                (int) (Math.random() * 10),
                Math.random() < 0.5,
                "Escamas " + (int) (Math.random() * 3),
                Math.random() < 0.5
        );
    }

    
    private void mostrarInf(Animal animal) {
        System.out.println("Nombre: " + animal.getNombre());
        System.out.println("Edad: " + animal.getEdad());
        System.out.println("Tiene cola: " + animal.conCola());

        
        if (animal instanceof Mamifero) {
            Mamifero mamifero = (Mamifero) animal;
            System.out.println("Número de patas: " + mamifero.getNumPatas());
            System.out.println("Tiene pelaje: " + mamifero.elPelo());
        } else if (animal instanceof Ave) {
            Ave ave = (Ave) animal;
            System.out.println("Vuela?: " + ave.vuela());
            System.out.println("Tipo de pico: " + ave.getTipoPico());
        } else if (animal instanceof Pez) {
            Pez pez = (Pez) animal;
            System.out.println("Tipo de escamas: " + pez.getTipoEscamas());
            System.out.println("Es de agua salada?: " + pez.aguaSalada());
        }

        
        System.out.println(" ");
    }
}
