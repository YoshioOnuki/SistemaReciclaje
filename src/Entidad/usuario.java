/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author yoshi
 */
public class usuario {
    private int UsuaID;
    private String UsuaUser;
    private String UsuaCont;
    private int UsuaEstd;
    private int OperID;

    public usuario() {
    }

    public usuario(int UsuaID, String UsuaUser, String UsuaCont, int UsuaEstd, int OperID) {
        this.UsuaID = UsuaID;
        this.UsuaUser = UsuaUser;
        this.UsuaCont = UsuaCont;
        this.UsuaEstd = UsuaEstd;
        this.OperID = OperID;
    }

    public int getUsuaID() {
        return UsuaID;
    }

    public void setUsuaID(int UsuaID) {
        this.UsuaID = UsuaID;
    }

    public String getUsuaUser() {
        return UsuaUser;
    }

    public void setUsuaUser(String UsuaUser) {
        this.UsuaUser = UsuaUser;
    }

    public String getUsuaCont() {
        return UsuaCont;
    }

    public void setUsuaCont(String UsuaCont) {
        this.UsuaCont = UsuaCont;
    }

    public int getUsuaEstd() {
        return UsuaEstd;
    }

    public void setUsuaEstd(int UsuaEstd) {
        this.UsuaEstd = UsuaEstd;
    }

    public int getOperID() {
        return OperID;
    }

    public void setOperID(int OperID) {
        this.OperID = OperID;
    }
    
    
}
