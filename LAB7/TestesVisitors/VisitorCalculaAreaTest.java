package TestesVisitors;

import static org.junit.Assert.*;

import org.junit.Test;

import Entidades.Circulo;
import Entidades.Retangulo;
import Entidades.Trapezio;
import Entidades.Triangulo;
import Visitors.VisitorCalculaArea;
import Visitors.VisitorIF;

public class VisitorCalculaAreaTest {

    @Test
    public void testVisitaRetangulo() {
        VisitorIF visitor = new VisitorCalculaArea();
        Retangulo r = new Retangulo(3, 6);
        assertEquals(18, visitor.visitaRetangulo(r), 0.001);
    }

    @Test
    public void testVisitaTriangulo() {
        VisitorIF visitor = new VisitorCalculaArea();
        Triangulo t = new Triangulo(6, 8, 6, 6);
        assertEquals(24, visitor.visitaTriangulo(t), 0.001);
    }

    @Test
    public void testVisitaCirculo() {
        VisitorIF visitor = new VisitorCalculaArea();
        Circulo c = new Circulo(4);
        assertEquals(50.265, visitor.visitaCirculo(c), 0.001);
    }

    @Test
    public void testVisitaTrapezio() {
        VisitorIF visitor = new VisitorCalculaArea();
        Trapezio tz = new Trapezio(3, 6, 4, 5, 5);
        assertEquals(18, visitor.visitaTrapezio(tz), 0.001);
    }
}
