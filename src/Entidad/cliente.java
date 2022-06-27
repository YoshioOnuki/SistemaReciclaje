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
public class cliente {
    private int ClienID;
    private char ClienDNI;
    private String ClienNom;
    private String ClienApe;
    private String ClienDirec;

    public cliente() {
    }

    public cliente(int ClienID, char ClienDNI, String ClienNom, String ClienApe, String ClienDirec) {
        this.ClienID = ClienID;
        this.ClienDNI = ClienDNI;
        this.ClienNom = ClienNom;
        this.ClienApe = ClienApe;
        this.ClienDirec = ClienDirec;
    }

    public int getClienID() {
        return ClienID;
    }

    public void setClienID(int ClienID) {
        this.ClienID = ClienID;
    }

    public char getClienDNI() {
        return ClienDNI;
    }

    public void setClienDNI(char ClienDNI) {
        this.ClienDNI = ClienDNI;
    }

    public String getClienNom() {
        return ClienNom;
    }

    public void setClienNom(String ClienNom) {
        this.ClienNom = ClienNom;
    }

    public String getClienApe() {
        return ClienApe;
    }

    public void setClienApe(String ClienApe) {
        this.ClienApe = ClienApe;
    }

    public String getClienDirec() {
        return ClienDirec;
    }

    public void setClienDirec(String ClienDirec) {
        this.ClienDirec = ClienDirec;
    }
    
    
    
}
