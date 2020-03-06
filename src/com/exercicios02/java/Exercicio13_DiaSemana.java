package com.exercicios02.java;

import java.util.Scanner;

public class Exercicio13_DiaSemana {

	private static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana em n�mero (1-7): ");
		int diaSemana = scan.nextInt();
	
		switch(diaSemana) {
		case 1: System.out.println("Domingo"); break;
		case 2: System.out.println("Segunda-Feira"); break;
		case 3: System.out.println("Ter�a-Feira"); break;
		case 4: System.out.println("Quarta-Feira"); break;
		case 5: System.out.println("Quinta-Feira"); break;
		case 6: System.out.println("Sexta-Feira"); break;
		case 7: System.out.println("S�bado"); break;
		default: System.out.println("N�o � um dia da semana v�lido!!"); break;
		}
	}

}
