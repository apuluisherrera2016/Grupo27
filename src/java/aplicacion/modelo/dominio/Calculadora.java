/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;




public class Calculadora implements Serializable{
    
    public double sumar(double numeroA, double numeroB){
        return numeroA + numeroB;
    }
        public double restar(double numeroA, double numeroB){
            double aux = numeroA - numeroB;      
                return aux;
    }
    public double multiplicar(double numeroA, double numeroB){
            double aux = numeroA * numeroB;      
                return aux;
    }   
    public double dividir(double numeroA, double numeroB){
            double aux = numeroA / numeroB;      
                return aux;
    }
}
