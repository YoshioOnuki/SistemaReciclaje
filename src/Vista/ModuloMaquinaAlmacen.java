/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Entidad.almacen;
import Entidad.maquina;
import Modelo.almacenMod;
import Modelo.maquinaMod;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author yoshi
 */
public class ModuloMaquinaAlmacen extends javax.swing.JPanel {

    Entidad.almacen alma1Pla = new almacen();
    Entidad.almacen alma2Lat = new almacen();
    Entidad.almacen alma3Car = new almacen();
    Entidad.almacen alma4Vid = new almacen();
    Entidad.almacen alma5Bat = new almacen();
    Modelo.almacenMod almaMod = new almacenMod();
    
    public ModuloMaquinaAlmacen() {
        initComponents();
        mostrarCampos();
    }
    
    //Formateamos el contador de las productos
    void formatearHoja(int n){
        Entidad.almacen alma = new almacen();
        alma = almaMod.validarAlmacen(n);
        
        Object ob = new Object();
        ob = 0;
        almaMod.updateAlmacen(ob, n);
        
        if(n == 1){
            txtCantPlastico.setText(""+alma.getAlmaNumProd());
        }else if(n == 2){
            txtCantLata.setText(""+alma.getAlmaNumProd());
        }else if(n == 3){
            txtCantCarton.setText(""+alma.getAlmaNumProd());
        }else if(n == 4){
            txtCantVidrio.setText(""+alma.getAlmaNumProd());
        }else if(n == 5){
            txtCantBateria.setText(""+alma.getAlmaNumProd());
        }
        
        mostrarCampos();
    }

    //Mostramos los campos del almacenamiento de cada producto
     void mostrarCampos(){
        
        alma1Pla = almaMod.validarAlmacen(1);
        alma2Lat = almaMod.validarAlmacen(2);
        alma3Car = almaMod.validarAlmacen(3);
        alma4Vid = almaMod.validarAlmacen(4);
        alma5Bat = almaMod.validarAlmacen(5);
        
        txtCantPlastico.setText(""+alma1Pla.getAlmaNumProd());
        txtLimPlastico.setText(""+alma1Pla.getAlmaLimProd());
        
        txtCantLata.setText(""+alma2Lat.getAlmaNumProd());
        txtLimLata.setText(""+alma2Lat.getAlmaLimProd());
        
        txtCantCarton.setText(""+alma3Car.getAlmaNumProd());
        txtLimCarton.setText(""+alma3Car.getAlmaLimProd());
        
        txtCantVidrio.setText(""+alma4Vid.getAlmaNumProd());
        txtLimVidrio.setText(""+alma4Vid.getAlmaLimProd());
        
        txtCantBateria.setText(""+alma5Bat.getAlmaNumProd());
        txtLimBateria.setText(""+alma5Bat.getAlmaLimProd());
        
        if(alma1Pla.getAlmaNumProd() < (alma1Pla.getAlmaLimProd()*80)/100){
            plasticoDisp.setVisible(true);
            plasticoLleno.setVisible(false);
            plasticoDipAma.setVisible(false);
        }else if(alma1Pla.getAlmaNumProd() >= (alma1Pla.getAlmaLimProd()*80)/100 && alma1Pla.getAlmaNumProd() < alma1Pla.getAlmaLimProd()){
            plasticoDisp.setVisible(false);
            plasticoLleno.setVisible(false);
            plasticoDipAma.setVisible(true);
        }else if(alma1Pla.getAlmaNumProd() == alma1Pla.getAlmaLimProd()){
            plasticoDisp.setVisible(false);
            plasticoLleno.setVisible(true);
            plasticoDipAma.setVisible(false);
        }
        
        if(alma2Lat.getAlmaNumProd() < (alma2Lat.getAlmaLimProd()*80)/100){
            lataDisp.setVisible(true);
            lataLleno.setVisible(false);
            lataDispAma.setVisible(false);
        }else if(alma2Lat.getAlmaNumProd() >= (alma2Lat.getAlmaLimProd()*80)/100 && alma2Lat.getAlmaNumProd() < alma2Lat.getAlmaLimProd()){
            lataDisp.setVisible(false);
            lataLleno.setVisible(false);
            lataDispAma.setVisible(true);
        }else if(alma2Lat.getAlmaNumProd() == alma2Lat.getAlmaLimProd()){
            lataDisp.setVisible(false);
            lataLleno.setVisible(true);
            lataDispAma.setVisible(false);
        }
        
        if(alma3Car.getAlmaNumProd() < (alma3Car.getAlmaLimProd()*80)/100){
            cartonDisp.setVisible(true);
            cartonLleno.setVisible(false);
            cartonDispAma.setVisible(false);
        }else if(alma3Car.getAlmaNumProd() >= (alma3Car.getAlmaLimProd()*80)/100 && alma3Car.getAlmaNumProd() < alma3Car.getAlmaLimProd()){
            cartonDisp.setVisible(false);
            cartonLleno.setVisible(false);
            cartonDispAma.setVisible(true);
        }else if(alma3Car.getAlmaNumProd() == alma3Car.getAlmaLimProd()){
            cartonDisp.setVisible(false);
            cartonLleno.setVisible(true);
            cartonDispAma.setVisible(false);
        }
        
        if(alma4Vid.getAlmaNumProd() < (alma4Vid.getAlmaLimProd()*80)/100){
            vidrioDisp.setVisible(true);
            vidrioLleno.setVisible(false);
            vidrioDispAma.setVisible(false);
        }else if(alma4Vid.getAlmaNumProd() >= (alma4Vid.getAlmaLimProd()*80)/100 && alma4Vid.getAlmaNumProd() < alma4Vid.getAlmaLimProd()){
            vidrioDisp.setVisible(false);
            vidrioLleno.setVisible(false);
            vidrioDispAma.setVisible(true);
        }else if(alma4Vid.getAlmaNumProd() == alma4Vid.getAlmaLimProd()){
            vidrioDisp.setVisible(false);
            vidrioLleno.setVisible(true);
            vidrioDispAma.setVisible(false);
        }
        
        if(alma5Bat.getAlmaNumProd() < (alma5Bat.getAlmaLimProd()*80)/100){
            bateriaDisp.setVisible(true);
            bateriaLleno.setVisible(false);
            bateriaDispAma.setVisible(false);
        }else if(alma5Bat.getAlmaNumProd() >= (alma5Bat.getAlmaLimProd()*80)/100 && alma5Bat.getAlmaNumProd() < alma5Bat.getAlmaLimProd()){
            bateriaDisp.setVisible(false);
            bateriaLleno.setVisible(false);
            bateriaDispAma.setVisible(true);
        }else if(alma5Bat.getAlmaNumProd() == alma5Bat.getAlmaLimProd()){
            bateriaDisp.setVisible(false);
            bateriaLleno.setVisible(true);
            bateriaDispAma.setVisible(false);
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        atras = new javax.swing.JPanel();
        atrasIcon = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Titulo3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCantPlastico = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtLimPlastico = new javax.swing.JLabel();
        EstadoPlastico = new javax.swing.JPanel();
        plasticoDisp = new javax.swing.JLabel();
        plasticoLleno = new javax.swing.JLabel();
        plasticoDipAma = new javax.swing.JLabel();
        btnVaciarPlastico = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCantLata = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtLimLata = new javax.swing.JLabel();
        EstadoLata = new javax.swing.JPanel();
        lataDisp = new javax.swing.JLabel();
        lataLleno = new javax.swing.JLabel();
        lataDispAma = new javax.swing.JLabel();
        btnVaciarLata = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCantCarton = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtLimCarton = new javax.swing.JLabel();
        EstadoCarton = new javax.swing.JPanel();
        cartonDisp = new javax.swing.JLabel();
        cartonLleno = new javax.swing.JLabel();
        cartonDispAma = new javax.swing.JLabel();
        btnVaciarCarton = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtCantVidrio = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtLimVidrio = new javax.swing.JLabel();
        EstadoVidrio = new javax.swing.JPanel();
        vidrioDisp = new javax.swing.JLabel();
        vidrioLleno = new javax.swing.JLabel();
        vidrioDispAma = new javax.swing.JLabel();
        btnVaciarVidrio = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtCantBateria = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtLimBateria = new javax.swing.JLabel();
        EstadoBateria = new javax.swing.JPanel();
        bateriaDisp = new javax.swing.JLabel();
        bateriaLleno = new javax.swing.JLabel();
        bateriaDispAma = new javax.swing.JLabel();
        btnVaciarBateria = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();

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
        jLabel4.setText("Maquina - Almacenamiento");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        Titulo3.setBackground(new java.awt.Color(0, 23, 35));
        Titulo3.setFont(new java.awt.Font("SF UI Display", 1, 22)); // NOI18N
        Titulo3.setText("Almacenamiento ");

        jLabel7.setBackground(new java.awt.Color(0, 23, 35));
        jLabel7.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        jLabel7.setText("Catidad Plastico:");

        txtCantPlastico.setBackground(new java.awt.Color(0, 23, 35));
        txtCantPlastico.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        txtCantPlastico.setText("00");

        jLabel9.setBackground(new java.awt.Color(0, 23, 35));
        jLabel9.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        jLabel9.setText("Límite Plastico :");

        txtLimPlastico.setBackground(new java.awt.Color(0, 23, 35));
        txtLimPlastico.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        txtLimPlastico.setText("30");

        EstadoPlastico.setBackground(new java.awt.Color(255, 255, 255));
        EstadoPlastico.setMaximumSize(new java.awt.Dimension(100, 30));
        EstadoPlastico.setMinimumSize(new java.awt.Dimension(100, 30));

        plasticoDisp.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        plasticoDisp.setForeground(new java.awt.Color(255, 255, 255));
        plasticoDisp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plasticoDisp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/EstadoDisponible.png"))); // NOI18N
        plasticoDisp.setMaximumSize(new java.awt.Dimension(100, 30));
        plasticoDisp.setMinimumSize(new java.awt.Dimension(100, 30));
        plasticoDisp.setPreferredSize(new java.awt.Dimension(100, 30));

        plasticoLleno.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        plasticoLleno.setForeground(new java.awt.Color(255, 255, 255));
        plasticoLleno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plasticoLleno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/EstadoLleno.png"))); // NOI18N
        plasticoLleno.setMaximumSize(new java.awt.Dimension(100, 30));
        plasticoLleno.setMinimumSize(new java.awt.Dimension(100, 30));
        plasticoLleno.setPreferredSize(new java.awt.Dimension(100, 30));

        plasticoDipAma.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        plasticoDipAma.setForeground(new java.awt.Color(255, 255, 255));
        plasticoDipAma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plasticoDipAma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/EstadoDisponibleAmarillo.png"))); // NOI18N
        plasticoDipAma.setMaximumSize(new java.awt.Dimension(100, 30));
        plasticoDipAma.setMinimumSize(new java.awt.Dimension(100, 30));
        plasticoDipAma.setPreferredSize(new java.awt.Dimension(100, 30));

        javax.swing.GroupLayout EstadoPlasticoLayout = new javax.swing.GroupLayout(EstadoPlastico);
        EstadoPlastico.setLayout(EstadoPlasticoLayout);
        EstadoPlasticoLayout.setHorizontalGroup(
            EstadoPlasticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plasticoDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(EstadoPlasticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EstadoPlasticoLayout.createSequentialGroup()
                    .addComponent(plasticoLleno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(EstadoPlasticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EstadoPlasticoLayout.createSequentialGroup()
                    .addComponent(plasticoDipAma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        EstadoPlasticoLayout.setVerticalGroup(
            EstadoPlasticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plasticoDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(EstadoPlasticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EstadoPlasticoLayout.createSequentialGroup()
                    .addComponent(plasticoLleno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(EstadoPlasticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EstadoPlasticoLayout.createSequentialGroup()
                    .addComponent(plasticoDipAma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        btnVaciarPlastico.setBackground(new java.awt.Color(51, 71, 86));
        btnVaciarPlastico.setMaximumSize(new java.awt.Dimension(140, 50));
        btnVaciarPlastico.setMinimumSize(new java.awt.Dimension(140, 50));
        btnVaciarPlastico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVaciarPlasticoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVaciarPlasticoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVaciarPlasticoMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SF UI Display", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Vaciar");
        jLabel2.setMaximumSize(new java.awt.Dimension(140, 40));
        jLabel2.setMinimumSize(new java.awt.Dimension(140, 40));
        jLabel2.setPreferredSize(new java.awt.Dimension(140, 40));

        javax.swing.GroupLayout btnVaciarPlasticoLayout = new javax.swing.GroupLayout(btnVaciarPlastico);
        btnVaciarPlastico.setLayout(btnVaciarPlasticoLayout);
        btnVaciarPlasticoLayout.setHorizontalGroup(
            btnVaciarPlasticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnVaciarPlasticoLayout.setVerticalGroup(
            btnVaciarPlasticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jLabel11.setBackground(new java.awt.Color(0, 23, 35));
        jLabel11.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        jLabel11.setText("Catidad Lata:");

        txtCantLata.setBackground(new java.awt.Color(0, 23, 35));
        txtCantLata.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        txtCantLata.setText("00");

        jLabel12.setBackground(new java.awt.Color(0, 23, 35));
        jLabel12.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        jLabel12.setText("Límite Lata :");

        txtLimLata.setBackground(new java.awt.Color(0, 23, 35));
        txtLimLata.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        txtLimLata.setText("30");

        EstadoLata.setBackground(new java.awt.Color(255, 255, 255));
        EstadoLata.setMaximumSize(new java.awt.Dimension(100, 30));
        EstadoLata.setMinimumSize(new java.awt.Dimension(100, 30));

        lataDisp.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        lataDisp.setForeground(new java.awt.Color(255, 255, 255));
        lataDisp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lataDisp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/EstadoDisponible.png"))); // NOI18N
        lataDisp.setMaximumSize(new java.awt.Dimension(100, 30));
        lataDisp.setMinimumSize(new java.awt.Dimension(100, 30));
        lataDisp.setPreferredSize(new java.awt.Dimension(100, 30));

        lataLleno.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        lataLleno.setForeground(new java.awt.Color(255, 255, 255));
        lataLleno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lataLleno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/EstadoLleno.png"))); // NOI18N
        lataLleno.setMaximumSize(new java.awt.Dimension(100, 30));
        lataLleno.setMinimumSize(new java.awt.Dimension(100, 30));
        lataLleno.setPreferredSize(new java.awt.Dimension(100, 30));

        lataDispAma.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        lataDispAma.setForeground(new java.awt.Color(255, 255, 255));
        lataDispAma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lataDispAma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/EstadoDisponibleAmarillo.png"))); // NOI18N
        lataDispAma.setMaximumSize(new java.awt.Dimension(100, 30));
        lataDispAma.setMinimumSize(new java.awt.Dimension(100, 30));
        lataDispAma.setPreferredSize(new java.awt.Dimension(100, 30));

        javax.swing.GroupLayout EstadoLataLayout = new javax.swing.GroupLayout(EstadoLata);
        EstadoLata.setLayout(EstadoLataLayout);
        EstadoLataLayout.setHorizontalGroup(
            EstadoLataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lataDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(EstadoLataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EstadoLataLayout.createSequentialGroup()
                    .addComponent(lataLleno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(EstadoLataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EstadoLataLayout.createSequentialGroup()
                    .addComponent(lataDispAma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        EstadoLataLayout.setVerticalGroup(
            EstadoLataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lataDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(EstadoLataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EstadoLataLayout.createSequentialGroup()
                    .addComponent(lataLleno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(EstadoLataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EstadoLataLayout.createSequentialGroup()
                    .addComponent(lataDispAma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        btnVaciarLata.setBackground(new java.awt.Color(51, 71, 86));
        btnVaciarLata.setMaximumSize(new java.awt.Dimension(140, 50));
        btnVaciarLata.setMinimumSize(new java.awt.Dimension(140, 50));
        btnVaciarLata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVaciarLataMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVaciarLataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVaciarLataMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SF UI Display", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Vaciar");
        jLabel3.setMaximumSize(new java.awt.Dimension(140, 40));
        jLabel3.setMinimumSize(new java.awt.Dimension(140, 40));
        jLabel3.setPreferredSize(new java.awt.Dimension(140, 40));

        javax.swing.GroupLayout btnVaciarLataLayout = new javax.swing.GroupLayout(btnVaciarLata);
        btnVaciarLata.setLayout(btnVaciarLataLayout);
        btnVaciarLataLayout.setHorizontalGroup(
            btnVaciarLataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnVaciarLataLayout.setVerticalGroup(
            btnVaciarLataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jLabel13.setBackground(new java.awt.Color(0, 23, 35));
        jLabel13.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        jLabel13.setText("Catidad Carton:");

        txtCantCarton.setBackground(new java.awt.Color(0, 23, 35));
        txtCantCarton.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        txtCantCarton.setText("00");

        jLabel14.setBackground(new java.awt.Color(0, 23, 35));
        jLabel14.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        jLabel14.setText("Límite Carton :");

        txtLimCarton.setBackground(new java.awt.Color(0, 23, 35));
        txtLimCarton.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        txtLimCarton.setText("30");

        EstadoCarton.setBackground(new java.awt.Color(255, 255, 255));
        EstadoCarton.setMaximumSize(new java.awt.Dimension(100, 30));
        EstadoCarton.setMinimumSize(new java.awt.Dimension(100, 30));

        cartonDisp.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        cartonDisp.setForeground(new java.awt.Color(255, 255, 255));
        cartonDisp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cartonDisp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/EstadoDisponible.png"))); // NOI18N
        cartonDisp.setMaximumSize(new java.awt.Dimension(100, 30));
        cartonDisp.setMinimumSize(new java.awt.Dimension(100, 30));
        cartonDisp.setPreferredSize(new java.awt.Dimension(100, 30));

        cartonLleno.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        cartonLleno.setForeground(new java.awt.Color(255, 255, 255));
        cartonLleno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cartonLleno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/EstadoLleno.png"))); // NOI18N
        cartonLleno.setMaximumSize(new java.awt.Dimension(100, 30));
        cartonLleno.setMinimumSize(new java.awt.Dimension(100, 30));
        cartonLleno.setPreferredSize(new java.awt.Dimension(100, 30));

        cartonDispAma.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        cartonDispAma.setForeground(new java.awt.Color(255, 255, 255));
        cartonDispAma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cartonDispAma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/EstadoDisponibleAmarillo.png"))); // NOI18N
        cartonDispAma.setMaximumSize(new java.awt.Dimension(100, 30));
        cartonDispAma.setMinimumSize(new java.awt.Dimension(100, 30));
        cartonDispAma.setPreferredSize(new java.awt.Dimension(100, 30));

        javax.swing.GroupLayout EstadoCartonLayout = new javax.swing.GroupLayout(EstadoCarton);
        EstadoCarton.setLayout(EstadoCartonLayout);
        EstadoCartonLayout.setHorizontalGroup(
            EstadoCartonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cartonDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(EstadoCartonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EstadoCartonLayout.createSequentialGroup()
                    .addComponent(cartonLleno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(EstadoCartonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EstadoCartonLayout.createSequentialGroup()
                    .addComponent(cartonDispAma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        EstadoCartonLayout.setVerticalGroup(
            EstadoCartonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cartonDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(EstadoCartonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EstadoCartonLayout.createSequentialGroup()
                    .addComponent(cartonLleno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(EstadoCartonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EstadoCartonLayout.createSequentialGroup()
                    .addComponent(cartonDispAma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        btnVaciarCarton.setBackground(new java.awt.Color(51, 71, 86));
        btnVaciarCarton.setMaximumSize(new java.awt.Dimension(140, 50));
        btnVaciarCarton.setMinimumSize(new java.awt.Dimension(140, 50));
        btnVaciarCarton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVaciarCartonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVaciarCartonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVaciarCartonMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SF UI Display", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Vaciar");
        jLabel5.setMaximumSize(new java.awt.Dimension(140, 40));
        jLabel5.setMinimumSize(new java.awt.Dimension(140, 40));
        jLabel5.setPreferredSize(new java.awt.Dimension(140, 40));

        javax.swing.GroupLayout btnVaciarCartonLayout = new javax.swing.GroupLayout(btnVaciarCarton);
        btnVaciarCarton.setLayout(btnVaciarCartonLayout);
        btnVaciarCartonLayout.setHorizontalGroup(
            btnVaciarCartonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnVaciarCartonLayout.setVerticalGroup(
            btnVaciarCartonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jLabel15.setBackground(new java.awt.Color(0, 23, 35));
        jLabel15.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        jLabel15.setText("Catidad Vidrio:");

        txtCantVidrio.setBackground(new java.awt.Color(0, 23, 35));
        txtCantVidrio.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        txtCantVidrio.setText("00");

        jLabel16.setBackground(new java.awt.Color(0, 23, 35));
        jLabel16.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        jLabel16.setText("Límite Vidrio :");

        txtLimVidrio.setBackground(new java.awt.Color(0, 23, 35));
        txtLimVidrio.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        txtLimVidrio.setText("30");

        EstadoVidrio.setBackground(new java.awt.Color(255, 255, 255));
        EstadoVidrio.setMaximumSize(new java.awt.Dimension(100, 30));
        EstadoVidrio.setMinimumSize(new java.awt.Dimension(100, 30));

        vidrioDisp.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        vidrioDisp.setForeground(new java.awt.Color(255, 255, 255));
        vidrioDisp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vidrioDisp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/EstadoDisponible.png"))); // NOI18N
        vidrioDisp.setMaximumSize(new java.awt.Dimension(100, 30));
        vidrioDisp.setMinimumSize(new java.awt.Dimension(100, 30));
        vidrioDisp.setPreferredSize(new java.awt.Dimension(100, 30));

        vidrioLleno.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        vidrioLleno.setForeground(new java.awt.Color(255, 255, 255));
        vidrioLleno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vidrioLleno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/EstadoLleno.png"))); // NOI18N
        vidrioLleno.setMaximumSize(new java.awt.Dimension(100, 30));
        vidrioLleno.setMinimumSize(new java.awt.Dimension(100, 30));
        vidrioLleno.setPreferredSize(new java.awt.Dimension(100, 30));

        vidrioDispAma.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        vidrioDispAma.setForeground(new java.awt.Color(255, 255, 255));
        vidrioDispAma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vidrioDispAma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/EstadoDisponibleAmarillo.png"))); // NOI18N
        vidrioDispAma.setMaximumSize(new java.awt.Dimension(100, 30));
        vidrioDispAma.setMinimumSize(new java.awt.Dimension(100, 30));
        vidrioDispAma.setPreferredSize(new java.awt.Dimension(100, 30));

        javax.swing.GroupLayout EstadoVidrioLayout = new javax.swing.GroupLayout(EstadoVidrio);
        EstadoVidrio.setLayout(EstadoVidrioLayout);
        EstadoVidrioLayout.setHorizontalGroup(
            EstadoVidrioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vidrioDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(EstadoVidrioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EstadoVidrioLayout.createSequentialGroup()
                    .addComponent(vidrioLleno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(EstadoVidrioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EstadoVidrioLayout.createSequentialGroup()
                    .addComponent(vidrioDispAma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        EstadoVidrioLayout.setVerticalGroup(
            EstadoVidrioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vidrioDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(EstadoVidrioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EstadoVidrioLayout.createSequentialGroup()
                    .addComponent(vidrioLleno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(EstadoVidrioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EstadoVidrioLayout.createSequentialGroup()
                    .addComponent(vidrioDispAma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        btnVaciarVidrio.setBackground(new java.awt.Color(51, 71, 86));
        btnVaciarVidrio.setMaximumSize(new java.awt.Dimension(140, 50));
        btnVaciarVidrio.setMinimumSize(new java.awt.Dimension(140, 50));
        btnVaciarVidrio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVaciarVidrioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVaciarVidrioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVaciarVidrioMouseExited(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("SF UI Display", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Vaciar");
        jLabel17.setMaximumSize(new java.awt.Dimension(140, 40));
        jLabel17.setMinimumSize(new java.awt.Dimension(140, 40));
        jLabel17.setPreferredSize(new java.awt.Dimension(140, 40));

        javax.swing.GroupLayout btnVaciarVidrioLayout = new javax.swing.GroupLayout(btnVaciarVidrio);
        btnVaciarVidrio.setLayout(btnVaciarVidrioLayout);
        btnVaciarVidrioLayout.setHorizontalGroup(
            btnVaciarVidrioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnVaciarVidrioLayout.setVerticalGroup(
            btnVaciarVidrioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jLabel18.setBackground(new java.awt.Color(0, 23, 35));
        jLabel18.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        jLabel18.setText("Catidad Batería:");

        txtCantBateria.setBackground(new java.awt.Color(0, 23, 35));
        txtCantBateria.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        txtCantBateria.setText("00");

        jLabel19.setBackground(new java.awt.Color(0, 23, 35));
        jLabel19.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        jLabel19.setText("Límite Batería :");

        txtLimBateria.setBackground(new java.awt.Color(0, 23, 35));
        txtLimBateria.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        txtLimBateria.setText("30");

        EstadoBateria.setBackground(new java.awt.Color(255, 255, 255));
        EstadoBateria.setMaximumSize(new java.awt.Dimension(100, 30));
        EstadoBateria.setMinimumSize(new java.awt.Dimension(100, 30));

        bateriaDisp.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        bateriaDisp.setForeground(new java.awt.Color(255, 255, 255));
        bateriaDisp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bateriaDisp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/EstadoDisponible.png"))); // NOI18N
        bateriaDisp.setMaximumSize(new java.awt.Dimension(100, 30));
        bateriaDisp.setMinimumSize(new java.awt.Dimension(100, 30));
        bateriaDisp.setPreferredSize(new java.awt.Dimension(100, 30));

        bateriaLleno.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        bateriaLleno.setForeground(new java.awt.Color(255, 255, 255));
        bateriaLleno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bateriaLleno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/EstadoLleno.png"))); // NOI18N
        bateriaLleno.setMaximumSize(new java.awt.Dimension(100, 30));
        bateriaLleno.setMinimumSize(new java.awt.Dimension(100, 30));
        bateriaLleno.setPreferredSize(new java.awt.Dimension(100, 30));

        bateriaDispAma.setFont(new java.awt.Font("SF UI Display", 1, 14)); // NOI18N
        bateriaDispAma.setForeground(new java.awt.Color(255, 255, 255));
        bateriaDispAma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bateriaDispAma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/EstadoDisponibleAmarillo.png"))); // NOI18N
        bateriaDispAma.setMaximumSize(new java.awt.Dimension(100, 30));
        bateriaDispAma.setMinimumSize(new java.awt.Dimension(100, 30));
        bateriaDispAma.setPreferredSize(new java.awt.Dimension(100, 30));

        javax.swing.GroupLayout EstadoBateriaLayout = new javax.swing.GroupLayout(EstadoBateria);
        EstadoBateria.setLayout(EstadoBateriaLayout);
        EstadoBateriaLayout.setHorizontalGroup(
            EstadoBateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bateriaDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(EstadoBateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EstadoBateriaLayout.createSequentialGroup()
                    .addComponent(bateriaLleno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(EstadoBateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EstadoBateriaLayout.createSequentialGroup()
                    .addComponent(bateriaDispAma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        EstadoBateriaLayout.setVerticalGroup(
            EstadoBateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bateriaDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(EstadoBateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EstadoBateriaLayout.createSequentialGroup()
                    .addComponent(bateriaLleno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(EstadoBateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EstadoBateriaLayout.createSequentialGroup()
                    .addComponent(bateriaDispAma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        btnVaciarBateria.setBackground(new java.awt.Color(51, 71, 86));
        btnVaciarBateria.setMaximumSize(new java.awt.Dimension(140, 50));
        btnVaciarBateria.setMinimumSize(new java.awt.Dimension(140, 50));
        btnVaciarBateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVaciarBateriaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVaciarBateriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVaciarBateriaMouseExited(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("SF UI Display", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Vaciar");
        jLabel20.setMaximumSize(new java.awt.Dimension(140, 40));
        jLabel20.setMinimumSize(new java.awt.Dimension(140, 40));
        jLabel20.setPreferredSize(new java.awt.Dimension(140, 40));

        javax.swing.GroupLayout btnVaciarBateriaLayout = new javax.swing.GroupLayout(btnVaciarBateria);
        btnVaciarBateria.setLayout(btnVaciarBateriaLayout);
        btnVaciarBateriaLayout.setHorizontalGroup(
            btnVaciarBateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnVaciarBateriaLayout.setVerticalGroup(
            btnVaciarBateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
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
                        .addComponent(Titulo3)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCantBateria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCantVidrio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCantCarton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCantLata, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(20, 20, 20)
                                .addComponent(txtCantPlastico, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(20, 20, 20)
                                .addComponent(txtLimPlastico, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(EstadoPlastico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnVaciarPlastico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtLimLata, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(EstadoLata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnVaciarLata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtLimCarton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(EstadoCarton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnVaciarCarton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtLimVidrio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(EstadoVidrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnVaciarVidrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtLimBateria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(EstadoBateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnVaciarBateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                    .addComponent(btnVaciarPlastico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Titulo3)
                                    .addComponent(jLabel7)
                                    .addComponent(txtCantPlastico)
                                    .addComponent(jLabel9)
                                    .addComponent(txtLimPlastico)))
                            .addComponent(EstadoPlastico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVaciarLata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txtCantLata)
                                    .addComponent(jLabel12)
                                    .addComponent(txtLimLata)))
                            .addComponent(EstadoLata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVaciarCarton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(txtCantCarton)
                                    .addComponent(jLabel14)
                                    .addComponent(txtLimCarton)))
                            .addComponent(EstadoCarton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVaciarVidrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(txtCantVidrio)
                                    .addComponent(jLabel16)
                                    .addComponent(txtLimVidrio)))
                            .addComponent(EstadoVidrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVaciarBateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(txtCantBateria)
                                    .addComponent(jLabel19)
                                    .addComponent(txtLimBateria)))
                            .addComponent(EstadoBateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        ModuloMaquina mMaq = new ModuloMaquina();

        mMaq.setSize(new Dimension(1300, 680));
        mMaq.setLocation(0,0);
        ModuloOpeDash.Principal.removeAll();
        ModuloOpeDash.Principal.add(mMaq,BorderLayout.CENTER);
        ModuloOpeDash.Principal.revalidate();
        ModuloOpeDash.Principal.repaint();
    }//GEN-LAST:event_atrasMouseClicked

    private void atrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseEntered
        atras.setBackground(new Color(255, 0, 0));
    }//GEN-LAST:event_atrasMouseEntered

    private void atrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseExited
        atras.setBackground(new Color(200, 42, 42));
    }//GEN-LAST:event_atrasMouseExited

    private void btnVaciarPlasticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVaciarPlasticoMouseClicked
        formatearHoja(1);
    }//GEN-LAST:event_btnVaciarPlasticoMouseClicked

    private void btnVaciarPlasticoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVaciarPlasticoMouseEntered
        btnVaciarPlastico.setBackground(new Color(48, 105, 147));
    }//GEN-LAST:event_btnVaciarPlasticoMouseEntered

    private void btnVaciarPlasticoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVaciarPlasticoMouseExited
        btnVaciarPlastico.setBackground(new Color(51,71,86));
    }//GEN-LAST:event_btnVaciarPlasticoMouseExited

    private void btnVaciarLataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVaciarLataMouseClicked
        formatearHoja(2);
    }//GEN-LAST:event_btnVaciarLataMouseClicked

    private void btnVaciarLataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVaciarLataMouseEntered
        btnVaciarLata.setBackground(new Color(48, 105, 147));
    }//GEN-LAST:event_btnVaciarLataMouseEntered

    private void btnVaciarLataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVaciarLataMouseExited
        btnVaciarLata.setBackground(new Color(51,71,86));
    }//GEN-LAST:event_btnVaciarLataMouseExited

    private void btnVaciarCartonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVaciarCartonMouseClicked
        formatearHoja(3);
    }//GEN-LAST:event_btnVaciarCartonMouseClicked

    private void btnVaciarCartonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVaciarCartonMouseEntered
        btnVaciarCarton.setBackground(new Color(48, 105, 147));
    }//GEN-LAST:event_btnVaciarCartonMouseEntered

    private void btnVaciarCartonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVaciarCartonMouseExited
        btnVaciarCarton.setBackground(new Color(51,71,86));
    }//GEN-LAST:event_btnVaciarCartonMouseExited

    private void btnVaciarVidrioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVaciarVidrioMouseClicked
        formatearHoja(4);
    }//GEN-LAST:event_btnVaciarVidrioMouseClicked

    private void btnVaciarVidrioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVaciarVidrioMouseEntered
        btnVaciarVidrio.setBackground(new Color(48, 105, 147));
    }//GEN-LAST:event_btnVaciarVidrioMouseEntered

    private void btnVaciarVidrioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVaciarVidrioMouseExited
        btnVaciarVidrio.setBackground(new Color(51,71,86));
    }//GEN-LAST:event_btnVaciarVidrioMouseExited

    private void btnVaciarBateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVaciarBateriaMouseClicked
        formatearHoja(5);
    }//GEN-LAST:event_btnVaciarBateriaMouseClicked

    private void btnVaciarBateriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVaciarBateriaMouseEntered
        btnVaciarBateria.setBackground(new Color(48, 105, 147));
    }//GEN-LAST:event_btnVaciarBateriaMouseEntered

    private void btnVaciarBateriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVaciarBateriaMouseExited
        btnVaciarBateria.setBackground(new Color(51,71,86));
    }//GEN-LAST:event_btnVaciarBateriaMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EstadoBateria;
    private javax.swing.JPanel EstadoCarton;
    private javax.swing.JPanel EstadoLata;
    private javax.swing.JPanel EstadoPlastico;
    private javax.swing.JPanel EstadoVidrio;
    private javax.swing.JLabel Titulo3;
    public static javax.swing.JPanel atras;
    public static javax.swing.JLabel atrasIcon;
    private javax.swing.JLabel bateriaDisp;
    private javax.swing.JLabel bateriaDispAma;
    private javax.swing.JLabel bateriaLleno;
    private javax.swing.JPanel btnVaciarBateria;
    private javax.swing.JPanel btnVaciarCarton;
    private javax.swing.JPanel btnVaciarLata;
    private javax.swing.JPanel btnVaciarPlastico;
    private javax.swing.JPanel btnVaciarVidrio;
    private javax.swing.JLabel cartonDisp;
    private javax.swing.JLabel cartonDispAma;
    private javax.swing.JLabel cartonLleno;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lataDisp;
    private javax.swing.JLabel lataDispAma;
    private javax.swing.JLabel lataLleno;
    private javax.swing.JLabel plasticoDipAma;
    private javax.swing.JLabel plasticoDisp;
    private javax.swing.JLabel plasticoLleno;
    private javax.swing.JLabel txtCantBateria;
    private javax.swing.JLabel txtCantCarton;
    private javax.swing.JLabel txtCantLata;
    private javax.swing.JLabel txtCantPlastico;
    private javax.swing.JLabel txtCantVidrio;
    private javax.swing.JLabel txtLimBateria;
    private javax.swing.JLabel txtLimCarton;
    private javax.swing.JLabel txtLimLata;
    private javax.swing.JLabel txtLimPlastico;
    private javax.swing.JLabel txtLimVidrio;
    private javax.swing.JLabel vidrioDisp;
    private javax.swing.JLabel vidrioDispAma;
    private javax.swing.JLabel vidrioLleno;
    // End of variables declaration//GEN-END:variables
}
