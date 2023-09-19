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
public class Usuario {

    private String uDni;
    private String uNombre;
    private String uApellidos;
    private String uDireccion;
    private String uClave;
    private String uCelular;
    private int uTipo;
    private String tienda;

    public Usuario() {
    }

    public Usuario(String uDni, String uNombre, String uApellidos, String uDireccion, String uClave, String uCelular, int uTipo, String tienda) {
        this.uDni = uDni;
        this.uNombre = uNombre;
        this.uApellidos = uApellidos;
        this.uDireccion = uDireccion;
        this.uClave = uClave;
        this.uCelular = uCelular;
        this.uTipo = uTipo;
        this.tienda = tienda;
    }

    public String getuDni() {
        return uDni;
    }

    public void setuDni(String uDni) {
        this.uDni = uDni;
    }

    public String getuNombre() {
        return uNombre;
    }

    public void setuNombre(String uNombre) {
        this.uNombre = uNombre;
    }

    public String getuApellidos() {
        return uApellidos;
    }

    public void setuApellidos(String uApellidos) {
        this.uApellidos = uApellidos;
    }

    public String getuDireccion() {
        return uDireccion;
    }

    public void setuDireccion(String uDireccion) {
        this.uDireccion = uDireccion;
    }

    public String getuClave() {
        return uClave;
    }

    public void setuClave(String uClave) {
        this.uClave = uClave;
    }

    public String getuCelular() {
        return uCelular;
    }

    public void setuCelular(String uCelular) {
        this.uCelular = uCelular;
    }

    public int getuTipo() {
        return uTipo;
    }

    public void setuTipo(int uTipo) {
        this.uTipo = uTipo;
    }

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }

   

   
}
