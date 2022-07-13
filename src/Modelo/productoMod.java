/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import DB.ConDB;
import Entidad.detalleRecibo;
import Entidad.producto;
import Vista.ModuloIngProd;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yoshi
 */
public class productoMod {
    PreparedStatement ps;
    ResultSet rs;
    
    DB.ConDB con = new ConDB();
    Connection acce;
    
    //Validamos el producto, devolviendo todos los atributos por medio de la entidad
    public Entidad.producto validarProducto(int idP){
        Entidad.producto entP = new producto();
        
        String msql = "SELECT * FROM producto WHERE ProdID=? AND ProdEstd=1";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(msql);
            ps.setInt(1, idP);
            rs = ps.executeQuery();
            while(rs.next()){
                entP.setProdID(rs.getInt(1));
                entP.setProdDesc(rs.getString(2));
                entP.setProdPrec(rs.getDouble(3));
                entP.setProdEstd(rs.getInt(4));
            }
            //Cerramos la conexion
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al validar Producto:  " + e);
        }
        
        return entP;
    }
    
    //Obtenemos la cantidad de registros de los productos
    public int SacarContProd(){
        int cont = 0;
        
        String msql = "SELECT COUNT(ProdID) FROM producto WHERE ProdEstd=1";
        
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(msql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                cont = rs.getInt(1);
            }
            //Cerramos la conexion
            acce.close();
        } catch (Exception e) {
            System.out.println("Error al Objeter contador del producto:  " + e);
        }
        
        return cont;
    }
    

    //Haciendo la consulta para mostrar los datos de los productos en una tabla
    public DefaultTableModel consultarProductos(){
        String [] encabe={"ID PROD","DESCRIPCION","PRECIO","ESTADO"};
        DefaultTableModel m = new DefaultTableModel(null, encabe);
        Object[] o = new Object[4];
        String estado = "ACTIVO";
        
        String sql = "SELECT ProdID, ProdDesc, ProdPrec FROM producto WHERE ProdEstd=1";
   
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                o[0] = rs.getInt(1);
                o[1] = rs.getString(2);
                o[2] = rs.getDouble(3);
                o[3] = estado;
                
                m.addRow(o);
            }
            //Cerramos la conexion
            acce.close();
        } catch (Exception e) {
            System.out.println("error consultar datos de los productos en reportes para mostrar en una tabla: " + e);
        }

        return m;
    }
    
    
    //Haciendo la consulta para mostrar los datos de los productos en una tabla
    public DefaultTableModel consultarReporProdTotal(){
        Modelo.detaReciMod detRecMod = new detaReciMod();
        Object[] ob = new Object[2];
        int n=1;
        
        String [] encabe={"ID PROD","DESCRIPCION","CANTIDAD","TOTAL"};
        DefaultTableModel m = new DefaultTableModel(null, encabe);
        Object[] o = new Object[4];
        
        String sql = "SELECT ProdID, ProdDesc FROM producto WHERE ProdEstd=1";
   
        try {
            acce = con.conectardb();
            ps = acce.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                ob = detRecMod.consultarReporProdTotal(n);
                
                o[0] = rs.getInt(1);
                o[1] = rs.getString(2);
                o[2] = ob[0];
                o[3] = ob[1];
                m.addRow(o);
                n++;
            }
            //Cerramos la conexion
            acce.close();
        } catch (Exception e) {
            System.out.println("error consultar datos de los productos en reportes para mostrar en una tabla: " + e);
        }

        return m;
    }
    
    
    
}
