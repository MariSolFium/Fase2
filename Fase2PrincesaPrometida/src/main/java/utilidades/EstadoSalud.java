package utilidades;

import java.util.HashMap;
import java.util.Map;

public enum EstadoSalud {
	ENFERMO, VIVO, BORRACHO, MUERTO, MEDIO_MUERTO, EN_PELIGRO, DEBIL, HERIDO, RECUPERADO, INCONSCIENTE;

	public String getString() {
		switch (this) {
		case ENFERMO:
			return "enfermo";
		case VIVO:
			return "vivo";
		case BORRACHO:
			return "borracho";
		case MUERTO:
			return "muerto";
		case MEDIO_MUERTO:
			return "medio muerto";
		case EN_PELIGRO:
			return "en peligro";
		case INCONSCIENTE:
			return "inconsciente";
		case DEBIL:
			return "débil";
		case HERIDO:
			return "herido";
		case RECUPERADO:
			return "recuperado";
		default:
			return "no se sabe";
		}

	}
	
	private static final Map<String, EstadoSalud> lookup = new HashMap<>();

	public static EstadoSalud get(String s) {
		return lookup.get(s);
	}

	static {
		for (EstadoSalud es : EstadoSalud.values()) {
			lookup.put(es.getString(), es);
		}
	}

	public static boolean isValor(String s) {
		return lookup.containsKey(s);
	}
}
