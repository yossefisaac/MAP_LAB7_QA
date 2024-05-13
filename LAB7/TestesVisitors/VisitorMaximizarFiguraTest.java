package TestesVisitors;

import static org.junit.Assert.*;

import org.junit.Test;

import Entidades.Circulo;
import Entidades.Retangulo;
import Entidades.Trapezio;
import Entidades.Triangulo;
import Visitors.VisitorIF;
import Visitors.VisitorMaximizarFigura;

public class VisitorMaximizarFiguraTest {

    @Test
    public void testVisitaRetangulo() {
        VisitorIF visitor = new VisitorMaximizarFigura();
        Retangulo r = new Retangulo(3, 6);
        visitor.visitaRetangulo(r);
        assertEquals(6, r.getLargura());
        assertEquals(12, r.getAltura());
    }

    @Test
    public void testVisitaTriangulo() {
        VisitorIF visitor = new VisitorMaximizarFigura();
        Triangulo t = new Triangulo(6, 8, 6, 6);
        visitor.visitaTriangulo(t);
        // Não há nada a fazer, não é possível maximizar um triângulo.
        assertEquals(12, t.getBase());
        assertEquals(16, t.getAltura());
        assertEquals(12, t.getLado1());
        assertEquals(12, t.getLado2());
    }

    @Test
    public void testVisitaCirculo() {
        VisitorIF visitor = new VisitorMaximizarFigura();
        Circulo c = new Circulo(4);
        visitor.visitaCirculo(c);
        assertEquals(8, c.getRaio(), 0.001);
    }

    @Test
    public void testVisitaTrapezio() {
        VisitorIF visitor = new VisitorMaximizarFigura();
        Trapezio tz = new Trapezio(3, 6, 4, 5, 5);
        visitor.visitaTrapezio(tz);
        assertEquals(6, tz.getBaseMenor());
        assertEquals(12, tz.getBaseMaior());
        assertEquals(8, tz.getAltura());
        assertEquals(10, tz.getLado1());
        assertEquals(10, tz.getLado2());
    }
}
