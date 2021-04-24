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
public class EquivalenteHora {

    private int hora;
    private int minutos;
    private int segundos;
    private int dias;
    
    public void establecerHora(int tipo){
        hora = tipo;
    }
    public void establecerMinutos(){
        minutos = hora * 60;
    }
    public void establecerSegundos(){
        segundos = hora * 3600;
    }
    public void establecerDias(){
        dias  = hora / 24;
    }
    public int obtenerHora(){
        return hora;
    }
    public int obtenerMinutos(){
        return minutos;
    }
    public int obtenerSegundos(){
        return segundos;
    }
    public int obtenerDias(){
        return dias;
    }
    
    //-----------
    
    private int hora2;
    private int minutos2;
    private int segundos2;
    private int dias2;
    
    public void establecerHora2(int tipo){
        hora2 = tipo;
    }
    public void establecerMinutos2(){
        minutos2 = hora2 * 60;
    }
    public void establecerSegundos2(){
        segundos2 = hora2 * 3600;
    }
    public void establecerDias2(){
        dias2  = hora2 / 24;
    }
    public int obtenerHora2(){
        return hora2;
    }
    public int obtenerMinutos2(){
        return minutos2;
    }
    public int obtenerSegundos2(){
        return segundos2;
    }
    public int obtenerDias2(){
        return dias2;
    }
}
