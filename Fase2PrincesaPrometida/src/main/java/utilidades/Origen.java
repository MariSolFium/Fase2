package utilidades;

import java.util.HashMap;
import java.util.Map;

public enum Origen {
	SICILIA, GROENLANDIA, ESPANA, FLORIN, GUILDER, CHICAGO, TURQUIA, INGLATERRA, DESCONOCIDO;

	public String getString() {
		switch (this) {
		case SICILIA:
			return "Sicilia";
		case GROENLANDIA:
			return "Groenlandia";
		case ESPANA:
			return "España";
		case FLORIN:
			return "Florin";
		case GUILDER:
			return "Guilder";
		case CHICAGO:
			return "Chicago";
		case TURQUIA:
			return "Turquía";
		case INGLATERRA:
			return "Inglaterra";
		case DESCONOCIDO:
			return "desconocido";

		default:
			return "no lo sé";
		}

	}

	private static final Map<String, Origen> lookup = new HashMap<>();

	public static Origen get(String s) {
		return lookup.get(s);
	}

	static {
		for (Origen origen : Origen.values()) {
			lookup.put(origen.getString(), origen);
		}
	}

	public static boolean isValor(String s) {
		return lookup.containsKey(s);
	}

}
