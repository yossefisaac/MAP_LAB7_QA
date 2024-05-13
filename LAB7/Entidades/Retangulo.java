package Entidades;

import Visitors.VisitorIF;

public class Retangulo implements ElementoConcretoIF {
	
	private int largura;
	private int altura;
	
	public Retangulo(int largura, int altura) {
		setLargura(largura);
		setAltura(altura);
	}

	public void aceitaVisita(VisitorIF v) {
		v.visitaRetangulo(this);
	}
	
	public int getLargura() {
		return largura;
	}

	public int getAltura() {
		return altura;
	}

	public void setLargura(int largura) {
		if (largura <= 0) {
			throw new IllegalArgumentException("A largura deve ser maior que zero.");
		}
		this.largura = largura;
	}

	public void setAltura(int altura) {
		if (altura <= 0) {
			throw new IllegalArgumentException("A altura deve ser maior que zero.");
		}
		this.altura = altura;
	}
}
