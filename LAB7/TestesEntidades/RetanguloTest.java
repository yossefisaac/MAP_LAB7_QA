package TestesEntidades;

import static org.junit.Assert.*;

import org.junit.Test;

import Entidades.Retangulo;

public class RetanguloTest {

    @Test
    public void testConstrutor() {
        Retangulo r = new Retangulo(3, 6);
        assertEquals(3, r.getLargura());
        assertEquals(6, r.getAltura());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstrutorComLarguraZero() {
        Retangulo r = new Retangulo(0, 6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstrutorComAlturaZero() {
        Retangulo r = new Retangulo(3, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstrutorComLarguraNegativa() {
        Retangulo r = new Retangulo(-3, 6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstrutorComAlturaNegativa() {
        Retangulo r = new Retangulo(3, -6);
    }

    @Test
    public void testSetLargura() {
        Retangulo r = new Retangulo(3, 6);
        r.setLargura(5);
        assertEquals(5, r.getLargura());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLarguraZero() {
        Retangulo r = new Retangulo(3, 6);
        r.setLargura(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLarguraNegativa() {
        Retangulo r = new Retangulo(3, 6);
        r.setLargura(-5);
    }

    @Test
    public void testSetAltura() {
        Retangulo r = new Retangulo(3, 6);
        r.setAltura(8);
        assertEquals(8, r.getAltura());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAlturaZero() {
        Retangulo r = new Retangulo(3, 6);
        r.setAltura(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAlturaNegativa() {
        Retangulo r = new Retangulo(3, 6);
        r.setAltura(-8);
    }
}
