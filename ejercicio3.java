package com.java.exercise.expresionesRegulares;

import java.util.regex.Pattern;

public class ejercicio3 {

	public static void main(String[] args) {

		/*
		 * 7) Validar un número binario.
		 */

		String validarNumBinario = "[0-1]+?";

		String numBinario = "10101010101000000111100011";

		System.out.println("El numero binario es: " + Pattern.matches(validarNumBinario, numBinario));

		/*
		 * 8) Validar un número octal.
		 */

		String validarNumOctal = "[0-7]+$";

		String numOctal = "0325410103754357040213212";

		System.out.println("El numero octal es: " + Pattern.matches(validarNumOctal, numOctal));

		/*
		 * 9) Validar un número hexadecimal.
		 */

		String validarNumHexadecimal = "[0-9a-fA-F]*?";

		String numHexadecimal = "A54F";

		System.out.println("El numero hexadecimal es: " + Pattern.matches(validarNumHexadecimal, numHexadecimal));

		/*
		 * 10) Validar numero real.
		 */

		String validarNumReal = "^-?[0-9]+(\\p{Punct}[0-9]+)?$";

		String numReal = "-453/544";

		System.out.println("El numero real es: " + Pattern.matches(validarNumReal, numReal));

		/*
		 * 11) Validar numero real positivo.
		 */

		String validarNumRealPositivo = "^[0-9]+(\\p{Punct}[0-9]+)?$";

		String numRealPositivo = "12/0";

		System.out.println("El numero real Positivo es: " + Pattern.matches(validarNumRealPositivo, numRealPositivo));

		/*
		 * 12) Validar numero real negativo.
		 */

		String validarNumRealNegativo = "^-[0-9]+(\\p{Punct}[0-9]+)?$";

		String numRealNegativo = "-12/0";

		System.out.println("El numero real Negativo es: " + Pattern.matches(validarNumRealNegativo, numRealNegativo));

		/*
		 * 13) Validar numero real con 3 decimales.
		 */

		String validarNumRealDecimal3 = "^-?[0-9]+(\\p{Punct}[0-9]{3})*?$";

		String numRealDecimal3 = "25507.992";

		System.out.println(
				"El numero real con tres decimales: " + Pattern.matches(validarNumRealDecimal3, numRealDecimal3));

		/*
		 * 14) Validar numero real positivo con 4 decimales.
		 */

		String validarNumRealDecimal4 = "^[0-9]+(\\p{Punct}\\d{4})*?$";

		String numRealDecimal4 = "25507.4949";

		System.out.println(
				"El numero real con cuatro decimales: " + Pattern.matches(validarNumRealDecimal4, numRealDecimal4));

		/*
		 * 15) Validar numero real negativo con 2 decimales.
		 */

		String validarNumRealNegativoDecimal2 = "^-[0-9]+(\\p{Punct}\\d{2})*?";

		String numRealNegativoDecimal2 = "-25507.49";

		System.out.println("El numero real negativo con 2 decimales: "
				+ Pattern.matches(validarNumRealNegativoDecimal2, numRealNegativoDecimal2));

		/*
		 * 16) Validar una fecha con formato dd/mm/aaaa
		 */

		String validarFecha = "(0[1-9]|[1-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/([0-2][0-9]\\d\\d)";

		String fecha = "30/12/2019";

		System.out.println("La fecha es: " + Pattern.matches(validarFecha, fecha));

		/*
		 * 17) Validar un nombre, incluyendo nombres compuestos.
		 */

		String validarName = "^\\D([A-Za-z]+\\s?){1,2}$";

		String name = "Evarist Jaume";

		System.out.println("El nombre o nombre compuesto es: " + Pattern.matches(validarName, name));

		/*
		 * 18) Validar un email.
		 */

		String validarEmail = "^[a-zA-Z0-9._@]+@[a-zA-Z0-9-]+[a-zA-Z.]*$";

		String email = "EvaristJaume@gmail.com";

		System.out.println("El email es: " + Pattern.matches(validarEmail, email));

		/*
		 * 19) Valida un nombre de usuario en twitter, empieza por @ y puede
		 * contener letras mayusculas y minusculas, numeros, guiones y guiones
		 * bajos.
		 */

		String validarTwitter = "^@[a-zA-Z0-9._-]+[a-zA-Z0-9-]*$";

		String twitter = "@Mon487key-user";

		System.out.println("El usuario de Twitter es: " + Pattern.matches(validarTwitter, twitter));

		/*
		 * 20) Validar ISBN de 13 digitos, siempre empieza en 978 o 979.
		 */

		String validarIsbn = "^(978|979)[0-9]{9}$";

		String isbn = "978569874321";

		System.out.println("El numero de ISBN es: " + Pattern.matches(validarIsbn, isbn));
	}

}
