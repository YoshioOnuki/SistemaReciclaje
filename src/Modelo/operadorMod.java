/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import DB.ConDB;
import Entidad.operador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author yoshi
 */
public class operadorMod {
    PreparedStatement ps;
    ResultSet rs;
    
    DB.ConDB con = new ConDB();
    Connection acce;
    
    //Validamos los campos del login...
    public Entidad.operador validarOperador(int idOpe){
        Entidad.operador entE = new operador();
        
        String msql = "SELECT * FROM operador WHERE OperID=?";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(msql);
            ps.setInt(1, idOpe);
            rs = ps.executeQuery();
            while(rs.next()){
                entE.setOperID(rs.getInt(1));
                entE.setOperDNI(rs.getString(2));
                entE.setOperNom(rs.getString(3));
                entE.setOperApe(rs.getString(4));
                entE.setOperDirec(rs.getString(5));
            }
            
        } catch (Exception e) {
            System.out.println("Error al validar operador:  " + e);
        }
        
        return entE;
    }
}
