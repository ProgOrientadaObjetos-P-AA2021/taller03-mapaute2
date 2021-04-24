/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.EquivalenteHora;
/**
 *
 * @author usuario
 */
public class Ejecutor {

    public static void main(String[] args) {
        
        EquivalenteHora objeto1 = new EquivalenteHora();//onjeto 1
        
        int hora = 72;
        
        objeto1.establecerHora(hora);
        objeto1.establecerMinutos();
        objeto1.establecerSegundos();
        objeto1.establecerDias();
        
        System.out.printf("Hora 1\n\nHora: %d\nMinutos: %d\nSegundos: %d\n"
                + "Dias: %d\n",objeto1.obtenerHora(),objeto1.obtenerMinutos(),
                objeto1.obtenerSegundos(),objeto1.obtenerDias());
        
        EquivalenteHora objeto2 = new EquivalenteHora();//objeto 2
        
        int hora2 = 48;
        
        objeto2.establecerHora2(hora2);
        objeto2.establecerMinutos2();
        objeto2.establecerSegundos2();
        objeto2.establecerDias2();
        
        System.out.printf("\nHora 2\n\nHora: %d\nMinutos: %d\nSegundos: %d\n"
                + "Dias: %d\n",objeto2.obtenerHora2(),objeto2.obtenerMinutos2(),
                objeto2.obtenerSegundos2(),objeto2.obtenerDias2());
    }
    
}
