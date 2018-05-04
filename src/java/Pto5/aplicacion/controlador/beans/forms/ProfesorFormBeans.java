/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pto5.aplicacion.controlador.beans.forms;

import Pto5.aplicacion.modelo.dominio.Profesor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author RENE
 */
@ManagedBean
@ViewScoped
public class ProfesorFormBeans implements Serializable{
   
    
   private Profesor profesorSelecc;
    private String nombre;
    private String apellido;
    private int legajo;
    private int edad;
    private String materia;
    private List<Profesor> lista= new ArrayList() ;
     private Profesor profesor;
    public List<Profesor> getLista() {
        return lista;
    }

   
    public void cargarLista(){
        profesor = new Profesor(nombre,apellido,legajo,edad,materia);
       // unProfe.agregarProfe(nombre, apellido, legajo,edad , materia);
        lista.add(profesor);
    }

   
   
    /**
     * Creates a new instance of ProfesorFormBeans
     */
    public ProfesorFormBeans() {
        
        profesor= new Profesor(nombre,apellido,legajo,edad,materia);
        
    }

    /**
     * @return the profesor
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * @param profesor the profesor to set
     */
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
   

    /**
     * @return the profesorSelecc
     */
    public Profesor getProfesorSelecc() {
        return profesorSelecc;
    }

    /**
     * @param profesorSelecc the profesorSelecc to set
     */
    public void setProfesorSelecc(Profesor profesorSelecc) {
        this.profesorSelecc = profesorSelecc;
    }
}
