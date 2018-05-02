package aplicacion.controlador.beans.forms;


import aplicacion.modelo.dominio.Numero;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Luis
 */
@ManagedBean
@ViewScoped
public class ArregloNumeros {

    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    private List<Numero> lista= new ArrayList() ;

    public List<Numero> getLista() {
        return lista;
    }

    public void setLista(List<Numero> lista) {
        this.lista = lista;
    }
    public void agregarLista(){
        Numero unNumero = new Numero();
        unNumero.agregarNumero(num);
        lista.add(unNumero);
    }
    
    public int maximoValor(){
        int max;
        max = 0;
        for(int i=0; i< lista.size();i++)
        {
            if(max < lista.get(i).getNumero())
                max= lista.get(i).getNumero();
        }
        
        return max;
    }
    
    public int menoValor(){
        int men;
        
        if(lista.isEmpty())
            men= 0;
        else{
             men=lista.get(0).getNumero();
        for(int i=1; i< lista.size();i++)
        {
            
            if(men > lista.get(i).getNumero())
                men= lista.get(i).getNumero();
        }
        }
        return men;
    }
    
    public float promedio(){
        int aux =0;
        float prom;
        
        if(lista.isEmpty())
            prom=0;
        
        else{
            
       
         for(int i=0; i< lista.size();i++)
        
           aux= aux + lista.get(i).getNumero();
    
         prom= aux / lista.size();
          }
         return prom;
    }
    
     
    
    
    
    
}
