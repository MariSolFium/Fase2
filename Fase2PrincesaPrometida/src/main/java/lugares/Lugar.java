package lugares;

public abstract class Lugar {
	private final String nombre;

	public Lugar(String nom) {
		this.nombre = nom;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return nombre;
	}

}
