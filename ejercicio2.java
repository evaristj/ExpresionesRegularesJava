package com.java.exercise.expresionesRegulares;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ejercicio2 {

	public static void main(String[] args) {

		/*
		 * 2) Validar un número entero positivo.
		 */

		String numberPositivo = "1234568791";

		System.out.println("Numero entero Positivo: " + numberPositivo.matches("[0-9]*"));

		/*
		 * 3) Validar un número entero negativo.
		 */

		String numberNegativo = "-1234568791";

		System.out.println("Numero entero negativo: " + numberNegativo.matches("-[0-9]*"));

		/*
		 * 4) Validar DNI (buscar internet), 8 números y una letra al final.
		 */

		String dniRegex = "\\d{8}[A-HJ-NP-TV-Z]";

		String dni = "45785126J";

		System.out.println("El DNI es: " + Pattern.matches(dniRegex, dni));

		/*
		 * 5) Validar una IP.
		 */

		String validarIp = "^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$";

		String ip = "910.2.231.122";

		System.out.println("La IP es: " + Pattern.matches(validarIp, ip));

		/*
		 * 6) Validar una matricula de un coche con formato 0000XXX
		 */
		String validarMatricula = "^\\d{4}[b-zB-Z&&[^eiou]]{3}";
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una matricula de cualquier coche español:");
		String matricula = sc.nextLine();

		System.out.println("La Matricula es: " + Pattern.matches(validarMatricula, matricula));
	}

}
