package Visitors;

import Entidades.Circulo;
import Entidades.Retangulo;
import Entidades.Trapezio;
import Entidades.Triangulo;

public class VisitorCalculaArea implements VisitorIF {
	
	private static final double PI = Math.PI;
	
	public double visitaRetangulo(Retangulo r) {
		return r.getAltura() * r.getLargura();
	}
	
	public double visitaTriangulo(Triangulo t) {
		return (t.getBase() * t.getAltura()) / 2.0;
	}
	
	public double visitaCirculo(Circulo c) {
		return PI * Math.pow(c.getRaio(), 2);
	}
	
	public double visitaTrapezio(Trapezio t) {
		return ((t.getBaseMaior() + t.getBaseMenor()) * t.getAltura()) / 2.0;
	}
}
