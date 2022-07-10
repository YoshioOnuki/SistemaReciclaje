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
public class producto {
    private int ProdID;
    private String ProdDesc;
    private double ProdPrec;
    private int ProdEstd;
    
    public producto() {
    }

    public producto(int ProdID, String ProdDesc, double ProdPrec, int ProdEstd) {
        this.ProdID = ProdID;
        this.ProdDesc = ProdDesc;
        this.ProdPrec = ProdPrec;
        this.ProdEstd = ProdEstd;
    }


    public int getProdID() {
        return ProdID;
    }

    public void setProdID(int ProdID) {
        this.ProdID = ProdID;
    }

    public String getProdDesc() {
        return ProdDesc;
    }

    public void setProdDesc(String ProdDesc) {
        this.ProdDesc = ProdDesc;
    }

    public double getProdPrec() {
        return ProdPrec;
    }

    public void setProdPrec(double ProdPrec) {
        this.ProdPrec = ProdPrec;
    }

    public int getProdEstd() {
        return ProdEstd;
    }

    public void setProdEstd(int ProdEstd) {
        this.ProdEstd = ProdEstd;
    }
    
}
