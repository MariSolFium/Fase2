package profesiones;

public abstract class Profesion {

	private final String nombre;
	
	public Profesion(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
}
