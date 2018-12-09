package utilidades;

import java.util.HashMap;
import java.util.Map;

public enum Sexo {
	HOMBRE, MUJER;
	
	public String getString() {
		switch (this) {
		case HOMBRE:
			return "hombre";
		case MUJER:
			return "mujer";
		default:
			return "no lo sé";
		}

	}
	
	private static final Map<String, Sexo> lookup = new HashMap<>();
	
	public static Sexo get(String s) {
		return lookup.get(s);
	}
	

	static {
		for (Sexo sexo : Sexo.values()) {
			lookup.put(sexo.getString(), sexo);
		}
	}


	public static boolean isValor(String s) {
		return s.equals("hombre") || s.equals("mujer");
	}


	
	
}
