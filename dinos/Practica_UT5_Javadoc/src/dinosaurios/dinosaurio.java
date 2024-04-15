package dinosaurios;

/**
 * Esta es la clase Dinosaurio tiene a los dinousaurios con sus nombre y edades.
 * 
 * @author bjjnr
 * @version 1.0.0
 */
public class dinosaurio {
    private String nombre;
    private int edad;

    /**
     * Crea un nuevo dinosaurio con el nombre y la edad .
     * 
     * @param nombre El nombre del dinosaurio.
     * @param edad La edad del dinosaurio.
     */
    public dinosaurio(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Obtiene el nombre del dinosaurio.
     * 
     * @return El nombre del dinosaurio.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la edad del dinosaurio.
     * 
     * @return La edad del dinosaurio.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Hace que el dinosaurio cumpla un año más.
     */
    public void cumpleAnios() {
        edad++;
    }

    /**
     * Imprime un rugido del dinosaurio.
     */
    public void rugir() {
        System.out.println("¡ROAARRR!");
    }
}
