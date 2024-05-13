package Visitors;

import Entidades.*;

public interface VisitorIF {
	
	public double visitaRetangulo(Retangulo r);
	public double visitaTriangulo (Triangulo t);
	public double visitaCirculo (Circulo c);
	public double visitaTrapezio (Trapezio tz);
	
}