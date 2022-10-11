/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sisventas.model.logic;

import com.sisventas.model.beans.Categoria;
import com.sisventas.model.dao.CategoriaDao;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author Jean Paul
 */
public class CategoriaLogic {
    private static CategoriaDao categoriadao = new CategoriaDao();
    
    public static boolean insertarCategoria(Categoria categoria)throws Exception{
        try{
           return categoriadao.insertar(categoria);
        }catch(Exception ex){
            throw ex;
        }
    }
    
    public static boolean modificarCategoria(Categoria categoria)throws Exception{
        try{
            return categoriadao.modificar(categoria);
        }catch(Exception ex){
            throw ex;
        }
    }
    
    public static boolean eliminarCategoria(int codigo)throws Exception{
        try{
            return categoriadao.eliminar(codigo);
        }catch(Exception ex){
            throw ex;
        }
    }
    
    public static DefaultComboBoxModel comboModelCategoria(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        List lista = categoriadao.listar();
        for (int i = 0; i < lista.size(); i++) {
            modelo.addElement(lista.get(i));
        }
        return modelo;
    }
    
    public static DefaultListModel listModelCategoria(){
        DefaultListModel modelo = new DefaultListModel();
        List lista = categoriadao.listar();
        
        for (int i = 0; i < lista.size(); i++) {
            modelo.addElement(lista.get(i));
        }
        return modelo;        
    }
}
