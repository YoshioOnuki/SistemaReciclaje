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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author yoshi
 */
public class ModuloMain extends javax.swing.JPanel {

    Modelo.maquinaMod maqMod = new maquinaMod();
    Modelo.almacenMod almaMod = new almacenMod();
    Entidad.maquina maq = new maquina();
    
    public ModuloMain() {
        initComponents();
        ModuloIngProd.total = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PanelOpc = new javax.swing.JPanel();
        btnIniciar = new javax.swing.JPanel();
        lblIniciar = new javax.swing.JLabel();
        btnReciclar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1300, 800));
        setMinimumSize(new java.awt.Dimension(1300, 800));
        setPreferredSize(new java.awt.Dimension(1300, 800));

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setMaximumSize(new java.awt.Dimension(1300, 800));
        Fondo.setName(""); // NOI18N
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 71, 86));

        jLabel3.setFont(new java.awt.Font("SF UI Display", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SI AMAS LA TIERRA, RECICLA Y CONSERVA...");
        jLabel3.setMaximumSize(new java.awt.Dimension(1050, 120));
        jLabel3.setMinimumSize(new java.awt.Dimension(1050, 120));
        jLabel3.setPreferredSize(new java.awt.Dimension(1050, 120));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Logo.png"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(152, 102));
        jLabel5.setMinimumSize(new java.awt.Dimension(152, 102));
        jLabel5.setPreferredSize(new java.awt.Dimension(152, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 120));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/FondoVer.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(900, 680));
        jLabel1.setMinimumSize(new java.awt.Dimension(900, 680));
        jLabel1.setName(""); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(900, 680));
        Fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 900, 680));

        PanelOpc.setBackground(new java.awt.Color(210, 232, 212));
        PanelOpc.setMaximumSize(new java.awt.Dimension(360, 510));
        PanelOpc.setMinimumSize(new java.awt.Dimension(360, 510));

        btnIniciar.setBackground(new java.awt.Color(51, 71, 86));
        btnIniciar.setMaximumSize(new java.awt.Dimension(250, 60));
        btnIniciar.setMinimumSize(new java.awt.Dimension(250, 60));
        btnIniciar.setPreferredSize(new java.awt.Dimension(250, 60));
        btnIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIniciarMouseExited(evt);
            }
        });
        btnIniciar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIniciar.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        lblIniciar.setForeground(new java.awt.Color(255, 255, 255));
        lblIniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIniciar.setText("Iniciar Sesi??n");
        lblIniciar.setMaximumSize(new java.awt.Dimension(220, 60));
        lblIniciar.setMinimumSize(new java.awt.Dimension(220, 60));
        lblIniciar.setPreferredSize(new java.awt.Dimension(220, 60));
        btnIniciar.add(lblIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 250, 40));

        btnReciclar.setBackground(new java.awt.Color(51, 71, 86));
        btnReciclar.setMaximumSize(new java.awt.Dimension(250, 60));
        btnReciclar.setMinimumSize(new java.awt.Dimension(250, 60));
        btnReciclar.setPreferredSize(new java.awt.Dimension(250, 60));
        btnReciclar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReciclarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReciclarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReciclarMouseExited(evt);
            }
        });
        btnReciclar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("??Reciclaremos!");
        btnReciclar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, 228, 36));

        jLabel4.setFont(new java.awt.Font("SF UI Display", 1, 26)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("BIENVENIDO");

        javax.swing.GroupLayout PanelOpcLayout = new javax.swing.GroupLayout(PanelOpc);
        PanelOpc.setLayout(PanelOpcLayout);
        PanelOpcLayout.setHorizontalGroup(
            PanelOpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(PanelOpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReciclar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(PanelOpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelOpcLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        PanelOpcLayout.setVerticalGroup(
            PanelOpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelOpcLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnReciclar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
            .addGroup(PanelOpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelOpcLayout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(362, Short.MAX_VALUE)))
        );

        Fondo.add(PanelOpc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseClicked
        ModuloLogin mLo = new ModuloLogin();
        
        mLo.setSize(new Dimension(1300, 800));
        mLo.setLocation(0,0);
        Main.Fondo.removeAll();
        Main.Fondo.add(mLo, BorderLayout.CENTER);
        Main.Fondo.revalidate();
        Main.Fondo.repaint();
    }//GEN-LAST:event_btnIniciarMouseClicked

    private void btnIniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseEntered
        btnIniciar.setBackground(new Color(48, 105, 147));
    }//GEN-LAST:event_btnIniciarMouseEntered

    private void btnIniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseExited
        btnIniciar.setBackground(new Color(51,71,86));
    }//GEN-LAST:event_btnIniciarMouseExited

    private void btnReciclarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReciclarMouseClicked
        if(maqMod.atascoMaqui() == 1){
            Entidad.almacen alma1Pla = new almacen();
            Entidad.almacen alma2Lat = new almacen();
            Entidad.almacen alma3Car = new almacen();
            Entidad.almacen alma4Vid = new almacen();
            Entidad.almacen alma5Bat = new almacen();
            alma1Pla = almaMod.validarAlmacen(1);
            alma2Lat = almaMod.validarAlmacen(2);
            alma3Car = almaMod.validarAlmacen(3);
            alma4Vid = almaMod.validarAlmacen(4);
            alma5Bat = almaMod.validarAlmacen(5);
            
            if(alma1Pla.getAlmaNumProd() >= alma1Pla.getAlmaLimProd() && alma2Lat.getAlmaNumProd() >= alma2Lat.getAlmaLimProd() && alma3Car.getAlmaNumProd() >= alma3Car.getAlmaLimProd() && alma4Vid.getAlmaNumProd() >= alma4Vid.getAlmaLimProd() && alma5Bat.getAlmaNumProd() >= alma5Bat.getAlmaLimProd()){
                ImageIcon ico = new ImageIcon("src/Imagen/IconProductos.png");
                    JOptionPane.showMessageDialog(null, " \nEl almacenamiento total de la m??quina se encuentra lleno."
                        + "\nLlamar al Operador: 924667644"
                        + "\ny/o escribir al correo: reciclando.juntos.peru@gmail.com\n ", "??Almacenamiento Lleno!", JOptionPane.WARNING_MESSAGE, ico);
            }else{
                ModuloIngProd mPro = new ModuloIngProd();

                mPro.setSize(new Dimension(1300, 800));
                mPro.setLocation(0,0);
                Main.Fondo.removeAll();
                Main.Fondo.add(mPro, BorderLayout.CENTER);
                Main.Fondo.revalidate();
                Main.Fondo.repaint();

                mPro.vector2.setVisible(false);
                mPro.vector3.setVisible(false);
            }
        }else{
            ImageIcon ico = new ImageIcon("src/Imagen/IconJOP.png");
            JOptionPane.showMessageDialog(null, " \nProducto atascado, maquina inutilizable..."
                            + "\nLlamar al Operador: 924667644"
                            + "\ny/o escribir al correo: reciclando.juntos.peru@gmail.com\n ", "??Error en la Maquina!", JOptionPane.WARNING_MESSAGE, ico);
        }
        
    }//GEN-LAST:event_btnReciclarMouseClicked

    private void btnReciclarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReciclarMouseEntered
        btnReciclar.setBackground(new Color(48, 105, 147));
    }//GEN-LAST:event_btnReciclarMouseEntered

    private void btnReciclarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReciclarMouseExited
        btnReciclar.setBackground(new Color(51,71,86));
    }//GEN-LAST:event_btnReciclarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel Fondo;
    public static javax.swing.JPanel PanelOpc;
    private javax.swing.JPanel btnIniciar;
    private javax.swing.JPanel btnReciclar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblIniciar;
    // End of variables declaration//GEN-END:variables
}
