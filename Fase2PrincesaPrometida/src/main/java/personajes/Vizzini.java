package personajes;

import lugares.*;
import profesiones.*;
import utilidades.*;

public class Vizzini extends PersonajeCuento {

	public Vizzini(Lugar ubicacionAct, Profesion profesion) {
		super("Vizzini", Origen.SICILIA, Sexo.HOMBRE, EstadoCivil.SOLTERO, EstadoSalud.VIVO, TipoImportancia.SECUNDARIO,
				ubicacionAct, profesion, Motivacion.DESCONOCIDA);

	}

}
