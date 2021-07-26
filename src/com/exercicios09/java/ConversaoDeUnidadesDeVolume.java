package com.exercicios09.java;

public class ConversaoDeUnidadesDeVolume {
	/*
	 * 5. Escreva a classe ConversaoDeUnidadesDeVolume com m�todos est�ticos para
	 * convers�o das unidades de volume segundo a lista abaixo. � 1 litro = 1000
	 * cent�metros c�bicos � 1 metro c�bico = 1000 litros � 1 metro c�bico = 35.32
	 * p�s c�bicos � 1 gal�o americano = 231 polegadas c�bicas � 1 gal�o americano =
	 * 3.785 litros
	 */
	
	public static double litro2cm(double n) {
		return n * 1000;
	}
	
	public static double cm2litro(double n) {
		return n / 1000;
	}
	
	public static double m2litro(double n) {
		return n * 1000;
	}
	
	public static double litro2m(double n) {
		return n / 1000;
	}
	
	public static double m2pes(double n) {
		return n * 35.32;
	}
	
	public static double pes2m(double n) {
		return n / 35.32;
	}
	
	public static double galao2polegada(double n) {
		return n * 231;
	}
	
	public static double polegada2galao(double n) {
		return n / 231;
	}
	
	public static double galao2litro(double n) {
		return n * 3785;
	}
	
	public static double litro2galao(double n) {
		return n / 3785;
	}
}
