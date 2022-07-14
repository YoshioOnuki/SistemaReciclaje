/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Entidad.maquina;
import Modelo.maquinaMod;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author yoshi
 */
public class ModuloMaquina extends javax.swing.JPanel {

    
    Entidad.maquina maq = new maquina();
    Modelo.maquinaMod maqMod = new maquinaMod();
    
    public ModuloMaquina() {
        initComponents();
        mostrarCampos();
    }
    
    //Mostramos los campos de la maquina
    void mostrarCampos(){
        maq = maqMod.validarMaquina();
        txtHojaUsada.setText(""+maq.getMaquiHoja());
        txtHojaLim.setText(""+maq.getMaquiLimHoja());
        
        if(maq.getMaquiHoja() < (maq.getMaquiLimHoja()*80)/100){
            HojaDisponible.setVisible(true);
            HojaDisponibleAmarillo.setVisible(false);
            HojaLleno.setVisible(false);
        }else if(maq.getMaquiHoja() >= (maq.getMaquiLimHoja()*80)/100 && maq.getMaquiHoja() < maq.getMaquiLimHoja()){
            HojaDisponible.setVisible(false);
            HojaDisponibleAmarillo.setVisible(true);
            HojaLleno.setVisible(false);
        }else if(maq.getMaquiHoja() == maq.getMaquiLimHoja()){
            HojaDisponible.setVisible(false);
            HojaDisponibleAmarillo.setVisible(false);
            HojaLleno.setVisible(true);
        }
        
        if(maq.getMaquiAtasco() == 1){
            AtascoLibre.setVisible(true);
            AtascoAtascado.setVisible(false);
        }else if(maq.getMaquiAtasco() == 2){
            AtascoLibre.setVisible(false);
            AtascoAtascado.setVisible(true);
        }
    }

    //Formateamos el contador de las hojas
    void formatearHoja(){
        maq = maqMod.validarMaquina();
        
        Object ob = new Object();
        ob = 0;
        maqMod.updateHoja(ob);
        
        txtHojaUsada.setText(""+maq.getMaquiHoja());
        mostrarCampos();
    }
    
    void repararAtasco(){
        Object ob = new Object();
        ob = 1;
        maqMod.updateAtasco(ob);
        
        mostrarCampos();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        atras = new javax.swing.JPanel();
        atrasIcon = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Titulo1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtHojaUsada = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtHojaLim = new javax.swing.JLabel();
        EstadoHoja = new javax.swing.JPanel();
        HojaDisponible = new javax.swing.JLabel();
        HojaLleno = new javax.swing.JLabel();
        HojaDisponibleAmarillo = new javax.swing.JLabel();
        btnRepararHoja = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Titulo2 = new javax.swing.JLabel();
        EstadoAtasco = new javax.swing.JPanel();
        AtascoLibre = new javax.swing.JLabel();
        AtascoAtascado = new javax.swing.JLabel();
        btnRepararAtasco = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        Titulo3 = new javax.swing.JLabel();
        btnVerAlmacen = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1300, 680));
        setMinimumSize(new java.awt.Dimension(1300, 680));
        setPreferredSize(new java.awt.Dimension(1300, 680));

        atras.setBackground(new java.awt.Color(209, 20, 54));
        atras.setMaximumSize(new java.awt.Dimension(40, 40));
        atras.setMinimumSize(new java.awt.Dimension(40, 40));
        atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                atrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                atrasMouseExited(evt);
            }
        });

        atrasIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        atrasIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Atras.png"))); // NOI18N

        javax.swing.GroupLayout atrasLayout = new javax.swing.GroupLayout(atras);
        atras.setLayout(atrasLayout);
        atrasLayout.setHorizontalGroup(
            atrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(atrasIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        atrasLayout.setVerticalGroup(
            atrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(atrasIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jLabel4.setBackground(new java.awt.Color(0, 23, 35));
        jLabel4.setFont(new java.awt.Font("SF UI Display", 1, 36)); // NOI18N
        jLabel4.setText("Maquina");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        Titulo1.setBackground(new java.awt.Color(0, 23, 35));
        Titulo1.setFont(new java.awt.Font("SF UI Display", 1, 22)); // NOI18N
        Titulo1.setText("Hoja de la impresora");

        jLabel6.setBackground(new java.awt.Color(0, 23, 35));
        jLabel6.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        jLabel6.setText("Hoja usada:");

        txtHojaUsada.setBackground(new java.awt.Color(0, 23, 35));
        txtHojaUsada.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        txtHojaUsada.setText("00");

        jLabel8.setBackground(new java.awt.Color(0, 23, 35));
        jLabel8.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        jLabel8.setText("Límite de hoja :");

        txtHojaLim.setBackground(new java.awt.Color(0, 23, 35));
        txtHojaLim.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        txtHojaLim.setText("30");

        EstadoHoja.setBackground(new java.awt.Color(255, 255, 255));
        EstadoHoja.setMaximumSize(new java.awt.Dimension(100, 30));
        EstadoHoja.setMinimumSize(new java.awt.Dimension(100, 30));
        EstadoHoja.setPreferredSize(new java.awt.Dimension(100, 30));

        HojaDisponible.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        HojaDisponible.setForeground(new java.awt.Color(255, 255, 255));
        HojaDisponible.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HojaDisponible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/EstadoDisponible.png"))); // NOI18N
        HojaDisponible.setMaximumSize(new java.awt.Dimension(100, 30));
        HojaDisponible.setMinimumSize(new java.awt.Dimension(100, 30));
        HojaDisponible.setPreferredSize(new java.awt.Dimension(100, 30));

        HojaLleno.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        HojaLleno.setForeground(new java.awt.Color(255, 255, 255));
        HojaLleno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HojaLleno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/EstadoLleno.png"))); // NOI18N
        HojaLleno.setMaximumSize(new java.awt.Dimension(100, 30));
        HojaLleno.setMinimumSize(new java.awt.Dimension(100, 30));
        HojaLleno.setPreferredSize(new java.awt.Dimension(100, 30));

        HojaDisponibleAmarillo.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        HojaDisponibleAmarillo.setForeground(new java.awt.Color(255, 255, 255));
        HojaDisponibleAmarillo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HojaDisponibleAmarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/EstadoDisponibleAmarillo.png"))); // NOI18N
        HojaDisponibleAmarillo.setMaximumSize(new java.awt.Dimension(100, 30));
        HojaDisponibleAmarillo.setMinimumSize(new java.awt.Dimension(100, 30));
        HojaDisponibleAmarillo.setPreferredSize(new java.awt.Dimension(100, 30));

        javax.swing.GroupLayout EstadoHojaLayout = new javax.swing.GroupLayout(EstadoHoja);
        EstadoHoja.setLayout(EstadoHojaLayout);
        EstadoHojaLayout.setHorizontalGroup(
            EstadoHojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HojaDisponible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(EstadoHojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(HojaLleno, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
            .addGroup(EstadoHojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EstadoHojaLayout.createSequentialGroup()
                    .addComponent(HojaDisponibleAmarillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 20, Short.MAX_VALUE)))
        );
        EstadoHojaLayout.setVerticalGroup(
            EstadoHojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HojaDisponible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(EstadoHojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(HojaLleno, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
            .addGroup(EstadoHojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EstadoHojaLayout.createSequentialGroup()
                    .addComponent(HojaDisponibleAmarillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 22, Short.MAX_VALUE)))
        );

        btnRepararHoja.setBackground(new java.awt.Color(51, 71, 86));
        btnRepararHoja.setMaximumSize(new java.awt.Dimension(140, 50));
        btnRepararHoja.setMinimumSize(new java.awt.Dimension(140, 50));
        btnRepararHoja.setPreferredSize(new java.awt.Dimension(140, 50));
        btnRepararHoja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRepararHojaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRepararHojaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRepararHojaMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SF UI Display", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formatear");
        jLabel1.setMaximumSize(new java.awt.Dimension(140, 40));
        jLabel1.setMinimumSize(new java.awt.Dimension(140, 40));
        jLabel1.setPreferredSize(new java.awt.Dimension(140, 40));

        javax.swing.GroupLayout btnRepararHojaLayout = new javax.swing.GroupLayout(btnRepararHoja);
        btnRepararHoja.setLayout(btnRepararHojaLayout);
        btnRepararHojaLayout.setHorizontalGroup(
            btnRepararHojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnRepararHojaLayout.setVerticalGroup(
            btnRepararHojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jSeparator1.setMaximumSize(new java.awt.Dimension(997, 10));
        jSeparator1.setMinimumSize(new java.awt.Dimension(997, 10));
        jSeparator1.setPreferredSize(new java.awt.Dimension(997, 10));

        Titulo2.setBackground(new java.awt.Color(0, 23, 35));
        Titulo2.setFont(new java.awt.Font("SF UI Display", 1, 22)); // NOI18N
        Titulo2.setText("Atasco de productos");

        EstadoAtasco.setBackground(new java.awt.Color(255, 255, 255));
        EstadoAtasco.setMaximumSize(new java.awt.Dimension(100, 30));
        EstadoAtasco.setMinimumSize(new java.awt.Dimension(100, 30));

        AtascoLibre.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        AtascoLibre.setForeground(new java.awt.Color(255, 255, 255));
        AtascoLibre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AtascoLibre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/EstadoLibre.png"))); // NOI18N
        AtascoLibre.setMaximumSize(new java.awt.Dimension(100, 30));
        AtascoLibre.setMinimumSize(new java.awt.Dimension(100, 30));
        AtascoLibre.setPreferredSize(new java.awt.Dimension(100, 30));

        AtascoAtascado.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        AtascoAtascado.setForeground(new java.awt.Color(255, 255, 255));
        AtascoAtascado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AtascoAtascado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/EstadoAtascado.png"))); // NOI18N
        AtascoAtascado.setMaximumSize(new java.awt.Dimension(100, 30));
        AtascoAtascado.setMinimumSize(new java.awt.Dimension(100, 30));
        AtascoAtascado.setPreferredSize(new java.awt.Dimension(100, 30));

        javax.swing.GroupLayout EstadoAtascoLayout = new javax.swing.GroupLayout(EstadoAtasco);
        EstadoAtasco.setLayout(EstadoAtascoLayout);
        EstadoAtascoLayout.setHorizontalGroup(
            EstadoAtascoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AtascoLibre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(EstadoAtascoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(AtascoAtascado, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
        );
        EstadoAtascoLayout.setVerticalGroup(
            EstadoAtascoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AtascoLibre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(EstadoAtascoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(AtascoAtascado, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
        );

        btnRepararAtasco.setBackground(new java.awt.Color(51, 71, 86));
        btnRepararAtasco.setMaximumSize(new java.awt.Dimension(140, 50));
        btnRepararAtasco.setMinimumSize(new java.awt.Dimension(140, 50));
        btnRepararAtasco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRepararAtascoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRepararAtascoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRepararAtascoMouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("SF UI Display", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Reparar");
        jLabel10.setMaximumSize(new java.awt.Dimension(140, 40));
        jLabel10.setMinimumSize(new java.awt.Dimension(140, 40));
        jLabel10.setPreferredSize(new java.awt.Dimension(140, 40));

        javax.swing.GroupLayout btnRepararAtascoLayout = new javax.swing.GroupLayout(btnRepararAtasco);
        btnRepararAtasco.setLayout(btnRepararAtascoLayout);
        btnRepararAtascoLayout.setHorizontalGroup(
            btnRepararAtascoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnRepararAtascoLayout.setVerticalGroup(
            btnRepararAtascoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jSeparator3.setMaximumSize(new java.awt.Dimension(997, 10));
        jSeparator3.setMinimumSize(new java.awt.Dimension(997, 10));
        jSeparator3.setPreferredSize(new java.awt.Dimension(997, 10));

        Titulo3.setBackground(new java.awt.Color(0, 23, 35));
        Titulo3.setFont(new java.awt.Font("SF UI Display", 1, 22)); // NOI18N
        Titulo3.setText("Almacenamiento ");

        btnVerAlmacen.setBackground(new java.awt.Color(51, 71, 86));
        btnVerAlmacen.setMaximumSize(new java.awt.Dimension(140, 50));
        btnVerAlmacen.setMinimumSize(new java.awt.Dimension(140, 50));
        btnVerAlmacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerAlmacenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerAlmacenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerAlmacenMouseExited(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("SF UI Display", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Ver");
        jLabel17.setMaximumSize(new java.awt.Dimension(140, 40));
        jLabel17.setMinimumSize(new java.awt.Dimension(140, 40));
        jLabel17.setPreferredSize(new java.awt.Dimension(140, 40));

        javax.swing.GroupLayout btnVerAlmacenLayout = new javax.swing.GroupLayout(btnVerAlmacen);
        btnVerAlmacen.setLayout(btnVerAlmacenLayout);
        btnVerAlmacenLayout.setHorizontalGroup(
            btnVerAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnVerAlmacenLayout.setVerticalGroup(
            btnVerAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1036, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Titulo1)
                                .addGap(60, 60, 60)
                                .addComponent(jLabel6)
                                .addGap(20, 20, 20)
                                .addComponent(txtHojaUsada, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel8)
                                .addGap(20, 20, 20)
                                .addComponent(txtHojaLim, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EstadoHoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnRepararHoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Titulo2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EstadoAtasco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnRepararAtasco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(559, 559, 559)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Titulo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVerAlmacen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRepararHoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EstadoHoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtHojaUsada)
                                    .addComponent(jLabel8)
                                    .addComponent(txtHojaLim))
                                .addComponent(Titulo1)))))
                .addGap(29, 29, 29)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EstadoAtasco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Titulo2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnRepararAtasco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(Titulo3)
                .addGap(25, 25, 25)
                .addComponent(btnVerAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        ImageIcon ico = new ImageIcon("src/Imagen/CerrarSesion.png");
        String [] arregloOpc = {"Cerrar Sesión", "Cancelar"};
        int op = JOptionPane.showOptionDialog(null, " \n¿Seguro que desea Cerrar Sesión?\n ", "Cerrar Sesión", 0, JOptionPane.QUESTION_MESSAGE, ico, arregloOpc, "Cancelar");
        
        if(op == 0){
            ModuloMain mm = new ModuloMain();

            mm.setSize(new Dimension(1300, 800));
            mm.setLocation(0,0);
            Main.Fondo.removeAll();
            Main.Fondo.add(mm, BorderLayout.CENTER);
            Main.Fondo.revalidate();
            Main.Fondo.repaint();
        }
    }//GEN-LAST:event_atrasMouseClicked

    private void atrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseEntered
        atras.setBackground(new Color(255, 0, 0));
    }//GEN-LAST:event_atrasMouseEntered

    private void atrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseExited
        atras.setBackground(new Color(200, 42, 42));
    }//GEN-LAST:event_atrasMouseExited

    private void btnRepararHojaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRepararHojaMouseEntered
        btnRepararHoja.setBackground(new Color(48, 105, 147));
    }//GEN-LAST:event_btnRepararHojaMouseEntered

    private void btnRepararHojaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRepararHojaMouseClicked
        formatearHoja();
    }//GEN-LAST:event_btnRepararHojaMouseClicked

    private void btnRepararHojaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRepararHojaMouseExited
        btnRepararHoja.setBackground(new Color(51,71,86));
    }//GEN-LAST:event_btnRepararHojaMouseExited

    private void btnRepararAtascoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRepararAtascoMouseClicked
        repararAtasco();
    }//GEN-LAST:event_btnRepararAtascoMouseClicked

    private void btnRepararAtascoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRepararAtascoMouseEntered
        btnRepararAtasco.setBackground(new Color(48, 105, 147));
    }//GEN-LAST:event_btnRepararAtascoMouseEntered

    private void btnRepararAtascoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRepararAtascoMouseExited
        btnRepararAtasco.setBackground(new Color(51,71,86));
    }//GEN-LAST:event_btnRepararAtascoMouseExited

    private void btnVerAlmacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerAlmacenMouseClicked
        ModuloMaquinaAlmacen mAlma = new ModuloMaquinaAlmacen();

        mAlma.setSize(new Dimension(1300, 800));
        mAlma.setLocation(0,0);
        ModuloOpeDash.Principal.removeAll();
        ModuloOpeDash.Principal.add(mAlma, BorderLayout.CENTER);
        ModuloOpeDash.Principal.revalidate();
        ModuloOpeDash.Principal.repaint();
    }//GEN-LAST:event_btnVerAlmacenMouseClicked

    private void btnVerAlmacenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerAlmacenMouseEntered
        btnVerAlmacen.setBackground(new Color(48, 105, 147));
    }//GEN-LAST:event_btnVerAlmacenMouseEntered

    private void btnVerAlmacenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerAlmacenMouseExited
        btnVerAlmacen.setBackground(new Color(51,71,86));
    }//GEN-LAST:event_btnVerAlmacenMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AtascoAtascado;
    private javax.swing.JLabel AtascoLibre;
    private javax.swing.JPanel EstadoAtasco;
    private javax.swing.JPanel EstadoHoja;
    private javax.swing.JLabel HojaDisponible;
    private javax.swing.JLabel HojaDisponibleAmarillo;
    private javax.swing.JLabel HojaLleno;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JLabel Titulo3;
    public static javax.swing.JPanel atras;
    public static javax.swing.JLabel atrasIcon;
    private javax.swing.JPanel btnRepararAtasco;
    private javax.swing.JPanel btnRepararAtasco1;
    private javax.swing.JPanel btnRepararAtasco2;
    private javax.swing.JPanel btnRepararHoja;
    private javax.swing.JPanel btnVerAlmacen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel txtHojaLim;
    private javax.swing.JLabel txtHojaUsada;
    // End of variables declaration//GEN-END:variables
}
