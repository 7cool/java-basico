package com.exercicios01.java;

import java.util.Scanner;

public class Exercicio05_MetrosCentimetros {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Este programa converte metros para cent�metros");
		System.out.println("Para come�ar digite um n�mero em metro: ");
		Double numero = scan.nextDouble();
		System.out.println("O n�mero " + numero + " convertido em cent�metros � igual a " + (numero/0.01));
	}

}
