package com.exercicios01.java;

import java.util.Scanner;

public class Exercicio06_AreaCirculo {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Este programa vai calcular a �rea de um c�rculo");
		System.out.println("Para come�ar digite o valor do raio do c�rculo: ");
		Double raio = scan.nextDouble();
		System.out.println("A �rea do c�rculo �: " + (Math.PI * Math.pow(raio, 2)));

	}

}
