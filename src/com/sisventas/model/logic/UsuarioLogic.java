/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sisventas.model.logic;

import com.sisventas.model.beans.Usuario;
import com.sisventas.model.dao.UsuarioDao;

/**
 *
 * @author Jean Paul
 */
public class UsuarioLogic {
    private static UsuarioDao usuariodao = new UsuarioDao();
    
    public static boolean insertarUsuario(Usuario usuario)throws Exception{
        try {
            return usuariodao.insertar(usuario);
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    public static Usuario obtenerUsuario(String usuario)throws Exception{
        try{
            return usuariodao.obtener(usuario);
        }catch(Exception ex){
            throw ex;
        }
    }
}
