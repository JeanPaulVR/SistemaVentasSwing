/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sisventas.model.dao;

import com.sisventas.model.beans.Venta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jean Paul
 */
public class VentaDao {
    private List<Venta> ventas;
    
    public VentaDao(){
        ventas = new ArrayList<>();
    }
    
    public int buscar(int codigo){
        int pos = -1;
        for (int i = 0; i < ventas.size(); i++) {
            if(ventas.get(i).getIdventa()==codigo){
                pos = i;
                break;
            }
            
        }
        return pos;
    }
    
    public boolean insertar(Venta venta)throws Exception{
        try{
            if(buscar(venta.getIdventa())==-1){
                ventas.add(venta);
                return true;
            }else{
                return false;
            }
        }catch(Exception ex){
            throw ex;
        }
    }
    
    public Venta obtener(int codigo)throws Exception{
        try{
            int pos = buscar(codigo);
            return ventas.get(pos);
        }catch(Exception ex){
            throw ex;
        }
    }
    
    public List<Venta> listar(){
        return ventas;
    }
}
