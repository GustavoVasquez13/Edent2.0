/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulariosAyuda;
import Clases.internalFrameImagen;
import java.awt.Color;
/**
 *
 * @author ricar
 */
public class frmayudaEG extends internalFrameImagen {

    /**
     * Creates new form frmayudaEG
     */
    public frmayudaEG() {
        initComponents();
          setImagenw("img2.jpg");
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
        lblCL2 = new javax.swing.JLabel();
        lblCL4 = new javax.swing.JLabel();
        lblReg = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
        lblEdit = new javax.swing.JLabel();
        lblErrores = new javax.swing.JLabel();
        lblCL1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Formulario de Ayuda");

        lblCL2.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N

        lblCL4.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N

        lblReg.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lblReg.setText("Realizar una consulta");
        lblReg.setToolTipText("Click Para Ver la Descripcion del Caso");
        lblReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegMouseExited(evt);
            }
        });

        lblMensaje.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        lblEdit.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lblEdit.setText("Realizar una edicion de datos");
        lblEdit.setToolTipText("Click Para Ver la Descripcion del Caso");
        lblEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEditMouseExited(evt);
            }
        });

        lblErrores.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lblErrores.setText("Posibles Problemas Presentados");
        lblErrores.setToolTipText("Click Para Ver la Descripcion del Caso");
        lblErrores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblErroresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblErroresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblErroresMouseExited(evt);
            }
        });

        lblCL1.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblReg)))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblErrores)
                                .addGap(18, 18, 18)
                                .addComponent(lblCL4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblMensaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblEdit)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblCL2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lblCL1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(lblReg, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(387, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addComponent(lblCL1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCL2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblErrores, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCL4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(26, 26, 26)
                    .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(73, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegMouseClicked
        this.lblMensaje.setText("<html><body><p ALIGN=\"justify\">Para realizar una consulta solo necesita seleccionar <b>en el boton</b> "
            + "Elegir tipo de paciente</p></body></html>");
    }//GEN-LAST:event_lblRegMouseClicked

    private void lblRegMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegMouseEntered
        this.lblReg.setForeground(Color.blue);
        this.lblCL1.setText("Click Aqui");
    }//GEN-LAST:event_lblRegMouseEntered

    private void lblRegMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegMouseExited
        this.lblReg.setForeground(Color.black);
        this.lblCL1.setText("");
    }//GEN-LAST:event_lblRegMouseExited

    private void lblEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditMouseClicked
        this.lblMensaje.setText("<html><body><p ALIGN=\"justify\">Para <b>Para editar los datos de un paciente </b>debe dar click al boton Buscar para Editar "
            + "<b>se mostrara un formulario</b> busque el paciente a editar <b> y de doble click sobre el nombre</b> "
            + "Los datos se cargaran en las <b>Cajas de Texto</b> correspondientes. Luego llenar los campos con la informacion necesaria, "
            + "es obligatorio <b>Seleccionar un Paciente </b> "
            + "para realizar exitosamente <b>la edicion de datos</b>. <br><br>"
            + "Despues debe de dar <b>Click en el boton Ediatr</b> y aparecera un mensaje "
            + "de confirmacion de que la <b>Edicion se realizo correctamente</b></p></body></html>");
    }//GEN-LAST:event_lblEditMouseClicked

    private void lblEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditMouseEntered
        this.lblEdit.setForeground(Color.blue);
        this.lblCL2.setText("Click Aqui");
    }//GEN-LAST:event_lblEditMouseEntered

    private void lblEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditMouseExited
        this.lblEdit.setForeground(Color.black);
        this.lblCL2.setText("");
    }//GEN-LAST:event_lblEditMouseExited

    private void lblErroresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblErroresMouseClicked
        this.lblMensaje.setText("<html><body><p ALIGN=\"justify\"><b>Problemas al Realizar la consulta</b> este tipo de problemas se puede presentar"
            + " cuando se ha perdido la <b>conexion con la base de datos,</b> causando que no se pueda realizar la operacion Solicitada.<br><br>"
            + "Para Solucionar este problema Porfavor Comuniquese con el <b>Administrador de Sistema.</b></p></body></html>");
    }//GEN-LAST:event_lblErroresMouseClicked

    private void lblErroresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblErroresMouseEntered
        this.lblErrores.setForeground(Color.blue);
        this.lblCL4.setText("Click Aqui");
    }//GEN-LAST:event_lblErroresMouseEntered

    private void lblErroresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblErroresMouseExited
        this.lblErrores.setForeground(Color.black);
        this.lblCL4.setText("");
    }//GEN-LAST:event_lblErroresMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCL1;
    private javax.swing.JLabel lblCL2;
    private javax.swing.JLabel lblCL4;
    private javax.swing.JLabel lblEdit;
    private javax.swing.JLabel lblErrores;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblReg;
    // End of variables declaration//GEN-END:variables
}
