package Entidades;

import Visitors.VisitorIF;

public class Triangulo implements ElementoConcretoIF {
	
	private int base;
	private int altura;
	private int lado1;
	private int lado2;
	
	public Triangulo(int base, int altura, int lado1, int lado2) {
		setBase(base);
		setAltura(altura);
		setLado1(lado1);
		setLado2(lado2);
	}
	
	public void aceitaVisita(VisitorIF v) {
		v.visitaTriangulo(this);
	}

	public int getBase() {
		return base;
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

	public void setBase(int base) {
		if (base <= 0) {
			throw new IllegalArgumentException("A base deve ser maior que zero.");
		}
		this.base = base;
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
