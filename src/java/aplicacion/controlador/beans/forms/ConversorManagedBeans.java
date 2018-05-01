/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import aplicacion.modelo.dominio.ConversorTemperatura;
/**
 *
 * @author Luis
 */
@ManagedBean
@ViewScoped
public class ConversorManagedBeans {

    private double n;
    private ConversorTemperatura conversor;
    private char unidadOrigen;
    private char unidadDestino;
    
    public ConversorManagedBeans() {
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public ConversorTemperatura getConversor() {
        return conversor;
    }

    public void setConversor(ConversorTemperatura conversor) {
        this.conversor = conversor;
    }

    public char getUnidadOrigen() {
        return unidadOrigen;
    }

    public void setUnidadOrigen(char unidadOrigen) {
        this.unidadOrigen = unidadOrigen;
    }

    public char getUnidadDestino() {
        return unidadDestino;
    }

    public void setUnidadDestino(char unidadDestino) {
        this.unidadDestino = unidadDestino;
    }
    
    public double convertirUnidades(){
        double resultado=.0;
        conversor = new ConversorTemperatura();
        conversor.asignarValor(n);
        if(unidadOrigen == 'C' && unidadDestino == 'F'){
            resultado = conversor.celsiusToFahrenheit();
            }
        else{
              if(unidadOrigen == 'C' && unidadDestino == 'K'){
            resultado = conversor.celsiusToKelvin();}
              else{
                     if(unidadOrigen == 'F' && unidadDestino == 'C'){
                           resultado = conversor.fahrenheitToCelsius();}
                     else{
                           if(unidadOrigen == 'F' && unidadDestino == 'K'){
                               resultado = conversor.fahrenheitToKelvin();}
                           else{
                               if(unidadOrigen == 'k' && unidadDestino == 'C'){
                                   resultado = conversor.kelvinToCelsius();}
                               else{
                                    if(unidadOrigen == 'K' && unidadDestino == 'F'){
                                         resultado = conversor.kelvinToFahrenheit();}
            
                                    }
                                }
                           }                                            
                  
                  }
            }
    
        
             return resultado;
}
    
    
    
    }

