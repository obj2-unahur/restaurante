package ar.edu.unahur.obj2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ComensalTest {

    private Vip vip;

    @BeforeTest
    public void setup() {
        vip = new Vip();
    }

    @Test
    public void testVipParilla() {
        Comensal vip = new Vip();
        Menu parrilla = new MenuParilla();
        double costo = vip.calcularCosto(parrilla);
        assertEquals(costo, 240.0);
    }

}