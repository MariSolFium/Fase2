package utilidades;

public class ConsultaInvalida implements Consulta{

	@Override
	public String getTipo() {
		return "Consulta Invalida";
	}

	@Override
	public Acto getActo() {
		return null;
	}

}
