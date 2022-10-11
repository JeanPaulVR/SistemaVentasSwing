/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sisventas.model.logic;

import com.sisventas.model.beans.DetalleVenta;
import com.sisventas.model.dao.DetalleVentaDao;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jean Paul
 */
public class DetalleVentaLogic {
    private static DetalleVentaDao detalledao = new DetalleVentaDao();
    
    public static boolean insertarItem(DetalleVenta detalleventa)throws Exception{
        try{
            int cantidad = detalleventa.getCantidad();
            int stock = detalleventa.getProducto().getStock();
            double precio = detalleventa.getProducto().getPrecio();
            if(stock < cantidad){
                throw new Exception("Stock insuficiente");
            }else{
                detalleventa.setSubtotal(precio*cantidad);
            }
            return detalledao.insertar(detalleventa);
        }catch(Exception ex){
            throw ex;
        }
    }
    
    public static void finalizar()throws Exception{
        try{
            detalledao.limpiar();
        }catch(Exception ex){
            throw ex;
        }
    }
    
    public static List<DetalleVenta> obtenerLista()throws Exception{
        try{
            List<DetalleVenta> detalle = detalledao.listar();
            return detalle;
        }catch(Exception ex){
            throw ex;
        }
    }
    
    public static DefaultTableModel tableModelDetalleventa(){
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
        
        String[] columnNames = {"PRODUCTO","PRECIO U","CANTIDAD","SUBTOTAL"};
        modelo.setColumnIdentifiers(columnNames);
        
        List<DetalleVenta> lista = detalledao.listar();
        Object[] fila = new Object[modelo.getColumnCount()];
        for (int i = 0; i < lista.size(); i++) {
            fila[0] = lista.get(i).getProducto().getNombre();
            fila[1] = lista.get(i).getProducto().getPrecio();
            fila[2] = lista.get(i).getCantidad();
            fila[3] = lista.get(i).getSubtotal();
            modelo.addRow(fila);
        }
        return modelo;
    }
}
