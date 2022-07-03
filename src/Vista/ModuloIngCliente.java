/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Entidad.cliente;
import Modelo.clienteMod;
import Modelo.detaReciMod;
import Modelo.reciboMod;
import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yoshi
 */
public class ModuloIngCliente extends javax.swing.JPanel {
    
    Modelo.reciboMod recMod = new reciboMod();
    Modelo.clienteMod cliMod = new clienteMod();
    Modelo.detaReciMod detaReciMod = new detaReciMod();
    Entidad.cliente eClien = new cliente();
    
    
    DefaultTableModel tModel2;
    Object[] ob = new Object[4];
    double total;
    int numHojas=0;
    
    
    public ModuloIngCliente() {
        initComponents();
        tablaProd.setRowHeight(25);//Damos un tamaño predeterminado a la tabla
        cargarTabProd();
        email.setVisible(false);
        txtEmail.setVisible(false);
        
    }
    
    //Cargamos la tabla de productos de la interfaz anterior
    void cargarTabProd(){
        tModel2 = (DefaultTableModel) tablaProd.getModel();
        for (int i = 0; i < ModuloIngProd.fila; i++) {
            ob[0] = ModuloIngProd.tModel.getValueAt(i, 0);
            ob[1] = ModuloIngProd.tModel.getValueAt(i, 1);
            ob[2] = ModuloIngProd.tModel.getValueAt(i, 2);
            ob[3] = ModuloIngProd.tModel.getValueAt(i, 3);
            tModel2.addRow(ob);
        }
        
        total = ModuloIngProd.total;
        txtTotal.setText("S/."+String.format("%.2f",total));
    }

    //Generamos el Numero del Recibo
    String generarReciNum(){
        String rNum = "";
        String num = recMod.maxReciNum();
        int j;
        if(num == null){
            rNum = "REC001";
        }else{
            char r1 = num.charAt(3);
            char r2 = num.charAt(4);
            char r3 = num.charAt(5);
            String r="";
            r=""+r1+r2+r3;
            
            j=Integer.parseInt(r);
            
            recMod.generarNum(j);
            num = "REC" + recMod.Num();
            rNum = num;
        }
        return rNum;
    }
    
    
    //Validamos el Boton Siguiente...
    void ingresarSig() throws MessagingException{
        if(txtDNI.getText().equals("") || txtNombre.getText().equals("") || txtApe.getText().equals("") || txtDirec.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campos de textos obligatorios sin rellenar");
            txtDNI.requestFocus();
        }else{
            if(!rbtCorreo.isSelected() && !rbtImprimir.isSelected()){
                JOptionPane.showMessageDialog(null, "Seleccione el tipo de Recibo\n        (Imprimir / Correo)");
            }else{
                if(rbtCorreo.isSelected() == true){
                    if(txtEmail.getText().equals("")){
                            JOptionPane.showMessageDialog(null, "Campo de Email sin rellenar");
                        }else{
                            this.vector1.setVisible(false);
                            this.vector2.setVisible(false);
                            this.vector3.setVisible(true);
                            ActIngresar();
                        }
                    }else{
                        this.vector1.setVisible(false);
                        this.vector2.setVisible(false);
                        this.vector3.setVisible(true);
                        ActIngresar();
                    }
                }
            }
            
    }
    
    void buscarCliente(){
        int temp = 0;
        if(txtDNI.getText().equals("")){
            txtDNI.requestFocus();
            lblMensajeDNI.setText("Ingrese un DNI");
            txtNombre.setText("");
            txtApe.setText("");
            txtDirec.setText("");
            txtEmail.setText("");
        }else{
            String c = txtDNI.getText();
            eClien = cliMod.datosClienteDNI(c);
            temp = eClien.getClienID();
            if(temp == 0){
                lblMensajeDNI.setText("Cliente no encontrado");
                txtNombre.setText("");
                txtApe.setText("");
                txtDirec.setText("");
                txtEmail.setText("");
            }else{
                txtNombre.setText(eClien.getClienNom());
                txtApe.setText(eClien.getClienApe());
                txtDirec.setText(eClien.getClienDirec());
                txtEmail.setText(cliMod.datoCorreoDNI(eClien.getClienDNI()));
                lblMensajeDNI.setText("");
            }
            
        }
    }
    //Ingresamos todos los datos del cliente, Recibo, Detalle de recibo, Email.
    void ActIngresar(){
        //Ingresar datos del cliente
        String dni= txtDNI.getText();
        String nom = txtNombre.getText();
        String ape = txtApe.getText();
        String direc = txtDirec.getText();
        String email;
        
        Object[] ob = new Object[4];
        
        ob[0] = dni;
        ob[1] = nom;
        ob[2] = ape;
        ob[3] = direc;
        
        int ClienID = 0;
        
        if(cliMod.idClienteDNI(dni)==0){
            int r1 = cliMod.addCliente(ob);
            
//            if(r1>0){
//                JOptionPane.showMessageDialog(null, "Los datos del cliente se ingresaron correctamente");
//            }
            
            ClienID = cliMod.idCliente();
        }else{
            ClienID = cliMod.idClienteDNI(dni);
        }
        
        int c1 = 0;
                
        //Ingresar Email del cliente
        
        if(!txtEmail.getText().isEmpty()){
            email = txtEmail.getText();
            
            if(cliMod.idEmailDNI(email, dni)==0){
                Object obCor = new Object();
                obCor = txtEmail.getText();
                c1 = cliMod.addCorreo(obCor, ClienID);

//                if(c1>0){
//                    JOptionPane.showMessageDialog(null, "El correo del cliente se ingresó correctamente");
//                }
            }
            
        }
        
        //Ingresar datos del recibo
        String RecNum = generarReciNum();
        double total = this.total;
        DateTimeFormatter ReciFech = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String ReciF = ""+ReciFech.format(LocalDateTime.now());
        int ReciEstd = 1;
        
        Object[] obRec = new Object[5];
        
        obRec[0] = RecNum;
        obRec[1] = ReciF;
        obRec[2] = ReciEstd;
        obRec[3] = total;
        obRec[4] = ClienID;
        
        int r2 = recMod.addRecibo(obRec);
        
//        if(r2>0){
//            JOptionPane.showMessageDialog(null, "Datos del recibo ingresados correctamente");
//        }
        
        //Ingresar Detalle del Recibo
        for(int i=0; i<tablaProd.getRowCount(); i++){
            int ProdID = Integer.parseInt(tablaProd.getValueAt(i, 0).toString());
            int RecID = recMod.maxReciID();
            int detaReciCant = Integer.parseInt(tablaProd.getValueAt(i, 2).toString());
            double importe = Double.parseDouble(tablaProd.getValueAt(i, 3).toString());

            Object[] obDet = new Object[4];

            obDet[0] = detaReciCant;
            obDet[1] = importe;
            obDet[2] = RecID;
            obDet[3] = ProdID;

            detaReciMod.addDetaRecibo(obDet);
        }
        
        JOptionPane.showMessageDialog(null, "Datos ingresados correctamente");
        
        eClien = cliMod.datosClienteID(ClienID);
        
        if(rbtImprimir.isSelected()){
            JOptionPane.showMessageDialog(null, "Imprimiendo Recibo de Pago","Mensaje",1);
        }else{
            JOptionPane.showMessageDialog(null, "Enviando Recibo de Pago al Correo","Mensaje",1);
        }
        
        //Regresamos al Modulo Main
        
        ModuloMain mm = new ModuloMain();

        mm.setSize(new Dimension(1300, 800));
        mm.setLocation(0, 0);
        Main.Fondo.removeAll();
        Main.Fondo.add(mm, BorderLayout.CENTER);
        Main.Fondo.revalidate();
        Main.Fondo.repaint();
    }
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupBotones = new javax.swing.ButtonGroup();
        Encabe = new javax.swing.JPanel();
        vector1 = new javax.swing.JLabel();
        vector2 = new javax.swing.JLabel();
        vector3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnSoyCliente = new javax.swing.JPanel();
        lblSoyCliente = new javax.swing.JLabel();
        atras = new javax.swing.JPanel();
        atrasIcon = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        texto1 = new javax.swing.JLabel();
        btnRecibo = new javax.swing.JPanel();
        lblAgregar3 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProd = new javax.swing.JTable();
        lblPrecio1 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        dni = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        apellido = new javax.swing.JLabel();
        txtApe = new javax.swing.JTextField();
        direccion = new javax.swing.JLabel();
        txtDirec = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        email1 = new javax.swing.JLabel();
        email2 = new javax.swing.JLabel();
        rbtImprimir = new javax.swing.JRadioButton();
        rbtCorreo = new javax.swing.JRadioButton();
        lblMensajeDNI = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1300, 800));
        setMinimumSize(new java.awt.Dimension(1300, 800));
        setPreferredSize(new java.awt.Dimension(1300, 800));

        Encabe.setBackground(new java.awt.Color(51, 71, 86));
        Encabe.setMaximumSize(new java.awt.Dimension(1300, 120));
        Encabe.setMinimumSize(new java.awt.Dimension(1300, 120));
        Encabe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vector1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Vector.png"))); // NOI18N
        Encabe.add(vector1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 140, 10));

        vector2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Vector.png"))); // NOI18N
        Encabe.add(vector2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 140, 10));

        vector3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Vector.png"))); // NOI18N
        Encabe.add(vector3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 90, 140, 10));

        jLabel3.setFont(new java.awt.Font("SF UI Display", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/separador.png"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(60, 120));
        jLabel3.setMinimumSize(new java.awt.Dimension(60, 120));
        jLabel3.setPreferredSize(new java.awt.Dimension(60, 120));
        Encabe.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, -1, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/seccion1.png"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(323, 120));
        jLabel5.setMinimumSize(new java.awt.Dimension(323, 120));
        Encabe.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 120));

        jLabel4.setFont(new java.awt.Font("SF UI Display", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/seccion3.png"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(1050, 120));
        jLabel4.setMinimumSize(new java.awt.Dimension(1050, 120));
        jLabel4.setPreferredSize(new java.awt.Dimension(1050, 120));
        Encabe.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 326, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/seccion2.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(323, 120));
        jLabel1.setMinimumSize(new java.awt.Dimension(323, 120));
        jLabel1.setPreferredSize(new java.awt.Dimension(323, 120));
        Encabe.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 330, 120));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/separador.png"))); // NOI18N
        Encabe.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, -1, 120));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/separador.png"))); // NOI18N
        Encabe.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 60, 120));

        btnSoyCliente.setBackground(new java.awt.Color(75, 134, 115));
        btnSoyCliente.setMaximumSize(new java.awt.Dimension(30, 29));
        btnSoyCliente.setMinimumSize(new java.awt.Dimension(30, 29));
        btnSoyCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSoyClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSoyClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSoyClienteMouseExited(evt);
            }
        });

        lblSoyCliente.setFont(new java.awt.Font("SF UI Display", 1, 18)); // NOI18N
        lblSoyCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblSoyCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSoyCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Iconlupa.png"))); // NOI18N
        lblSoyCliente.setMaximumSize(new java.awt.Dimension(30, 29));
        lblSoyCliente.setMinimumSize(new java.awt.Dimension(30, 29));
        lblSoyCliente.setPreferredSize(new java.awt.Dimension(30, 29));

        javax.swing.GroupLayout btnSoyClienteLayout = new javax.swing.GroupLayout(btnSoyCliente);
        btnSoyCliente.setLayout(btnSoyClienteLayout);
        btnSoyClienteLayout.setHorizontalGroup(
            btnSoyClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSoyClienteLayout.createSequentialGroup()
                .addComponent(lblSoyCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnSoyClienteLayout.setVerticalGroup(
            btnSoyClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSoyClienteLayout.createSequentialGroup()
                .addComponent(lblSoyCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        atras.setBackground(new java.awt.Color(224, 27, 18));
        atras.setMaximumSize(new java.awt.Dimension(30, 30));
        atras.setMinimumSize(new java.awt.Dimension(30, 30));
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
        atras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        atrasIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        atrasIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Atras.png"))); // NOI18N
        atras.add(atrasIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        texto1.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        texto1.setText("Productos a reciclar");

        btnRecibo.setBackground(new java.awt.Color(75, 134, 115));
        btnRecibo.setMaximumSize(new java.awt.Dimension(160, 50));
        btnRecibo.setMinimumSize(new java.awt.Dimension(160, 50));
        btnRecibo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReciboMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReciboMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReciboMouseExited(evt);
            }
        });

        lblAgregar3.setFont(new java.awt.Font("SF UI Display", 1, 20)); // NOI18N
        lblAgregar3.setForeground(new java.awt.Color(255, 255, 255));
        lblAgregar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgregar3.setText("Generar Recibo");

        javax.swing.GroupLayout btnReciboLayout = new javax.swing.GroupLayout(btnRecibo);
        btnRecibo.setLayout(btnReciboLayout);
        btnReciboLayout.setHorizontalGroup(
            btnReciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
            .addGroup(btnReciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnReciboLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblAgregar3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnReciboLayout.setVerticalGroup(
            btnReciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(btnReciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnReciboLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblAgregar3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        texto2.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        texto2.setText("Ingrese sus datos para el Recibo");

        tablaProd.setFont(new java.awt.Font("SF UI Display", 0, 17)); // NOI18N
        tablaProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID PROD", "DESCRIPCION", "CANTIDAD", "IMPORTE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaProd);
        if (tablaProd.getColumnModel().getColumnCount() > 0) {
            tablaProd.getColumnModel().getColumn(0).setMinWidth(90);
            tablaProd.getColumnModel().getColumn(0).setPreferredWidth(90);
            tablaProd.getColumnModel().getColumn(0).setMaxWidth(90);
            tablaProd.getColumnModel().getColumn(2).setMinWidth(100);
            tablaProd.getColumnModel().getColumn(2).setPreferredWidth(100);
            tablaProd.getColumnModel().getColumn(2).setMaxWidth(100);
            tablaProd.getColumnModel().getColumn(3).setMinWidth(100);
            tablaProd.getColumnModel().getColumn(3).setPreferredWidth(100);
            tablaProd.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        lblPrecio1.setFont(new java.awt.Font("SF UI Display", 0, 20)); // NOI18N
        lblPrecio1.setText("Total: ");

        txtTotal.setFont(new java.awt.Font("SF UI Display", 0, 20)); // NOI18N
        txtTotal.setText("S/. 0.00");

        dni.setFont(new java.awt.Font("SF UI Display", 1, 18)); // NOI18N
        dni.setText("DNI  *");

        txtDNI.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        txtDNI.setMaximumSize(new java.awt.Dimension(220, 29));
        txtDNI.setMinimumSize(new java.awt.Dimension(220, 29));
        txtDNI.setPreferredSize(new java.awt.Dimension(220, 29));

        nombre.setFont(new java.awt.Font("SF UI Display", 1, 18)); // NOI18N
        nombre.setText("Nombres  *");

        txtNombre.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        txtNombre.setMaximumSize(new java.awt.Dimension(300, 29));
        txtNombre.setMinimumSize(new java.awt.Dimension(300, 29));
        txtNombre.setPreferredSize(new java.awt.Dimension(300, 29));

        apellido.setFont(new java.awt.Font("SF UI Display", 1, 18)); // NOI18N
        apellido.setText("Apellidos  *");

        txtApe.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        txtApe.setMaximumSize(new java.awt.Dimension(300, 29));
        txtApe.setMinimumSize(new java.awt.Dimension(300, 29));
        txtApe.setPreferredSize(new java.awt.Dimension(300, 29));

        direccion.setFont(new java.awt.Font("SF UI Display", 1, 18)); // NOI18N
        direccion.setText("Dirección  *");

        txtDirec.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        txtDirec.setMaximumSize(new java.awt.Dimension(350, 29));
        txtDirec.setMinimumSize(new java.awt.Dimension(350, 29));
        txtDirec.setPreferredSize(new java.awt.Dimension(350, 29));

        email.setFont(new java.awt.Font("SF UI Display", 1, 18)); // NOI18N
        email.setText("Email  *");

        txtEmail.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        txtEmail.setMaximumSize(new java.awt.Dimension(350, 29));
        txtEmail.setMinimumSize(new java.awt.Dimension(350, 29));
        txtEmail.setPreferredSize(new java.awt.Dimension(350, 29));

        email1.setFont(new java.awt.Font("SF UI Display", 0, 15)); // NOI18N
        email1.setText("Si usted es cliente, busque su información mediante su DNI precionando la lupa.");

        email2.setFont(new java.awt.Font("SF UI Display", 0, 15)); // NOI18N
        email2.setText("¿Desea imprimir Voucher o  enviar  al Correo?");

        GrupBotones.add(rbtImprimir);
        rbtImprimir.setFont(new java.awt.Font("SF UI Display", 0, 15)); // NOI18N
        rbtImprimir.setText("Imprimir");
        rbtImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtImprimirActionPerformed(evt);
            }
        });

        GrupBotones.add(rbtCorreo);
        rbtCorreo.setFont(new java.awt.Font("SF UI Display", 0, 15)); // NOI18N
        rbtCorreo.setText("Correo");
        rbtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtCorreoActionPerformed(evt);
            }
        });

        lblMensajeDNI.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        lblMensajeDNI.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Encabe, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(texto2)
                    .addComponent(email1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dni)
                        .addGap(88, 88, 88)
                        .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnSoyCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(lblMensajeDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombre)
                        .addGap(42, 42, 42)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(apellido)
                        .addGap(43, 43, 43)
                        .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(direccion)
                        .addGap(39, 39, 39)
                        .addComponent(txtDirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(email2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(rbtImprimir)
                        .addGap(80, 80, 80)
                        .addComponent(rbtCorreo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(email)
                        .addGap(75, 75, 75)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Encabe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(texto2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(email1)
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(dni))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(btnSoyCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblMensajeDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(nombre))
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(apellido))
                                    .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(direccion))
                                    .addComponent(txtDirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addComponent(email2)
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtImprimir)
                                    .addComponent(rbtCorreo))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(email))
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)
                                .addComponent(btnRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        ModuloIngProd modIngPro = new ModuloIngProd();

        modIngPro.setSize(new Dimension(1300, 800));
        modIngPro.setLocation(0,0);
        Main.Fondo.removeAll();
        Main.Fondo.add(modIngPro, BorderLayout.CENTER);
        Main.Fondo.revalidate();
        Main.Fondo.repaint();
        
        modIngPro.vector2.setVisible(false);
        modIngPro.vector3.setVisible(false);
    }//GEN-LAST:event_atrasMouseClicked

    private void atrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseEntered
        atras.setBackground(new Color(255, 0, 0));
    }//GEN-LAST:event_atrasMouseEntered

    private void atrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseExited
        atras.setBackground(new Color(200, 42, 42));
    }//GEN-LAST:event_atrasMouseExited

    private void btnReciboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReciboMouseClicked
        try {
            ingresarSig();
        } catch (MessagingException ex) {
            Logger.getLogger(ModuloIngCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReciboMouseClicked

    private void btnReciboMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReciboMouseEntered
        btnRecibo.setBackground(new Color(78, 176, 145));
    }//GEN-LAST:event_btnReciboMouseEntered

    private void btnReciboMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReciboMouseExited
        btnRecibo.setBackground(new Color(75,134,115));
    }//GEN-LAST:event_btnReciboMouseExited

    private void btnSoyClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSoyClienteMouseClicked
        buscarCliente();
    }//GEN-LAST:event_btnSoyClienteMouseClicked

    private void btnSoyClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSoyClienteMouseEntered
        btnSoyCliente.setBackground(new Color(78, 176, 145));
    }//GEN-LAST:event_btnSoyClienteMouseEntered

    private void btnSoyClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSoyClienteMouseExited
        btnSoyCliente.setBackground(new Color(75,134,115));
    }//GEN-LAST:event_btnSoyClienteMouseExited

    private void rbtImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtImprimirActionPerformed
        email.setVisible(false);
        txtEmail.setVisible(false);
    }//GEN-LAST:event_rbtImprimirActionPerformed

    private void rbtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtCorreoActionPerformed
        email.setVisible(true);
        txtEmail.setVisible(true);
    }//GEN-LAST:event_rbtCorreoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel Encabe;
    private javax.swing.ButtonGroup GrupBotones;
    private javax.swing.JLabel apellido;
    private javax.swing.JPanel atras;
    private javax.swing.JLabel atrasIcon;
    private javax.swing.JPanel btnRecibo;
    private javax.swing.JPanel btnSoyCliente;
    private javax.swing.JLabel direccion;
    private javax.swing.JLabel dni;
    private javax.swing.JLabel email;
    private javax.swing.JLabel email1;
    private javax.swing.JLabel email2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAgregar3;
    private javax.swing.JLabel lblMensajeDNI;
    private javax.swing.JLabel lblPrecio1;
    private javax.swing.JLabel lblSoyCliente;
    private javax.swing.JLabel nombre;
    private javax.swing.JRadioButton rbtCorreo;
    private javax.swing.JRadioButton rbtImprimir;
    private javax.swing.JTable tablaProd;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JTextField txtApe;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDirec;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JLabel txtTotal;
    public static javax.swing.JLabel vector1;
    public static javax.swing.JLabel vector2;
    public static javax.swing.JLabel vector3;
    // End of variables declaration//GEN-END:variables
}
