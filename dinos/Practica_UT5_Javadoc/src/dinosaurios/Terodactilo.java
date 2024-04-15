package dinosaurios;

/**
 * Esta es la clase Terodáctilo representa a un tipo de dinosaurio volador.
 * 
 * Esta clase tiene las características y acciones de un terodáctilo, como su nombre y envergadura.
 * Además, permite realizar acciones como volar, emitir sonido y realizar un poderoso e infalible ataque aéreo.
 * 
 * @author bjjnr
 * @version 1.0.0
 */
public class Terodactilo {
    private String nombre;
    private int envergadura;

    /**
     * Crea un nuevo terodáctilo con el nombre y la envergadura especificados.
     * 
     * @param nombre El nombre del terodáctilo.
     * @param envergadura La envergadura del terodáctilo en metros.
     */
    public Terodactilo(String nombre, int envergadura) {
        this.nombre = nombre;
        this.envergadura = envergadura;
    }

    /**
     * Obtiene el nombre del terodáctilo.
     * 
     * @return El nombre del terodáctilo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la envergadura del terodáctilo.
     * 
     * @return La envergadura del terodáctilo en metros.
     */
    public int getEnvergadura() {
        return envergadura;
    }

    /**
     * Realiza un vuelo.
     */
    public void volar() {
        System.out.println("¡El terodáctilo está volando!");
    }

    /**
     * Emitir sonido de terodáctilo.
     */
    public void emitirSonido() {
        System.out.println("¡Aaahhhhhhh!");
    }

    /**
     * Realiza un ataque aéreo.
     * 
     * @param objetivo El objetivo del ataque aéreo.
     * @return true si el ataque fue exitoso, false de lo contrario.
     */
    public boolean ataqueAereo(String objetivo) {
        System.out.println("El terodáctilo está atacando a " + objetivo + " desde el aire.");
        // Lógica del ataque
        return true; // Supongamos que siempre es exitoso 
    }
}

