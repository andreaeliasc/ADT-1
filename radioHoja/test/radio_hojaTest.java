/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrea
 */
public class radio_hojaTest {
    
    public radio_hojaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of encendidoRadio method, of class radio_hoja.
     */
    @Test
    public void testEncendidoRadio() {
        System.out.println("encendidoRadio");
        radio_hoja instance = new radio_hoja();
        boolean expResult = false;
        boolean result = instance.encendidoRadio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambiarAmFm method, of class radio_hoja.
     */
    @Test
    public void testCambiarAmFm() {
        System.out.println("cambiarAmFm");
        radio_hoja instance = new radio_hoja();
        boolean expResult = false;
        boolean result = instance.cambiarAmFm();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subirFrecuencia method, of class radio_hoja.
     */
    @Test
    public void testSubirFrecuencia() {
        System.out.println("subirFrecuencia");
        radio_hoja instance = new radio_hoja();
        double expResult = 0.0;
        double result = instance.subirFrecuencia();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bajarFrecuencia method, of class radio_hoja.
     */
    @Test
    public void testBajarFrecuencia() {
        System.out.println("bajarFrecuencia");
        radio_hoja instance = new radio_hoja();
        double expResult = 0.0;
        double result = instance.bajarFrecuencia();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFavorito method, of class radio_hoja.
     */
    @Test
    public void testGetFavorito() {
        System.out.println("getFavorito");
        int posicion = 0;
        radio_hoja instance = new radio_hoja();
        double expResult = 0.0;
        double result = instance.getFavorito(posicion);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFavorito method, of class radio_hoja.
     */
    @Test
    public void testSetFavorito() {
        System.out.println("setFavorito");
        int posicion = 0;
        radio_hoja instance = new radio_hoja();
        instance.setFavorito(posicion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
