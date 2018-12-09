package utilidades;

public class ConsultaQue implements Consulta {
		
	private Acto acto;
	
	
	public ConsultaQue(Acto acto) {
		this.acto = acto;
	}

	
	public Acto getActo() {
		return acto;
	}



	@Override
	public String getTipo() {
		return "ConsultaQue";
	}
	
	
	
	
	
}
