package com.java.exercise.expresionesRegulares;

public class ejercicio1 {

	public static void main(String[] args) {

		/*
		 * 1) Validar un número entero.
		 */

		// String texto = "Comprueba que solo haya texto.547";
		// Pattern pat = Pattern.compile("[a-zA-Z].*");
		// Matcher mat = pat.matcher(texto);
		// if (mat.matches()) {
		// System.out.println("SI");
		// } else {
		// System.out.println("NO");
		// }

		String numberPositivo = "111234568791";
		String numberNegativo = "-1234568791";

		System.out.println("Numero entero: " + numberPositivo.matches("-?[0-9]*") + ". Numero entero: "
				+ numberNegativo.matches("-?[0-9]*"));
	}

}
