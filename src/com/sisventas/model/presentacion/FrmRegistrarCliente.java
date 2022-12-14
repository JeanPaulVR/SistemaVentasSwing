/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.sisventas.model.presentacion;

import com.sisventas.model.beans.Cliente;
import com.sisventas.model.logic.ClienteLogic;
import java.awt.Color;
import java.awt.Image;
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
public class FrmRegistrarCliente extends javax.swing.JDialog {
    private Cliente cliente;
    private ImageIcon imagen;
    private Icon icono;
    private Border border = BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLACK);
    private Border border1 = BorderFactory.createMatteBorder(3, 3, 3, 3, Color.RED);
    
    /**
     * Creates new form FrmRegistrarCliente
     */
    public FrmRegistrarCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        cargarTablaCliente();
    }
    
    private void cargarTablaCliente(){
        tablemodel = ClienteLogic.tableModelCliente();
        tblclientes.setModel(tablemodel);
        panelcasillas.setBorder(border);
        panelbotones.setBorder(border);
        txtapellido.setBorder(border1);
        txtdni.setBorder(border1);
        txtnombre.setBorder(border1);
        paneltbl.setBorder(border);
        this.pintarImagen(lblfondo, "src/imagenes/fondop.jpg");
        this.pintarImagen(lblinf, "src/imagenes/fondoinferior.png");
        this.pintarImagen(lblmano, "src/imagenes/telefono.png");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelcasillas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        panelbotones = new javax.swing.JPanel();
        btnagregar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnregresar = new javax.swing.JButton();
        paneltbl = new javax.swing.JScrollPane();
        tblclientes = new javax.swing.JTable();
        lblinf = new javax.swing.JLabel();
        lblmano = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblfondo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelcasillas.setBackground(new java.awt.Color(255, 255, 255));
        panelcasillas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelcasillas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombres:");
        panelcasillas.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));
        panelcasillas.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 137, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Apellidos:");
        panelcasillas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 20));
        panelcasillas.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 137, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("DNI:");
        panelcasillas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 30));

        txtdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdniKeyTyped(evt);
            }
        });
        panelcasillas.add(txtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 137, -1));

        getContentPane().add(panelcasillas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 291, 200));

        panelbotones.setBackground(new java.awt.Color(255, 255, 255));
        panelbotones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnagregar.setBackground(new java.awt.Color(255, 255, 255));
        btnagregar.setForeground(new java.awt.Color(0, 0, 0));
        btnagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cheque.png"))); // NOI18N
        btnagregar.setText("Agregar");
        btnagregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnagregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnagregarMouseExited(evt);
            }
        });
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btnmodificar.setBackground(new java.awt.Color(255, 255, 255));
        btnmodificar.setForeground(new java.awt.Color(0, 0, 0));
        btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        btnmodificar.setText("Modificar");
        btnmodificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnmodificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnmodificarMouseExited(evt);
            }
        });
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btneliminar.setBackground(new java.awt.Color(255, 255, 255));
        btneliminar.setForeground(new java.awt.Color(0, 0, 0));
        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btneliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btneliminarMouseExited(evt);
            }
        });
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelbotonesLayout = new javax.swing.GroupLayout(panelbotones);
        panelbotones.setLayout(panelbotonesLayout);
        panelbotonesLayout.setHorizontalGroup(
            panelbotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelbotonesLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(panelbotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        panelbotonesLayout.setVerticalGroup(
            panelbotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelbotonesLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(btnagregar)
                .addGap(18, 18, 18)
                .addComponent(btneliminar)
                .addGap(18, 18, 18)
                .addComponent(btnmodificar)
                .addGap(23, 23, 23))
        );

        getContentPane().add(panelbotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 160, 200));

        btnregresar.setBackground(new java.awt.Color(255, 255, 255));
        btnregresar.setForeground(new java.awt.Color(0, 0, 0));
        btnregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras (1).png"))); // NOI18N
        btnregresar.setText("Regresar");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        tblclientes.setBackground(new java.awt.Color(255, 255, 255));
        tblclientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblclientes.setForeground(new java.awt.Color(0, 0, 0));
        tblclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblclientes.setToolTipText("");
        tblclientes.setFocusable(false);
        tblclientes.setGridColor(new java.awt.Color(255, 255, 255));
        tblclientes.setRequestFocusEnabled(false);
        tblclientes.setSelectionBackground(new java.awt.Color(153, 255, 153));
        tblclientes.setSelectionForeground(new java.awt.Color(0, 0, 153));
        tblclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblclientesMouseClicked(evt);
            }
        });
        paneltbl.setViewportView(tblclientes);

        getContentPane().add(paneltbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 480, 127));
        getContentPane().add(lblinf, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 260, 290));
        getContentPane().add(lblmano, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 180, 200));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Registrar Nuevo Cliente");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 440, -1));
        getContentPane().add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 510));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 480, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        try {
            int dni = Integer.parseInt(txtdni.getText());
            String nombre = txtnombre.getText();
            String apellido = txtapellido.getText();
            cliente = new Cliente(dni, nombre, apellido);
            if(ClienteLogic.insertarCliente(cliente)){
                JOptionPane.showMessageDialog(this, "Registrado Correctamente");
            }else{
                JOptionPane.showMessageDialog(this, "No se pudo registrar");
            }
            this.cargarTablaCliente();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Llene todos los campos");
        }
        
        txtnombre.setText("");
        txtdni.setText("");
        txtapellido.setText("");
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        try{
            int dni = Integer.parseInt(txtdni.getText());

            if(ClienteLogic.eliminarCliente(dni)){
                JOptionPane.showMessageDialog(this, "Se elimino correctamente");
            }else{
                JOptionPane.showMessageDialog(this, "No se pudo eliminar");
            }
            this.cargarTablaCliente();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Primero seleccione una fila");
        }
        
        txtnombre.setText("");
        txtdni.setText("");
        txtapellido.setText("");
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        try{
            int dni = Integer.parseInt(txtdni.getText());
            String nombre = txtnombre.getText();
            String apellido = txtapellido.getText();
            
            cliente = new Cliente(dni,nombre,apellido);
            
            if(ClienteLogic.modificarCliente(cliente)){
                JOptionPane.showMessageDialog(this, "Se modifico correctamente");
            }else{
                JOptionPane.showMessageDialog(this, "No se pudo modificar");
            }
            this.cargarTablaCliente();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Primero seleccione una fila");
        }
        
        txtnombre.setText("");
        txtdni.setText("");
        txtapellido.setText("");
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnregresarActionPerformed

    private void tblclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblclientesMouseClicked
        int seleccionar = tblclientes.rowAtPoint(evt.getPoint());
        txtdni.setText(String.valueOf(tblclientes.getValueAt(seleccionar,0)));
        txtnombre.setText(String.valueOf(tblclientes.getValueAt(seleccionar,1)));
        txtapellido.setText(String.valueOf(tblclientes.getValueAt(seleccionar,2)));
    }//GEN-LAST:event_tblclientesMouseClicked

    private void txtdniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdniKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c))
            evt.consume();
    }//GEN-LAST:event_txtdniKeyTyped

    private void btnagregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnagregarMouseEntered
        btnagregar.setBackground(new Color(50,199,236));
    }//GEN-LAST:event_btnagregarMouseEntered

    private void btnagregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnagregarMouseExited
        btnagregar.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnagregarMouseExited

    private void btneliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneliminarMouseEntered
        btneliminar.setBackground(new Color(50,199,236));
    }//GEN-LAST:event_btneliminarMouseEntered

    private void btneliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneliminarMouseExited
        btneliminar.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btneliminarMouseExited

    private void btnmodificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmodificarMouseEntered
        btnmodificar.setBackground(new Color(50,199,236));
    }//GEN-LAST:event_btnmodificarMouseEntered

    private void btnmodificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmodificarMouseExited
        btnmodificar.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnmodificarMouseExited

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
            java.util.logging.Logger.getLogger(FrmRegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmRegistrarCliente dialog = new FrmRegistrarCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnregresar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JLabel lblinf;
    private javax.swing.JLabel lblmano;
    private javax.swing.JPanel panelbotones;
    private javax.swing.JPanel panelcasillas;
    private javax.swing.JScrollPane paneltbl;
    private javax.swing.JTable tblclientes;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel tablemodel;
}
