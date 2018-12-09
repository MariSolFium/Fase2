package personajes;

import lugares.*;
import profesiones.*;
import utilidades.*;

public class Rey extends PersonajeCuento {

	public Rey(Lugar ubicacionAct, Profesion profesion) {
		super("El Rey", Origen.FLORIN, Sexo.HOMBRE, EstadoCivil.CASADO, EstadoSalud.VIVO, TipoImportancia.SECUNDARIO,
				ubicacionAct, profesion, Motivacion.DESCONOCIDA);

	}

}
