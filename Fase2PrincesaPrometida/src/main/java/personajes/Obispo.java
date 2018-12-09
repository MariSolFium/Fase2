package personajes;

import lugares.*;
import profesiones.*;
import utilidades.*;

public class Obispo extends PersonajeCuento{
	
	public Obispo(Lugar ubicacionAct, Profesion profesion) {
		super("Obispo Gangoso", Origen.FLORIN, Sexo.HOMBRE, EstadoCivil.SOLTERO, EstadoSalud.VIVO,  
				TipoImportancia.SECUNDARIO, ubicacionAct, profesion, Motivacion.DESCONOCIDA);
	}

	
	
}
