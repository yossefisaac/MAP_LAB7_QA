package TestesEntidades;

import static org.junit.Assert.*;

import org.junit.Test;

import Entidades.Triangulo;

public class TrianguloTest {

    @Test
    public void testConstrutor() {
        Triangulo t = new Triangulo(5, 8, 6, 6);
        assertEquals(5, t.getBase());
        assertEquals(8, t.getAltura());
        assertEquals(6, t.getLado1());
        assertEquals(6, t.getLado2());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstrutorComBaseZero() {
        Triangulo t = new Triangulo(0, 8, 6, 6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstrutorComAlturaZero() {
        Triangulo t = new Triangulo(5, 0, 6, 6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstrutorComLado1Zero() {
        Triangulo t = new Triangulo(5, 8, 0, 6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstrutorComLado2Zero() {
        Triangulo t = new Triangulo(5, 8, 6, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstrutorComBaseNegativa() {
        Triangulo t = new Triangulo(-5, 8, 6, 6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstrutorComAlturaNegativa() {
        Triangulo t = new Triangulo(5, -8, 6, 6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstrutorComLado1Negativa() {
        Triangulo t = new Triangulo(5, 8, -6, 6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstrutorComLado2Negativa() {
        Triangulo t = new Triangulo(5, 8, 6, -6);
    }

    @Test
    public void testSetBase() {
        Triangulo t = new Triangulo(5, 8, 6, 6);
        t.setBase(10);
        assertEquals(10, t.getBase());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseZero() {
        Triangulo t = new Triangulo(5, 8, 6, 6);
        t.setBase(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseNegativa() {
        Triangulo t = new Triangulo(5, 8, 6, 6);
        t.setBase(-10);
    }

    @Test
    public void testSetAltura() {
        Triangulo t = new Triangulo(5, 8, 6, 6);
        t.setAltura(10);
        assertEquals(10, t.getAltura());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAlturaZero() {
        Triangulo t = new Triangulo(5, 8, 6, 6);
        t.setAltura(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAlturaNegativa() {
        Triangulo t = new Triangulo(5, 8, 6, 6);
        t.setAltura(-10);
    }

    @Test
    public void testSetLado1() {
        Triangulo t = new Triangulo(5, 8, 6, 6);
        t.setLado1(12);
        assertEquals(12, t.getLado1());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLado1Zero() {
        Triangulo t = new Triangulo(5, 8, 6, 6);
        t.setLado1(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLado1Negativa() {
        Triangulo t = new Triangulo(5, 8, 6, 6);
        t.setLado1(-12);
    }

    @Test
    public void testSetLado2() {
        Triangulo t = new Triangulo(5, 8, 6, 6);
        t.setLado2(12);
        assertEquals(12, t.getLado2());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLado2Zero() {
        Triangulo t = new Triangulo(5, 8, 6, 6);
        t.setLado2(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLado2Negativa() {
        Triangulo t = new Triangulo(5, 8, 6, 6);
        t.setLado2(-12);
    }
}
