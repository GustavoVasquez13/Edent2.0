/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormularioDetalleCon;

import Clases.internalFrameImagen;

/**
 *
 * @author marvi
 */
public class DetalleConsulta extends internalFrameImagen {

    /**
     * Creates new form DetalleConsulta
     */
    public DetalleConsulta() {
        initComponents();
        setImagenw("img.jpg");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblnombre4 = new javax.swing.JLabel();
        idconsulta = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbid = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lbnombre = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        lblnombre1 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        txtMotivoC = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        lblnombre2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        txtHistoriaM = new javax.swing.JTextField();
        lblidc = new javax.swing.JLabel();
        jfecha = new com.toedter.calendar.JDateChooser();
        txtExamenC = new javax.swing.JTextField();
        lblnombre5 = new javax.swing.JLabel();
        txtDX = new javax.swing.JTextField();
        lblnombre6 = new javax.swing.JLabel();
        txtpresupuesto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblnombre3 = new javax.swing.JLabel();
        txtHistoriaO = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblnombre4.setForeground(new java.awt.Color(255, 255, 255));
        lblnombre4.setText("Examen Clinico:");
        getContentPane().add(lblnombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 234, 120, -1));

        idconsulta.setForeground(new java.awt.Color(255, 255, 255));
        idconsulta.setText("...");
        getContentPane().add(idconsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 24, -1, -1));

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 402, 20, 23));

        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 402, 20, 23));

        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 20, -1));
        getContentPane().add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 392, 20, 23));
        getContentPane().add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 412, 20, -1));

        jLabel5.setText("Posicion de diente");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 402, -1, -1));

        jLabel6.setText("nombre del diente");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 402, -1, -1));

        jLabel7.setText("nombre");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 402, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 45, -1, -1));

        jLabel8.setText("Tipo de diente");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 402, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 51, -1, -1));

        jLabel9.setText("tipo");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 402, -1, -1));

        lbid.setForeground(new java.awt.Color(0, 102, 153));
        getContentPane().add(lbid, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 44, 89, 19));

        jButton1.setText("selecionar diente");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 398, -1, -1));

        lbnombre.setForeground(new java.awt.Color(0, 102, 153));
        getContentPane().add(lbnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 45, 210, 18));

        jRadioButton1.setText("relleno");
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 451, -1, -1));

        lblnombre1.setForeground(new java.awt.Color(255, 255, 255));
        lblnombre1.setText("Motivo de la Consulta: ");
        getContentPane().add(lblnombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 77, -1, -1));

        jRadioButton2.setText("extraccion");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 451, -1, -1));

        txtMotivoC.setEnabled(false);
        txtMotivoC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMotivoCKeyPressed(evt);
            }
        });
        getContentPane().add(txtMotivoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 67, 350, -1));

        jButton2.setText("guardar");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 467, -1, -1));

        lblnombre2.setForeground(new java.awt.Color(255, 255, 255));
        lblnombre2.setText("Historia Medica:");
        getContentPane().add(lblnombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 116, 126, -1));

        jButton3.setText("salir");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 467, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID consulta");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 70, -1, -1));

        jButton4.setText("elegir consulta");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 15, -1, -1));

        txtHistoriaM.setEnabled(false);
        txtHistoriaM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHistoriaMKeyPressed(evt);
            }
        });
        getContentPane().add(txtHistoriaM, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 106, 350, 50));

        lblidc.setForeground(new java.awt.Color(255, 255, 255));
        lblidc.setText("...");
        getContentPane().add(lblidc, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 70, -1, -1));

        jfecha.setDateFormatString("yyyy-MM-dd");
        jfecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jfechaKeyPressed(evt);
            }
        });
        getContentPane().add(jfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 45, 110, -1));

        txtExamenC.setEnabled(false);
        txtExamenC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtExamenCKeyPressed(evt);
            }
        });
        getContentPane().add(txtExamenC, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 234, 350, -1));

        lblnombre5.setForeground(new java.awt.Color(255, 255, 255));
        lblnombre5.setText("DX Odontologico:");
        getContentPane().add(lblnombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 265, 130, -1));

        txtDX.setEnabled(false);
        txtDX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDXKeyPressed(evt);
            }
        });
        getContentPane().add(txtDX, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 265, 350, 70));

        lblnombre6.setForeground(new java.awt.Color(255, 255, 255));
        lblnombre6.setText("Presupuesto:");
        getContentPane().add(lblnombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 345, 110, 20));

        txtpresupuesto.setEnabled(false);
        txtpresupuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpresupuestoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpresupuestoKeyTyped(evt);
            }
        });
        getContentPane().add(txtpresupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 345, 350, 29));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Numero de expediente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, -1, -1));

        lblnombre3.setForeground(new java.awt.Color(255, 255, 255));
        lblnombre3.setText("Historia Odontologica:");
        getContentPane().add(lblnombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 167, -1, -1));

        txtHistoriaO.setEnabled(false);
        txtHistoriaO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHistoriaOKeyPressed(evt);
            }
        });
        getContentPane().add(txtHistoriaO, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 167, 350, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void txtMotivoCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMotivoCKeyPressed

    }//GEN-LAST:event_txtMotivoCKeyPressed

    private void txtHistoriaMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHistoriaMKeyPressed

    }//GEN-LAST:event_txtHistoriaMKeyPressed

    private void jfechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jfechaKeyPressed
        //        this.jfecha.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
            //            java.util.Collections.EMPTY_SET);
        //        if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            //            txttelefono.requestFocus();
            //            this.txttelefono.setBackground(Color.LIGHT_GRAY);
            //        }
    }//GEN-LAST:event_jfechaKeyPressed

    private void txtExamenCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExamenCKeyPressed

    }//GEN-LAST:event_txtExamenCKeyPressed

    private void txtDXKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDXKeyPressed

    }//GEN-LAST:event_txtDXKeyPressed

    private void txtpresupuestoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpresupuestoKeyPressed

    }//GEN-LAST:event_txtpresupuestoKeyPressed

    private void txtpresupuestoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpresupuestoKeyTyped

    }//GEN-LAST:event_txtpresupuestoKeyTyped

    private void txtHistoriaOKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHistoriaOKeyPressed

    }//GEN-LAST:event_txtHistoriaOKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel idconsulta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    public static com.toedter.calendar.JDateChooser jfecha;
    public static javax.swing.JLabel lbid;
    public static javax.swing.JLabel lblidc;
    private javax.swing.JLabel lblnombre1;
    private javax.swing.JLabel lblnombre2;
    private javax.swing.JLabel lblnombre3;
    private javax.swing.JLabel lblnombre4;
    private javax.swing.JLabel lblnombre5;
    private javax.swing.JLabel lblnombre6;
    public static javax.swing.JLabel lbnombre;
    public static javax.swing.JTextField txtDX;
    public static javax.swing.JTextField txtExamenC;
    public static javax.swing.JTextField txtHistoriaM;
    public static javax.swing.JTextField txtHistoriaO;
    public static javax.swing.JTextField txtMotivoC;
    public static javax.swing.JTextField txtpresupuesto;
    // End of variables declaration//GEN-END:variables
}