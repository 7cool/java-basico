package com.exercicios03.java;

import java.util.Scanner;

public class Exercicio19_MediaNotas {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Digite quantas notas existem para calcular a m�dia: ");
		int n = scan.nextInt();
		
		Double t = (double) 0;
		for (int i = 1; i <= n; i++) {
			System.out.print("Digite a "+i+"� nota: ");
			t+= scan.nextDouble();
		}
		
		System.out.print("M�dia geral: "+(t/n));
	}

}
