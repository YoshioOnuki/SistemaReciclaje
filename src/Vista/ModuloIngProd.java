
package Vista;

import Entidad.almacen;
import Entidad.maquina;
import Entidad.producto;
import Modelo.almacenMod;
import Modelo.maquinaMod;
import Modelo.productoMod;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;

/**
 *
 * @author yoshi
 */
public class ModuloIngProd extends javax.swing.JPanel {

    
    Modelo.productoMod modpro = new productoMod();
    Entidad.producto epro = new producto();
    Modelo.maquinaMod maqMod = new maquinaMod();
    Modelo.almacenMod almaMod = new almacenMod();
        
    int cantRegs;
    int regActual = 0;
    DefaultTableModel mpro = new DefaultTableModel();
    int cPlastico = 1;
    int cLata = 1;
    int cCarton = 1;
    int cVidrio = 1;
    int cBateria = 1;
    public static double total=0;
//    public static int contProd=0;
    public static int fila=0;
    public static TableModel tModel;
    
    public ModuloIngProd() {
        initComponents();
        limpiarControles();
        mostrarProductos();
        tablaProd.setRowHeight(25);//Damos un tamaño predeterminado a la tabla
    }
    
    //Limpiamos los campos del producto
    public void limpiarControles() {
        this.txtNombre.setText("Seleccione");
        this.txtPrecio.setText("Seleccione");
        this.txtNombre.setForeground(new Color(140,140,140));
        this.txtPrecio.setForeground(new Color(140,140,140));
    }
    

    //Botones de navegacion para los productos a introducir
    public void navega(int adonde) {
        cantRegs = modpro.SacarContProd() + 2;
        
        if (cantRegs > 0) {
            switch (adonde) {
                case 1:// Boton Siguiente                        
                    ++regActual;
                    if (regActual == cantRegs) {
                        regActual = 1;
                    }
                    break;
                case 2:// Boton Anterior                        
                    --regActual;
                    if (regActual <= 0) {
                        regActual = cantRegs - 1;
                    }
                    break;
            }
            mostrarProductos();
        }
    }
    
    //Mostramos los productos a introducir en la recicladora
    public void mostrarProductos() {
        
        limpiarControles();
        if (cantRegs > 0) {
            
            epro = modpro.validarProducto(regActual);
            this.txtNombre.setText("" + epro.getProdDesc());
            this.txtPrecio.setText(String.format("%.2f", epro.getProdPrec()));
            this.txtNombre.setForeground(new Color(0,0,0));
            this.txtPrecio.setForeground(new Color(0,0,0));
            this.fotoObj.setBackground(new Color(255,255,255));
            this.lblFotoObj.setText("");
            
            if(regActual == 1){
                this.lblFotoObj.setIcon(new ImageIcon("src/Imagen/ProdPlastico.png"));
            }else if(regActual == 2){
                lblFotoObj.setIcon(new ImageIcon("src/Imagen/ProdLata.png"));
            }else if(regActual == 3){
                lblFotoObj.setIcon(new ImageIcon("src/Imagen/ProdCarton.png"));
            }else if(regActual == 4){
                lblFotoObj.setIcon(new ImageIcon("src/Imagen/ProdVidrio.png"));
            }else if(regActual == 5){
                lblFotoObj.setIcon(new ImageIcon("src/Imagen/ProdBaterias.png"));
            }else if(regActual == 6){
                lblFotoObj.setIcon(new ImageIcon("src/Imagen/ProdNulo.png"));
                this.txtNombre.setText("No Válido");
                this.txtPrecio.setText("No Válido");
            }
            
        } 
    }
    
    //Validamos el atasco del producto...
    void validarAtasco(){
        int inicio = 1, fin = 100, estd = 2, a = 1;
        int at = (int) (Math.random() * (inicio - fin + 1) + fin);
        
        if(at >= inicio && at <= 0){
            Object ob = new Object();
            ob = estd;
            a = maqMod.updateAtasco(ob);
        }
    }
    
    //Agrega el producto introducido en la tabla para visualizar el detalle
    void agregarProd(){
        
        if(txtNombre.getText() == "Seleccione" || txtPrecio.getText() == "Seleccione"){
            ImageIcon icon1 = new ImageIcon("src/Imagen/IconTodoRec.png");
            JOptionPane.showMessageDialog(null, "No hay productos para ingresar en la máquina", "¡Maquina Vacía!",JOptionPane.WARNING_MESSAGE, icon1);
        }else{
            if(txtNombre.getText() == "No Válido" || txtPrecio.getText() == "No Válido"){
                ImageIcon icon2 = new ImageIcon("src/Imagen/IconNulo.png");
                JOptionPane.showMessageDialog(null, "Producto introducido No Válido","¡No Válido!", JOptionPane.WARNING_MESSAGE, icon2);
            }else{
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
                
                if(cPlastico + alma1Pla.getAlmaNumProd() >= alma1Pla.getAlmaLimProd() && regActual == 1){
                    ImageIcon ico = new ImageIcon("src/Imagen/IconPlastico.png");
                    JOptionPane.showMessageDialog(null, " \nEl almacenamiento del Plastico se encuentra lleno."
                        + "\nLlamar al Operador: 924667644"
                        + "\ny/o escribir al correo: reciclando.juntos.peru@gmail.com\n ", "¡Almacenamiento Lleno!", JOptionPane.WARNING_MESSAGE, ico);
                }else if(cLata + alma2Lat.getAlmaNumProd() >= alma2Lat.getAlmaLimProd() && regActual == 2){
                    ImageIcon ico = new ImageIcon("src/Imagen/IconLata.png");
                    JOptionPane.showMessageDialog(null, " \nEl almacenamiento de la Lata se encuentra lleno."
                        + "\nLlamar al Operador: 924667644"
                        + "\ny/o escribir al correo: reciclando.juntos.peru@gmail.com\n ", "¡Almacenamiento Lleno!", JOptionPane.WARNING_MESSAGE, ico);
                }else if(cCarton + alma3Car.getAlmaNumProd() >= alma3Car.getAlmaLimProd() && regActual == 3){
                    ImageIcon ico = new ImageIcon("src/Imagen/IconCarton.png");
                    JOptionPane.showMessageDialog(null, " \nEl almacenamiento del Carton se encuentra lleno."
                        + "\nLlamar al Operador: 924667644"
                        + "\ny/o escribir al correo: reciclando.juntos.peru@gmail.com\n ", "¡Almacenamiento Lleno!", JOptionPane.WARNING_MESSAGE, ico);
                }else if(cVidrio + alma4Vid.getAlmaNumProd() >= alma4Vid.getAlmaLimProd() && regActual == 4){
                    ImageIcon ico = new ImageIcon("src/Imagen/IconVidrio.png");
                    JOptionPane.showMessageDialog(null, " \nEl almacenamiento del Vidrio se encuentra lleno."
                        + "\nLlamar al Operador: 924667644"
                        + "\ny/o escribir al correo: reciclando.juntos.peru@gmail.com\n ", "¡Almacenamiento Lleno!", JOptionPane.WARNING_MESSAGE, ico);
                }else if(cBateria + alma5Bat.getAlmaNumProd() >= alma5Bat.getAlmaLimProd() && regActual == 5){
                    ImageIcon ico = new ImageIcon("src/Imagen/IconBateria.png");
                    JOptionPane.showMessageDialog(null, " \nEl almacenamiento de la Batería se encuentra lleno."
                        + "\nLlamar al Operador: 924667644"
                        + "\ny/o escribir al correo: reciclando.juntos.peru@gmail.com\n ", "¡Almacenamiento Lleno!", JOptionPane.WARNING_MESSAGE, ico);
                }else{
                    if(maqMod.atascoMaqui() == 1){
                        validarAtasco();
                        
                        if(maqMod.atascoMaqui() == 2){
                            ImageIcon ico = new ImageIcon("src/Imagen/IconJOP.png");
                            JOptionPane.showMessageDialog(null, " \nProducto atascado, maquina inutilizable..."
                                + "\nLlamar al Operador: 924667644"
                                + "\ny/o escribir al correo: reciclando.juntos.peru@gmail.com\n ", "¡Error en la Maquina!", JOptionPane.WARNING_MESSAGE, ico);
                        }else{
                            String nombre = txtNombre.getText();
                            double precio = Double.parseDouble(txtPrecio.getText());
                            int valida = 1, posProd = 0;
                            double importe;

                            mpro = (DefaultTableModel) tablaProd.getModel();

                            for(int i=0; i<tablaProd.getRowCount(); i++){
                                if(regActual == Integer.parseInt(tablaProd.getValueAt(i, 0).toString())){
                                    valida = 2;
                                    posProd = i;
                                    break;
                                }
                            }

                            Object[] ob = new Object[4];

                            if(valida == 1){
                                ob[0] = regActual;
                                ob[1] = nombre;
                                ob[2] = 1;
                                ob[3] = String.format("%.2f", precio);

                                mpro.addRow(ob);
                                tablaProd.setModel(mpro);
                            }else{
                                switch (regActual) {
                                case 1:
                                    cPlastico++;
                                    importe = cPlastico * precio;
                                    tablaProd.setValueAt(cPlastico, posProd, 2);
                                    tablaProd.setValueAt(String.format("%.2f", importe), posProd, 3);
                                    break;
                                case 2:
                                    cLata++;
                                    importe=cLata * precio;
                                    tablaProd.setValueAt(cLata, posProd, 2);
                                    tablaProd.setValueAt(String.format("%.2f", importe), posProd, 3);
                                    break;
                                case 3:
                                    cCarton++;
                                    importe=cCarton * precio;
                                    tablaProd.setValueAt(cCarton, posProd, 2);
                                    tablaProd.setValueAt(String.format("%.2f", importe), posProd, 3);
                                    break;
                                case 4:
                                    cVidrio++;
                                    importe=cVidrio * precio;
                                    tablaProd.setValueAt(cVidrio, posProd, 2);
                                    tablaProd.setValueAt(String.format("%.2f", importe), posProd, 3);
                                    break;
                                case 5:
                                    cBateria++;
                                    importe=cBateria * precio;
                                    tablaProd.setValueAt(cBateria, posProd, 2);
                                    tablaProd.setValueAt(String.format("%.2f", importe), posProd, 3);
                                    break;
                                }
                            }
                            total += precio;
                            txtTotal.setText("S/."+String.format("%.2f", total));
                        }
                    }else{
                        ImageIcon ico = new ImageIcon("src/Imagen/IconJOP.png");
                        JOptionPane.showMessageDialog(null, " \nProducto atascado, maquina inutilizable..."
                                + "\nLlamar al Operador: 924667644"
                                + "\ny/o escribir al correo: reciclando.juntos.peru@gmail.com\n ", "¡Error en la Maquina!", JOptionPane.WARNING_MESSAGE, ico);
                    }
                }
            }
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        vector1 = new javax.swing.JLabel();
        vector2 = new javax.swing.JLabel();
        vector3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        atras = new javax.swing.JPanel();
        atrasIcon = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        fotoObj = new javax.swing.JPanel();
        lblFotoObj = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        ant = new javax.swing.JPanel();
        antIcon = new javax.swing.JLabel();
        antIconCo = new javax.swing.JLabel();
        sig = new javax.swing.JPanel();
        antIcon1 = new javax.swing.JLabel();
        antIcon1Co = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JPanel();
        lblAgregar1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        texto1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProd = new javax.swing.JTable();
        btnContinuar = new javax.swing.JPanel();
        lblContinuar = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1300, 800));
        setMinimumSize(new java.awt.Dimension(1300, 800));
        setPreferredSize(new java.awt.Dimension(1300, 800));

        jPanel1.setBackground(new java.awt.Color(51, 71, 86));
        jPanel1.setMaximumSize(new java.awt.Dimension(1300, 120));
        jPanel1.setMinimumSize(new java.awt.Dimension(1300, 120));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vector1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Vector.png"))); // NOI18N
        jPanel1.add(vector1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 140, 10));

        vector2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Vector.png"))); // NOI18N
        jPanel1.add(vector2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 140, 10));

        vector3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Vector.png"))); // NOI18N
        jPanel1.add(vector3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 90, 140, 10));

        jLabel3.setFont(new java.awt.Font("SF UI Display", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/separador.png"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(60, 120));
        jLabel3.setMinimumSize(new java.awt.Dimension(60, 120));
        jLabel3.setPreferredSize(new java.awt.Dimension(60, 120));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, -1, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/seccion1.png"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(323, 120));
        jLabel5.setMinimumSize(new java.awt.Dimension(323, 120));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 120));

        jLabel4.setFont(new java.awt.Font("SF UI Display", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/seccion3.png"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(1050, 120));
        jLabel4.setMinimumSize(new java.awt.Dimension(1050, 120));
        jLabel4.setPreferredSize(new java.awt.Dimension(1050, 120));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 326, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/seccion2.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(323, 120));
        jLabel1.setMinimumSize(new java.awt.Dimension(323, 120));
        jLabel1.setPreferredSize(new java.awt.Dimension(323, 120));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 330, 120));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/separador.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, -1, 120));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/separador.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 60, 120));

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

        texto2.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        texto2.setText("Ingrese objeto a reciclar");

        fotoObj.setBackground(new java.awt.Color(210, 232, 212));
        fotoObj.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        fotoObj.setMaximumSize(new java.awt.Dimension(216, 216));
        fotoObj.setMinimumSize(new java.awt.Dimension(216, 216));
        fotoObj.setPreferredSize(new java.awt.Dimension(216, 216));

        lblFotoObj.setFont(new java.awt.Font("SF UI Display", 1, 16)); // NOI18N
        lblFotoObj.setForeground(new java.awt.Color(140, 140, 140));
        lblFotoObj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFotoObj.setText("Seleccione un objeto");
        lblFotoObj.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblFotoObj.setMaximumSize(new java.awt.Dimension(214, 214));
        lblFotoObj.setMinimumSize(new java.awt.Dimension(214, 214));
        lblFotoObj.setPreferredSize(new java.awt.Dimension(214, 214));

        javax.swing.GroupLayout fotoObjLayout = new javax.swing.GroupLayout(fotoObj);
        fotoObj.setLayout(fotoObjLayout);
        fotoObjLayout.setHorizontalGroup(
            fotoObjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fotoObjLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblFotoObj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        fotoObjLayout.setVerticalGroup(
            fotoObjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fotoObjLayout.createSequentialGroup()
                .addComponent(lblFotoObj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lblNombre.setFont(new java.awt.Font("SF UI Display", 0, 20)); // NOI18N
        lblNombre.setText("Nombre : ");

        txtNombre.setFont(new java.awt.Font("SF UI Display", 0, 20)); // NOI18N
        txtNombre.setMaximumSize(new java.awt.Dimension(147, 30));
        txtNombre.setMinimumSize(new java.awt.Dimension(147, 30));
        txtNombre.setPreferredSize(new java.awt.Dimension(147, 30));

        txtPrecio.setFont(new java.awt.Font("SF UI Display", 0, 20)); // NOI18N
        txtPrecio.setMaximumSize(new java.awt.Dimension(147, 30));
        txtPrecio.setMinimumSize(new java.awt.Dimension(147, 30));
        txtPrecio.setPreferredSize(new java.awt.Dimension(147, 30));

        lblPrecio.setFont(new java.awt.Font("SF UI Display", 0, 20)); // NOI18N
        lblPrecio.setText("Precio    : ");

        ant.setBackground(new java.awt.Color(44, 57, 75));
        ant.setMaximumSize(new java.awt.Dimension(40, 40));
        ant.setMinimumSize(new java.awt.Dimension(40, 40));
        ant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                antMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                antMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                antMouseExited(evt);
            }
        });
        ant.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        antIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        antIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/ant.png"))); // NOI18N
        antIcon.setMaximumSize(new java.awt.Dimension(40, 40));
        antIcon.setMinimumSize(new java.awt.Dimension(40, 40));
        antIcon.setPreferredSize(new java.awt.Dimension(40, 40));
        ant.add(antIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        antIconCo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        antIconCo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/antCo.png"))); // NOI18N
        ant.add(antIconCo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        sig.setBackground(new java.awt.Color(44, 57, 75));
        sig.setMaximumSize(new java.awt.Dimension(40, 40));
        sig.setMinimumSize(new java.awt.Dimension(40, 40));
        sig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sigMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sigMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sigMouseExited(evt);
            }
        });
        sig.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        antIcon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        antIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/ant2.png"))); // NOI18N
        antIcon1.setMaximumSize(new java.awt.Dimension(40, 40));
        antIcon1.setMinimumSize(new java.awt.Dimension(40, 40));
        antIcon1.setPreferredSize(new java.awt.Dimension(40, 40));
        sig.add(antIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        antIcon1Co.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        antIcon1Co.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/ant2Co.png"))); // NOI18N
        sig.add(antIcon1Co, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        btnAgregar.setBackground(new java.awt.Color(51, 71, 86));
        btnAgregar.setMaximumSize(new java.awt.Dimension(180, 60));
        btnAgregar.setMinimumSize(new java.awt.Dimension(180, 60));
        btnAgregar.setPreferredSize(new java.awt.Dimension(180, 60));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
        });

        lblAgregar1.setFont(new java.awt.Font("SF UI Display", 1, 20)); // NOI18N
        lblAgregar1.setForeground(new java.awt.Color(255, 255, 255));
        lblAgregar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgregar1.setText("Agregar");

        javax.swing.GroupLayout btnAgregarLayout = new javax.swing.GroupLayout(btnAgregar);
        btnAgregar.setLayout(btnAgregarLayout);
        btnAgregarLayout.setHorizontalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAgregar1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnAgregarLayout.setVerticalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAgregar1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        texto1.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        texto1.setText("Productos a reciclar");

        tablaProd.setFont(new java.awt.Font("SF UI Display", 0, 17)); // NOI18N
        tablaProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID PROD", "DESCRIPCION", "CANTIDAD", "IMPORTE"
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
            tablaProd.getColumnModel().getColumn(2).setMinWidth(100);
            tablaProd.getColumnModel().getColumn(2).setPreferredWidth(100);
            tablaProd.getColumnModel().getColumn(2).setMaxWidth(100);
            tablaProd.getColumnModel().getColumn(3).setMinWidth(100);
            tablaProd.getColumnModel().getColumn(3).setPreferredWidth(100);
            tablaProd.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        btnContinuar.setBackground(new java.awt.Color(51, 71, 86));
        btnContinuar.setMaximumSize(new java.awt.Dimension(180, 60));
        btnContinuar.setMinimumSize(new java.awt.Dimension(180, 60));
        btnContinuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnContinuarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnContinuarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnContinuarMouseExited(evt);
            }
        });

        lblContinuar.setFont(new java.awt.Font("SF UI Display", 1, 20)); // NOI18N
        lblContinuar.setForeground(new java.awt.Color(255, 255, 255));
        lblContinuar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContinuar.setText("Continuar");

        javax.swing.GroupLayout btnContinuarLayout = new javax.swing.GroupLayout(btnContinuar);
        btnContinuar.setLayout(btnContinuarLayout);
        btnContinuarLayout.setHorizontalGroup(
            btnContinuarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
            .addGroup(btnContinuarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnContinuarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnContinuarLayout.setVerticalGroup(
            btnContinuarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(btnContinuarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnContinuarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        lblTotal.setFont(new java.awt.Font("SF UI Display", 0, 20)); // NOI18N
        lblTotal.setText("Total: ");

        txtTotal.setFont(new java.awt.Font("SF UI Display", 0, 20)); // NOI18N
        txtTotal.setText("S/. 0.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(fotoObj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(texto2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblNombre)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(lblPrecio)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(ant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(90, 90, 90)
                                        .addComponent(sig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
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
                                                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)
                                .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(texto2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(60, 60, 60)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(16, 16, 16))
                                    .addComponent(fotoObj, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        ImageIcon ico = new ImageIcon("src/Imagen/IconJOP.png");
        String [] arregloOpc = {"Regresar", "Seguir Reciclando"};
        int op = JOptionPane.showOptionDialog(null, " \n¿Seguro que deseas regresar al menú principal?\n        Perderás todos los datos ingresados.\n ", "¡Espera!", 0, JOptionPane.QUESTION_MESSAGE, ico, arregloOpc, "Seguir Reciclando");
        
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

    private void antMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_antMouseClicked
        navega(2);
    }//GEN-LAST:event_antMouseClicked

    private void antMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_antMouseEntered
        antIcon.setVisible(false);
        antIconCo.setVisible(true);
    }//GEN-LAST:event_antMouseEntered

    private void antMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_antMouseExited
        antIcon.setVisible(true);
        antIconCo.setVisible(false);
    }//GEN-LAST:event_antMouseExited

    private void sigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sigMouseClicked
        navega(1);
    }//GEN-LAST:event_sigMouseClicked

    private void sigMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sigMouseEntered
        antIcon1.setVisible(false);
        antIcon1Co.setVisible(true);
    }//GEN-LAST:event_sigMouseEntered

    private void sigMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sigMouseExited
        antIcon1.setVisible(true);
        antIcon1Co.setVisible(false);
    }//GEN-LAST:event_sigMouseExited

    private void btnContinuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinuarMouseClicked
        tModel = tablaProd.getModel();
        fila = tablaProd.getRowCount();
        if(tablaProd.getRowCount() == 0){
            ImageIcon icon = new ImageIcon("src/Imagen/IconTodoRec.png");
            JOptionPane.showMessageDialog(null, "No se registró productos", "¡Maquina Vacía!",JOptionPane.WARNING_MESSAGE, icon);
        }else{
            ModuloIngCliente mCli = new ModuloIngCliente();

            mCli.setSize(new Dimension(1300, 800));
            mCli.setLocation(0,0);
            Main.Fondo.removeAll();
            Main.Fondo.add(mCli, BorderLayout.CENTER);
            Main.Fondo.revalidate();
            Main.Fondo.repaint();

            mCli.vector1.setVisible(false);
            mCli.vector3.setVisible(false);
        }
        
        
    }//GEN-LAST:event_btnContinuarMouseClicked

    private void btnContinuarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinuarMouseEntered
        btnContinuar.setBackground(new Color(48, 105, 147));
    }//GEN-LAST:event_btnContinuarMouseEntered

    private void btnContinuarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinuarMouseExited
        btnContinuar.setBackground(new Color(51,71,86));
    }//GEN-LAST:event_btnContinuarMouseExited

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        agregarProd();
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        btnAgregar.setBackground(new Color(48, 105, 147));
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        btnAgregar.setBackground(new Color(51,71,86));
    }//GEN-LAST:event_btnAgregarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ant;
    private javax.swing.JLabel antIcon;
    private javax.swing.JLabel antIcon1;
    private javax.swing.JLabel antIcon1Co;
    private javax.swing.JLabel antIconCo;
    private javax.swing.JPanel atras;
    private javax.swing.JLabel atrasIcon;
    private javax.swing.JPanel btnAgregar;
    private javax.swing.JPanel btnContinuar;
    private javax.swing.JPanel fotoObj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAgregar1;
    private javax.swing.JLabel lblContinuar;
    private javax.swing.JLabel lblFotoObj;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    public static javax.swing.JLabel lblTotal;
    private javax.swing.JPanel sig;
    public static javax.swing.JTable tablaProd;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    public static javax.swing.JLabel txtNombre;
    public static javax.swing.JLabel txtPrecio;
    public static javax.swing.JLabel txtTotal;
    public static javax.swing.JLabel vector1;
    public static javax.swing.JLabel vector2;
    public static javax.swing.JLabel vector3;
    // End of variables declaration//GEN-END:variables
}
