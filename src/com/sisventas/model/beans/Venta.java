/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sisventas.model.beans;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jean Paul
 */
public class Venta {
    private int idventa;
    private Date fecha;
    private double total;
    private Cliente cliente;
    private List<DetalleVenta> detalleventa;

    public Venta() {
        
    }
    
    public Venta(Cliente cliente, int idventa, Date fecha, List<DetalleVenta> detalleventa){
        this.idventa = idventa;
        this.fecha = fecha;
        this.total = total;
        this.cliente = cliente;
        this.detalleventa = detalleventa;
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<DetalleVenta> getDetalleventa() {
        return detalleventa;
    }

    public void setDetalleventa(List<DetalleVenta> detalleventa) {
        this.detalleventa = detalleventa;
    }
    
    @Override
    public String toString(){
        ZoneId timeZone = ZoneId.systemDefault();
        LocalDate getLocalDate = fecha.toInstant().atZone(timeZone).toLocalDate();
        return ""+ getLocalDate.getDayOfMonth()+"/"+getLocalDate.getMonth()+"/"+ getLocalDate.getYear();
    }
}
