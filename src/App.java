
import Models.Persona;
import Views.ViewConsole;
import Controllers.PersonaController;
public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {

            new Persona("Juan", 25),
            new Persona("Maria", 30),
            new Persona("Pedro", 22),
            new Persona("Steve", 28),
            new Persona("Luis", 35),
            new Persona("Alfonso", 27),
            new Persona("Laura", 40),
            new Persona("Elena", 32),
            new Persona("Carlos", 29),
            new Persona("Sofia", 26)

                

            
        };
        

    
        ViewConsole vc = new ViewConsole();
        PersonaController oe = new PersonaController();

        vc.printMessage("------------Lista de Personas Original--------------------");
        vc.printPersonasArray(personas);

        
        oe.ordenarPorEdad(personas);
        vc.printMessage("\n ------------Insercion Ascendente------------------");
        vc.printPersonasArray(personas);
        
        vc.printMessage("\n ------------Buscar Persona Edad 40------------------");

        oe.buscarPorEdad(personas, 40);

        int edadBuscar1 = 40;
        Persona resultado1 = oe.buscarPorEdad(personas, edadBuscar1);

        if (resultado1 != null) {
            vc.printMessage("Persona encontrada con edad " + edadBuscar1 + ": " + resultado1);
        } else {
            vc.printMessage("No se encontró ninguna persona con edad " + edadBuscar1);
        }


        int edadBuscar2 = 99;
        Persona resultado2 = oe.buscarPorEdad(personas, edadBuscar2);

        vc.printMessage("\n ------------Buscar Persona Edad 40------------------");

        if (resultado2 != null) {
            vc.printMessage("Persona encontrada con edad " + edadBuscar2 + ": " + resultado2);
        } else {
            vc.printMessage("No se encontró ninguna persona con edad " + edadBuscar2);
        }



        /// TODO: GENERAR INSTNACIA DE CONTROLLE Y ORDENAR EL METODO DESPUES BUSCAR POR
        /// LA EDAD

    }
}


/*Instanciar clases necesarias
         * Mensaje = Arreglo personas
         * Imprimimos el arreglo
         * Mensaje = Arreglo Ordenado por inserion ascendente
         * Imprimimos el arreglo ordenado
         * Mensaje = buscar persona con edad 40 
         * Imprimir resultado de busqurda y la persona si se econtro
         * Mensaje = buscar persona con edad 99
         * Imprimir resultado de busqurda y la persona si se encontro         
         */