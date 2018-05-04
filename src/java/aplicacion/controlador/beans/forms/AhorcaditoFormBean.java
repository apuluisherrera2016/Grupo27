/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.modelo.dominio.Ahorcadito;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

/**
 *
 * @author
 */
@ManagedBean
@ViewScoped
public class AhorcaditoFormBean implements Serializable{

    private Ahorcadito nuevoahorcado;
    
    /**
     * Creates a new instance of hangmanFormBean
     */
    public AhorcaditoFormBean() {
    
        nuevoahorcado = new Ahorcadito();
    }

    /**
     * @return the nuevoahorcado
     */
    public Ahorcadito getNuevoahorcado() {
        return nuevoahorcado;
    }

    /**
     * @param nuevoahorcado the nuevoahorcado to set
     */
    public void setNuevoahorcado(Ahorcadito nuevoahorcado) {
        this.nuevoahorcado = nuevoahorcado;
    }

   

   
    
}
