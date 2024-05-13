package Entidades;

import Visitors.VisitorIF;

public class Circulo implements ElementoConcretoIF {
	
	private double raio;
	
	public Circulo(double raio) {
		setRaio(raio);
	}
	
	public void aceitaVisita(VisitorIF v) {
		v.visitaCirculo(this);
	}
	
	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
		if (raio <= 0) {
			throw new IllegalArgumentException("O raio deve ser maior que zero.");
		}
		this.raio = raio;
	}
}
