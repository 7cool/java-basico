package com.exercicios02.java;

import java.util.Scanner;

public class Exercicio17_AnoBissexto {

	private static Scanner scan;

	public static void main(String[] args) {
        scan = new Scanner(System.in);
		
		int ano;
        
        System.out.println("Digite um ano para saber se � bissexto");
        ano = scan.nextInt();
        
        // se o ano for maior que 400
        if (ano % 400 == 0){
            System.out.println(ano + " � bissexto.");
        // se o ano for menor que 400
        } else if ((ano % 4 == 0) && (ano % 100 != 0)){
            System.out.println(ano + " � bissexto.");
        } else {
            System.out.println(ano + " n�o � bissexto");
        }

	}

}
