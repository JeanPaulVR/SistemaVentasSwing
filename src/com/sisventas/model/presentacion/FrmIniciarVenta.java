/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.sisventas.model.presentacion;

import com.sisventas.model.beans.Cliente;
import com.sisventas.model.beans.DetalleVenta;
import com.sisventas.model.beans.Producto;
import com.sisventas.model.beans.Venta;
import com.sisventas.model.logic.ClienteLogic;
import com.sisventas.model.logic.DetalleVentaLogic;
import com.sisventas.model.logic.ProductoLogic;
import com.sisventas.model.logic.VentaLogic;
import java.awt.Color;
import java.awt.Image;
import java.util.Date;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jean Paul
 */
public class FrmIniciarVenta extends javax.swing.JDialog {
    private DetalleVenta detalle;
    private Venta venta;
    private Cliente cliente;
    private ImageIcon imagen;
    private Icon icono;
    private Border border = BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLACK);
    private Border border1 = BorderFactory.createMatteBorder(3, 3, 3, 3, Color.RED);
    /**
     * Creates new form FrmIniciarVenta
     */
    
    public FrmIniciarVenta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        cargarTablaItem();
        codigoventa();
        this.pintarImagen(lblfondo, "src/imagenes/fondop.jpg");
        jPanel1.setBorder(border);
        jScrollPane1.setBorder(border);
    }
    
    private void cargarTablaItem(){
        tableModel = DetalleVentaLogic.tableModelDetalleventa();
        tblproductos.setModel(tableModel);
    }
    
    private void codigoventa(){
        int codigo;
        codigo = VentaLogic.codigoventa() + 1;
        lblnum.setText(String.valueOf(codigo));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lblnum = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtdnicliente = new javax.swing.JTextField();
        btnbuscarcli = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblnombrecliente = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcodproducto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        btnagregarp = new javax.swing.JButton();
        btnfinalizarv = new javax.swing.JButton();
        lbltotal = new javax.swing.JLabel();
        btncancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblproductos = new javax.swing.JTable();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("N??");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 30, -1));

        lblnum.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblnum.setForeground(new java.awt.Color(0, 0, 0));
        lblnum.setText("1");
        lblnum.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 30, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("DNI Cliente:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 20));

        txtdnicliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdniclienteKeyTyped(evt);
            }
        });
        jPanel1.add(txtdnicliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 100, -1));

        btnbuscarcli.setBackground(new java.awt.Color(255, 255, 255));
        btnbuscarcli.setForeground(new java.awt.Color(0, 0, 0));
        btnbuscarcli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscando.png"))); // NOI18N
        btnbuscarcli.setText("Buscar");
        btnbuscarcli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnbuscarcliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnbuscarcliMouseExited(evt);
            }
        });
        btnbuscarcli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarcliActionPerformed(evt);
            }
        });
        jPanel1.add(btnbuscarcli, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, 20));

        lblnombrecliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblnombrecliente.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblnombrecliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 240, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Cod. Producto:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 20));

        txtcodproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodproductoKeyTyped(evt);
            }
        });
        jPanel1.add(txtcodproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 100, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Cantidad:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, 20));

        txtcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcantidadKeyTyped(evt);
            }
        });
        jPanel1.add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 80, -1));

        btnagregarp.setBackground(new java.awt.Color(255, 255, 255));
        btnagregarp.setForeground(new java.awt.Color(0, 0, 0));
        btnagregarp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carrito-de-compras.png"))); // NOI18N
        btnagregarp.setText("Agregar ");
        btnagregarp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnagregarpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnagregarpMouseExited(evt);
            }
        });
        btnagregarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarpActionPerformed(evt);
            }
        });
        jPanel1.add(btnagregarp, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 80, 630, 155));

        btnfinalizarv.setBackground(new java.awt.Color(255, 255, 255));
        btnfinalizarv.setForeground(new java.awt.Color(0, 0, 0));
        btnfinalizarv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/verificar.png"))); // NOI18N
        btnfinalizarv.setText("Finalizar Venta");
        btnfinalizarv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnfinalizarvMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnfinalizarvMouseExited(evt);
            }
        });
        btnfinalizarv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfinalizarvActionPerformed(evt);
            }
        });
        getContentPane().add(btnfinalizarv, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, -1));

        lbltotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbltotal.setForeground(new java.awt.Color(0, 0, 0));
        lbltotal.setText("0.00");
        getContentPane().add(lbltotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 70, -1));

        btncancelar.setBackground(new java.awt.Color(255, 255, 255));
        btncancelar.setForeground(new java.awt.Color(0, 0, 0));
        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btncancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btncancelarMouseExited(evt);
            }
        });
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 140, 40));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Boleta de Venta");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 300, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Total:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 50, -1));

        tblproductos.setBackground(new java.awt.Color(255, 255, 255));
        tblproductos.setModel(new javax.swing.table.DefaultTableModel(
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
        tblproductos.setSelectionBackground(new java.awt.Color(153, 255, 153));
        tblproductos.setSelectionForeground(new java.awt.Color(0, 0, 153));
        jScrollPane1.setViewportView(tblproductos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 640, 150));
        getContentPane().add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarcliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarcliActionPerformed
        try {
            int dni = Integer.parseInt(txtdnicliente.getText());
            Cliente cliente = ClienteLogic.obtenerCliente(dni);
            lblnombrecliente.setText(cliente.getNombre() + " " + cliente.getApellidos());
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Primero complete el campo del DNI");
        }
    }//GEN-LAST:event_btnbuscarcliActionPerformed

    private void btnagregarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarpActionPerformed
        try {
            double total = Double.parseDouble(lbltotal.getText());
            int codigo = Integer.parseInt(txtcodproducto.getText());
            Producto producto = ProductoLogic.obtenerProducto(codigo);
            int cantidad = Integer.parseInt(txtcantidad.getText());
            detalle = new DetalleVenta(cantidad, producto);
            DetalleVentaLogic.insertarItem(detalle);
            cargarTablaItem();
            lbltotal.setText(String.valueOf(total+detalle.getSubtotal()));
            txtcodproducto.setText("");
            txtcantidad.setText("");
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Llene todos los campos");
        }
    }//GEN-LAST:event_btnagregarpActionPerformed

    private void btnfinalizarvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinalizarvActionPerformed
        try {
            int dni = Integer.parseInt(txtdnicliente.getText());
            cliente = ClienteLogic.obtenerCliente(dni);
            int codigo = Integer.parseInt(lblnum.getText());
            Date fecha = new Date();
            List<DetalleVenta> detalleventa = DetalleVentaLogic.obtenerLista();
            venta = new Venta(cliente, codigo, fecha, detalleventa);
            if(VentaLogic.insertarVenta(venta)){
                DetalleVentaLogic.finalizar();
                JOptionPane.showMessageDialog(this, "Venta Realizada");
            }
            cargarTablaItem();
            txtdnicliente.setText("");
            lblnombrecliente.setText("");
            lbltotal.setText("0.00");
            codigoventa();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Ingrese al menos 1 producto");
        }
    }//GEN-LAST:event_btnfinalizarvActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        try {
            DetalleVentaLogic.finalizar();
            dispose();
            lbltotal.setText("0.00");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
        
    }//GEN-LAST:event_btncancelarActionPerformed

    private void txtdniclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdniclienteKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c))
            evt.consume();
    }//GEN-LAST:event_txtdniclienteKeyTyped

    private void txtcodproductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodproductoKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c))
            evt.consume();
    }//GEN-LAST:event_txtcodproductoKeyTyped

    private void txtcantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c))
            evt.consume();
    }//GEN-LAST:event_txtcantidadKeyTyped

    private void btnbuscarcliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbuscarcliMouseEntered
        btnbuscarcli.setBackground(new Color(50,199,236));
    }//GEN-LAST:event_btnbuscarcliMouseEntered

    private void btnbuscarcliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbuscarcliMouseExited
        btnbuscarcli.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnbuscarcliMouseExited

    private void btnagregarpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnagregarpMouseEntered
        btnagregarp.setBackground(new Color(50,199,236));
    }//GEN-LAST:event_btnagregarpMouseEntered

    private void btnagregarpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnagregarpMouseExited
        btnagregarp.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnagregarpMouseExited

    private void btncancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelarMouseEntered
        btncancelar.setBackground(new Color(255,9,58));
    }//GEN-LAST:event_btncancelarMouseEntered

    private void btncancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelarMouseExited
        btncancelar.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btncancelarMouseExited

    private void btnfinalizarvMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfinalizarvMouseEntered
        btnfinalizarv.setBackground(new Color(30,208,44));
    }//GEN-LAST:event_btnfinalizarvMouseEntered

    private void btnfinalizarvMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfinalizarvMouseExited
        btnfinalizarv.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnfinalizarvMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmIniciarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmIniciarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmIniciarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmIniciarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmIniciarVenta dialog = new FrmIniciarVenta(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    private void pintarImagen(JLabel lbl, String ruta){
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lbl.getWidth(),lbl.getHeight(),Image.SCALE_DEFAULT));
        lbl.setIcon(this.icono);
        this.repaint();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregarp;
    private javax.swing.JButton btnbuscarcli;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnfinalizarv;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JLabel lblnombrecliente;
    private javax.swing.JLabel lblnum;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JTable tblproductos;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcodproducto;
    private javax.swing.JTextField txtdnicliente;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel tableModel;
}
