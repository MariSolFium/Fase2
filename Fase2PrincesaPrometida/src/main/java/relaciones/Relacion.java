package relaciones;

import java.util.ArrayList;
import java.util.List;

import personajes.*;

public abstract class Relacion {

	private Personaje afectado;
	private final String nombre;

	public Relacion(String nombre, Personaje afectado) {
		this.nombre = nombre;
		this.afectado = afectado;
	}

	public Personaje getAfectado() {
		return afectado;
	}

	public void setAfectado(Personaje afectado) {
		this.afectado = afectado;
	}

	public String getNombre() {
		return nombre;
	}

	/***
	 * devuelve la lista de relaciones que tiene p1 con p2, siendo p2 el afectado
	 * 
	 * @param personaje uno
	 * @param personaje afectado
	 * @return Lista con las relaciones que tiene p1 con p2.
	 */
	public static List<Relacion> getRelaciones2personajes(Personaje p1, Personaje p2) {
		ArrayList<Relacion> relaciones = new ArrayList<>();
		ArrayList<Relacion> relacionesP1 = p1.getRelacionesPersonaje();

		for (Relacion relacionp1 : relacionesP1) {
			if (relacionp1.afectado == p2)
				relaciones.add(relacionp1);
		}

		return relaciones;

	}

	@Override
	public String toString() {
		return nombre + " " + afectado.getNombre();
	}

	public static boolean notExistsRelacion(Personaje p1, Personaje p2) {
		ArrayList<Relacion> relaciones = new ArrayList<>();
		ArrayList<Relacion> relacionesP1 = p1.getRelacionesPersonaje();

		for (Relacion relacionp1 : relacionesP1) {
			if (relacionp1.afectado == p2)
				return false;
		}

		return true;

	}

}
