/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author felipe
 */
public class Articulo {
    private String referencia;
    private String nombre;
    private double precio;

    public Articulo() {
    }

    public Articulo(String referencia, String nombre, double precio) {
        this.referencia = referencia;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void GetAtributos(){
    }
    
    public Articulo SetAtributos(String referencia, String nombre, double precio ){
        Articulo Articulo = null;
        return Articulo;
    }
    
    public String Calculo_Venta(){
        return referencia;
    }
}
