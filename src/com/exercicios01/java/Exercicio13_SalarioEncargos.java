package com.exercicios01.java;

import java.util.Scanner;

public class Exercicio13_SalarioEncargos {

	private static Scanner scan;	
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Este programa vai calcular e mostrar o total do seu sal�rio e encargos no m�s");
		System.out.println("Quanto voc� ganha por hora? ");
		Double custoHora = scan.nextDouble();
		
		System.out.println("Quantas horas voc� trabalha por m�s? ");
		Double horaTrabalhada = scan.nextDouble();
		
		Double bruto = (custoHora * horaTrabalhada);
		Double liquido = (bruto * 0.76);
		System.out.println("Sal�rio Bruto: R$" + bruto);
		System.out.println("INSS: R$" + (bruto * 0.08));
		System.out.println("Sindicato: R$" + (bruto * 0.05));
		System.out.println("Sal�rio L�quido: R$" + liquido);
		
		System.out.println("Sal�rio Bruto : R$ " + bruto + " - IR (11%) : R$ " + (bruto * 0.11) + " - INSS " +
		" (8%) : R$ " + (bruto * 0.08) + " - Sindicato ( 5%) : R$ " + (bruto * 0.05) + " = Sal�rio " +
		" Liquido : R$ " + liquido);

	}
}
