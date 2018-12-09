package utilidades;

public enum TipoImportancia {
	SECUNDARIO, NARRADOR, PROTAGONISTA;

	public String getString() {
		switch (this) {
		case SECUNDARIO:
			return "secundario";
		case NARRADOR:
			return "narrador";
		case PROTAGONISTA:
			return "protagonista";
		default:
			return "no tiene importancia";
		}
	}
}
