package utilidades;

public enum TituloNobiliario {
	CONDE, REY, PRINCIPE;

	public String getString() {
		switch (this) {
		case CONDE:
			return "conde";
		case REY:
			return "rey";
		case PRINCIPE:
			return "príncipe";
		default:
			return "no tiene título";
		}
	}
}
