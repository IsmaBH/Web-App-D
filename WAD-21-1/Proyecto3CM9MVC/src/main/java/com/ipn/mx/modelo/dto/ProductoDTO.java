/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.modelo.dto;

import com.ipn.mx.modelo.entidades.Producto;
import java.io.Serializable;

/**
 *
 * @author root
 */
public class ProductoDTO implements Serializable{
    private Producto entidad;
    
    public ProductoDTO(){
        entidad = new Producto();
    }
    public ProductoDTO(Producto entidad){
        this.entidad = entidad;
    }

    public Producto getEntidad() {
        return entidad;
    }

    public void setEntidad(Producto entidad) {
        this.entidad = entidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductoDTO{entidad=").append(entidad);
        sb.append('}');
        return sb.toString();
    }
    
}
