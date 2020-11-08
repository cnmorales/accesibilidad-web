package utils;

import model.DiagnosticoDeAccesibilidadOperativa;
import model.PaginaWeb;

public class TestCaseUtils {

	////////////////TEST CASES UTILS ////////////////

	public static void print(String title) {
		System.out.println(title);
	}

	public static void print() {
		print("");
	}

	public static void print(PaginaWeb paginaWeb) {
		System.out.println("Datos De PaginaWeb: " + paginaWeb.toString());

	}

	public static void assertResults(DiagnosticoDeAccesibilidadOperativa diagnostico, String valorEsperado) {
		String diagnosticoFinal = diagnostico.getDiagnosticoFinal();
		printResults(diagnosticoFinal, valorEsperado);
		assert(diagnosticoFinal.equals(valorEsperado));
	}

	private static void printResults(String result,String expected) {
		print("Resultados");
		print("Esperaba: " + expected);
		print("Recibi: " + result);
		Boolean isOk = result.equals(expected);
		String condition = isOk ? "Ok" : "Fallo";
		print("Caso de prueba: "+ condition);
	}
}
