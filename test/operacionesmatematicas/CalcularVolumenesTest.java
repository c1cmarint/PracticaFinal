/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesmatematicas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class CalcularVolumenesTest {
    
    public CalcularVolumenesTest() {
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
     * Test of funcion method, of class CalcularVolumenes.
     */
    @Test
    

    
    public void testVolumenParalelepipedo() {
        System.out.println("volumenParalelepipedo");
        int a = 0;
        int b = 0;
        int c = 0;
        int expResult = 0;
        int result = CalcularVolumenes.volumenParalelepipedo(a, b, c);
        assertEquals(expResult, result);
     
    }

    /**
     * Test of volumenConoCircular method, of class CalcularVolumenes.
     */
    @Test
    public void testVolumenConoCircular() {
        System.out.println("volumenConoCircular");
        CalcularVolumenes instance = new CalcularVolumenes();
        double expResult = 0.0;
        double result = instance.volumenConoCircular();
        assertEquals(expResult, result, 0.0);
    
    }

    /**
     * Test of volumenCilindroRecto method, of class CalcularVolumenes.
     */
    @Test
    public void testVolumenCilindroRecto() {
        System.out.println("volumenCilindroRecto");
        CalcularVolumenes instance = new CalcularVolumenes();
        double expResult = 0.0;
        double result = instance.volumenCilindroRecto();
        assertEquals(expResult, result, 0.0);
      
    }

    /**
     * Test of volumenEsfera method, of class CalcularVolumenes.
     */
    @Test
    public void testVolumenEsfera() {
        System.out.println("volumenEsfera");
        CalcularVolumenes instance = new CalcularVolumenes();
        double expResult = 0.0;
        double result = instance.volumenEsfera();
        assertEquals(expResult, result, 0.0);
       
    }
    
}
