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
public class EquipoCelular {
    
    private String sisOperativo;
    private double tamaño;
    private double costo;
    private String direccion;
    private String informacion;
    
    public void establecerSisOperativo(String tipo){
        sisOperativo = tipo;
    }
    public void establecerTamño(double tipo){
        tamaño = tipo;
    }
    public void establecerCosto(double tipo){
        costo = tipo;
    }
    public void establecerDireccion(String tipo){
        direccion = tipo;
    }
    public void establecerInformacion(String tipo){
        informacion = tipo;
    }
    
    public String obtenerSisOperativo(){
        return sisOperativo;
    }
    public double obtenerTamaño(){
        return tamaño;
    }
    public double obtenerCosto(){
        return costo;
    }
    public String obtenerDireccion(){
        return direccion;
    }
    public String obtenerInformacion(){
        return informacion;
    }
    
    //------------
    
    private String sisOperativo2;
    private double tamaño2;
    private double costo2;
    private String direccion2;
    private String informacion2;
    
    public void establecerSisOperativo2(String tipo){
        sisOperativo2 = tipo;
    }
    public void establecerTamño2(double tipo){
        tamaño2 = tipo;
    }
    public void establecerCosto2(double tipo){
        costo2 = tipo;
    }
    public void establecerDireccion2(String tipo){
        direccion2 = tipo;
    }
    public void establecerInformacion2(String tipo){
        informacion2 = tipo;
    }
    
    public String obtenerSisOperativo2(){
        return sisOperativo2;
    }
    public double obtenerTamaño2(){
        return tamaño2;
    }
    public double obtenerCosto2(){
        return costo2;
    }
    public String obtenerDireccion2(){
        return direccion2;
    }
    public String obtenerInformacion2(){
        return informacion2;
    }
}
