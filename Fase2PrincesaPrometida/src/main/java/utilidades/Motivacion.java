package utilidades;

public enum Motivacion {
	TENER_TRABAJO, SALVAR_BUTTERCUP, VENGAR_PADRE, DECLARAR_GUERRA, GANAR_DINERO, SECUESTRAR_PRINCESA,
	ESTAR_CON_WESTLEY, ESTAR_CON_BUTTERCUP, SERVIR_PRINCIPE, ESTUDIAR_DOLOR, HUMILLAR_PRINCIPE, AMOR_VERDADERO,
	SUICIDARSE, MATAR_WESTLEY, SEGUIR_VIVO, DESCONOCIDA;

	public String getString() {
		switch (this) {
		case TENER_TRABAJO:
			return "tener trabajo";
		case SALVAR_BUTTERCUP:
			return "salvar a Buttercup";
		case VENGAR_PADRE:
			return "vengar a su padre";
		case DECLARAR_GUERRA:
			return "declarar la guerra a Guilder";
		case GANAR_DINERO:
			return "ganar dinero";
		case SECUESTRAR_PRINCESA:
			return "secuestrar a la princesa";
		case ESTAR_CON_WESTLEY:
			return "estar con Westley";
		case ESTAR_CON_BUTTERCUP:
			return "estar con Buttercup";
		case SERVIR_PRINCIPE:
			return "servir al príncipe";
		case ESTUDIAR_DOLOR:
			return "estudiar el dolor";
		case HUMILLAR_PRINCIPE:
			return "humillar al príncipe";
		case AMOR_VERDADERO:
			return "amor verdadero";
		case SUICIDARSE:
			return "suicidarse";
		case MATAR_WESTLEY:
			return "matar a Westley";
		case SEGUIR_VIVO:
			return "seguir con vida";
		case DESCONOCIDA:
			return "desconocida";
		default:
			return "no tiene motivación";
		}

	}
}
