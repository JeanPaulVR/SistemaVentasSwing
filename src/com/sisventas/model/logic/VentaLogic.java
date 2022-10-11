/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sisventas.model.logic;

import com.sisventas.model.beans.Venta;
import com.sisventas.model.dao.VentaDao;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jean Paul
 */
public class VentaLogic {
    private static VentaDao ventadao = new VentaDao();
    
    public static boolean insertarVenta(Venta venta) throws Exception {
        double total = 0;
        for (int i = 0; i < venta.getDetalleventa().size(); i++) {
            int stock = venta.getDetalleventa().get(i).getProducto().getStock();
            int cantidad = venta.getDetalleventa().get(i).getCantidad();
            venta.getDetalleventa().get(i).getProducto().setStock(stock-cantidad);
            total += venta.getDetalleventa().get(i).getSubtotal();
        }
        venta.setTotal(total);
        try {
            return ventadao.insertar(venta);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public static Venta obtenerVenta(int codigo) throws Exception {
        try {
            return ventadao.obtener(codigo);
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    public static int codigoventa(){
        return ventadao.listar().size();
    }
    
    public static DefaultComboBoxModel comboModelVenta(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        List<Venta> lista = ventadao.listar();
        String fecha = "";
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).toString().equals(fecha)){
                
            }else{
                modelo.addElement(lista.get(i));
                fecha = lista.get(i).toString();
            }
        }
        return modelo;
    }
    
    public static DefaultTableModel tableModelVentas(){
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
        
        String[] columnNames = {"CODIGO","CLIENTE","FECHA","TOTAL"};
        modelo.setColumnIdentifiers(columnNames);
        
        List<Venta> lista = ventadao.listar();
        Object[] fila = new Object[modelo.getColumnCount()];
        for (int i = 0; i < lista.size(); i++) {
            fila[0] = lista.get(i).getIdventa();
            fila[1] = lista.get(i).getCliente().getNombre();
            fila[2] = lista.get(i).getFecha();
            fila[3] = lista.get(i).getTotal();
            modelo.addRow(fila);
        }
        return modelo;
    }
    
    public static DefaultTableModel tableModelBuscadorVentas(String nombre){
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
        
        String[] columnNames = {"CODIGO","CLIENTE","FECHA","TOTAL"};
        modelo.setColumnIdentifiers(columnNames);
        
        List<Venta> lista = ventadao.listar();
        Object[] fila = new Object[modelo.getColumnCount()];
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getCliente().getNombre().equals(nombre) || lista.get(i).getCliente().getApellidos().equals(nombre) || lista.get(i).toString().equals(nombre)){
                fila[0] = lista.get(i).getIdventa();
                fila[1] = lista.get(i).getCliente().getNombre();
                fila[2] = lista.get(i).getFecha();
                fila[3] = lista.get(i).getTotal();
                modelo.addRow(fila);
            }
        }
        return modelo;
    }
}
