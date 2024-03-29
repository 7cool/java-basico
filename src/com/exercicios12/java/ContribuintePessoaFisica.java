package com.exercicios12.java;

public class ContribuintePessoaFisica extends Contribuinte {
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public double calcularImposto() {
		double renda = this.getRendaBruta();
		
		if (renda <= 1400) {
			return renda;
		}
		
		if (renda > 1400 && renda <= 2100) {
			return (renda * 0.1) - 100;
		}
		
		if (renda > 2100 && renda <= 2800) {
			return (renda * 0.15) - 270;
		}
		
		if (renda > 2800 && renda <= 3600) {
			return (renda * 0.25) - 500;
		}
		
		//> 3600
		return (renda * 0.3) - 700;
	}
	
	@Override
	public String toString() {
		String s = "Pessoa F�sica[";
		s += super.toString();
		s += " ; cpf: " + cpf;
		s += " ; imposto a ser pago: " + calcularImposto();
		s += "]";
		
		return s;
	}
	
}
