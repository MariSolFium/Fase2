package personajes;

import lugares.*;
import profesiones.*;
import utilidades.*;

public class Inigo extends PersonajeCuento {

	public Inigo(Lugar ubicacionAct, Profesion profesion) {
		super("Iñigo Montoya", Origen.ESPANA, Sexo.HOMBRE, EstadoCivil.SOLTERO, EstadoSalud.VIVO,
				TipoImportancia.PROTAGONISTA, ubicacionAct, profesion, Motivacion.DESCONOCIDA);

	}

}
