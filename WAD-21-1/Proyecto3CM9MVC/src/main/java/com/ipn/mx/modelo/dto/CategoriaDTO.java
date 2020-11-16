/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.modelo.dto;

import com.ipn.mx.modelo.entidades.Categoria;
import java.io.Serializable;

/**
 *
 * @author root
 */
public class CategoriaDTO implements Serializable{
    private Categoria entidad;

    public CategoriaDTO() {
        entidad = new Categoria();
    }

    public CategoriaDTO(Categoria entidad) {
        this.entidad = entidad;
    }

    public Categoria getEntidad() {
        return entidad;
    }

    public void setEntidad(Categoria entidad) {
        this.entidad = entidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Id Categoria: ").append(getEntidad().getIdCategoria()).append("\n");
        sb.append("Nombre Categoria: ").append(getEntidad().getNombreCategoria()).append("\n");
        sb.append("Descripción Categoria: ").append(getEntidad().getDescripcionCategoria()).append("\n");
        return sb.toString();
    }
    
}
