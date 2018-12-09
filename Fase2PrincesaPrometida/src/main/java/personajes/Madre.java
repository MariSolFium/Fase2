package personajes;

import lugares.*;
import utilidades.*;

public class Madre extends Personaje {

	
	public Madre(Lugar ubicacionAct) {
		super("La Madre", Origen.CHICAGO, Sexo.MUJER, EstadoCivil.CASADO, EstadoSalud.VIVO,
				TipoImportancia.SECUNDARIO, ubicacionAct);
	}
}
