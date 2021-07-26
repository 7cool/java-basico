package com.rafael.java;

import static java.lang.System.out;

public class Construtor {
	//classe Carro
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	//**Aqui
	Construtor(){
		out.println("Classe Construtor foi instanciada");
		numPassageiros = 4;
	}
	
	//**Aqui
//	Construtor(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_){
//		marca = marca_;
//		modelo = modelo_;		
//		numPassageiros = numPassageiros_;
//		capCombustivel = capCombustivel_;
//		consumoCombustivel = consumoCombustivel_;
//	}
	
	public Construtor(String marca, String modelo, int numPassageiros, double capCombustivel,
			double consumoCombustivel) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}//O This � usado para deixar explicito o artibruto da classe e n�o o argumento que recebe no construtor
	
//	public tem o acesso em todos os pacotes do projeto
//	default (sem marca��o) tem acesso somente dentro do pacote
//	private s� tem acesso liberado dentro da classe
	
	void exibirAutonomia() {
		out.println("A autonomia do carro �: " + capCombustivel * consumoCombustivel);
	}

	double obterAutonomia() {
		out.println("M�todo obter autonomia foi chamado.");
		
		return capCombustivel * consumoCombustivel;
	}
	
	double calcularCombustiivel(double km) {
		double qtdCombustivel = km/consumoCombustivel;
		
		return qtdCombustivel;
	}


}
