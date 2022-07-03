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
public class reciboMod {
    
    PreparedStatement ps;
    ResultSet rs;
    
    DB.ConDB con = new ConDB();
    Connection acce;
    
    
    private int d;
    private int c = 1;
    private String reciNum = "";

    //Generamos el numero de recibo
    public void generarNum(int dat) {
        this.d = dat;
        
        // Si  el rango es de 100 a 999, no se aumentan ceros a la izquierda "100"
        if ((this.d >= 100) || (this.d < 1000)) {
            int can = c + this.d;
            reciNum = "" + can;
        }
        
        // Si el rango es de 10 a 99, se aumenta un cero a la izquierda "010"
        if ((this.d >= 9) || (this.d < 100)) {
            int can = c + this.d;
            reciNum = "0" + can;
        }
        

        // Si el rango es de 10 a 99, se aumenta un dos a la izquierda "001"
        if (this.d < 9) {
            int can = c + this.d;
            reciNum = "00" + can;
        }

    }
    
    //Retormanos el numero del recibo generado anteriormente
    public String Num() {
        return this.reciNum;
    }
    
    //Obtener el ultimo numero del recibo generado
    public String maxReciNum(){
        String serie = "";
        String sql = "SELECT max(ReciNum) FROM recibo";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                serie = rs.getString(1);
            }
        } catch (Exception e) {
            System.out.println("error en obtener el ultimo numero de recibo " + e);
        }
        
        return serie;
    }
    
    //Obtener el ultimo ID del recibo generado
    public int maxReciID(){
        int serie = 0;
        String sql = "SELECT max(ReciID) FROM recibo ";

        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                serie = rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println("error en obtener el maximo ID recibo " + e);
        }

        return serie;
    }
    
    //Ingresar datos del recibo
    public int addRecibo(Object[] ob) {
        int r = 0;
        String sql = "INSERT INTO recibo(ReciNum,ReciFecha,ReciEstd,ReciMonto,ClienID) VALUES(?,?,?,?,?)";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            ps.setObject(1, ob[0]);
            ps.setObject(2, ob[1]);
            ps.setObject(3, ob[2]);
            ps.setObject(4, ob[3]);
            ps.setObject(5, ob[4]);
            r = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al ingresar datos del recibo " + e);
        }
        
        return r;
    }
    
    
    
}
