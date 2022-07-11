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
public class maquina {
    
    private int MaquiID;
    private int MaquiHoja;
    private int MaquiLimHoja;
    private int MaquiAtasco;
    private static int cont;

    public maquina() {
    }

    public maquina(int MaquiID, int MaquiHoja, int MaquiLimHoja, int MaquiAtasco) {
        this.MaquiID = MaquiID;
        this.MaquiHoja = MaquiHoja;
        this.MaquiLimHoja = MaquiLimHoja;
        this.MaquiAtasco = MaquiAtasco;
    }
    
    //Aumentamos el contador de las hojas de la impresora
    public void aumentarHoja(){
        cont = getMaquiHoja() + 1;
        setMaquiHoja(cont);
    }
    

    public int getMaquiLimHoja() {
        return MaquiLimHoja;
    }

    public void setMaquiLimHoja(int MaquiLimHoja) {
        this.MaquiLimHoja = MaquiLimHoja;
    }

    public int getMaquiID() {
        return MaquiID;
    }

    public void setMaquiID(int MaquiID) {
        this.MaquiID = MaquiID;
    }

    public int getMaquiHoja() {
        return MaquiHoja;
    }

    public void setMaquiHoja(int MaquiHoja) {
        this.MaquiHoja = MaquiHoja;
    }

    public int getMaquiAtasco() {
        return MaquiAtasco;
    }

    public void setMaquiAtasco(int MaquiAtasco) {
        this.MaquiAtasco = MaquiAtasco;
    }
    
    
    
}
