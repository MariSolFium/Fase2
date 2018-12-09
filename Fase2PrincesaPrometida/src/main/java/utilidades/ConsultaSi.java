package utilidades;

public class ConsultaSi implements Consulta {
		private Consulta consulta;
		private String nombre;
		private String valorAtributo = null;
	
		/*
		 * Constructor para una Consulta con condicion tipo <nombre> es <valor_de_atributo>
		 */
		public ConsultaSi(String nombre, String valorAtributo, Consulta consulta) {
			this.nombre = nombre;
			this.valorAtributo = valorAtributo;
			this.consulta = consulta;
				
		}
		
		public Consulta getConsulta() {
			return consulta;
		}

		public String getNombre() {
			return nombre;
		}

		public String getValorAtributo() {
			return valorAtributo;
		}

		/*
		 * Constructor para una Consulta con condicion tipo <nombre> no existe
		 */
		public ConsultaSi(String nombre, Consulta consulta) {
			this.nombre = nombre;
			this.consulta = consulta;
		}
		
		

		public boolean isConsultaNombreNoExiste() {
			return valorAtributo == null;
		}
		
		
	

		@Override
		public String getTipo() {
			return "ConsultaSi";
		}

		@Override
		public Acto getActo() {
			return consulta.getActo();
		}
		
		
		
		
		
		
	
}
