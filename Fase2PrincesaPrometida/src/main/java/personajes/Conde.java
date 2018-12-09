package personajes;

import lugares.Lugar;
import profesiones.*;
import utilidades.*;

public class Conde extends PersonajeCuento {

	public Conde(Lugar ubicacionAct, Profesion profesion) {
		super("Tyrone Rugen", Origen.FLORIN, Sexo.HOMBRE, EstadoCivil.SOLTERO, EstadoSalud.VIVO,
				TipoImportancia.SECUNDARIO, ubicacionAct, profesion, Motivacion.DESCONOCIDA);
	}

}
