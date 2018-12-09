package personajes;

import lugares.*;
import profesiones.*;
import utilidades.*;

public class Valerie extends PersonajeCuento {

	public Valerie(Lugar ubicacionAct, Profesion profesion) {
		super("Valerie", Origen.FLORIN, Sexo.MUJER, EstadoCivil.SOLTERO, EstadoSalud.VIVO, TipoImportancia.SECUNDARIO,
				ubicacionAct, profesion, Motivacion.DESCONOCIDA);
	}

}
