/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import DB.ConDB;
import Entidad.maquina;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author yoshi
 */
public class maquinaMod {
    
    PreparedStatement ps;
    ResultSet rs;
    
    DB.ConDB con = new ConDB();
    Connection acce;
    
    //Retornamos el estado del atasco de productos de la maquina
    public int atascoMaqui(){
        int r = 0;
        
        String sql = "SELECT MaquiAtasco FROM maquina WHERE MaquiID=1";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                r = rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println("Error al obtener el Estado del Atasco de la Maquina:  " + e);
        }
        
        return r;
    }
    
    //Actualizamos el estado de atasco de la maquina
    public int updateAtasco(Object ob) {
        int r = 0;
        
        String sql = "UPDATE maquina SET MaquiAtasco=? WHERE MaquiID=1";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            ps.setObject(1, ob);
            r = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error actualizar el Estado del Atasco de la Maquina" + e);
        }
        
        return r;
    }
    
    //Validamos los atributos de la maquina
    public Entidad.maquina validarMaquina(){
        Entidad.maquina entMaq = new maquina();
        
        String msql = "SELECT * FROM maquina WHERE MaquiID=1";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(msql);
            rs = ps.executeQuery();
            while(rs.next()){
                entMaq.setMaquiID(rs.getInt(1));
                entMaq.setMaquiHoja(rs.getInt(2));
                entMaq.setMaquiLimHoja(rs.getInt(3));
                entMaq.setMaquiAtasco(rs.getInt(4));
            }
            
        } catch (Exception e) {
            System.out.println("Error al validar la entidad Maquina:  " + e);
        }
        
        return entMaq;
    }
    
    //Actualizamos el estado de atasco de la maquina
    public int updateHoja(Object ob) {
        int r = 0;
        
        String sql = "UPDATE maquina SET MaquiHoja=? WHERE MaquiID=1";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            ps.setObject(1, ob);
            r = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error actualizar las hojas de la Maquina" + e);
        }
        
        return r;
    }
    
    
}
