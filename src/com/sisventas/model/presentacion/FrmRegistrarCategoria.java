/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.sisventas.model.presentacion;

import com.sisventas.model.beans.Categoria;
import com.sisventas.model.logic.CategoriaLogic;
import java.awt.Color;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Jean Paul
 */
public class FrmRegistrarCategoria extends javax.swing.JDialog {
    private Categoria categoria;
    private ImageIcon imagen;
    private Icon icono;
    private Border border1 = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.RED);
    private Border border = BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLACK);
    /**
     * Creates new form FrmRegistrarCategoria
     */
    public FrmRegistrarCategoria(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        cargarLista();
        this.pintarImagen(lblfondo, "src/imagenes/fondop.jpg");
        this.pintarImagen(lbltelefonos, "src/imagenes/telefonos.png");
        this.pintarImagen(lblcargador, "src/imagenes/cargador.png");
        this.pintarImagen(lblvidrio, "src/imagenes/vidrios.png");
        this.pintarImagen(lblaudifonos, "src/imagenes/audifonos.png");
        this.pintarImagen(lblfunda, "src/imagenes/funda.png");
        txtcodigo.setBorder(border1);
        txtnombre.setBorder(border1);
        jPanel1.setBorder(border);
        lstcategorias.setBorder(border);
    }
    
    private void cargarLista(){
        this.modelListCat = CategoriaLogic.listModelCategoria();
        lstcategorias.setModel(modelListCat);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnregresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstcategorias = new javax.swing.JList<>();
        btnagregar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        lblfunda = new javax.swing.JLabel();
        lblaudifonos = new javax.swing.JLabel();
        lblvidrio = new javax.swing.JLabel();
        lblcargador = new javax.swing.JLabel();
        lbltelefonos = new javax.swing.JLabel();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Registrar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 54, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Categoria");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        lstcategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstcategoriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstcategorias);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 150, 270));

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
        getContentPane().add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 120, -1));

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
        getContentPane().add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 120, -1));

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
        getContentPane().add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 120, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Codigo:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 40));

        txtcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigoKeyTyped(evt);
            }
        });
        jPanel1.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 119, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 85, -1, -1));
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 119, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 240, 140));
        getContentPane().add(lblfunda, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 130, 160));
        getContentPane().add(lblaudifonos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 150, 210));
        getContentPane().add(lblvidrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 120, 150));
        getContentPane().add(lblcargador, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 160, 110));
        getContentPane().add(lbltelefonos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 330, 190));
        getContentPane().add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        try{
            int codigo = Integer.parseInt(txtcodigo.getText());
            String nombre = txtnombre.getText();
            categoria = new Categoria(codigo, nombre);
            
            if(CategoriaLogic.insertarCategoria(categoria)){
                JOptionPane.showMessageDialog(this, "Se inserto correctamente");
            }else{
                JOptionPane.showMessageDialog(this, "No se pudo insertar");
            }
            this.cargarLista();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Primero llene todos los campos");
        }
        txtcodigo.setText("");
        txtnombre.setText("");
    }//GEN-LAST:event_btnagregarActionPerformed

    private void lstcategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstcategoriasMouseClicked
        int op = lstcategorias.getSelectedIndex();
        categoria = (Categoria) modelListCat.getElementAt(op);
         
        txtcodigo.setText(String.valueOf(categoria.getIdcategoria()));
        txtnombre.setText(categoria.getNombre());
    }//GEN-LAST:event_lstcategoriasMouseClicked

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        try {
            String nombre = txtnombre.getText();
            int codigo = Integer.parseInt(txtcodigo.getText());
            categoria = new Categoria(codigo, nombre);
            if(CategoriaLogic.modificarCategoria(categoria)){
                JOptionPane.showMessageDialog(this, "Se modifico Correctamente");
            }else{
                JOptionPane.showMessageDialog(this, "No se pudo modificar");
            }
            this.cargarLista();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Primero seleccione una fila");
        }
        txtcodigo.setText("");
        txtnombre.setText("");
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        try {
            int codigo = Integer.parseInt(txtcodigo.getText());
            if(CategoriaLogic.eliminarCategoria(codigo)){
                JOptionPane.showMessageDialog(this, "Categoria Eliminada");
            }else{
                JOptionPane.showMessageDialog(this, "Ocurrio un error");
            }
            this.cargarLista();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Primero seleccione una fila");
        }
        txtcodigo.setText("");
        txtnombre.setText("");
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnregresarActionPerformed

    private void txtcodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c))
            evt.consume();
    }//GEN-LAST:event_txtcodigoKeyTyped

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
            java.util.logging.Logger.getLogger(FrmRegistrarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmRegistrarCategoria dialog = new FrmRegistrarCategoria(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblaudifonos;
    private javax.swing.JLabel lblcargador;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JLabel lblfunda;
    private javax.swing.JLabel lbltelefonos;
    private javax.swing.JLabel lblvidrio;
    private javax.swing.JList<String> lstcategorias;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
    private DefaultListModel modelListCat;
}
