/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import DB.ConDB;
import Entidad.usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author yoshi
 */
public class usuarioMod {
    
    PreparedStatement ps;
    ResultSet rs;
    
    DB.ConDB con = new ConDB();
    Connection acce;
    
    
    //Validamos los campos del login...
    public Entidad.usuario validarUsuario(String usu, String cont){
        Entidad.usuario entU = new usuario();
        int estado = 1;
        
        String msql = "SELECT * FROM usuario WHERE UsuaUser=? AND UsuaCont=? AND UsuaEstd=?";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(msql);
            ps.setString(1, usu);
            ps.setString(2, cont);
            ps.setInt(3, estado);
            rs = ps.executeQuery();
            while(rs.next()){
                entU.setUsuaID(rs.getInt(1));
                entU.setUsuaUser(rs.getString(2));
                entU.setUsuaCont(rs.getString(3));
                entU.setUsuaEstd(rs.getInt(4));
                entU.setOperID(rs.getInt(5));
            }
            
        } catch (Exception e) {
            System.out.println("Error al validad usuario en el login:  " + e);
        }
        
        return entU;
    }
}
