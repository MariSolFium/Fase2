package mainProyecto;

import java.io.IOException;

import java.util.Scanner;
import java.util.ArrayList;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;


import utilidades.*;

public class Main {

	private static final KieServices ks = KieServices.Factory.get();
	private static final KieContainer kContainer = ks.getKieClasspathContainer();
	private static KieSession kSession = kContainer.newKieSession("ksession-rules");

	public static void main(String[] args) throws IOException {

		// System.out.println(kContainer.verify().getMessages().toString());


		//String filePath = "/home/norberto/input1.txt";
	
		String filePath = funcionalidadConsola();
		//String filePath = "C:\\Users\\fires\\Desktop\\Nueva\\que.txt";

		//String filePath = "C:\\Users\\maris\\Desktop\\pruebasDsint\\pruebaActo1.txt";
		Archivo.setPath(filePath + ".output.txt");
		
		ArrayList<Consulta> consultas = null;
		try {
			consultas = (ArrayList<Consulta>) Parser.parsear(filePath);
		} catch (IOException e) {
			System.err.println("No se ha podido leer el fichero: " + filePath);
			System.exit(-1);
		}

		for (Consulta consulta : consultas) {
			if (consulta instanceof ConsultaInvalida) {
				Archivo.getUnicaInstancia().escribir("No entiendo la pregunta acerca de la película\n\n");
				continue;
			}
			
			
			
			if (consulta instanceof ConsultaSi) {
				kSession.insert(consulta);
				consulta = ((ConsultaSi) consulta).getConsulta();
			}
			
			
			ejecutarHastaActo(consulta.getActo());
			kSession.insert(consulta);
			
		
			//System.out.println(Archivo.getUnicaInstancia().getInformacion());
			
			
			kSession.fireAllRules();
			//kSession.dispose();
			kSession.destroy();
			Archivo.getUnicaInstancia().resetearInf();

			kSession = kContainer.newKieSession("ksession-rules");
			
		}

		try {
			Archivo.getUnicaInstancia().cerrarArchivo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void ejecutarHastaActo(Acto acto) {
		for (int i = 0; i <= acto.getNumActo(); i++) {
			kSession.getAgenda().getAgendaGroup("Acto" + i).setFocus();
			kSession.fireAllRules();
		}
	}

	private static String funcionalidadConsola() {
		System.out.println("Inserte la ruta del fichero a tratar");
		String cadena = "";
		Scanner entrada = new Scanner(System.in);
		cadena = entrada.nextLine();
		System.out.println("Ruta recibida: "+ cadena);		
		return cadena;
	}
}
