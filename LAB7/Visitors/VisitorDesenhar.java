package Visitors;

import Entidades.Circulo;
import Entidades.Retangulo;
import Entidades.Trapezio;
import Entidades.Triangulo;

public class VisitorDesenhar implements VisitorIF {
	
	public double visitaRetangulo(Retangulo r) {
		System.out.println("Desenhando Retângulo");
		return 0;
	}
	
	public double visitaTriangulo(Triangulo t) {
		System.out.println("Desenhando Triângulo");
		return 0;
	}
	
	public double visitaCirculo(Circulo c) {
		System.out.println("Desenhando Círculo");
		return 0;
	}
	
	public double visitaTrapezio(Trapezio t) {
		System.out.println("Desenhando Trapézio");
		return 0;
	}
}
