/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Terreno;
/**
 *
 * @author usuario
 */
public class Ejecutor {
    
    public static void main(String[] args) {
        
        Terreno terreno = new Terreno();//objeto 1
        
        double costo = 300 ;
        double ancho = 10.5;
        double largo = 20.4;

        terreno.establecerCosto(costo);
        terreno.establecerAncho(ancho);
        terreno.establecerLargo(largo);
        terreno.establecerArea();
        terreno.establecerValorMetroCuadrado();

        System.out.printf("Costo del primer Terreno\n\nCosto por metro cuadrado es: %.2f $\n"
                + "El ancho del terreno es: %.2f m\nEl largo del terreno es: %.2f m\n"
                + "El área del terreno es: %.2f m^2\nEL valor total del terreno es: %.2f $\n"
                ,terreno.obtenerCosto(),terreno.obtenerAncho(),
                terreno.obtenerLargo(), terreno.obtenerArea(),
                terreno.obtenerValorMetroCuadrado());   
  
        Terreno lote = new Terreno();//objeto 2
        
        double valorMetro = 500.50 ;
        double anchoTerreno = 20.89;
        double largoTerreno = 50.60;

        lote.establecerValorMetro(valorMetro);
        lote.establecerAnchoTerreno(anchoTerreno);
        lote.establecerLargoTerreno(largoTerreno);
        lote.establecerAreaTerreno();
        lote.establecerValorTerreno();

        System.out.printf("\nCosto del segundo Terreno\n\nCosto por metro cuadrado es: %.2f $\n"
                + "El ancho del terreno es: %.2f m\nEl largo del terreno es: %.2f m\n"
                + "El área del terreno es: %.2f m^2\nEL valor total del terreno es: %.2f $\n"
                ,lote.obtenerValorMetro(),lote.obtenerAnchoTerreno(),
                lote.obtenerLargoTerreno(), lote.obtenerAreaTerreno(),
                lote.obtenerValorTerreno());    
    }
}
