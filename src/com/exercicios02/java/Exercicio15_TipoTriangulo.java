package com.exercicios02.java;

import java.util.Scanner;

public class Exercicio15_TipoTriangulo {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Por favor, d�-me tr�s lados de um triangulo");
		int l1 = scan.nextInt();
		int l2 = scan.nextInt();
		int l3 = scan.nextInt();
		
		if (((l1 + l2) > l3) || ((l1 + l3) > l2) || ((l2 + l3) > l1) && ((l1 > 0) && (l2 > 0) && (l3 > 0))) {
			if ((l1 == l2) && (l2 == l3)) {
				System.out.println("Tri�ngulo Equil�tero");
			} else if (((l1 == l2) && (l1 != l3)) ||
					   ((l1 != l2) && (l2 == l3)) ||
					   ((l1 == l3) && (l2 != l3))) {
				System.out.println("Tri�ngulo Is�sceles");
			} else {
				System.out.println("Tri�ngulo Escaleno");
			}
		} else {
			System.out.println("N�o � um tri�ngulo!!");
		}

	}

}