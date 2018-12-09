package personajes;

import lugares.*;
import profesiones.*;
import utilidades.*;

public class Yalin extends PersonajeCuento {

	public Yalin(Lugar ubicacionAct, Profesion profesion) {
		super("Yalin", Origen.FLORIN, Sexo.HOMBRE, EstadoCivil.SOLTERO, EstadoSalud.VIVO, TipoImportancia.SECUNDARIO,
				ubicacionAct, profesion, Motivacion.DESCONOCIDA);
	}

}
