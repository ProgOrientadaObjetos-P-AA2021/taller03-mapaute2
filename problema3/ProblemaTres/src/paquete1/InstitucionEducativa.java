/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author usuario
 */
public class InstitucionEducativa {
    
    private String nombre;
    private String tipoInstituto;
    private int numAlumnos;
    private int numDocentes;
    private int numSedes;
    
    public void establecerNombre(String tipo){
        nombre = tipo;       
    }
    public void establecerTipoInstituto(String tipo){
        tipoInstituto = tipo;
    }
    public void establecerNumAlumnos(int tipo){
        numAlumnos = tipo;
    }
    public void establecerNumDocentes(int tipo){
        numDocentes = tipo;
    }
    public void establecerNumSedes(int tipo){
        numSedes = tipo;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerTipoInstituto(){
        return tipoInstituto;
    }
    public int obtenerNumAlumnos(){
        return numAlumnos;
    }
    public int obtenerNumDocentes(){
        return numDocentes;
    }
    public int obtenerNumSedes(){
        return numSedes;
    }
    
    //-----------
    
    private String nombre2;
    private String tipoInstituto2;
    private int numAlumnos2;
    private int numDocentes2;
    private int numSedes2;
    
    public void establecerNombre2(String tipo){
        nombre2 = tipo;       
    }
    public void establecerTipoInstituto2(String tipo){
        tipoInstituto2 = tipo;
    }
    public void establecerNumAlumnos2(int tipo){
        numAlumnos2 = tipo;
    }
    public void establecerNumDocentes2(int tipo){
        numDocentes2 = tipo;
    }
    public void establecerNumSedes2(int tipo){
        numSedes2 = tipo;
    }
    
    public String obtenerNombre2(){
        return nombre2;
    }
    public String obtenerTipoInstituto2(){
        return tipoInstituto2;
    }
    public int obtenerNumAlumnos2(){
        return numAlumnos2;
    }
    public int obtenerNumDocentes2(){
        return numDocentes2;
    }
    public int obtenerNumSedes2(){
        return numSedes2;
    }
}
