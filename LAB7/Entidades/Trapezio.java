package Entidades;

import Visitors.VisitorIF;

public class Trapezio implements ElementoConcretoIF {
	
	private int baseMenor;
	private int baseMaior;
	private int altura;
	private int lado1;
	private int lado2;
	
	public Trapezio(int baseMenor, int baseMaior, int altura, int lado1, int lado2) {
		setBaseMenor(baseMenor);
		setBaseMaior(baseMaior);
		setAltura(altura);
		setLado1(lado1);
		setLado2(lado2);
	}

	public void aceitaVisita(VisitorIF v) {
		v.visitaTrapezio(this);
	}
	
	public int getBaseMenor() {
		return baseMenor;
	}

	public int getBaseMaior() {
		return baseMaior;
	}

	public int getAltura() {
		return altura;
	}

	public int getLado1() {
		return lado1;
	}

	public int getLado2() {
		return lado2;
	}

	public void setBaseMenor(int baseMenor) {
		if (baseMenor <= 0) {
			throw new IllegalArgumentException("A base menor deve ser maior que zero.");
		}
		this.baseMenor = baseMenor;
	}

	public void setBaseMaior(int baseMaior) {
		if (baseMaior <= 0) {
			throw new IllegalArgumentException("A base maior deve ser maior que zero.");
		}
		this.baseMaior = baseMaior;
	}

	public void setAltura(int altura) {
		if (altura <= 0) {
			throw new IllegalArgumentException("A altura deve ser maior que zero.");
		}
		this.altura = altura;
	}

	public void setLado1(int lado1) {
		if (lado1 <= 0) {
			throw new IllegalArgumentException("O lado 1 deve ser maior que zero.");
		}
		this.lado1 = lado1;
	}

	public void setLado2(int lado2) {
		if (lado2 <= 0) {
			throw new IllegalArgumentException("O lado 2 deve ser maior que zero.");
		}
		this.lado2 = lado2;
	}
}
