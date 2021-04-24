/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.InstitucionEducativa;
/**
 *
 * @author usuario
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        InstitucionEducativa instituto = new InstitucionEducativa();//objeto 1
        
        String nombre = "María Paute";
        String tipoInstituto = "Particular";
        int numAlumnos = 1050;
        int numDocentes = 40;
        int numSedes = 10;
        
        instituto.establecerNombre(nombre);
        instituto.establecerTipoInstituto(tipoInstituto);
        instituto.establecerNumAlumnos(numAlumnos);
        instituto.establecerNumDocentes(numDocentes);
        instituto.establecerNumSedes(numSedes);
        
        System.out.printf("Institución Educativa 1\n\nNombre: %s\n"
                + "Tipo de institución: %s\nNúmero de alumnos: %d\n"
                + "Número de docentes: %d\nNúmero de sedes: %s\n",
                instituto.obtenerNombre(),instituto.obtenerTipoInstituto(),
                instituto.obtenerNumAlumnos(),instituto.obtenerNumDocentes(),
                instituto.obtenerNumSedes());
        
        InstitucionEducativa instituto2 = new InstitucionEducativa();//objeto 2
        
        String nombre2 = "Rachel Duarte";
        String tipoInstituto2 = "Fiscomisional";
        int numAlumnos2 = 3568;
        int numDocentes2 = 70;
        int numSedes2 = 20;
        
        instituto2.establecerNombre2(nombre2);
        instituto2.establecerTipoInstituto2(tipoInstituto2);
        instituto2.establecerNumAlumnos2(numAlumnos2);
        instituto2.establecerNumDocentes2(numDocentes2);
        instituto2.establecerNumSedes2(numSedes2);
        
        System.out.printf("\nInstitución Educativa 2\n\nNombre: %s\n"
                + "Tipo de institución: %s\nNúmero de alumnos: %d\n"
                + "Número de docentes: %d\nNúmero de sedes: %s\n",
                instituto2.obtenerNombre2(),instituto2.obtenerTipoInstituto2(),
                instituto2.obtenerNumAlumnos2(),instituto2.obtenerNumDocentes2(),
                instituto2.obtenerNumSedes2());
    }
    
}
