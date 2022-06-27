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
public class correo {
    private int CorID;
    private String CorEmail;
    private int ClienID;

    public correo() {
    }

    public correo(int CorID, String CorEmail, int ClienID) {
        this.CorID = CorID;
        this.CorEmail = CorEmail;
        this.ClienID = ClienID;
    }

    public int getCorID() {
        return CorID;
    }

    public void setCorID(int CorID) {
        this.CorID = CorID;
    }

    public String getCorEmail() {
        return CorEmail;
    }

    public void setCorEmail(String CorEmail) {
        this.CorEmail = CorEmail;
    }

    public int getClienID() {
        return ClienID;
    }

    public void setClienID(int ClienID) {
        this.ClienID = ClienID;
    }
    
    
}
