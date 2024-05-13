package TestesEntidades;

import static org.junit.Assert.*;

import org.junit.Test;

import Entidades.Trapezio;

public class TrapezioTest {

    @Test
    public void testConstrutor() {
        Trapezio t = new Trapezio(3, 6, 4, 5, 5);
        assertEquals(3, t.getBaseMenor());
        assertEquals(6, t.getBaseMaior());
        assertEquals(4, t.getAltura());
        assertEquals(5, t.getLado1());
        assertEquals(5, t.getLado2());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstrutorComBaseMenorZero() {
        Trapezio t = new Trapezio(0, 6, 4, 5, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstrutorComBaseMaiorZero() {
        Trapezio t = new Trapezio(3, 0, 4, 5, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstrutorComAlturaZero() {
        Trapezio t = new Trapezio(3, 6, 0, 5, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstrutorComLado1Zero() {
        Trapezio t = new Trapezio(3, 6, 4, 0, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstrutorComLado2Zero() {
        Trapezio t = new Trapezio(3, 6, 4, 5, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstrutorComBaseMenorNegativa() {
        Trapezio t = new Trapezio(-3, 6, 4, 5, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstrutorComBaseMaiorNegativa() {
        Trapezio t = new Trapezio(3, -6, 4, 5, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstrutorComAlturaNegativa() {
        Trapezio t = new Trapezio(3, 6, -4, 5, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstrutorComLado1Negativa() {
        Trapezio t = new Trapezio(3, 6, 4, -5, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstrutorComLado2Negativa() {
        Trapezio t = new Trapezio(3, 6, 4, 5, -5);
    }

    @Test
    public void testSetBaseMenor() {
        Trapezio t = new Trapezio(3, 6, 4, 5, 5);
        t.setBaseMenor(8);
        assertEquals(8, t.getBaseMenor());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseMenorZero() {
        Trapezio t = new Trapezio(3, 6, 4, 5, 5);
        t.setBaseMenor(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseMenorNegativa() {
        Trapezio t = new Trapezio(3, 6, 4, 5, 5);
        t.setBaseMenor(-8);
    }

    @Test
    public void testSetBaseMaior() {
        Trapezio t = new Trapezio(3, 6, 4, 5, 5);
        t.setBaseMaior(10);
        assertEquals(10, t.getBaseMaior());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseMaiorZero() {
        Trapezio t = new Trapezio(3, 6, 4, 5, 5);
        t.setBaseMaior(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseMaiorNegativa() {
        Trapezio t = new Trapezio(3, 6, 4, 5, 5);
        t.setBaseMaior(-10);
    }

    @Test
    public void testSetAltura() {
        Trapezio t = new Trapezio(3, 6, 4, 5, 5);
        t.setAltura(8);
        assertEquals(8, t.getAltura());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAlturaZero() {
        Trapezio t = new Trapezio(3, 6, 4, 5, 5);
        t.setAltura(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAlturaNegativa() {
        Trapezio t = new Trapezio(3, 6, 4, 5, 5);
        t.setAltura(-8);
    }

    @Test
    public void testSetLado1() {
        Trapezio t = new Trapezio(3, 6, 4, 5, 5);
        t.setLado1(7);
        assertEquals(7, t.getLado1());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLado1Zero() {
        Trapezio t = new Trapezio(3, 6, 4, 5, 5);
        t.setLado1(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLado1Negativa() {
        Trapezio t = new Trapezio(3, 6, 4, 5, 5);
        t.setLado1(-7);
    }

    @Test
    public void testSetLado2() {
        Trapezio t = new Trapezio(3, 6, 4, 5, 5);
        t.setLado2(7);
        assertEquals(7, t.getLado2());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLado2Zero() {
        Trapezio t = new Trapezio(3, 6, 4, 5, 5);
        t.setLado2(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLado2Negativa() {
        Trapezio t = new Trapezio(3, 6, 4, 5, 5);
        t.setLado2(-7);
    }
}
