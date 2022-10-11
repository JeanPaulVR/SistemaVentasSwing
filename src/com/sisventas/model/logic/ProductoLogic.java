/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sisventas.model.logic;

import com.sisventas.model.beans.Producto;
import com.sisventas.model.dao.ProductoDao;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jean Paul
 */
public class ProductoLogic {
    private static ProductoDao productodao = new ProductoDao();
    
    public static boolean insertarProducto(Producto producto)throws Exception{
        try{
            return productodao.insertar(producto);
        }catch(Exception ex){
            throw ex;
        }
    }
    
    public static boolean modificarProducto(Producto producto)throws Exception{
        try{
            return productodao.modificar(producto);
        }catch(Exception ex){
            throw ex;
        }
    }
    
    public static boolean eliminarProducto(int codigo)throws Exception{
        try{
            return productodao.eliminar(codigo);
        }catch(Exception ex){
            throw ex;
        }
    }
    
    public static Producto obtenerProducto(int codigo)throws Exception{
        try{
            return productodao.obtener(codigo);
        }catch(Exception ex){
            throw ex;
        }
    }
    
    public static DefaultTableModel tableModelProducto(){
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
        
        String[] columnNames = {"CODIGO","NOMBRE","CATEGORIA","STOCK","PRECIO"};
        modelo.setColumnIdentifiers(columnNames);
        
        List<Producto> lista = productodao.listar();
        Object[] fila = new Object[modelo.getColumnCount()];
        for (int i = 0; i < lista.size(); i++) {
            fila[0] = lista.get(i).getIdproducto();
            fila[1] = lista.get(i).getNombre();
            fila[2] = lista.get(i).getCategoria();
            fila[3] = lista.get(i).getStock();
            fila[4] = lista.get(i).getPrecio();
            modelo.addRow(fila);
        }
        return modelo;
    }
    
    public static DefaultTableModel tableModelBuscadorProducto(String nombre){
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
        
        String[] columnNames = {"CODIGO","NOMBRE","CATEGORIA","STOCK","PRECIO"};
        modelo.setColumnIdentifiers(columnNames);
        
        List<Producto> lista = productodao.listar();
        Object[] fila = new Object[modelo.getColumnCount()];
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getNombre().equals(nombre) || lista.get(i).getCategoria().getNombre().equals(nombre)){
                fila[0] = lista.get(i).getIdproducto();
                fila[1] = lista.get(i).getNombre();
                fila[2] = lista.get(i).getCategoria();
                fila[3] = lista.get(i).getStock();
                fila[4] = lista.get(i).getPrecio();
                modelo.addRow(fila);
            }
        }
        return modelo;
    }
}
