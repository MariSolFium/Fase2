package personajes;

import lugares.*;
import profesiones.*;
import utilidades.*;

public class Albino extends PersonajeCuento {
 
	public Albino(Lugar ubicacionAct, Profesion profesion) {
		super("Jai", Origen.FLORIN, Sexo.HOMBRE, EstadoCivil.INDEFINIDO, EstadoSalud.VIVO,
				TipoImportancia.SECUNDARIO, ubicacionAct, profesion, Motivacion.DESCONOCIDA);
	}

}
