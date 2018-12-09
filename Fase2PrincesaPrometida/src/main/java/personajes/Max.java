package personajes;

import lugares.*;
import profesiones.*;
import utilidades.*;

public class Max extends PersonajeCuento {

	public Max(Lugar ubicacionAct, Profesion profesion) {
		super("Milagroso Max", Origen.FLORIN, Sexo.HOMBRE, EstadoCivil.SOLTERO, EstadoSalud.VIVO,
				TipoImportancia.SECUNDARIO, ubicacionAct, profesion, Motivacion.DESCONOCIDA);
	}

}
