package Controllers;

import Models.Persona;

/**
 * Controlador para manejar la lógica de operaciones sobre arrays de Persona.
 */
public class PersonaController {
    /**
     * Método para ordenar un arreglo de Persona por edad utilizando el algoritmo de
     * inserscion .
     * 
     * @param personas Array de Persona a ordenar.
     */
    public void ordenarPorEdad(Persona[] personas){

        for (int i = 1; i < personas.length; i++) {
            Persona temp = personas[i];
            int j = i - 1;

           
            while (j >= 0 && personas[j].getEdad() > temp.getEdad()) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = temp; 
        }
    }


    public Persona buscarPorEdad(Persona[] personas, int edad) {
        for (Persona persona : personas) {
            if (persona.getEdad() == edad) {
                return persona; 
            }
        }
        return null;
    }
    
}
