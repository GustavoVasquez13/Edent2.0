/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import Clases.ActualizarDatosBD;
import Clases.InsertarDatosBD;
import Clases.IsertarDatosBD2;
import Clases.internalFrameImagen;
import Clases.validaciones;
import static formularios.frmPrincipal.Dpanel;

import formulariosAyuda.frmayudaEG;
import java.awt.Color;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import javax.swing.JOptionPane;




public class ExpedienteOrtodoncia extends internalFrameImagen {


    public ExpedienteOrtodoncia() {
        initComponents(); 
          txttelefono.setText("");
        ExpedienteOrtodoncia.jfecha.setEnabled(false);
//        ExpedienteOrtodoncia.txtedad.setEnabled(false);
//        ExpedienteOrtodoncia.txttelefono.setEnabled(false);
//        ExpedienteOrtodoncia.txtnombre.setEnabled(false);
//        ExpedienteOrtodoncia.txtapellido.setEnabled(false);
        ExpedienteOrtodoncia.txtMotivoC.setEnabled(false);
        ExpedienteOrtodoncia.btneditar.setEnabled(false);
        ExpedienteOrtodoncia.btnbuscaredicion.setEnabled(true);
        ExpedienteOrtodoncia.btnGuardar.setEnabled(false);
        ExpedienteOrtodoncia.txtHistoriaO.setEnabled(false);
        ExpedienteOrtodoncia.txtHistoriaM.setEnabled(false);
        ExpedienteOrtodoncia.txtExamenC.setEnabled(false);
        ExpedienteOrtodoncia.txtDX.setEnabled(false);
//        ExpedienteOrtodoncia.txtdireccion.setEnabled(false);
//        ExpedienteOrtodoncia.btndientes.setEnabled(false);
        
        
       setImagenw("fondo.jpg");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel82 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbltelefono = new javax.swing.JLabel();
        lbledad = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        lblnombre = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        lbldireccion1 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        lblnombre1 = new javax.swing.JLabel();
        txtMotivoC = new javax.swing.JTextField();
        lblnombre2 = new javax.swing.JLabel();
        txtHistoriaM = new javax.swing.JTextField();
        lblnombre3 = new javax.swing.JLabel();
        txtHistoriaO = new javax.swing.JTextField();
        lblnombre4 = new javax.swing.JLabel();
        txtExamenC = new javax.swing.JTextField();
        lblnombre5 = new javax.swing.JLabel();
        txtDX = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jfecha = new com.toedter.calendar.JDateChooser();
        lblnombre40 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        btnsalir = new javax.swing.JButton();
        btnsiguiente = new javax.swing.JButton();
        btnelegir = new javax.swing.JButton();
        txttip = new javax.swing.JTextField();
        txttip2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btneditar = new javax.swing.JButton();
        btnbuscaredicion = new javax.swing.JButton();
        lblid1 = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        ayuda = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel82.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setText("Expediente Paciente Ortodoncia");

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha:");

        lbltelefono.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lbltelefono.setForeground(new java.awt.Color(255, 255, 255));
        lbltelefono.setText("Telefono:");

        txttelefono.setEditable(false);
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });

        lbledad.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lbledad.setForeground(new java.awt.Color(255, 255, 255));
        lbledad.setText("Edad:");

        txtedad.setEditable(false);
        txtedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtedadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtedadKeyTyped(evt);
            }
        });

        lblnombre.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lblnombre.setForeground(new java.awt.Color(255, 255, 255));
        lblnombre.setText("Nombre: ");

        txtnombre.setEditable(false);
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        lbldireccion1.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lbldireccion1.setForeground(new java.awt.Color(255, 255, 255));
        lbldireccion1.setText("Dirección: ");

        txtdireccion.setEditable(false);
        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });

        lblnombre1.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lblnombre1.setForeground(new java.awt.Color(255, 255, 255));
        lblnombre1.setText("Motivo de la Consulta: ");

        txtMotivoC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMotivoCKeyPressed(evt);
            }
        });

        lblnombre2.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lblnombre2.setForeground(new java.awt.Color(255, 255, 255));
        lblnombre2.setText("Historia Medica:");

        txtHistoriaM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHistoriaMKeyPressed(evt);
            }
        });

        lblnombre3.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lblnombre3.setForeground(new java.awt.Color(255, 255, 255));
        lblnombre3.setText("Historia Odontologica:");

        txtHistoriaO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHistoriaOKeyPressed(evt);
            }
        });

        lblnombre4.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lblnombre4.setForeground(new java.awt.Color(255, 255, 255));
        lblnombre4.setText("Examen Clinico:");

        txtExamenC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExamenCActionPerformed(evt);
            }
        });
        txtExamenC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtExamenCKeyPressed(evt);
            }
        });

        lblnombre5.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lblnombre5.setForeground(new java.awt.Color(255, 255, 255));
        lblnombre5.setText("DX Odontologico:");

        txtDX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDXActionPerformed(evt);
            }
        });
        txtDX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDXKeyPressed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 51, 204));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jfecha.setDateFormatString("yyyy-MM-dd");

        lblnombre40.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lblnombre40.setForeground(new java.awt.Color(255, 255, 255));
        lblnombre40.setText("Apellido:");

        txtapellido.setEditable(false);
        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
            }
        });

        btnsalir.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnsalir.setForeground(new java.awt.Color(0, 0, 204));
        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        btnsalir.setText("Cerrar");
        btnsalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnsalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        btnsiguiente.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnsiguiente.setForeground(new java.awt.Color(0, 0, 204));
        btnsiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/siguiente.png"))); // NOI18N
        btnsiguiente.setText("Tratamiento");
        btnsiguiente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnsiguiente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnsiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsiguienteActionPerformed(evt);
            }
        });

        btnelegir.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnelegir.setForeground(new java.awt.Color(0, 0, 204));
        btnelegir.setText("Elegir paciente");
        btnelegir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnelegir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnelegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnelegirActionPerformed(evt);
            }
        });

        txttip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttipActionPerformed(evt);
            }
        });

        txttip2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttip2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Para realizar una consulta elija el paciente:");

        btneditar.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btneditar.setForeground(new java.awt.Color(0, 0, 204));
        btneditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar.png"))); // NOI18N
        btneditar.setText("Editar Consulta ");
        btneditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btneditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btnbuscaredicion.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnbuscaredicion.setForeground(new java.awt.Color(0, 0, 204));
        btnbuscaredicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar edicion.png"))); // NOI18N
        btnbuscaredicion.setText("Buscar para editar");
        btnbuscaredicion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnbuscaredicion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnbuscaredicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscaredicionActionPerformed(evt);
            }
        });

        lblid1.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lblid1.setForeground(new java.awt.Color(255, 255, 255));
        lblid1.setText("ID paciente:");
        lblid1.setAutoscrolls(true);

        lblid.setForeground(new java.awt.Color(255, 255, 255));
        lblid.setText("...");
        lblid.setAutoscrolls(true);

        ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/help (1).png"))); // NOI18N
        ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnbuscaredicion)
                            .addGap(18, 18, 18)
                            .addComponent(btneditar)
                            .addGap(18, 18, 18)
                            .addComponent(btnGuardar)
                            .addGap(18, 18, 18)
                            .addComponent(btnsiguiente)
                            .addGap(18, 18, 18)
                            .addComponent(btnsalir))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(lblnombre5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDX, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblnombre4)
                            .addGap(27, 27, 27)
                            .addComponent(txtExamenC, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblnombre3)
                            .addGap(27, 27, 27)
                            .addComponent(txtHistoriaO, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblnombre2)
                            .addGap(27, 27, 27)
                            .addComponent(txtHistoriaM, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblnombre1)
                            .addGap(27, 27, 27)
                            .addComponent(txtMotivoC, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbldireccion1)
                                .addComponent(lblnombre))
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(33, 33, 33)
                                    .addComponent(lblnombre40)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtapellido))
                                .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(81, 81, 81)
                                    .addComponent(lblid1)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblid, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnelegir, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(27, 27, 27)
                                .addComponent(jfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbltelefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbledad)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btnelegir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblid)
                            .addComponent(lblid1)))
                    .addComponent(ayuda))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbltelefono)
                        .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbledad))
                    .addComponent(jfecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblnombre40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblnombre)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldireccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMotivoC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnombre1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHistoriaM, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnombre2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHistoriaO, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnombre3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtExamenC, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnombre4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDX, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnombre5))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnsiguiente)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar))
                    .addComponent(btneditar)
                    .addComponent(btnbuscaredicion))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed
     //metodo para limpiar los jtextfield despues de cada click al boton guardar
    public void limpiarTxt(){
        txtnombre.setText("");
        txtapellido.setText("");
        txtdireccion.setText("");
        txttelefono.setText("");
        txtedad.setText("");
        txtMotivoC.setText("");
        txtHistoriaM.setText("");
        txtHistoriaO.setText("");
        txtExamenC.setText("");
        txtDX.setText("");
        jfecha.setDateFormatString("");
    }
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
     if (this.txtMotivoC.getText().length() == 0 || this.txtHistoriaM.getText().length() == 0|| this.txtHistoriaO.getText().length() == 0
             || this.txtExamenC.getText().length() == 0|| this.txtDX.getText().length() == 0 || this.jfecha.getDate()== null){
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
            }else{
         
          String tip=this.txttip.getText();
      String motivo = this.txtMotivoC.getText().toUpperCase();
      String historiam = this.txtHistoriaM.getText().toUpperCase();
      String historiao = this.txtHistoriaO.getText().toUpperCase();
      String examen = this.txtExamenC.getText().toUpperCase();
      String dx = this.txtDX.getText().toUpperCase();
      String tip2=this.txttip2.getText();
      // se crean variables para almacenar en ellas el dia mes y año que se obtienen del control jcalendar
      String dia = Integer.toString(jfecha.getCalendar().get(Calendar.DAY_OF_MONTH));
      String mes = Integer.toString(jfecha.getCalendar().get(Calendar.MONTH) + 1);
      String year = Integer.toString(jfecha.getCalendar().get(Calendar.YEAR));
      String fechaA = (year + "-" + mes+ "-" + dia);
      String date = fechaA; 
      //se crea un objeto de la clase Insertar Datos, en este objeto se almacenaran y enviaran 
      //a la clase los parametros obtenidos por los jtextfield
      IsertarDatosBD2 insertar2 = new IsertarDatosBD2();
      insertar2.insertarPacienteOC(motivo, date, historiam, historiao, examen, dx,tip);
      //se manda a llamar el metodo para limpiar los jtextfield despues de cada click en el boton guardar
      limpiarTxt();
        ExpedienteOrtodoncia.jfecha.setEnabled(false);
        ExpedienteOrtodoncia.txtedad.setEnabled(false);
        ExpedienteOrtodoncia.txttelefono.setEnabled(false);
        ExpedienteOrtodoncia.txtnombre.setEnabled(false);
        ExpedienteOrtodoncia.txtapellido.setEnabled(false);
        ExpedienteOrtodoncia.txtMotivoC.setEnabled(false);
        ExpedienteOrtodoncia.btneditar.setEnabled(false);
        ExpedienteOrtodoncia.btnbuscaredicion.setEnabled(true);
        ExpedienteOrtodoncia.btnGuardar.setEnabled(false);
        ExpedienteOrtodoncia.txtHistoriaO.setEnabled(false);
        ExpedienteOrtodoncia.txtHistoriaM.setEnabled(false);
        ExpedienteOrtodoncia.txtExamenC.setEnabled(false);
        ExpedienteOrtodoncia.txtDX.setEnabled(false);
        ExpedienteOrtodoncia.txtdireccion.setEnabled(false);
//        ExpedienteOrtodoncia.btndientes.setEnabled(false);
        ExpedienteOrtodoncia.btnelegir.setEnabled(true);
     }
     
     
     
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtDXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDXActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        limpiarTxt();
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        validaciones val = new validaciones();
        val.validarCaracter(evt);
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped
        validaciones val = new validaciones();
        val.validarCaracter(evt);
    }//GEN-LAST:event_txtapellidoKeyTyped

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
       validaciones val = new validaciones();
        val.validarNum(evt);
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void txtedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadKeyTyped
        validaciones val = new validaciones();
        val.validarNum(evt);
    }//GEN-LAST:event_txtedadKeyTyped

    private void btnsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsiguienteActionPerformed
       ExpedienteO formExGral = new ExpedienteO();
       Dpanel.add(formExGral);
        formExGral.show();
    }//GEN-LAST:event_btnsiguienteActionPerformed

    private void btnelegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnelegirActionPerformed
        frmvistapacientes formProd = new frmvistapacientes();
        Dpanel.add(formProd);
        formProd.show();
    }//GEN-LAST:event_btnelegirActionPerformed

    private void txttipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttipActionPerformed

    private void txtExamenCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExamenCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExamenCActionPerformed

    private void txttip2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttip2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttip2ActionPerformed

    private void btnbuscaredicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscaredicionActionPerformed
        frmEditarPO formProd = new frmEditarPO();
        Dpanel.add(formProd);
        formProd.show();
    }//GEN-LAST:event_btnbuscaredicionActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        if(this.txtnombre.getText().length()!=0 && this.txtapellido.getText().length()!=0 && this.txtMotivoC.getText().length()!=0 
              && this.txtHistoriaO.getText().length()!=0 && this.txtDX.getText().length()!=0 ) {
          String motivo_consulta = this.txtMotivoC.getText().toUpperCase();
          String HistoriaM = this.txtHistoriaM.getText().toUpperCase();
          String HistoriaO = this.txtHistoriaO.getText().toUpperCase();
          String ExamenC = this.txtExamenC.getText().toUpperCase();
          String DXodon = this.txtDX.getText().toUpperCase();
          int code = Integer.valueOf(this.lblid.getText());
          
          ActualizarDatosBD actpaciente = new ActualizarDatosBD();
          
          actpaciente.ActualizarConsultaPO(motivo_consulta, HistoriaM, HistoriaO, ExamenC, DXodon, code);
          }else{
          JOptionPane.showMessageDialog(null, "DEBE DE LLENAR TODOS LOS CAMPOS");
      }
      limpiarTxt();
    }//GEN-LAST:event_btneditarActionPerformed

    private void ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaActionPerformed
        frmayudaEG ayudaPE = new frmayudaEG();
        frmPrincipal.Dpanel.add(ayudaPE);
        ayudaPE.show();
    }//GEN-LAST:event_ayudaActionPerformed

    private void txtedadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedadKeyPressed

    private void txtMotivoCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMotivoCKeyPressed
       this.txtMotivoC.setBackground(Color.WHITE);
       txtMotivoC.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);
       if (evt.getKeyCode() == KeyEvent.VK_TAB){
           txtHistoriaM.requestFocus();
           this.txtHistoriaM.setBackground(Color.LIGHT_GRAY);
       }
    }//GEN-LAST:event_txtMotivoCKeyPressed

    private void txtHistoriaOKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHistoriaOKeyPressed
         this.txtHistoriaO.setBackground(Color.WHITE);
       txtHistoriaO.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);
       if (evt.getKeyCode() == KeyEvent.VK_TAB){
           txtExamenC.requestFocus();
           this.txtExamenC.setBackground(Color.LIGHT_GRAY);
       }
    }//GEN-LAST:event_txtHistoriaOKeyPressed

    private void txtExamenCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExamenCKeyPressed
        this.txtExamenC.setBackground(Color.WHITE);
       txtExamenC.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);
       if (evt.getKeyCode() == KeyEvent.VK_TAB){
           txtDX.requestFocus();
           this.txtDX.setBackground(Color.LIGHT_GRAY);
       }    }//GEN-LAST:event_txtExamenCKeyPressed

    private void txtHistoriaMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHistoriaMKeyPressed
        this.txtHistoriaM.setBackground(Color.WHITE);
       txtHistoriaM.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);
       if (evt.getKeyCode() == KeyEvent.VK_TAB){
           txtHistoriaO.requestFocus();
           this.txtHistoriaO.setBackground(Color.LIGHT_GRAY);
       }    }//GEN-LAST:event_txtHistoriaMKeyPressed

    private void txtDXKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDXKeyPressed
        this.txtDX.setBackground(Color.WHITE);
       txtDX.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);    }//GEN-LAST:event_txtDXKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ayuda;
    public static javax.swing.JButton btnGuardar;
    public static javax.swing.JButton btnbuscaredicion;
    public static javax.swing.JButton btneditar;
    public static javax.swing.JButton btnelegir;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton btnsiguiente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel82;
    public static com.toedter.calendar.JDateChooser jfecha;
    private javax.swing.JLabel lbldireccion1;
    private javax.swing.JLabel lbledad;
    public static javax.swing.JLabel lblid;
    public static javax.swing.JLabel lblid1;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblnombre1;
    private javax.swing.JLabel lblnombre2;
    private javax.swing.JLabel lblnombre3;
    private javax.swing.JLabel lblnombre4;
    private javax.swing.JLabel lblnombre40;
    private javax.swing.JLabel lblnombre5;
    private javax.swing.JLabel lbltelefono;
    public static javax.swing.JTextField txtDX;
    public static javax.swing.JTextField txtExamenC;
    public static javax.swing.JTextField txtHistoriaM;
    public static javax.swing.JTextField txtHistoriaO;
    public static javax.swing.JTextField txtMotivoC;
    public static javax.swing.JTextField txtapellido;
    public static javax.swing.JTextField txtdireccion;
    public static javax.swing.JTextField txtedad;
    public static javax.swing.JTextField txtnombre;
    public static final javax.swing.JTextField txttelefono = new javax.swing.JTextField();
    public static javax.swing.JTextField txttip;
    public static javax.swing.JTextField txttip2;
    // End of variables declaration//GEN-END:variables
}
