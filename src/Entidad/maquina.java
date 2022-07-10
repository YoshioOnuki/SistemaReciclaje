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
    
    public int MaquiID;
    public int MaquiHoja;
    public int MaquiAtasco;

    public maquina() {
    }

    public maquina(int MaquiID, int MaquiHoja, int MaquiAtasco) {
        this.MaquiID = MaquiID;
        this.MaquiHoja = MaquiHoja;
        this.MaquiAtasco = MaquiAtasco;
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
