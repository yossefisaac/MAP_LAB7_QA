package TestesEntidades;

import static org.junit.Assert.*;

import org.junit.Test;

import Entidades.Circulo;

public class CirculoTest {

    @Test
    public void testConstrutor() {
        Circulo c = new Circulo(4);
        assertEquals(4, c.getRaio(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstrutorComRaioZero() {
        Circulo c = new Circulo(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstrutorComRaioNegativo() {
        Circulo c = new Circulo(-4);
    }

    @Test
    public void testSetRaio() {
        Circulo c = new Circulo(4);
        c.setRaio(8);
        assertEquals(8, c.getRaio(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRaioZero() {
        Circulo c = new Circulo(4);
        c.setRaio(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRaioNegativo() {
        Circulo c = new Circulo(4);
        c.setRaio(-8);
    }
}
