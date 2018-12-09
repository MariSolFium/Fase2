package personajes;

import lugares.*;
import utilidades.*;

public class Abuelo extends Personaje {

	public Abuelo(Lugar ubicacionAct) {
		super("Abuelo", Origen.CHICAGO, Sexo.HOMBRE, EstadoCivil.CASADO, EstadoSalud.VIVO, 
				TipoImportancia.NARRADOR, ubicacionAct);
	}

}
