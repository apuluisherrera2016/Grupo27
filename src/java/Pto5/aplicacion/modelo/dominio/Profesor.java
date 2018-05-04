/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pto5.aplicacion.modelo.dominio;

/**
 *
 * @author RENE
 */
public class Profesor {
    
    private String nombre;
    private String apellido;
    private int legajo;
    private int edad;
    private String materia;
 public Profesor(String nombre, String apellido, int legajo, int edad, String materia) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.legajo = legajo;
    this.materia=materia;
    this.edad=edad;
  }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the legajo
     */
    public int getLegajo() {
        return legajo;
    }

    /**
     * @param legajo the legajo to set
     */
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the materia
     */
    public String getMateria() {
        return materia;
    }

    /**
     * @param materia the materia to set
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }
    public void agregarProfe(String n, String a,int l, int e, String m){
          nombre=n;
          apellido=a;
          legajo=l;
          edad=e;
          materia=m;
    }
}
