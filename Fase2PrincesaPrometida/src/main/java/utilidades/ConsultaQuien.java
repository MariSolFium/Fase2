package utilidades;
/*
 * Una consulta quien tiene 2 atributos.
 * Quien es <nombre> hasta el <acto>
 */
public class ConsultaQuien implements Consulta {
	
	private String nombre;
	private Acto acto;
	
	
	public ConsultaQuien(String nombre, Acto acto) {
		this.nombre = nombre;
		this.acto = acto;
		
	}

	public String getNombre() {
		return nombre;
	}

	public Acto getActo() {
		return acto;
	}
	@Override
	public String getTipo() {
		return "ConsultaQuien";
	}
	
}
