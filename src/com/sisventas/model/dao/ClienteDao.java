/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sisventas.model.dao;

import com.sisventas.model.beans.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jean Paul
 */
public class ClienteDao {
    private List<Cliente> clientes;
    
    public ClienteDao(){
        clientes = new ArrayList<>();
    }
    
    public int buscar(int dni){
        int pos = -1;
        for (int i = 0; i < clientes.size(); i++) {
            if(clientes.get(i).getDni()==dni){
                pos = i;
                break;
            }
        }
        return pos;
    }
    
    public int buscarnombre(String nombre){
        int pos = -1;
        for (int i = 0; i < clientes.size(); i++) {
            if(clientes.get(i).getNombre().equals(nombre)){
                pos = i;
                break;
            }
        }
        return pos;
    }
    
    public boolean insertar(Cliente cliente)throws Exception{
        try{
            if(buscar(cliente.getDni())==-1){
                clientes.add(cliente);
                return true;
            }else{
                return false;
            }
        }catch(Exception ex){
            throw ex;
        }
    }
    
    public boolean modificar(Cliente cliente)throws Exception{
        try{
            int posicion = buscar(cliente.getDni());
            if(posicion != -1){
                clientes.set(posicion, cliente);
                return true;
            }else{
                return false;
            }
        }catch(Exception ex){
            throw ex;
        }
    }
    
    public boolean eliminar(int dni)throws Exception{
        try{
            int posicion = buscar(dni);
            if(posicion != -1){
                clientes.remove(posicion);
                return true;
            }else{
                return false;
            }
        }catch(Exception ex){
            throw ex;
        }
    }
    
    public Cliente obtener(int codigo)throws Exception{
        try{
            int pos = buscar(codigo);
            return clientes.get(pos);
        }catch(Exception ex){
            throw ex;
        }
    }
    
    public Cliente obtenernombre(String nombre)throws Exception{
        try{
            int pos = buscarnombre(nombre);
            return clientes.get(pos);
        }catch(Exception ex){
            throw ex;
        }
    }
    
    public List<Cliente> listar(){
        return clientes;
    }
}
