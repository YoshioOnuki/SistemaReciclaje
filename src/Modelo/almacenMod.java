/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import DB.ConDB;
import Entidad.almacen;
import Entidad.maquina;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author yoshi
 */
public class almacenMod {
    
    
    PreparedStatement ps;
    ResultSet rs;
    
    DB.ConDB con = new ConDB();
    Connection acce;
    
    //Validamos los atributos del almacen mediante su ID del producto
    public Entidad.almacen validarAlmacen(int prodID){
        Entidad.almacen entAlma = new almacen();
        
        String msql = "SELECT * FROM almacen WHERE AlmaProdID=?";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(msql);
            ps.setObject(1, prodID);
            rs = ps.executeQuery();
            while(rs.next()){
                entAlma.setAlmaID(rs.getInt(1));
                entAlma.setAlmaProdID(rs.getInt(2));
                entAlma.setAlmaNumProd(rs.getInt(3));
                entAlma.setAlmaLimProd(rs.getInt(4));
            }
            //Cerramos la conexion
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al validar la entidad Almacen mediante el codigo del producto:  " + e);
        }
        
        return entAlma;
    }
    
    //Actualizamos la cantidad de productos en el Almacen
    public int updateAlmacen(Object ob, int prodID) {
        int r = 0;
        
        String sql = "UPDATE almacen SET AlmaNumProd=? WHERE AlmaProdID=?";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            ps.setObject(1, ob);
            ps.setObject(2, prodID);
            r = ps.executeUpdate();
            //Cerramos la conexion
            acce.close();
        } catch (Exception e) {
            System.out.println("Error actualizar el contador del almacen del producto con codigo "+ prodID + ": " + e);
        }
        
        return r;
    }
    
}
