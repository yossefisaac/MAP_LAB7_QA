package TestesVisitors;

import static org.junit.Assert.*;

import org.junit.Test;

import Entidades.Circulo;
import Entidades.Retangulo;
import Entidades.Trapezio;
import Entidades.Triangulo;
import Visitors.VisitorDesenhar;
import Visitors.VisitorIF;

public class VisitorDesenharTest {

    @Test
    public void testVisitaRetangulo() {
        VisitorIF visitor = new VisitorDesenhar();
        Retangulo r = new Retangulo(3, 6);
        assertEquals(0, visitor.visitaRetangulo(r), 0.001);
    }

    @Test
    public void testVisitaTriangulo() {
        VisitorIF visitor = new VisitorDesenhar();
        Triangulo t = new Triangulo(6, 8, 6, 6);
        assertEquals(0, visitor.visitaTriangulo(t), 0.001);
    }

    @Test
    public void testVisitaCirculo() {
        VisitorIF visitor = new VisitorDesenhar();
        Circulo c = new Circulo(4);
        assertEquals(0, visitor.visitaCirculo(c), 0.001);
    }

    @Test
    public void testVisitaTrapezio() {
        VisitorIF visitor = new VisitorDesenhar();
        Trapezio tz = new Trapezio(3, 6, 4, 5, 5);
        assertEquals(0, visitor.visitaTrapezio(tz), 0.001);
    }
}
