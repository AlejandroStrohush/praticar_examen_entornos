
package dinosaurios;

/**
 * Esta es clase principal del proyecto Dinosaurios.
 * Esta clase contiene el método main para ejecutar el proyecto.
 * 
 * @author bjjnr
 * @version 1.0.0
 */
public class main {

    /**
     * El método principal que inicia la ejecución del programa.
     * 
     * @param args He creado dinosaurios para probar.
     */
    public static void main(String[] args) {
        // Crear un dinosaurio
        dinosaurio dinosaurio = new dinosaurio("T-Rex", 20);
        
        // Mostrar información del dinosaurio
        System.out.println("Nombre del dinosaurio: " + dinosaurio.getNombre());
        System.out.println("Edad del dinosaurio: " + dinosaurio.getEdad());
        System.out.println("-----------------------------");
        
        // Cumplir años al dinosaurio
        dinosaurio.cumpleAnios();
        
        // Mostrar información del dinosaurio después de cumplir años
        System.out.println("Después de cumplir años:");
        System.out.println("Nombre del dinosaurio: " + dinosaurio.getNombre());
        System.out.println("Edad del dinosaurio: " + dinosaurio.getEdad());
        System.out.println("-----------------------------");

        // Crear un terodáctilo
        Terodactilo terodactilo = new Terodactilo("Pterry", 5);
        
        // Mostrar información del terodáctilo
        System.out.println("Nombre del terodáctilo: " + terodactilo.getNombre());
        System.out.println("Envergadura del terodáctilo: " + terodactilo.getEnvergadura() + " metros");
        System.out.println("-----------------------------");

        // Hacer que el terodáctilo vuele
        terodactilo.volar();

        // Emitir sonido del terodáctilo
        terodactilo.emitirSonido();
        System.out.println("-----------------------------");

        // Realizar un ataque aéreo con el terodáctilo
        boolean exitoso = terodactilo.ataqueAereo("Triceratops");
        if (exitoso) {
            System.out.println("¡Ataque aéreo exitoso!");
        } else {
            System.out.println("El ataque aéreo falló.");
        }
    }
}

