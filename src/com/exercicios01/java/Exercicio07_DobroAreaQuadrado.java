package com.exercicios01.java;

import java.util.Scanner;

public class Exercicio07_DobroAreaQuadrado {

	private static Scanner scan;	
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Este programa vai calcular a �rea de um quadrado e depois dobr�-la e exibi-la");
		System.out.println("Para come�ar digite o valor de um dos lados do quadrado: ");
		Double lado = scan.nextDouble();
		System.out.println("O dobro da �rea do quadrado �: " + ((Math.pow(lado, 2))*2));
	}

}
