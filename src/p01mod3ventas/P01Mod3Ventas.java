package p01mod3ventas;

import java.util.ArrayList;
import modelos.ColeccionVentas;
import modelos.Venta;


public class P01Mod3Ventas {

    public static void main(String[] args) {
        Venta v = new Venta();
        ColeccionVentas lista = new ColeccionVentas();
        Venta venta = new Venta("TRY", 3400, 3);
        System.out.println(lista.SubTotal(venta));
    }
    
}
