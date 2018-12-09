package animales;

import lugares.*;
import utilidades.EstadoSalud;

public abstract class Animal {

	private Lugar ubicacionActual;
	private final String nombre;
	private EstadoSalud estadoSalud;

	public Animal(String tipo, Lugar ub) {
		this.ubicacionActual = ub;
		this.nombre = tipo;
		this.estadoSalud = EstadoSalud.VIVO;
	}

	public Lugar getUbicacionActual() {
		return ubicacionActual;
	}

	public void setUbicacionActual(Lugar ubicacionActual) {
		this.ubicacionActual = ubicacionActual;
	}

	public String getNombre() {
		return nombre;
	}

	public EstadoSalud getEstadoSalud() {
		return estadoSalud;
	}

	public void setEstadoSalud(EstadoSalud estadoSalud) {
		this.estadoSalud = estadoSalud;
	}

	@Override
	public String toString() {
		return "Es " + nombre + ", se encuentra en " + ubicacionActual + " y su estado es " + estadoSalud;
	}

}
