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
public class detalleRecibo {
    private int DetaReciID;
    private int DetaReciCant;
    private double DetaReciImpor;
    private int ReciNum;
    private int ProdID;

    public detalleRecibo() {
    }

    public detalleRecibo(int DetaReciID, int DetaReciCant, double DetaReciImpor, int ReciNum, int ProdID) {
        this.DetaReciID = DetaReciID;
        this.DetaReciCant = DetaReciCant;
        this.DetaReciImpor = DetaReciImpor;
        this.ReciNum = ReciNum;
        this.ProdID = ProdID;
    }

    public int getDetaReciID() {
        return DetaReciID;
    }

    public void setDetaReciID(int DetaReciID) {
        this.DetaReciID = DetaReciID;
    }

    public int getDetaReciCant() {
        return DetaReciCant;
    }

    public void setDetaReciCant(int DetaReciCant) {
        this.DetaReciCant = DetaReciCant;
    }

    public double getDetaReciImpor() {
        return DetaReciImpor;
    }

    public void setDetaReciImpor(double DetaReciImpor) {
        this.DetaReciImpor = DetaReciImpor;
    }

    public int getReciNum() {
        return ReciNum;
    }

    public void setReciNum(int ReciNum) {
        this.ReciNum = ReciNum;
    }

    public int getProdID() {
        return ProdID;
    }

    public void setProdID(int ProdID) {
        this.ProdID = ProdID;
    }
    
    
}
