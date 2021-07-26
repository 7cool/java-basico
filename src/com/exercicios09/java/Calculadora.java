package com.exercicios09.java;

import java.lang.System;

public class Calculadora {
	/*
	 * 2. Escreva uma classe Calculadora que tenha os seguintes m�todos: somar,
	 * subtrair, multiplicar, dividir (dois n�meros), elevar � pot�ncia n.
	 * Desenvolva um programa para testar essa classe.
	 */
	
	/*
	 * 3. Escreva um m�todo para calcular factorial de um n�mero na classe
	 * Calculadora do exerc�cio anterior.
	 */
	
	private static double somar(double n1, double n2) {
		return n1 + n2;
	}
	
	private static double subtrair(double n1, double n2) {
		return n1 - n2;
	}
	
	private static double multiplicar(double n1, double n2) {
		return n1 * n2;
	}
	
	private static double dividir(double n1, double n2) {
		return n1/n2;
	}
	
	private static double potencia(double n1, double n2) {
		return Math.pow(n1, n2);
	}
	
	private static double fatorial(int n1) {
		int calculo = n1;		
		if (n1 == 0) calculo++;		
		n1-= 1;
		
		while (n1 > 1) {
			System.out.println(calculo+"*"+n1);
			calculo*= n1--;
		};
		
		return calculo;
	}
	
	public static void calcular(int tipo, double n1, double n2) {
		switch (tipo) {
		case 1:
			System.out.println("Soma de "+n1+" e "+n2+" = "+somar(n1 ,n2));
			break;
		case 2:
			System.out.println("Subtra��o de "+n1+" por "+n2+" = "+subtrair(n1 ,n2));
			break;
		case 3:
			System.out.println("Multiplica��o de "+n1+" por "+n2+" = "+multiplicar(n1 ,n2));
			break;
		case 4:
			System.out.println("Divis�o de "+n1+" por "+n2+" = "+dividir(n1 ,n2));
			break;
		case 5:
			System.out.println("Potencia de "+n1+" elevado a "+n2+" = "+potencia(n1 ,n2));
			break;
		case 6:
			System.out.println("Fatorial de "+(int) n1+"! = "+fatorial((int)n1));
			break;
		default: System.out.println("Opera��o inv�lida");
			break;
		}
	}

}
