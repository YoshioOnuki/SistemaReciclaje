/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author yoshi
 */
public class ModuloOpeDash extends javax.swing.JPanel {

    /**
     * Creates new form ModuloLogin
     */
    public ModuloOpeDash() {
        initComponents();
        mostrarContenido();
        
    }

    void mostrarContenido(){
        ModuloInicio mIni = new ModuloInicio();

        mIni.setSize(new Dimension(1300, 680));
        mIni.setLocation(0,0);
        this.Principal.removeAll();
        this.Principal.add(mIni, BorderLayout.CENTER);
        this.Principal.revalidate();
        this.Principal.repaint();
        
        ModuloEncabe mEnca = new ModuloEncabe();

        mEnca.setSize(new Dimension(1300, 200));
        mEnca.setLocation(0,0);
        this.Encabe.removeAll();
        this.Encabe.add(mEnca, BorderLayout.CENTER);
        this.Encabe.revalidate();
        this.Encabe.repaint();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        Encabe = new javax.swing.JPanel();
        Principal = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(1300, 800));
        setMinimumSize(new java.awt.Dimension(1300, 800));
        setPreferredSize(new java.awt.Dimension(1300, 800));

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setMaximumSize(new java.awt.Dimension(1300, 800));
        Fondo.setMinimumSize(new java.awt.Dimension(1300, 800));
        Fondo.setName(""); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(1300, 800));

        Encabe.setBackground(new java.awt.Color(51, 71, 86));
        Encabe.setMaximumSize(new java.awt.Dimension(1300, 120));
        Encabe.setMinimumSize(new java.awt.Dimension(1300, 120));
        Encabe.setPreferredSize(new java.awt.Dimension(1300, 120));

        javax.swing.GroupLayout EncabeLayout = new javax.swing.GroupLayout(Encabe);
        Encabe.setLayout(EncabeLayout);
        EncabeLayout.setHorizontalGroup(
            EncabeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
        );
        EncabeLayout.setVerticalGroup(
            EncabeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        Principal.setBackground(new java.awt.Color(255, 255, 255));
        Principal.setMaximumSize(new java.awt.Dimension(1300, 680));
        Principal.setMinimumSize(new java.awt.Dimension(1300, 680));
        Principal.setPreferredSize(new java.awt.Dimension(1300, 680));

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Encabe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addComponent(Encabe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel Encabe;
    public static javax.swing.JPanel Fondo;
    public static javax.swing.JPanel Principal;
    // End of variables declaration//GEN-END:variables
}
