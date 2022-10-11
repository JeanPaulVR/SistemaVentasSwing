/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sisventas.model.dao;

import com.sisventas.model.beans.DetalleVenta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jean Paul
 */
public class DetalleVentaDao {
    private List<DetalleVenta> detalleventas;
    
    public DetalleVentaDao(){
        detalleventas = new ArrayList<>();
    }
    
    public void limpiar()throws Exception{
        try{
            detalleventas.clear();
        }catch(Exception ex){
            throw ex;
        }
    }
    
    public boolean insertar(DetalleVenta detalleventa)throws Exception{
        try{
            detalleventas.add(detalleventa);
            return true;
        }catch(Exception ex){
            throw ex;
        }
    }
    
    public List<DetalleVenta> listar(){
        return detalleventas;
    }
}
