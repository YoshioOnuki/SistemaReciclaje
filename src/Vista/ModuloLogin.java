/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Entidad.operador;
import Entidad.usuario;
import Modelo.operadorMod;
import Modelo.usuarioMod;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author yoshi
 */
public class ModuloLogin extends javax.swing.JPanel {

    Modelo.usuarioMod usuaMod = new usuarioMod();
    Modelo.operadorMod operMod = new operadorMod();
    Entidad.usuario usuaEnt = new usuario();
    Entidad.operador operEnt = new operador();
    
    
    public ModuloLogin() {
        initComponents();
        placeholders();
    }
    
    //Para los campos de texto
    void placeholders(){
        Textp txtu = new Textp("Usuario", txtUsua);
        Textp txtc = new Textp("Contraseña", txtContrasenia);
    }
    

    //Validando el Login...
    void validar(){
        String usu = txtUsua.getText();
        String cont = txtContrasenia.getText();
        
        if(txtUsua.getText().equals("") || txtContrasenia.getText().equals("")){
            ImageIcon ico = new ImageIcon("src/Imagen/IconJOP.png");
            JOptionPane.showMessageDialog(null, "Campos de texto vacíos...", "¡Espere!",JOptionPane.WARNING_MESSAGE, ico);
            txtUsua.requestFocus();
        }else{
            usuaEnt = usuaMod.validarUsuario(usu, cont);
            if(usuaEnt.getUsuaUser()!= null && usuaEnt.getUsuaCont()!= null){
                int idu = usuaEnt.getUsuaID();
                int idemp = usuaEnt.getOperID();
                System.out.println("id usuario: " + idu);
                System.out.println("id empleado: "+idemp);
                
                operEnt = operMod.validarOperador(idemp);
                
                System.out.println("DNI Empleado: " + operEnt.getOperDNI());
                System.out.println("Nombre del Empleado: " + operEnt.getOperNom());
                
                ModuloOpeDash mOpe = new ModuloOpeDash();

                mOpe.setSize(new Dimension(1300, 800));
                mOpe.setLocation(0,0);
                Main.Fondo.removeAll();
                Main.Fondo.add(mOpe, BorderLayout.CENTER);
                Main.Fondo.revalidate();
                Main.Fondo.repaint();
            }else{
                ImageIcon ico = new ImageIcon("src/Imagen/IconJOP.png");
                JOptionPane.showMessageDialog(null, "Campos de texto incorrectos...", "¡Espere!",JOptionPane.WARNING_MESSAGE, ico);
                txtUsua.requestFocus();
            }
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        Encabe = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        atras = new javax.swing.JPanel();
        atrasIcon = new javax.swing.JLabel();
        PanelOpc = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtUsua = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        txtContrasenia = new javax.swing.JPasswordField();
        btnIniciarSesion = new javax.swing.JPanel();
        lblAgregar6 = new javax.swing.JLabel();

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

        jLabel3.setFont(new java.awt.Font("SF UI Display", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INICIAR SESION");
        jLabel3.setMaximumSize(new java.awt.Dimension(1050, 120));
        jLabel3.setMinimumSize(new java.awt.Dimension(1050, 120));
        jLabel3.setPreferredSize(new java.awt.Dimension(1050, 120));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Logo.png"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(152, 102));
        jLabel5.setMinimumSize(new java.awt.Dimension(152, 102));
        jLabel5.setPreferredSize(new java.awt.Dimension(152, 102));

        javax.swing.GroupLayout EncabeLayout = new javax.swing.GroupLayout(Encabe);
        Encabe.setLayout(EncabeLayout);
        EncabeLayout.setHorizontalGroup(
            EncabeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EncabeLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        EncabeLayout.setVerticalGroup(
            EncabeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        atras.setBackground(new java.awt.Color(209, 20, 54));
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

        PanelOpc.setBackground(new java.awt.Color(210, 232, 212));
        PanelOpc.setMaximumSize(new java.awt.Dimension(360, 520));
        PanelOpc.setMinimumSize(new java.awt.Dimension(360, 520));
        PanelOpc.setPreferredSize(new java.awt.Dimension(360, 520));

        jLabel4.setFont(new java.awt.Font("SF UI Display", 1, 26)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("BIENBENIDO");

        jPanel3.setBackground(new java.awt.Color(205, 194, 174));
        jPanel3.setMaximumSize(new java.awt.Dimension(245, 50));
        jPanel3.setMinimumSize(new java.awt.Dimension(245, 50));
        jPanel3.setPreferredSize(new java.awt.Dimension(245, 50));
        jPanel3.setVerifyInputWhenFocusTarget(false);

        txtUsua.setBackground(new java.awt.Color(205, 194, 174));
        txtUsua.setFont(new java.awt.Font("SF UI Display", 0, 20)); // NOI18N
        txtUsua.setBorder(null);
        txtUsua.setMaximumSize(new java.awt.Dimension(187, 28));
        txtUsua.setMinimumSize(new java.awt.Dimension(187, 28));
        txtUsua.setPreferredSize(new java.awt.Dimension(187, 28));
        txtUsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuaActionPerformed(evt);
            }
        });
        txtUsua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtUsua, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(txtUsua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(205, 194, 174));
        jPanel4.setMaximumSize(new java.awt.Dimension(245, 50));
        jPanel4.setMinimumSize(new java.awt.Dimension(245, 50));
        jPanel4.setPreferredSize(new java.awt.Dimension(245, 50));

        txtContrasenia.setBackground(new java.awt.Color(205, 194, 174));
        txtContrasenia.setFont(new java.awt.Font("SF UI Display", 0, 20)); // NOI18N
        txtContrasenia.setBorder(null);
        txtContrasenia.setMaximumSize(new java.awt.Dimension(187, 28));
        txtContrasenia.setMinimumSize(new java.awt.Dimension(187, 28));
        txtContrasenia.setPreferredSize(new java.awt.Dimension(187, 28));
        txtContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseniaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnIniciarSesion.setBackground(new java.awt.Color(51, 71, 86));
        btnIniciarSesion.setMaximumSize(new java.awt.Dimension(160, 50));
        btnIniciarSesion.setMinimumSize(new java.awt.Dimension(160, 50));
        btnIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseExited(evt);
            }
        });

        lblAgregar6.setFont(new java.awt.Font("SF UI Display", 1, 20)); // NOI18N
        lblAgregar6.setForeground(new java.awt.Color(255, 255, 255));
        lblAgregar6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgregar6.setText("Iniciar Sesión");

        javax.swing.GroupLayout btnIniciarSesionLayout = new javax.swing.GroupLayout(btnIniciarSesion);
        btnIniciarSesion.setLayout(btnIniciarSesionLayout);
        btnIniciarSesionLayout.setHorizontalGroup(
            btnIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
            .addGroup(btnIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnIniciarSesionLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblAgregar6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnIniciarSesionLayout.setVerticalGroup(
            btnIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(btnIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnIniciarSesionLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblAgregar6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout PanelOpcLayout = new javax.swing.GroupLayout(PanelOpc);
        PanelOpc.setLayout(PanelOpcLayout);
        PanelOpcLayout.setHorizontalGroup(
            PanelOpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelOpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOpcLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelOpcLayout.createSequentialGroup()
                        .addGap(0, 51, Short.MAX_VALUE)
                        .addGroup(PanelOpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelOpcLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        PanelOpcLayout.setVerticalGroup(
            PanelOpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Encabe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(470, 470, 470)
                .addComponent(PanelOpc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addComponent(Encabe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelOpc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void txtUsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuaActionPerformed

    private void txtUsuaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuaKeyTyped

    private void txtContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseniaActionPerformed

    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        ModuloMain mm = new ModuloMain();

        mm.setSize(new Dimension(1300, 800));
        mm.setLocation(0,0);
        Main.Fondo.removeAll();
        Main.Fondo.add(mm, BorderLayout.CENTER);
        Main.Fondo.revalidate();
        Main.Fondo.repaint();
        
    }//GEN-LAST:event_atrasMouseClicked

    private void atrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseEntered
        atras.setBackground(new Color(255, 0, 0));
    }//GEN-LAST:event_atrasMouseEntered

    private void atrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseExited
        atras.setBackground(new Color(200, 42, 42));
    }//GEN-LAST:event_atrasMouseExited

    private void btnIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseClicked
        validar();
    }//GEN-LAST:event_btnIniciarSesionMouseClicked

    private void btnIniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseEntered
        btnIniciarSesion.setBackground(new Color(48, 105, 147));
    }//GEN-LAST:event_btnIniciarSesionMouseEntered

    private void btnIniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseExited
        btnIniciarSesion.setBackground(new Color(51,71,86));
    }//GEN-LAST:event_btnIniciarSesionMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Encabe;
    public static javax.swing.JPanel Fondo;
    private javax.swing.JPanel PanelOpc;
    public static javax.swing.JPanel atras;
    public static javax.swing.JLabel atrasIcon;
    private javax.swing.JPanel btnIniciarSesion;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblAgregar6;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtUsua;
    // End of variables declaration//GEN-END:variables
}
