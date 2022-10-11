/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sisventas.model.logic;

import com.sisventas.model.beans.Cliente;
import com.sisventas.model.dao.ClienteDao;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jean Paul
 */
public class ClienteLogic {
    private static ClienteDao clientedao = new ClienteDao();
    
    public static boolean insertarCliente(Cliente cliente)throws Exception{
        try{
            return clientedao.insertar(cliente);
        }catch(Exception ex){
            throw ex;
        }
    }
    
    public static boolean modificarCliente(Cliente cliente)throws Exception{
        try{
            return clientedao.modificar(cliente);
        }catch(Exception ex){
            throw ex;
        }
    }
    
    public static boolean eliminarCliente(int dni)throws Exception{
        try{
            return clientedao.eliminar(dni);
        }catch(Exception ex){
            throw ex;
        }
    }
    
    public static Cliente obtenerCliente(int dni)throws Exception{
        try{
            return clientedao.obtener(dni);
        }catch(Exception ex){
            throw ex;
        }
    }
    
    public static Cliente obtenerClienteNombre(String nombre)throws Exception{
        try{
            return clientedao.obtenernombre(nombre);
        }catch(Exception ex){
            throw ex;
        }
    }
    
    public static DefaultTableModel tableModelCliente(){
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int fila, int columnNames){
                if(columnNames == 4){
                    return true;
                }else{
                    return false;
                } 
            }
        };
        
        String[] columnNames = {"DNI","NOMBRES","APELLIDOS"};
        modelo.setColumnIdentifiers(columnNames);
        
        List<Cliente> lista = clientedao.listar();
        Object[] fila = new Object[modelo.getColumnCount()];
        for (int i = 0; i < lista.size(); i++) {
            fila[0] = lista.get(i).getDni();
            fila[1] = lista.get(i).getNombre();
            fila[2] = lista.get(i).getApellidos();
            modelo.addRow(fila);
        }
        return modelo;
    }
    
    public static DefaultTableModel tableModelBuscarCliente(String nombre){
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int fila, int columnNames){
                if(columnNames == 4){
                    return true;
                }else{
                    return false;
                } 
            }
        };
        
        String[] columnNames = {"DNI","NOMBRES","APELLIDOS"};
        modelo.setColumnIdentifiers(columnNames);
        
        List<Cliente> lista = clientedao.listar();
        Object[] fila = new Object[modelo.getColumnCount()];
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getNombre().equals(nombre) || lista.get(i).getApellidos().equals(nombre)){
                fila[0] = lista.get(i).getDni();
                fila[1] = lista.get(i).getNombre();
                fila[2] = lista.get(i).getApellidos();
                modelo.addRow(fila);
            }
        }
        return modelo;
    }
}