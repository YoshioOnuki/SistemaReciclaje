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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author yoshi
 */
public class ModuloProductos extends javax.swing.JPanel {

    DefaultTableModel m = new DefaultTableModel();
    Modelo.productoMod prodMod = new productoMod();
    
    
    public ModuloProductos() {
        initComponents();
        mostrarProd();
    }

    
    void mostrarProd(){
        try {
            m = prodMod.consultarProductos();
            tablaProd.setModel(m);

            TableColumn t = tablaProd.getColumn("ID PROD");
            t.setPreferredWidth(90);
            t.setMaxWidth(90);
            t.setMinWidth(90);

            TableColumn t2 = tablaProd.getColumn("PRECIO");
            t2.setPreferredWidth(100);
            t2.setMaxWidth(100);
            t2.setMinWidth(100);

            TableColumn t3 = tablaProd.getColumn("ESTADO");
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
        menuProd = new javax.swing.JPopupMenu();
        actualizar = new javax.swing.JMenuItem();
        atras = new javax.swing.JPanel();
        atrasIcon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProd = new javax.swing.JTable();

        actualizar.setFont(new java.awt.Font("SF UI Display", 1, 15)); // NOI18N
        actualizar.setText("Actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        menuProd.add(actualizar);

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
        jLabel2.setText("Productos");

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tablaProd.setFont(new java.awt.Font("SF UI Display", 0, 17)); // NOI18N
        tablaProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID PROD", "DESCRIPCION", "PRECIO", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProd.setComponentPopupMenu(menuProd);
        jScrollPane1.setViewportView(tablaProd);
        if (tablaProd.getColumnModel().getColumnCount() > 0) {
            tablaProd.getColumnModel().getColumn(0).setMinWidth(90);
            tablaProd.getColumnModel().getColumn(0).setPreferredWidth(90);
            tablaProd.getColumnModel().getColumn(0).setMaxWidth(90);
            tablaProd.getColumnModel().getColumn(2).setMinWidth(90);
            tablaProd.getColumnModel().getColumn(2).setPreferredWidth(90);
            tablaProd.getColumnModel().getColumn(2).setMaxWidth(90);
            tablaProd.getColumnModel().getColumn(3).setMinWidth(120);
            tablaProd.getColumnModel().getColumn(3).setPreferredWidth(120);
            tablaProd.getColumnModel().getColumn(3).setMaxWidth(120);
        }

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
                        .addGap(130, 130, 130)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1036, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem actualizar;
    public static javax.swing.JPanel atras;
    public static javax.swing.JLabel atrasIcon;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPopupMenu menuProd;
    public static javax.swing.JTable tablaProd;
    // End of variables declaration//GEN-END:variables
}
