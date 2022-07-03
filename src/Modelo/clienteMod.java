/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import DB.ConDB;
import Entidad.cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author yoshi
 */
public class clienteMod {
    PreparedStatement ps;
    ResultSet rs;
    
    DB.ConDB con = new ConDB();
    Connection acce;
    
    //Ingresamos al cliente
    public int addCliente(Object[] ob) {
        int r = 0;
        String sql = "INSERT INTO cliente(ClienDNI, ClienNom, ClienApe, ClienDirec) VALUES(?,?,?,?)";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            ps.setObject(1, ob[0]);
            ps.setObject(2, ob[1]);
            ps.setObject(3, ob[2]);
            ps.setObject(4, ob[3]);
            r = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al ingresar cliente para realizar el recibo" + e);
        }
        
        return r;
    }
    
    //Retornamos el último ID del cliente ingresado en la DB
    public int idCliente(){
        int r = 0;
        
        String sql = "SELECT max(ClienID) FROM cliente";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                r = rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println("Error al obtener el último ID del cliente:  " + e);
        }
        
        return r;
    }
    
    //Retornamos el ID del cliente por su DNI
    public int idClienteDNI(String dni){
        int r = 0; 
        String sql = "SELECT ClienID FROM cliente WHERE ClienDNI=?";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            ps.setString(1, dni);
            rs = ps.executeQuery();
            while(rs.next()){
                r = rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println("Error al obtener ID del cliente por DNI: " + e);
        }
        
        return r;
    }
    
    //Agregamos el correo del cliente en su tabla correo
    public int addCorreo(Object ob, int cliID) {
        int r = 0;
        String sql = "INSERT INTO correo(CorEmail, ClienID) VALUES(?,?)";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            ps.setObject(1, ob);
            ps.setObject(2, cliID);
            r = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al ingresar correo del cliente" + e);
        }
        
        return r;
    }
    
    //Obtenemos el ID del Email mediante el DNI del cliente
    public int idEmailDNI(String email, String dni){
        int r = 0; 
        String sql = "SELECT c.CorID FROM correo c INNER JOIN cliente cl ON c.ClienID=cl.ClienID WHERE c.CorEmail=? AND cl.ClienDNI=?";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, dni);
            rs = ps.executeQuery();
            while(rs.next()){
                r = rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println("Error al obtener ID del Email por el DNI del cliente: " + e);
        }
        
        return r;
    }
    
    //Obtenemos los datos del cliente por el ID
    public Entidad.cliente datosClienteID(int cliID){
        Entidad.cliente eCli = new cliente();
        
        String sql = "SELECT * FROM cliente WHERE ClienID=?";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            ps.setInt(1, cliID);
            rs = ps.executeQuery();
            while(rs.next()){
                eCli.setClienID(rs.getInt(1));
                eCli.setClienDNI(rs.getString(2));
                eCli.setClienNom(rs.getString(3));
                eCli.setClienApe(rs.getString(4));
                eCli.setClienDirec(rs.getString(5));
            }
        } catch (Exception e) {
            System.out.println("Error al obtener datos del cliente por ID:  " + e);
        }
        
        return eCli;
    }
    
    //Obtenemos los datos del cliente por el DNI
    public Entidad.cliente datosClienteDNI(String dni){
        Entidad.cliente eCli = new cliente();
        
        String sql = "SELECT * FROM cliente WHERE ClienDNI=?";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            ps.setString(1, dni);
            rs = ps.executeQuery();
            while(rs.next()){
                eCli.setClienID(rs.getInt(1));
                eCli.setClienDNI(rs.getString(2));
                eCli.setClienNom(rs.getString(3));
                eCli.setClienApe(rs.getString(4));
                eCli.setClienDirec(rs.getString(5));
            }
        } catch (Exception e) {
            System.out.println("Error al obtener datos del cliente por DNI:  " + e);
        }
        
        return eCli;
    }

    //Obtenemos el EMAIL del cliente metiante su DNI
    public String datoCorreoDNI(String dni){
        Entidad.cliente eCli = new cliente();
        String r = "";
        
        String sql = "SELECT c.CorEmail FROM correo c INNER JOIN cliente cl ON c.ClienID=cl.ClienID WHERE cl.ClienDNI=?";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            ps.setString(1, dni);
            rs = ps.executeQuery();
            while(rs.next()){
                r = rs.getString(1);
            }
        } catch (Exception e) {
            System.out.println("Error al obtener datos del cliente por DNI:  " + e);
        }
        
        return r;
    }
    
}
