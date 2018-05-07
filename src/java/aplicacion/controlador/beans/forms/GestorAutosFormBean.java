/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.modelo.dominio.Auto;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;
/**
 *
 * @author Luis
 */
@ManagedBean
@ViewScoped
public class GestorAutosFormBean implements Serializable{

    private List<Auto> lista= new ArrayList() ;
 
    private String patente;
    private String marca;
    private String color;
    private int modelo;
    private String tc;
    private Auto autoSelecionado;

    private String patenteN;
    private String marcaN;
    private String colorN;
    private int modeloN;
    private String tcN;
    
    
    
    
    
    public Auto getAutoSelecionado() {
        return autoSelecionado;
    }

    public void setAutoSelecionado(Auto autoSelecionado) {
        this.autoSelecionado = autoSelecionado;
    }
    
    
    public GestorAutosFormBean() {
        
    }

    
    
    
    public List<Auto> getLista() {
        return lista;
    }

    public void setLista(List<Auto> lista) {
        this.lista = lista;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }
    public void agregar(){
        Auto unAuto = new Auto();
        unAuto.setPatente(patente);
        unAuto.setMarca(marca);
        unAuto.setColor(color);
        unAuto.setModelo(modelo);
        unAuto.setTc(tc);
        
        lista.add(unAuto);
        
    }
    public void actualizar(RowEditEvent event){
        Auto xAuto = (Auto) event.getObject();
        xAuto.setPatente(patenteN);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Actualizado"));
        
    }
     public void cancelar(RowEditEvent event){
         
     }

    public String getPatenteN() {
        return patenteN;
    }

    public void setPatenteN(String patenteN) {
        this.patenteN = patenteN;
    }

    public String getMarcaN() {
        return marcaN;
    }

    public void setMarcaN(String marcaN) {
        this.marcaN = marcaN;
    }

    public String getColorN() {
        return colorN;
    }

    public void setColorN(String colorN) {
        this.colorN = colorN;
    }

    public int getModeloN() {
        return modeloN;
    }

    public void setModeloN(int modeloN) {
        this.modeloN = modeloN;
    }

    public String getTcN() {
        return tcN;
    }

    public void setTcN(String tcN) {
        this.tcN = tcN;
    }
  
    
}