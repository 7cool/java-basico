package com.exercicios03.java;

import java.util.Scanner;

public class Exercicio18_NumeroPrimo {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Digite um número para saber se ele é primo: ");
		int n = scan.nextInt();
		
		int primo = 0;
		
		for (int i = 2; i < n/2; i++) {
			if (n%i == 0) {
				primo++;
				break;
			}
		}
		 
		 if (primo == 0)
			 System.out.println("O número é primo");
		 else
			 System.out.println("O número Não é primo");
	}

}
