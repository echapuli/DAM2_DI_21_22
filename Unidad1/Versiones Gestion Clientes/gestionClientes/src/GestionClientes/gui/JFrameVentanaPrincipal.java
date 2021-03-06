/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionClientes.gui;
import javax.swing.table.DefaultTableModel;
import GestionClientes.dto.Cliente;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author Eduardo
 */
public class JFrameVentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFrameVentanaPrincipal
     */
    public JFrameVentanaPrincipal(){
        initComponents();
        InicializarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */ 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jLabelError = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuAlta = new javax.swing.JMenu();
        jMenuItemAlta = new javax.swing.JMenuItem();
        jMenuItemBorrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableClientes.setDragEnabled(true);
        jScrollPane1.setViewportView(jTableClientes);

        jLabelError.setForeground(new java.awt.Color(255, 0, 51));
        jLabelError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jMenuAlta.setText("Clientes");
        jMenuAlta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAltaMouseClicked(evt);
            }
        });

        jMenuItemAlta.setText("Alta...");
        jMenuItemAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAltaActionPerformed(evt);
            }
        });
        jMenuAlta.add(jMenuItemAlta);

        jMenuItemBorrar.setText("Borrar");
        jMenuItemBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBorrarActionPerformed(evt);
            }
        });
        jMenuAlta.add(jMenuItemBorrar);

        jMenuBar.add(jMenuAlta);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jLabelError, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelError, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAltaActionPerformed
        jLabelError.setText("");
        JDialogAlta DialogoAlta = new JDialogAlta(this, true);
        DialogoAlta.setVisible(true);
    }//GEN-LAST:event_jMenuItemAltaActionPerformed

    private void jMenuItemBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBorrarActionPerformed
        jLabelError.setText("");
        DefaultTableModel dtm = (DefaultTableModel) jTableClientes.getModel();
        if (jTableClientes.getSelectedRow() == -1) {
            jLabelError.setText("Selecciona un Cliente");
        } else {
            dtm.removeRow(jTableClientes.getSelectedRow());
        }

    }//GEN-LAST:event_jMenuItemBorrarActionPerformed

    private void jMenuAltaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAltaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuAltaMouseClicked
    private void InicializarTabla(){
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new String[]{"Nombre","Apellidos","fecha Alta","Provincia"});
        jTableClientes.setModel(dtm);
    }
    public void addCliente(Cliente cliente){
        DefaultTableModel dtm=(DefaultTableModel) jTableClientes.getModel();
        dtm.addRow(cliente.ClienteArray());
    }

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
            java.util.logging.Logger.getLogger(JFrameVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameVentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelError;
    private javax.swing.JMenu jMenuAlta;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItemAlta;
    private javax.swing.JMenuItem jMenuItemBorrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClientes;
    // End of variables declaration//GEN-END:variables
}
