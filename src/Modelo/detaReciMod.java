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
public class detaReciMod {
    PreparedStatement ps;
    ResultSet rs;
    
    DB.ConDB con = new ConDB();
    Connection acce;
    
    //Agregamos los datos del Detalle del Recibo
    public int addDetaRecibo(Object[] o) {
        int r = 0;
        String sql = "INSERT INTO detareci(DetaReciCant,DetaReciImpor,ReciID,ProdID) VALUES(?,?,?,?)";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            r = ps.executeUpdate();
            //Cerramos la conexion
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al ingresar el Detalle del Recido " + e);
        }
        
        return r;
    }
}
