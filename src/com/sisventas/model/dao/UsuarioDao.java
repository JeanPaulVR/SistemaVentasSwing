/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sisventas.model.dao;

import java.util.ArrayList;
import java.util.List;
import com.sisventas.model.beans.Usuario;

/**
 *
 * @author Jean Paul
 */
public class UsuarioDao {
    private List<Usuario> usuarios;
    
    public UsuarioDao(){
        usuarios = new ArrayList<>();
    }
    
    public int buscar(String usuario){
        int pos = -1;
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i).getUsuario().equals(usuario)){
                pos = i;
                break;
            }
        }
        return pos;
    }
    
    public boolean insertar(Usuario usuario)throws Exception{
        try {
            if(buscar(usuario.getUsuario())==-1){
                usuarios.add(usuario);
                return true;
            }else{
                return false;
            }
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    public Usuario obtener(String usuario)throws Exception{
        try{
            int pos = buscar(usuario);
            return usuarios.get(pos);
        }catch(Exception ex){
            throw ex;
        }
    }
}
