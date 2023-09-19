/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

/**
 *
 * @author labor
 */
public class TipoUsuario {

    private int idtipousuario;
    private String tuNombre;

    public TipoUsuario() {
    }

    public TipoUsuario(int idtipousuario, String tuNombre) {
        this.idtipousuario = idtipousuario;
        this.tuNombre = tuNombre;
    }

    public int getIdtipousuario() {
        return idtipousuario;
    }

    public void setIdtipousuario(int idtipousuario) {
        this.idtipousuario = idtipousuario;
    }

    public String getTuNombre() {
        return tuNombre;
    }

    public void setTuNombre(String tuNombre) {
        this.tuNombre = tuNombre;
    }

    
   

}
