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
public class recibo {
    private int ReciNum;
    private String ReciFecha;
    private int ReciEstd;
    private double ReciMonto;
    private int ClienID;

    public recibo() {
    }

    public recibo(int ReciNum, String ReciFecha, int ReciEstd, double ReciMonto, int ClienID) {
        this.ReciNum = ReciNum;
        this.ReciFecha = ReciFecha;
        this.ReciEstd = ReciEstd;
        this.ReciMonto = ReciMonto;
        this.ClienID = ClienID;
    }

    public int getReciNum() {
        return ReciNum;
    }

    public void setReciNum(int ReciNum) {
        this.ReciNum = ReciNum;
    }

    public String getReciFecha() {
        return ReciFecha;
    }

    public void setReciFecha(String ReciFecha) {
        this.ReciFecha = ReciFecha;
    }

    public int getReciEstd() {
        return ReciEstd;
    }

    public void setReciEstd(int ReciEstd) {
        this.ReciEstd = ReciEstd;
    }

    public double getReciMonto() {
        return ReciMonto;
    }

    public void setReciMonto(double ReciMonto) {
        this.ReciMonto = ReciMonto;
    }

    public int getClienID() {
        return ClienID;
    }

    public void setClienID(int ClienID) {
        this.ClienID = ClienID;
    }
    
    
}
