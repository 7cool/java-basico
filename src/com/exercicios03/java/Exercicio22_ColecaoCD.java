package com.exercicios03.java;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio22_ColecaoCD {

	private static Scanner scan;
	private static DecimalFormat formatador;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		formatador = new DecimalFormat("0.00");	
		
		System.out.println("Informe a quantidade de CDs na cole��o: ");
		int cd = scan.nextInt();
		Double valor = (double) 0;
		for (int i = 1; i <= cd; i++) {
			System.out.println("Valor do "+i+"� CD da cole��o: ");
			valor+= scan.nextDouble();
		}
		System.out.println("\nValor total da cole��o: R$ "+formatador.format(valor));
		System.out.println("Valor m�dio da cole��o: R$ "+formatador.format(valor/cd));
	}

}
