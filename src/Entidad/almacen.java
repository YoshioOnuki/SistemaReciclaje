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
public class almacen {
    
    private int AlmaID;
    private int AlmaProdID;
    private int AlmaNumProd;
    private int AlmaLimProd;

    public almacen() {
    }

    public almacen(int AlmaID, int AlmaProdID, int AlmaNumProd, int AlmaLimProd) {
        this.AlmaID = AlmaID;
        this.AlmaProdID = AlmaProdID;
        this.AlmaNumProd = AlmaNumProd;
        this.AlmaLimProd = AlmaLimProd;
    }

    public int getAlmaID() {
        return AlmaID;
    }

    public void setAlmaID(int AlmaID) {
        this.AlmaID = AlmaID;
    }

    public int getAlmaProdID() {
        return AlmaProdID;
    }

    public void setAlmaProdID(int AlmaProdID) {
        this.AlmaProdID = AlmaProdID;
    }

    public int getAlmaNumProd() {
        return AlmaNumProd;
    }

    public void setAlmaNumProd(int AlmaNumProd) {
        this.AlmaNumProd = AlmaNumProd;
    }

    public int getAlmaLimProd() {
        return AlmaLimProd;
    }

    public void setAlmaLimProd(int AlmaLimProd) {
        this.AlmaLimProd = AlmaLimProd;
    }

    
    
    
    
}
