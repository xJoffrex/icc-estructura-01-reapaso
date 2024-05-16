import java.util.Arrays;

import Controllers.PersonaController;
import Models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Persona[] personas = new Persona[] {
                new Persona("Juan", 25),
                new Persona("Ana", 30),
                new Persona("Pedro", 20),
                new Persona("Maria", 35),
                new Persona("Jorge", 25),
                new Persona("Sara", 30),
                new Persona("Carlos", 45),
                new Persona("Lucia", 25),
                new Persona("Mateo", 20),
                new Persona("Irene", 18)
        };

        PersonaController controller = new PersonaController();
        controller.ordenarPorEdad(personas);
        System.out.println(Arrays.toString(personas));

        Persona result = controller.buscarPorEdad(personas, 20);
        System.out.println(result != null ? result : "No se encontró persona con esa edad.");
    }
}
