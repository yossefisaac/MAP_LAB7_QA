package Visitors;

import Entidades.Circulo;
import Entidades.Retangulo;
import Entidades.Trapezio;
import Entidades.Triangulo;

public class VisitorCalculaPerimetro implements VisitorIF {
	
	public double visitaRetangulo(Retangulo r) {
		return (r.getAltura() * 2) + (r.getLargura() * 2);
	}
	
	public double visitaTriangulo(Triangulo t) {
		return t.getBase() + t.getLado1() + t.getLado2();
	}
	
	public double visitaCirculo(Circulo c) {
		return 2 * Math.PI * c.getRaio();
	}
	
	public double visitaTrapezio(Trapezio t) {
		return t.getBaseMenor() + t.getBaseMaior() + t.getLado1() + t.getLado2();
	}
}
