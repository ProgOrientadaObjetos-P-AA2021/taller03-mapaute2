/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.EquipoCelular;
/**
 *
 * @author usuario
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EquipoCelular celular = new EquipoCelular();//objeto 1
        
        String sisOperativo = "Android 10";
        double tamaño = 10.3;
        double costo = 300.50;
        String direccion = "1c:cc:d6:2e:4b:fc";
        String informacion ="865666044662171/98";
        
        celular.establecerSisOperativo(sisOperativo);
        celular.establecerTamño(tamaño);
        celular.establecerCosto(costo);
        celular.establecerDireccion(direccion);
        celular.establecerInformacion(informacion);
        
        System.out.printf("Equipo Celular 1\n\nSistema Operativo: %s\n"
                + "Tamaño de pantalla: %.2f pulgadas\nCosto: %.2f\n"
                + "Dirección mac: %s\nInformación IMEI: %s\n",celular.obtenerSisOperativo(),
                celular.obtenerTamaño(),celular.obtenerCosto(),celular.obtenerDireccion(),
                celular.obtenerInformacion());
        
        
        EquipoCelular celular2 = new EquipoCelular();//objeto 2
        
        String sisOperativo2 = "IOS";
        double tamaño2 = 14.8;
        double costo2 = 500.790;
        String direccion2 = "2c:dc:d6:2e:5c:cd";
        String informacion2 ="111263144662200/20";
        
        celular2.establecerSisOperativo2(sisOperativo2);
        celular2.establecerTamño2(tamaño2);
        celular2.establecerCosto2(costo2);
        celular2.establecerDireccion2(direccion2);
        celular2.establecerInformacion2(informacion2);
        
        System.out.printf("\nEquipo Celular 2\n\nSistema Operativo: %s\n"
                + "Tamaño de pantalla: %.2f pulgadas\nCosto: %.2f\n"
                + "Dirección mac: %s\nInformación IMEI: %s\n",celular2.obtenerSisOperativo2(),
                celular2.obtenerTamaño2(),celular2.obtenerCosto2(),celular2.obtenerDireccion2(),
                celular2.obtenerInformacion2());
    }
    
}
