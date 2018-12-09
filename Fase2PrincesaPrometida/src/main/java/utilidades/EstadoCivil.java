package utilidades;

public enum EstadoCivil {
	SOLTERO, CASADO, INDEFINIDO;
	
	public String getString() {
		switch (this) {
		case SOLTERO:
			return "soltero";
		case CASADO:
			return "casado";
		case INDEFINIDO:
			return "indefinido";
		default:
			return "no se sabe";
		}

	}
}
