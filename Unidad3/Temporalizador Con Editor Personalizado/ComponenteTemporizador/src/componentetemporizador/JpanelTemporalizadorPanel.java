/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentetemporizador;

import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author eduardo
 */
public class JpanelTemporalizadorPanel extends javax.swing.JPanel {

    private Color colorFin = Color.BLACK;
    private String fileFin = "";

    /**
     * Creates new form JpanelTemporalizadorPanel
     */
    public JpanelTemporalizadorPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTMilisegundos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTTextoFin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTColorFin = new javax.swing.JTextField();
        jBSColorFin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jCMostrarDecimales = new javax.swing.JCheckBox();
        jPanelImagen = new javax.swing.JPanel();

        jLabel1.setText("Número de segundos para la cuenta atrás");

        jTMilisegundos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTMilisegundosKeyTyped(evt);
            }
        });

        jLabel2.setText("Texto que mostrará al finalizar");

        jLabel3.setText("color que mostrará al finalizar");

        jTColorFin.setEnabled(false);

        jBSColorFin.setText("Sel. Color");
        jBSColorFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSColorFinActionPerformed(evt);
            }
        });

        jLabel4.setText("Imagen que mostrará al finalizar");

        jButton1.setText("Sel. Imagen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCMostrarDecimales.setText("Mostrar decimales");

        javax.swing.GroupLayout jPanelImagenLayout = new javax.swing.GroupLayout(jPanelImagen);
        jPanelImagen.setLayout(jPanelImagenLayout);
        jPanelImagenLayout.setHorizontalGroup(
            jPanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 144, Short.MAX_VALUE)
        );
        jPanelImagenLayout.setVerticalGroup(
            jPanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTMilisegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTTextoFin, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTColorFin, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBSColorFin)
                                    .addGap(46, 46, 46)
                                    .addComponent(jCMostrarDecimales, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTMilisegundos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTTextoFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTColorFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSColorFin)
                    .addComponent(jCMostrarDecimales))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jButton1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jPanelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBSColorFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSColorFinActionPerformed
        JColorChooser jc = new JColorChooser();
        colorFin = jc.showDialog(this, "Seleccione un Color", Color.BLACK);
        jTColorFin.setBackground(colorFin);
    }//GEN-LAST:event_jBSColorFinActionPerformed

    private void jTMilisegundosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTMilisegundosKeyTyped
        if ((evt.getKeyChar() < '0') || (evt.getKeyChar() > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_jTMilisegundosKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser jf = new JFileChooser();

        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "JPG & GIF Images", "jpg", "gif");
        jf.setFileFilter(filter);
        int returnVal = jf.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            fileFin = jf.getSelectedFile().getAbsolutePath();
            ImageIcon imageIcon = new ImageIcon(fileFin);
            Graphics g = jPanelImagen.getGraphics();
            g.drawImage(imageIcon.getImage(), 0, 0,jPanelImagen.getWidth(),jPanelImagen.getHeight(), null);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public JpanelTemporalizadorPropiedades devolverValores() {
        Double milisegundos;
        if (jTMilisegundos.getText().equals("")) {
            milisegundos = 0.0;
        } else {
            milisegundos = (Double.parseDouble(jTMilisegundos.getText()));
        }

        return (new JpanelTemporalizadorPropiedades(milisegundos, jTTextoFin.getText(), colorFin, jCMostrarDecimales.isSelected(), fileFin));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSColorFin;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCMostrarDecimales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelImagen;
    private javax.swing.JTextField jTColorFin;
    private javax.swing.JTextField jTMilisegundos;
    private javax.swing.JTextField jTTextoFin;
    // End of variables declaration//GEN-END:variables
}
