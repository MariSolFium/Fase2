package personajes;

import lugares.*;
import profesiones.*;
import utilidades.*;

public class Anciana extends PersonajeCuento {

	public Anciana(Lugar ubicacionAct, Profesion profesion) {
		super("Ancina Abucheadora", Origen.FLORIN, Sexo.MUJER, EstadoCivil.SOLTERO, EstadoSalud.VIVO,
				TipoImportancia.SECUNDARIO, ubicacionAct, profesion, Motivacion.DESCONOCIDA);
	}

}
