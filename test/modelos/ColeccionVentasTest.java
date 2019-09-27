package modelos;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ColeccionVentasTest {
    
    public ColeccionVentasTest() {
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
     * Test of listar method, of class ColeccionVentas.
     */
    @Test
    public void testListar() {
        System.out.println("listar");
        ColeccionVentas instance = new ColeccionVentas();
        ArrayList<Venta> esperado = new ArrayList<Venta>();
        ArrayList<Venta> obtenido = instance.listar();
        assertEquals(esperado, obtenido);
    }

    /**
     * Test of Agregar method, of class ColeccionVentas.
     */
    @Test
    public void testAgregar() {
        System.out.println("Agregar");
        Venta venta = new Venta();
        ColeccionVentas instance = new ColeccionVentas();
        boolean esperado = true;
        boolean obtenido = instance.Agregar(venta);
        assertEquals(esperado, obtenido);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Modificar method, of class ColeccionVentas.
     */
    @Test
    public void testModificar() {
        System.out.println("Modificar");
        Venta venta = new Venta("DFR", 3000, 2);
        ColeccionVentas instance = new ColeccionVentas();
        instance.Agregar(venta);
        boolean esperado = true;
        boolean obtenido = instance.Modificar(venta);
        venta = new Venta("DFR", 3700, 5);
        assertEquals(esperado, obtenido);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Eliminar method, of class ColeccionVentas.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        String codigo = "TYU";
        Venta venta = new Venta("TYU", 3900, 4);
        ColeccionVentas instance = new ColeccionVentas();
        instance.Agregar(venta);
        boolean esperado = true;
        boolean obtenido = instance.Eliminar(codigo);
        assertEquals(esperado, obtenido);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of SubTotal method, of class ColeccionVentas.
     */
    @Test
    public void testSubTotal() {
        System.out.println("SubTotal");
        Venta venta = new Venta("TYU", 3900, 4);
        ColeccionVentas instance = new ColeccionVentas();
        int esperado = 15600;
        int obtenido = instance.SubTotal(venta);
        assertEquals(esperado, obtenido);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
