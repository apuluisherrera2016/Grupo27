/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.modelo.dominio.Calculadora;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author gustso
 */
@ManagedBean
@ViewScoped
public class CalculadoraFormBean implements Serializable{
    private double numeroA;
    private double numeroB;
    private Calculadora calculadora;
    private char operador;

    public char getOperador() {
        return operador;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }
   
    public CalculadoraFormBean() {
        calculadora = new Calculadora();
    }

    public double sumar(){
        return calculadora.sumar(numeroA, numeroB);
    }
    
    public double restar(){
        return calculadora.restar(numeroA, numeroB);
    }
     public double multiplicar(){
        return calculadora.multiplicar(numeroA, numeroB);
    }
      public double dividir(){
        return calculadora.dividir(numeroA, numeroB);
    }
    public Calculadora getCalculadora() {
        return calculadora;
    }

    public double seleccionarOperacion(){
        double res=0;
        
            
            switch (operador){
                case 'S' : res=calculadora.sumar(numeroA, numeroB); break;
                case 'R' : res=calculadora.restar(numeroA, numeroB); break;
                case 'M' : res=calculadora.multiplicar(numeroA, numeroB); break;
                case 'D' : res=calculadora.dividir(numeroA, numeroB); break;      
            
        }
        return res;
    }
    
    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    public double getNumeroA() {
        return numeroA;
    }

    public void setNumeroA(double numeroA) {
        this.numeroA = numeroA;
    }

    public double getNumeroB() {
        return numeroB;
    }

    public void setNumeroB(double numeroB) {
        this.numeroB = numeroB;
    }
    
    
}
