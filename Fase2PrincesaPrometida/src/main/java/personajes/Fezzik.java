package personajes;

import lugares.Lugar;
import profesiones.Profesion;
import utilidades.EstadoCivil;
import utilidades.EstadoSalud;
import utilidades.Motivacion;
import utilidades.Origen;
import utilidades.Sexo;
import utilidades.TipoImportancia;

public class Fezzik extends PersonajeCuento {

	public Fezzik(Lugar ubicacionAct, Profesion profesion) {
		super("Fezzik", Origen.TURQUIA, Sexo.HOMBRE, EstadoCivil.SOLTERO, EstadoSalud.VIVO,
				TipoImportancia.PROTAGONISTA, ubicacionAct, profesion, Motivacion.DESCONOCIDA);
	}

}
