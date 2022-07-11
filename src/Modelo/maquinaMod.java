/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import DB.ConDB;
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
    
}
