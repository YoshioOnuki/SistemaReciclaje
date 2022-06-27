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
public class operador {
    private int OperID;
    private char OperDNI;
    private String OperNom;
    private String OperApe;
    private String OperDirec;

    public operador() {
    }

    public operador(int OperID, char OperDNI, String OperNom, String OperApe, String OperDirec) {
        this.OperID = OperID;
        this.OperDNI = OperDNI;
        this.OperNom = OperNom;
        this.OperApe = OperApe;
        this.OperDirec = OperDirec;
    }

    public int getOperID() {
        return OperID;
    }

    public void setOperID(int OperID) {
        this.OperID = OperID;
    }

    public char getOperDNI() {
        return OperDNI;
    }

    public void setOperDNI(char OperDNI) {
        this.OperDNI = OperDNI;
    }

    public String getOperNom() {
        return OperNom;
    }

    public void setOperNom(String OperNom) {
        this.OperNom = OperNom;
    }

    public String getOperApe() {
        return OperApe;
    }

    public void setOperApe(String OperApe) {
        this.OperApe = OperApe;
    }

    public String getOperDirec() {
        return OperDirec;
    }

    public void setOperDirec(String OperDirec) {
        this.OperDirec = OperDirec;
    }
    
    
}
