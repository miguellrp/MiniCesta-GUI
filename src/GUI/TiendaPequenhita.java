package GUI;

import Clases.Pedido;
import Clases.Producto;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MIGUEL ROMERO
 */
public class TiendaPequenhita extends javax.swing.JFrame {
    int xMouse, yMouse;
    ArrayList <Producto> listaProductos = new ArrayList <> ();
    ArrayList <Pedido> listaPedidos = new ArrayList <> ();
    DefaultTableModel modeloTablaCesta = new DefaultTableModel();
           
    public TiendaPequenhita() {
        initComponents();
        this.setTitle("Tienda pequeñita");
        this.setPreferredSize(new Dimension(615,615));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        Image logo = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/carrito_logo.png"));
        lblLogo.setIcon(new ImageIcon(logo.getScaledInstance(btnAgregar.getWidth(), btnAgregar.getHeight(), Image.SCALE_SMOOTH)));
        
        Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/ico_carrito.png"));
        this.setIconImage(icono);
        
        Image iconoAgregar = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/agregar.png"));
        lblAgregar.setIcon(new ImageIcon(iconoAgregar.getScaledInstance(btnAgregar.getWidth() - 5 , btnAgregar.getHeight() - 5, Image.SCALE_SMOOTH)));
        
        modeloTablaCesta.addColumn("Descripción");
        modeloTablaCesta.addColumn("Precio");
        modeloTablaCesta.addColumn("Cantidad");
        modeloTablaCesta.addColumn("Importe");
        
        anhadirProductos();
        listarProductos();
        actualizarTabla();
        formatoCeldasTabla();
        calcularImporte();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pXeral = new javax.swing.JPanel();
        lblBarraSuperior = new javax.swing.JPanel();
        btnX = new javax.swing.JPanel();
        lblX = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        cmbProducto = new javax.swing.JComboBox<>();
        lblCantidad = new javax.swing.JLabel();
        spnCantidad = new javax.swing.JSpinner();
        lblPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        lblImporte = new javax.swing.JLabel();
        txtImporte = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JPanel();
        lblAgregar = new javax.swing.JLabel();
        scpTablaCesta = new javax.swing.JScrollPane();
        tblCesta = new javax.swing.JTable();
        lblSubtotal = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        lblIVA = new javax.swing.JLabel();
        txtIVA = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(615, 615));
        setUndecorated(true);

        pXeral.setBackground(new java.awt.Color(248, 235, 235));
        pXeral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBarraSuperior.setBackground(new java.awt.Color(248, 235, 235));
        lblBarraSuperior.setMinimumSize(new java.awt.Dimension(626, 513));
        lblBarraSuperior.setPreferredSize(new java.awt.Dimension(626, 513));
        lblBarraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblBarraSuperiorMouseDragged(evt);
            }
        });
        lblBarraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBarraSuperiorMousePressed(evt);
            }
        });

        btnX.setBackground(new java.awt.Color(248, 235, 235));
        btnX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXMouseClicked(evt);
            }
        });

        lblX.setFont(new java.awt.Font("FiraCode Nerd Font Mono SemBd", 0, 18)); // NOI18N
        lblX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblX.setText("X");
        lblX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblXMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblXMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnXLayout = new javax.swing.GroupLayout(btnX);
        btnX.setLayout(btnXLayout);
        btnXLayout.setHorizontalGroup(
            btnXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnXLayout.createSequentialGroup()
                .addComponent(lblX, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnXLayout.setVerticalGroup(
            btnXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblX, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout lblBarraSuperiorLayout = new javax.swing.GroupLayout(lblBarraSuperior);
        lblBarraSuperior.setLayout(lblBarraSuperiorLayout);
        lblBarraSuperiorLayout.setHorizontalGroup(
            lblBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblBarraSuperiorLayout.createSequentialGroup()
                .addContainerGap(583, Short.MAX_VALUE)
                .addComponent(btnX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        lblBarraSuperiorLayout.setVerticalGroup(
            lblBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblBarraSuperiorLayout.createSequentialGroup()
                .addComponent(btnX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 472, Short.MAX_VALUE))
        );

        pXeral.add(lblBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 40));

        lblLogo.setBackground(new java.awt.Color(255, 255, 255));
        pXeral.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 60, 60));

        lblTitulo.setFont(new java.awt.Font("Hazelnut Milk Tea", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 153, 204));
        lblTitulo.setText("Tienda Pequeñita"); // NOI18N
        pXeral.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 400, 60));

        lblProducto.setFont(new java.awt.Font("FiraCode Nerd Font Mono Light", 0, 12)); // NOI18N
        lblProducto.setText("Producto:");
        pXeral.add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 80, 30));

        cmbProducto.setBackground(new java.awt.Color(254, 222, 254));
        cmbProducto.setFont(new java.awt.Font("FiraCode Nerd Font Mono Light", 0, 12)); // NOI18N
        cmbProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductoActionPerformed(evt);
            }
        });
        pXeral.add(cmbProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 160, 30));

        lblCantidad.setFont(new java.awt.Font("FiraCode Nerd Font Mono Light", 0, 12)); // NOI18N
        lblCantidad.setText("Cantidad:");
        pXeral.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 80, 30));

        spnCantidad.setFont(new java.awt.Font("FiraCode Nerd Font Mono Light", 0, 12)); // NOI18N
        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        spnCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCantidadStateChanged(evt);
            }
        });
        pXeral.add(spnCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 70, 30));

        lblPrecio.setFont(new java.awt.Font("FiraCode Nerd Font Mono Light", 0, 12)); // NOI18N
        lblPrecio.setText("Precio:");
        pXeral.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 70, 30));

        txtPrecio.setEditable(false);
        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setFont(new java.awt.Font("FiraCode Nerd Font Mono Light", 0, 12)); // NOI18N
        txtPrecio.setText("0,00€");
        pXeral.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 120, 30));

        lblImporte.setFont(new java.awt.Font("FiraCode Nerd Font Mono Light", 0, 12)); // NOI18N
        lblImporte.setText("Importe:");
        pXeral.add(lblImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 70, 30));

        txtImporte.setEditable(false);
        txtImporte.setBackground(new java.awt.Color(255, 255, 255));
        txtImporte.setFont(new java.awt.Font("FiraCode Nerd Font Mono Light", 0, 12)); // NOI18N
        txtImporte.setText("0,00€");
        pXeral.add(txtImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 120, 30));

        btnAgregar.setBackground(new java.awt.Color(248, 235, 235));

        lblAgregar.setBackground(new java.awt.Color(248, 235, 235));
        lblAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAgregarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblAgregarMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout btnAgregarLayout = new javax.swing.GroupLayout(btnAgregar);
        btnAgregar.setLayout(btnAgregarLayout);
        btnAgregarLayout.setHorizontalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        btnAgregarLayout.setVerticalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        pXeral.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 60, 60));

        tblCesta.setBackground(new java.awt.Color(254, 222, 254));
        tblCesta.setFont(new java.awt.Font("FiraCode Nerd Font Mono SemBd", 0, 14)); // NOI18N
        tblCesta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCesta.setRowHeight(30);
        tblCesta.setSelectionBackground(new java.awt.Color(255, 153, 255));
        tblCesta.setSelectionForeground(new java.awt.Color(255, 255, 255));
        scpTablaCesta.setViewportView(tblCesta);

        pXeral.add(scpTablaCesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 580, 230));

        lblSubtotal.setFont(new java.awt.Font("FiraCode Nerd Font Mono SemBd", 0, 12)); // NOI18N
        lblSubtotal.setText("SUBTOTAL:");
        pXeral.add(lblSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, 80, 30));

        txtSubtotal.setEditable(false);
        txtSubtotal.setBackground(new java.awt.Color(255, 255, 255));
        txtSubtotal.setFont(new java.awt.Font("FiraCode Nerd Font Mono Light", 0, 12)); // NOI18N
        txtSubtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSubtotal.setText("0,00€");
        txtSubtotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pXeral.add(txtSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, 120, 30));

        lblIVA.setFont(new java.awt.Font("FiraCode Nerd Font Mono SemBd", 0, 12)); // NOI18N
        lblIVA.setText("IVA:");
        pXeral.add(lblIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 520, 80, 30));

        txtIVA.setEditable(false);
        txtIVA.setBackground(new java.awt.Color(255, 255, 255));
        txtIVA.setFont(new java.awt.Font("FiraCode Nerd Font Mono Light", 0, 12)); // NOI18N
        txtIVA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIVA.setText("0,00€");
        txtIVA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pXeral.add(txtIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 120, 30));

        lblTotal.setFont(new java.awt.Font("FiraCode Nerd Font Mono SemBd", 0, 12)); // NOI18N
        lblTotal.setText("TOTAL:");
        pXeral.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, 80, 30));

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(255, 152, 214));
        txtTotal.setFont(new java.awt.Font("FiraCode Nerd Font Mono SemBd", 0, 12)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.setText("0,00€");
        txtTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 255), 2, true));
        pXeral.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 560, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pXeral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pXeral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBarraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBarraSuperiorMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_lblBarraSuperiorMousePressed

    private void lblBarraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBarraSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_lblBarraSuperiorMouseDragged

    private void lblXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXMouseEntered
        btnX.setBackground(new Color(255, 152, 214));
        lblX.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblXMouseEntered

    private void lblXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXMouseExited
        btnX.setBackground(new Color(248,235,235));
        lblX.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblXMouseExited

    private void btnXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnXMouseClicked

    private void lblXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblXMouseClicked

    private void lblAgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarMousePressed
        lblAgregar.setBorder(BorderFactory.createEtchedBorder());
        
        Producto productoSeleccionado = listaProductos.get(cmbProducto.getSelectedIndex());
        int cantidad = Integer.parseInt(spnCantidad.getValue().toString());
        float precio = productoSeleccionado.getPrecio();
        Pedido pedidoNuevo = new Pedido(
            productoSeleccionado.getId(),
            productoSeleccionado.getDescripcion(),
            precio,
            cantidad,
            (precio * cantidad)
        );
        
        if (pedidoIdentico(pedidoNuevo) == false)
            listaPedidos.add(pedidoNuevo);   
            
        actualizarTabla();
        calcularPrecioFinal();
        valoresPorDefecto();
    }//GEN-LAST:event_lblAgregarMousePressed

    private void lblAgregarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarMouseReleased
        lblAgregar.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
    }//GEN-LAST:event_lblAgregarMouseReleased

    private void spnCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCantidadStateChanged
        calcularImporte();
    }//GEN-LAST:event_spnCantidadStateChanged

    private void cmbProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProductoActionPerformed
        calcularImporte();
    }//GEN-LAST:event_cmbProductoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TiendaPequenhita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAgregar;
    private javax.swing.JPanel btnX;
    private javax.swing.JComboBox<String> cmbProducto;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JPanel lblBarraSuperior;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblIVA;
    private javax.swing.JLabel lblImporte;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblX;
    private javax.swing.JPanel pXeral;
    private javax.swing.JScrollPane scpTablaCesta;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTable tblCesta;
    private javax.swing.JTextField txtIVA;
    private javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    public final void anhadirProductos() {
        Producto cocacolita = new Producto(
            1,
            "Cocacolita",
            0.89f
        );
        
        Producto aguita = new Producto(
            2,
            "Agüita fresquita",
            1.49f
        );
        
        Producto velita = new Producto(
            3,
            "Velita",
            0.99f
        );
        
        Producto tirita = new Producto(
            4,
            "Tirita",
            0.08f
        );
        
        Producto cigarrito = new Producto(
            5,
            "Cigarrito",
            0.23f
        );
        
        Producto chocolatito = new Producto(
            6,
            "Chocolatito",
            1.01f
        );
        
        Producto palillito = new Producto(
            7,
            "Palillito",
            0.05f
        );
        
        Producto pipitas = new Producto(
            8,
            "Bolsa de pipitas",
            1.65f
        );
        
        
        listaProductos.add(cocacolita);
        listaProductos.add(aguita);
        listaProductos.add(velita);
        listaProductos.add(tirita);
        listaProductos.add(cigarrito);
        listaProductos.add(chocolatito);
        listaProductos.add(palillito);
        listaProductos.add(pipitas);
    }
    
    public final void listarProductos() {
        String [] descripcionesProductos = new String [8];

        // Se añaden los productos disponibles a la lista para poder ser seleccionados
        int iterador = 0;
        for (Producto producto: listaProductos) {
            descripcionesProductos[iterador]=producto.getDescripcion();
            iterador++;
        }

        DefaultComboBoxModel dcmListaProdutos = new DefaultComboBoxModel(descripcionesProductos);
        cmbProducto.setModel(dcmListaProdutos);
    }
    
    public final void calcularImporte() {
        float precio = listaProductos.get(cmbProducto.getSelectedIndex()).getPrecio();
        int cantidad = Integer.parseInt(spnCantidad.getValue().toString());
        float importe = precio * cantidad;
        
        txtPrecio.setText(String.format("%.2f", precio) + "€");
        txtImporte.setText(String.format("%.2f", importe) + "€");
    }
    
    public final void actualizarTabla() {
        while(modeloTablaCesta.getRowCount() > 0)
            modeloTablaCesta.removeRow(0);
        
        for (Pedido pedidoActual : listaPedidos) {
            Object pedido[] = new Object[4];
            pedido[0] = pedidoActual.getDescripcion();
            pedido[1] = String.format("%.2f",pedidoActual.getPrecio()) + "€";
            pedido[2] = pedidoActual.getCantidad();
            pedido[3] = String.format("%.2f",pedidoActual.getImporte()) + "€";
            
            modeloTablaCesta.addRow(pedido);
        }
        
        
        
        tblCesta.setModel(modeloTablaCesta);
    }
    
    public final void calcularPrecioFinal() {
        float subtotal = 0f;
        
        for (Pedido pedido : listaPedidos) {
            subtotal += pedido.getImporte();
        }
        
        txtSubtotal.setText(String.format("%.2f", subtotal) + "€");
        
        float IVA = subtotal * 0.21f;
        float total = subtotal + IVA;
        
        txtIVA.setText(String.format("%.2f", IVA) + "€");
        txtTotal.setText(String.format("%.2f", total) + "€");
    }
    
    public final boolean pedidoIdentico(Pedido pedidoComprobado) {
        for (Pedido pedido: listaPedidos) {
            if (pedido.getId() == pedidoComprobado.getId()){
                int nuevaCantidad = pedido.getCantidad() + pedidoComprobado.getCantidad();
                pedido.setCantidad(nuevaCantidad);
                pedido.setImporte(pedido.getPrecio() * nuevaCantidad);
                return true;
            }
        }
        return false;
    }
    
    public final void valoresPorDefecto() {
        spnCantidad.setValue(1);
    }
    
    public final void formatoCeldasTabla() {
        int numColumna = 0;
        
        while(numColumna < tblCesta.getColumnCount()){
            DefaultTableCellRenderer centroRenderer = new DefaultTableCellRenderer();
            centroRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
            tblCesta.getColumnModel().getColumn(numColumna).setCellRenderer(centroRenderer);
            numColumna++;
        }
        
        tblCesta.getColumnModel().getColumn(0).setPreferredWidth(180);
        tblCesta.getColumnModel().getColumn(1).setPreferredWidth(50);
        tblCesta.getColumnModel().getColumn(2).setPreferredWidth(50);
        tblCesta.getColumnModel().getColumn(3).setPreferredWidth(50);
    }
}