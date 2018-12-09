package personajes;

import java.util.*;

import lugares.*;
import utilidades.*;
import relaciones.*;

public abstract class Personaje {

	private EstadoCivil estadoCivil;
	private EstadoSalud estadoSalud;
	private String nombre;
	private Origen origen;
	private boolean perteneceCuento;
	private Sexo sexo;
	private TipoImportancia tipoImportancia;
	private Lugar ubicacionActual;

	private ArrayList<Relacion> relacionesPersonaje;

	/**
	 * Constructor para quitar la variable perteneceCuento
	 * 
	 * @param nombre
	 * @param origen
	 * @param sexo
	 * @param estadoCivil
	 * @param salud
	 * @param importancia
	 * @param ubicacionAct
	 */
	public Personaje(String nombre, Origen origen, Sexo sexo, EstadoCivil estadoCivil, EstadoSalud salud,
			TipoImportancia importancia, Lugar ubicacionAct) {
		this.estadoCivil = estadoCivil;
		this.estadoSalud = salud;
		this.nombre = nombre;
		this.origen = origen;
		this.sexo = sexo;
		this.tipoImportancia = importancia;
		this.ubicacionActual = ubicacionAct;
		this.relacionesPersonaje = new ArrayList<Relacion>();
	}

	public ArrayList<Relacion> getRelacionesPersonaje() {
		return relacionesPersonaje;
	}

	public void setRelacionesPersonaje(ArrayList<Relacion> relacionesPersonje) {
		this.relacionesPersonaje = relacionesPersonje;
	}

	public void addRelacion(Relacion rel) {
		this.relacionesPersonaje.add(rel);
	}

	public void removeRelacion(Relacion rel) {
		this.relacionesPersonaje.remove(rel);
	}
	
	public boolean tieneRelacion(Personaje p) {
		for (Relacion relacion : relacionesPersonaje) {
			if(relacion.getAfectado().equals(p)) return true;
		}
		return false;
		
	}
	
	public boolean noTieneRelacion(Personaje p) {
		for (Relacion relacion : relacionesPersonaje) {
			if(relacion.getAfectado().equals(p)) return false;
		}
		return true;
	}
	
	public boolean esConocido(Personaje p) {
		for (Relacion relacion : relacionesPersonaje) {
			if(relacion.getAfectado().equals(p)) {
				if(relacion.getNombre()=="conoce a" || relacion.getNombre()=="conocido de")
				return true;
			}
		}
		return false;
	}
	
	public Relacion getRelacion(Personaje p) {
		for (Relacion relacion : relacionesPersonaje) {
			if(relacion.getAfectado().equals(p)) return relacion;
		}
		return null;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public EstadoSalud getEstadoSalud() {
		return estadoSalud;
	}

	public void setEstadoSalud(EstadoSalud estadoSalud) {
		this.estadoSalud = estadoSalud;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Origen getOrigen() {
		return origen;
	}

	public void setOrigen(Origen origen) {
		this.origen = origen;
	}

	public boolean isPerteneceCuento() {
		return perteneceCuento;
	}

	public void setPerteneceCuento(boolean perteneceCuento) {
		this.perteneceCuento = perteneceCuento;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public TipoImportancia getTipoImportancia() {
		return tipoImportancia;
	}

	public void setTipoImportancia(TipoImportancia tipoImportancia) {
		this.tipoImportancia = tipoImportancia;
	}

	public Lugar getUbicacionActual() {
		return ubicacionActual;
	}

	public void setUbicacionActual(Lugar ubicacionActual) {
		this.ubicacionActual = ubicacionActual;
	}

	@Override
	public String toString() {
		String ub;
		if (ubicacionActual == null)
			ub = "actualmente no sé donde se encuentra";
		else
			ub = "actualmente se encuentra en " + ubicacionActual.toString();
		String cadena = nombre + " es un personaje " + tipoImportancia.getString() + ". Es de " + origen.getString() + " y " + ub
				+ ". Es " + sexo.getString() + ", está " + estadoSalud.getString() + " y su estado civil es "
				+ estadoCivil.getString() + ". " + nombre + " " + relacionesPersonaje + ".";
		return cadena;

	}

}
