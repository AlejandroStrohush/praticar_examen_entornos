package dinos;

public class Terodactilo {
	
	
	private String nombre;
    private int envergadura;
    
    
    
    public Terodactilo(String nombre, int envergadura) {
    	this.nombre = nombre;
    	this.envergadura=envergadura;
    }
    
    
    
    public String getNombre() {
		return nombre;
	}


	public int getEnvergadura() {
		return envergadura;
	}

	public void volar() {
		System.out.println("¡Mira como vuelooo!");
	}
}

