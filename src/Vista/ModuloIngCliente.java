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
public class ModuloIngCliente extends javax.swing.JPanel {

    /**
     * Creates new form ModuloIngCliente
     */
    public ModuloIngCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jTable1 = new javax.swing.JTable();
        lblPrecio1 = new javax.swing.JLabel();
        lblNombre3 = new javax.swing.JLabel();
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
        btnSoyCliente.setMaximumSize(new java.awt.Dimension(115, 50));
        btnSoyCliente.setMinimumSize(new java.awt.Dimension(115, 50));
        btnSoyCliente.setPreferredSize(new java.awt.Dimension(115, 50));
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
        lblSoyCliente.setText("Soy cliente");
        lblSoyCliente.setMaximumSize(new java.awt.Dimension(100, 38));
        lblSoyCliente.setMinimumSize(new java.awt.Dimension(100, 38));
        lblSoyCliente.setPreferredSize(new java.awt.Dimension(100, 38));

        javax.swing.GroupLayout btnSoyClienteLayout = new javax.swing.GroupLayout(btnSoyCliente);
        btnSoyCliente.setLayout(btnSoyClienteLayout);
        btnSoyClienteLayout.setHorizontalGroup(
            btnSoyClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSoyCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
        );
        btnSoyClienteLayout.setVerticalGroup(
            btnSoyClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSoyClienteLayout.createSequentialGroup()
                .addComponent(lblSoyCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        lblPrecio1.setFont(new java.awt.Font("SF UI Display", 0, 20)); // NOI18N
        lblPrecio1.setText("Precio: ");

        lblNombre3.setFont(new java.awt.Font("SF UI Display", 0, 20)); // NOI18N
        lblNombre3.setText("S/. 0.00");

        dni.setFont(new java.awt.Font("SF UI Display", 1, 18)); // NOI18N
        dni.setText("DNI:");

        txtDNI.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        txtDNI.setMaximumSize(new java.awt.Dimension(220, 29));
        txtDNI.setMinimumSize(new java.awt.Dimension(220, 29));
        txtDNI.setPreferredSize(new java.awt.Dimension(220, 29));

        nombre.setFont(new java.awt.Font("SF UI Display", 1, 18)); // NOI18N
        nombre.setText("Nombres:");

        txtNombre.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        txtNombre.setMaximumSize(new java.awt.Dimension(300, 29));
        txtNombre.setMinimumSize(new java.awt.Dimension(300, 29));
        txtNombre.setPreferredSize(new java.awt.Dimension(300, 29));

        apellido.setFont(new java.awt.Font("SF UI Display", 1, 18)); // NOI18N
        apellido.setText("Apellidos:");

        txtApe.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        txtApe.setMaximumSize(new java.awt.Dimension(300, 29));
        txtApe.setMinimumSize(new java.awt.Dimension(300, 29));
        txtApe.setPreferredSize(new java.awt.Dimension(300, 29));

        direccion.setFont(new java.awt.Font("SF UI Display", 1, 18)); // NOI18N
        direccion.setText("Dirección:");

        txtDirec.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        txtDirec.setMaximumSize(new java.awt.Dimension(350, 29));
        txtDirec.setMinimumSize(new java.awt.Dimension(350, 29));
        txtDirec.setPreferredSize(new java.awt.Dimension(350, 29));

        email.setFont(new java.awt.Font("SF UI Display", 1, 18)); // NOI18N
        email.setText("Email:");

        txtEmail.setFont(new java.awt.Font("SF UI Display", 0, 18)); // NOI18N
        txtEmail.setMaximumSize(new java.awt.Dimension(350, 29));
        txtEmail.setMinimumSize(new java.awt.Dimension(350, 29));
        txtEmail.setPreferredSize(new java.awt.Dimension(350, 29));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(dni)
                                                    .addComponent(nombre)
                                                    .addComponent(apellido))
                                                .addGap(42, 42, 42)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(direccion)
                                                    .addComponent(email))
                                                .addGap(39, 39, 39)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtDirec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGap(106, 106, 106))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(texto2)
                                        .addGap(18, 18, 18))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSoyCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)))
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
                                        .addComponent(lblNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Encabe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
                                .addGap(20, 20, 20)
                                .addComponent(btnSoyCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dni)
                                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nombre)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(apellido)
                                    .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(direccion)
                                    .addComponent(txtDirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(email)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addComponent(btnRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(60, Short.MAX_VALUE))
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
        
    }//GEN-LAST:event_btnReciboMouseClicked

    private void btnReciboMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReciboMouseEntered
        btnRecibo.setBackground(new Color(78, 176, 145));
    }//GEN-LAST:event_btnReciboMouseEntered

    private void btnReciboMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReciboMouseExited
        btnRecibo.setBackground(new Color(75,134,115));
    }//GEN-LAST:event_btnReciboMouseExited

    private void btnSoyClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSoyClienteMouseClicked
        
    }//GEN-LAST:event_btnSoyClienteMouseClicked

    private void btnSoyClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSoyClienteMouseEntered
        btnSoyCliente.setBackground(new Color(78, 176, 145));
    }//GEN-LAST:event_btnSoyClienteMouseEntered

    private void btnSoyClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSoyClienteMouseExited
        btnSoyCliente.setBackground(new Color(75,134,115));
    }//GEN-LAST:event_btnSoyClienteMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel Encabe;
    private javax.swing.JLabel apellido;
    private javax.swing.JPanel atras;
    private javax.swing.JLabel atrasIcon;
    private javax.swing.JPanel btnRecibo;
    private javax.swing.JPanel btnRecibo1;
    private javax.swing.JPanel btnSoyCliente;
    private javax.swing.JLabel direccion;
    private javax.swing.JLabel dni;
    private javax.swing.JLabel email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAgregar3;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JLabel lblPrecio1;
    private javax.swing.JLabel lblRecibo1;
    private javax.swing.JLabel lblSoyCliente;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JTextField txtApe;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDirec;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    public static javax.swing.JLabel vector1;
    public static javax.swing.JLabel vector2;
    public static javax.swing.JLabel vector3;
    // End of variables declaration//GEN-END:variables
}
