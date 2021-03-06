/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panelimagen;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author Eduardo
 */
public class ImagenFondoPanel extends javax.swing.JPanel {

    /**
     * Creates new form ImagenFondoPanel
     */
    public ImagenFondoPanel() {
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
        jTextFieldRuta = new javax.swing.JTextField();
        jButtonAbrir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSlideropacidad = new javax.swing.JSlider();
        jLabelMuestra = new javax.swing.JLabel();

        jLabel1.setText("Imagen:");

        jButtonAbrir.setText("....");
        jButtonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirActionPerformed(evt);
            }
        });

        jLabel2.setText("Opacidad:");

        jSlideropacidad.setPaintLabels(true);
        jSlideropacidad.setPaintTicks(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSlideropacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabelMuestra, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAbrir))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSlideropacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addComponent(jLabelMuestra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirActionPerformed
        // Seleccionamos el fichero
        JFileChooser filechooser=new JFileChooser();
        int result=filechooser.showOpenDialog(this);
        if (result==JFileChooser.APPROVE_OPTION){
            File file=filechooser.getSelectedFile();
            jTextFieldRuta.setText(file.getAbsolutePath());
            ImageIcon imageIcon = new ImageIcon(file.getAbsolutePath());
            Image imgEscalada = imageIcon.getImage().getScaledInstance(jLabelMuestra.getWidth(),jLabelMuestra.getHeight(), Image.SCALE_SMOOTH);
            jLabelMuestra.setIcon(new ImageIcon(imgEscalada));
        } 
    }//GEN-LAST:event_jButtonAbrirActionPerformed

    //creamos un m??todo p??blico que devuelva un objeto con los datos de la ventana (objeto de tipo ImagenFondo)
    public ImagenFondo GetValoresSeleccionados(){
        File file=new File(jTextFieldRuta.getText());
        //la opacidad se debe dar con un valor de 0 al 1 por eso debo dividir entre 100
        Float opacidad=jSlideropacidad.getValue()/100f; //poniendo al 100 una f al final hacemos que sea un float y al dividir un entero entre un float se convierte en float
        return new ImagenFondo(file,opacidad); //devuelvo el objeto
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbrir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelMuestra;
    private javax.swing.JSlider jSlideropacidad;
    private javax.swing.JTextField jTextFieldRuta;
    // End of variables declaration//GEN-END:variables
}
