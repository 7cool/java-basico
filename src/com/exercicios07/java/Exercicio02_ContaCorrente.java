package com.exercicios07.java;

import static java.lang.System.out;

public class Exercicio02_ContaCorrente {
	int numero;
	double saldo;
	double limite;	
	char status;
	boolean saque;
	
	void realizarSaque(double valor) {
		if (saque == true) {
			if (valor<= saldo) {
				saldo-=valor;			
				out.println("Saque feito no valor de: R$ "+valor);	
			} else {
				out.println("O valor do saque � maior do que o saldo!!");	
			}			
		} else {
			out.println("N�o � poss�vel fazer saques nessa conta.");
		}
	}
	
	void depositarDinheiro(double valor) {
		saldo+=valor;
		out.println("Dep�sito feito no valor de: R$ "+valor);
	}
	
	void consultarSaldo() {
		out.println("Saldo atual: R$ "+saldo);
	}
	
	void verificarCheque() {
		if (status == 's') {
			out.println("Conta est� habilitada para usar cheque especial.");			
		} else if (status == 'n') {
			out.println("Conta N�O est� habilitada para usar cheque especial.");
		} else {
			out.println("Sem informa��es sobre cheque especial");
		}
	}
}
