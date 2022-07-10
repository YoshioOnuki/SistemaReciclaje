/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import DB.ConDB;
import Entidad.producto;
import Vista.ModuloIngProd;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

/**
 *
 * @author yoshi
 */
public class productoMod {
    PreparedStatement ps;
    ResultSet rs;
    
    DB.ConDB con = new ConDB();
    Connection acceso;
    
    public Entidad.producto validarProducto(int idP){
        Entidad.producto entP = new producto();
        
        String msql = "SELECT * FROM producto WHERE ProdID=? AND ProdEstd=1";
        
        try {
            acceso = con.conectardb();
            ps = acceso.prepareStatement(msql);
            ps.setInt(1, idP);
            rs = ps.executeQuery();
            while(rs.next()){
                entP.setProdID(rs.getInt(1));
                entP.setProdDesc(rs.getString(2));
                entP.setProdPrec(rs.getDouble(3));
                entP.setProdEstd(rs.getInt(4));
            }
            
        } catch (Exception e) {
            System.out.println("Error al validar Producto:  " + e);
        }
        
        return entP;
    }
    
    public int SacarContProd(){
        int cont = 0;
        
        String msql = "SELECT COUNT(ProdID) FROM producto WHERE ProdEstd=1";
        
        try {
            acceso = con.conectardb();
            ps = acceso.prepareStatement(msql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                cont = rs.getInt(1);
            }
            
        } catch (Exception e) {
            System.out.println("Error al Objeter contador del producto:  " + e);
        }
        
        return cont;
    }
    

    
    
    
    
}
