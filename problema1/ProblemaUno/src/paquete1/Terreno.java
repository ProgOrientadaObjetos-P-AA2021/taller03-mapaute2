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
public class Terreno {

    private double costo;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;
    
    public void establecerCosto(double tipo){
        costo = tipo;
    }
    public void establecerAncho(double tipo){
        ancho = tipo;
    }
    public void establecerLargo(double tipo){
        largo = tipo;
    }
    public void establecerArea(){
        area  = largo * ancho;
    }
    public void establecerValorMetroCuadrado(){
        valorMetroCuadrado = area * costo;
    }
    public double obtenerCosto(){
        return costo;
    }
    public double obtenerAncho(){
        return ancho;
    }
    public double obtenerLargo(){
        return largo;
    }
    public double obtenerArea(){
        return area;
    }
    public double obtenerValorMetroCuadrado(){
        return valorMetroCuadrado;
    }
    
    //--------
    
    private double valorMetro;
    private double anchoTerreno;
    private double largoTerreno;
    private double areaTerreno;
    private double valorTerreno;
    
    public void establecerValorMetro(double a){
        valorMetro = a;
    }
    public void establecerAnchoTerreno(double a){
        anchoTerreno = a;
    }
    public void establecerLargoTerreno(double a){
        largoTerreno = a;
    }
    public void establecerAreaTerreno(){
        areaTerreno  = largoTerreno * anchoTerreno;
    }
    public void establecerValorTerreno(){
        valorTerreno = areaTerreno * valorMetro;
    }
    public double obtenerValorMetro(){
        return valorMetro;
    }
    public double obtenerAnchoTerreno(){
        return anchoTerreno;
    }
    public double obtenerLargoTerreno(){
        return largoTerreno;
    }
    public double obtenerAreaTerreno(){
        return areaTerreno;
    }
    public double obtenerValorTerreno(){
        return valorTerreno;
    }
}
