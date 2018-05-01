/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

/**
 *
 * @author Luis
 */
public class ConversorTemperatura {
    
   private double numero;
    
    public ConversorTemperatura(){
        
    }
    
    public void asignarValor(double num){
        this.numero = num;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }  
    
    public double celsiusToFahrenheit()
      {
          double resultado;
         resultado= numero * 1.8 + 32;
         return resultado;
      }
   
      public double fahrenheitToCelsius()
      {
          double res;
          res= (numero-32)/ 1.8;
         return res;
      }
   
   public double kelvinToCelsius()
      {double res;
           res= numero - 273 ;
         return res;
      }
   
   public double celsiusToKelvin()
      {
           double res;
           res=numero + 273;
         return res;
      }
   public double fahrenheitToKelvin()
     {
         double res;
         
         res =  (5/9 * (numero - 32) + 273);

         return res;

     }
   public double kelvinToFahrenheit()
   {   
       double res;
       res = 1.8 * (numero - 273) + 32;
       return res;
   }

}
