package com.exercicios01.java;

import java.util.Scanner;

public class Exercicio02_MostrarNumero {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);		
		
		System.out.println("Digite um n�mero: ");
		int numero1 = scan.nextInt();
		System.out.println("O n�mero informado foi: " + numero1);		
		

	}

}
