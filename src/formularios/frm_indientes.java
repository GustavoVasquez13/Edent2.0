/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import Clases.IsertarDatosBD2;
import Clases.internalFrameImagen;
import static formularios.frmPrincipal.Dpanel;


/**
 *
 * @author marvi
 */
public class frm_indientes extends internalFrameImagen {

    /**
     * Creates new form frm_indientes
     */
    public frm_indientes() {
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

        grup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jdiente = new javax.swing.JComboBox<>();
        jpc = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdes = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbid = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbnombre = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbfecha = new javax.swing.JLabel();
        ja = new javax.swing.JCheckBox();
        jn = new javax.swing.JCheckBox();
        btnGuardar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setText("Elegir dientes");

        jpc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CENTRAL", "SUPERIOR", "INFERIOR", "LATERAL DERECHO", "LATERAL IZQUIERDO" }));
        jpc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpcActionPerformed(evt);
            }
        });

        jLabel2.setText("Pocicion");

        txtdes.setColumns(20);
        txtdes.setRows(5);
        jScrollPane1.setViewportView(txtdes);

        jLabel3.setText("Descricion");

        jLabel4.setText("Numero de expediente");

        jLabel5.setText("Nombre");

        jLabel6.setText("Fecha");

        grup.add(ja);
        ja.setText("Adulto");
        ja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaActionPerformed(evt);
            }
        });

        grup.add(jn);
        jn.setText("Niño");
        jn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnActionPerformed(evt);
            }
        });

        btnGuardar.setForeground(new java.awt.Color(0, 0, 204));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("");
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnsalir.setForeground(new java.awt.Color(0, 0, 204));
        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.setToolTipText("");
        btnsalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnsalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setText("Formulario para agregar Dientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel3)
                        .addGap(597, 643, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ja)
                                .addGap(18, 18, 18)
                                .addComponent(jn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbid, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jdiente, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jpc, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(48, 48, 48))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(192, 192, 192))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(lbnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(lbid, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ja)
                    .addComponent(jn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jdiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void validar(){
 int i=11;
 if(this.ja.isSelected()==true){
     jdiente.removeAllItems();
 while(i<19)
    {
    jdiente.addItem(String.valueOf(i));
    i++;
    } i=21;
      while(i<29)
{
    jdiente.addItem(String.valueOf(i));
    i++;
} i=31;
      while(i<39)
{
    jdiente.addItem(String.valueOf(i));
    i++;
}    i=41;
      while(i<49)
{
    jdiente.addItem(String.valueOf(i));
    i++;
}
        }
if(this.jn.isSelected()==true){
    jdiente.removeAllItems();
    i=51;
 while(i<56)
    {
    jdiente.addItem(String.valueOf(i));
    i++;
    } i=61;
      while(i<66)
{
    jdiente.addItem(String.valueOf(i));
    i++;
} i=71;
      while(i<76)
{
    jdiente.addItem(String.valueOf(i));
    i++;
}    i=81;
      while(i<86)
{
    jdiente.addItem(String.valueOf(i));
    i++;
}
        }
}
    private void jpcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpcActionPerformed

    private void jaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaActionPerformed
validar(); // TODO add your handling code here:
    }//GEN-LAST:event_jaActionPerformed

    private void jnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnActionPerformed
validar();        // TODO add your handling code here:
    }//GEN-LAST:event_jnActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // se crean variables para guardar en ellas los datos recibidos de los jtextfield
        String id = lbid.getText();
        String dien = String.valueOf(jdiente.getSelectedItem());
        String poc = String.valueOf(jpc.getSelectedItem());
        String desc = txtdes.getText().toUpperCase();
        String fecha = lbfecha.getText();
       
        // se crean variables para almacenar en ellas el dia mes y año que se obtienen del control jcalendar
       
        //se crea un objeto de la clase Insertar Datos, en este objeto se almacenaran y enviaran
        //a la clase los parametros obtenidos por los jtextfield
        IsertarDatosBD2 insertar2 = new IsertarDatosBD2();
        insertar2.insertDiente(id, dien, poc, fecha, desc);
        //se manda a llamar el metodo para limpiar los jtextfield despues de cada click en el boton guardar
        this.dispose();
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnsalir;
    private javax.swing.ButtonGroup grup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox ja;
    private javax.swing.JComboBox<String> jdiente;
    private javax.swing.JCheckBox jn;
    private javax.swing.JComboBox<String> jpc;
    public static javax.swing.JLabel lbfecha;
    public static javax.swing.JLabel lbid;
    public static javax.swing.JLabel lbnombre;
    private javax.swing.JTextArea txtdes;
    // End of variables declaration//GEN-END:variables
}
