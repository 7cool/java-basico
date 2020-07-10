package com.exercicios03.java;

import java.util.Scanner;

public class Exercicio18_NumeroPrimo {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero para saber se ele � primo: ");
		int n = scan.nextInt();
		
		int primo = 0;
		
		for (int i = 1; i <= n; i++) {
			if (n%i == 0) {
				primo++;				
			};
		}
		 
		 if (primo == 2)
			 System.out.println("O n�mero � Primo");
		 else
			 System.out.println("O n�mero N�o � Primo");
	}
}
