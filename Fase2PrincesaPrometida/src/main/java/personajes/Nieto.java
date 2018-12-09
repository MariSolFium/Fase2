package personajes;

import lugares.*;
import utilidades.*;

public class Nieto extends Personaje {

	public Nieto(Lugar ubicacionAct) {
		super("El Nieto", Origen.CHICAGO, Sexo.HOMBRE, EstadoCivil.SOLTERO, EstadoSalud.ENFERMO,
				TipoImportancia.SECUNDARIO, ubicacionAct);
	}

}
