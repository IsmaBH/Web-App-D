/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.modelo.dto;

import com.ipn.mx.modelo.entidades.Usuario;
import java.io.Serializable;

/**
 *
 * @author root
 */
public class UsuarioDTO implements Serializable{
    private Usuario entidad;
    
    public UsuarioDTO(){
        entidad = new Usuario();
    }
    public UsuarioDTO(Usuario entidad) {
        this.entidad = entidad;
    }

    public Usuario getEntidad() {
        return entidad;
    }

    public void setEntidad(Usuario entidad) {
        this.entidad = entidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UsuarioDTO{entidad=").append(entidad);
        sb.append('}');
        return sb.toString();
    }
    
}
