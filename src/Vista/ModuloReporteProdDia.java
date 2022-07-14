/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.productoMod;
import static Vista.ModuloIngProd.tablaProd;
import static Vista.ModuloReporteProdTotal.tablaProd;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author yoshi
 */
public class ModuloReporteProdDia extends javax.swing.JPanel {

    DefaultTableModel m = new DefaultTableModel();
    Modelo.productoMod prodMod = new productoMod();
    
    
    public ModuloReporteProdDia() {
        initComponents();
        
    }

    
    void BuscarFecha(){
        try {
            Date f = txtFecNac.getDate();
            DateFormat f2 = new SimpleDateFormat("yyyy-MM-dd");
            String fec = f2.format(f);
            m = prodMod.consultarReporProdDia(fec);
            tablaProd.setModel(m);

            TableColumn t = tablaProd.getColumn("ID PROD");
            t.setPreferredWidth(90);
            t.setMaxWidth(90);
            t.setMinWidth(90);

            TableColumn t2 = tablaProd.getColumn("CANTIDAD");
            t2.setPreferredWidth(120);
            t2.setMaxWidth(120);
            t2.setMinWidth(120);

            TableColumn t3 = tablaProd.getColumn("TOTAL");
            t3.setPreferredWidth(120);
            t3.setMaxWidth(120);
            t3.setMinWidth(120);

            tablaProd.setRowHeight(25);//Damos un tamaño predeterminado a la tabla
        } catch (Exception e) {
            System.out.println("Error al mostrar productos: " + e);
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        atras = new javax.swing.JPanel();
        atrasIcon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProd = new javax.swing.JTable();
        txtFecNac = new com.toedter.calendar.JDateChooser();
        btnBuscar = new javax.swing.JPanel();
        lblBuscar = new javax.swing.JLabel();

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

        jLabel2.setBackground(new java.awt.Color(0, 23, 35));
        jLabel2.setFont(new java.awt.Font("SF UI Display", 1, 36)); // NOI18N
        jLabel2.setText("Productos por día");

        tablaProd.setFont(new java.awt.Font("SF UI Display", 0, 17)); // NOI18N
        tablaProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID PROD", "DESCRIPCION", "CANTIDAD", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
            tablaProd.getColumnModel().getColumn(2).setMinWidth(120);
            tablaProd.getColumnModel().getColumn(2).setPreferredWidth(120);
            tablaProd.getColumnModel().getColumn(2).setMaxWidth(120);
            tablaProd.getColumnModel().getColumn(3).setMinWidth(120);
            tablaProd.getColumnModel().getColumn(3).setPreferredWidth(120);
            tablaProd.getColumnModel().getColumn(3).setMaxWidth(120);
        }

        txtFecNac.setFont(new java.awt.Font("SF UI Display", 0, 17)); // NOI18N
        txtFecNac.setMaximumSize(new java.awt.Dimension(230, 26));
        txtFecNac.setMinimumSize(new java.awt.Dimension(230, 26));
        txtFecNac.setPreferredSize(new java.awt.Dimension(230, 26));

        btnBuscar.setBackground(new java.awt.Color(51, 71, 86));
        btnBuscar.setMaximumSize(new java.awt.Dimension(150, 50));
        btnBuscar.setMinimumSize(new java.awt.Dimension(150, 50));
        btnBuscar.setPreferredSize(new java.awt.Dimension(150, 50));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
        });

        lblBuscar.setFont(new java.awt.Font("SF UI Display", 1, 20)); // NOI18N
        lblBuscar.setForeground(new java.awt.Color(255, 255, 255));
        lblBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscar.setText("Buscar");

        javax.swing.GroupLayout btnBuscarLayout = new javax.swing.GroupLayout(btnBuscar);
        btnBuscar.setLayout(btnBuscarLayout);
        btnBuscarLayout.setHorizontalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
            .addGroup(btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
        );
        btnBuscarLayout.setVerticalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnBuscarLayout.createSequentialGroup()
                    .addComponent(lblBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1036, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel2)))
                .addContainerGap(144, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFecNac, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(309, 309, 309))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(txtFecNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        ModuloInicio mIni = new ModuloInicio();

        mIni.setSize(new Dimension(1300, 680));
        mIni.setLocation(0,0);
        ModuloOpeDash.Principal.removeAll();
        ModuloOpeDash.Principal.add(mIni, BorderLayout.CENTER);
        ModuloOpeDash.Principal.revalidate();
        ModuloOpeDash.Principal.repaint();
        
        ModuloEncabe mEnca = new ModuloEncabe();

        mEnca.setSize(new Dimension(1300, 200));
        mEnca.setLocation(0,0);
        ModuloOpeDash.Encabe.removeAll();
        ModuloOpeDash.Encabe.add(mEnca, BorderLayout.CENTER);
        ModuloOpeDash.Encabe.revalidate();
        ModuloOpeDash.Encabe.repaint();
    }//GEN-LAST:event_atrasMouseClicked

    private void atrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseEntered
        atras.setBackground(new Color(255, 0, 0));
    }//GEN-LAST:event_atrasMouseEntered

    private void atrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseExited
        atras.setBackground(new Color(200, 42, 42));
    }//GEN-LAST:event_atrasMouseExited

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        BuscarFecha();
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        btnBuscar.setBackground(new Color(48, 105, 147));
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        btnBuscar.setBackground(new Color(51,71,86));
    }//GEN-LAST:event_btnBuscarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel atras;
    public static javax.swing.JLabel atrasIcon;
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblBuscar;
    public static javax.swing.JTable tablaProd;
    private com.toedter.calendar.JDateChooser txtFecNac;
    // End of variables declaration//GEN-END:variables
}
