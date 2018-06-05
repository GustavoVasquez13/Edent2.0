/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import Clases.ActualizarDatosBD;
import Clases.InsertarDatosBD;
import Clases.internalFrameImagen;
import Clases.validaciones;
import static formularios.frmPrincipal.Dpanel;
import formulariosAyuda.frmayudaPO;
import java.awt.Color;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author marvin
 */
public class consulta extends internalFrameImagen {

    /**
     * Creates new form consulta
     */
    public consulta() {
        initComponents();
        consulta.btnGuardar.setEnabled(false);
        consulta.btneditar.setEnabled(false);
        consulta.txtDX.setEnabled(false);
        consulta.txtExamenC.setEnabled(false);
        consulta.txtHistoriaM.setEnabled(false);
        consulta.txtHistoriaO.setEnabled(false);
        consulta.txtMotivoC.setEnabled(false);
        consulta.txtpresupuesto.setEnabled(false);
        consulta.btndientes.setEnabled(false);
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
        lblnombre6 = new javax.swing.JLabel();
        txtpresupuesto = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbid = new javax.swing.JLabel();
        lbnombre = new javax.swing.JLabel();
        btnagregarpc = new javax.swing.JButton();
        btndientes = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnselecionaredicion = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblidc = new javax.swing.JLabel();
        ayuda = new javax.swing.JButton();
        jfecha = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(0, 0, 204));
        setClosable(true);
        setIconifiable(true);

        lblnombre1.setForeground(new java.awt.Color(0, 102, 153));
        lblnombre1.setText("Motivo de la Consulta: ");

        txtMotivoC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMotivoCKeyPressed(evt);
            }
        });

        lblnombre2.setForeground(new java.awt.Color(0, 102, 153));
        lblnombre2.setText("Historia Medica:");

        txtHistoriaM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHistoriaMKeyPressed(evt);
            }
        });

        lblnombre3.setForeground(new java.awt.Color(0, 102, 153));
        lblnombre3.setText("Historia Odontologica:");

        txtHistoriaO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHistoriaOKeyPressed(evt);
            }
        });

        lblnombre4.setForeground(new java.awt.Color(0, 102, 153));
        lblnombre4.setText("Examen Clinico:");

        txtExamenC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtExamenCKeyPressed(evt);
            }
        });

        lblnombre5.setForeground(new java.awt.Color(0, 102, 153));
        lblnombre5.setText("DX Odontologico:");

        txtDX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDXKeyPressed(evt);
            }
        });

        lblnombre6.setForeground(new java.awt.Color(0, 102, 153));
        lblnombre6.setText("Presupuesto:");

        txtpresupuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpresupuestoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpresupuestoKeyTyped(evt);
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

        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Numero de expediente");

        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("Nombre");

        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("Fecha");

        lbid.setForeground(new java.awt.Color(0, 102, 153));

        lbnombre.setForeground(new java.awt.Color(0, 102, 153));

        btnagregarpc.setForeground(new java.awt.Color(0, 0, 204));
        btnagregarpc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar paciente.jpg"))); // NOI18N
        btnagregarpc.setText("Agregar paciente para consulta");
        btnagregarpc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnagregarpc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnagregarpc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarpcActionPerformed(evt);
            }
        });

        btndientes.setForeground(new java.awt.Color(0, 0, 204));
        btndientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/dientes.jpg"))); // NOI18N
        btndientes.setText("insertar dientes");
        btndientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btndientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btndientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndientesActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("Consulta Pacientes Odontologia General");

        btnselecionaredicion.setForeground(new java.awt.Color(0, 0, 255));
        btnselecionaredicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar edicion.png"))); // NOI18N
        btnselecionaredicion.setText("Seleccionar paciente a editar");
        btnselecionaredicion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnselecionaredicion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnselecionaredicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselecionaredicionActionPerformed(evt);
            }
        });

        btneditar.setForeground(new java.awt.Color(0, 0, 255));
        btneditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar.png"))); // NOI18N
        btneditar.setText("Editar Paciente");
        btneditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btneditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("ID consulta");

        lblidc.setForeground(new java.awt.Color(0, 102, 153));
        lblidc.setText("...");

        ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/help (1).png"))); // NOI18N
        ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaActionPerformed(evt);
            }
        });

        jfecha.setDateFormatString("yyyy-MM-dd");
        jfecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jfechaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnselecionaredicion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btneditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnagregarpc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btndientes)
                        .addGap(35, 35, 35)))
                .addComponent(ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbid, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(67, 67, 67)
                                            .addComponent(lblnombre6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(47, 47, 47)
                                            .addComponent(lblnombre5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtDX, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtpresupuesto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(57, 57, 57)
                                    .addComponent(lblnombre4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtHistoriaO, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtExamenC, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblnombre1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(160, 160, 160)
                                        .addComponent(txtMotivoC, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(lblnombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(txtHistoriaM, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblnombre3))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(lblidc)))
                .addGap(0, 70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnagregarpc)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btndientes)
                                .addGap(9, 9, 9))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addComponent(lbnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbid, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblnombre1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMotivoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(lblidc)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblnombre2))
                    .addComponent(txtHistoriaM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHistoriaO, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnombre3))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblnombre4)
                    .addComponent(txtExamenC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblnombre5)
                    .addComponent(txtDX, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblnombre6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnselecionaredicion)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar))
                    .addComponent(btneditar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void limpiarTxt(){
       
        txtMotivoC.setText("");
        txtpresupuesto.setText("");
        txtHistoriaM.setText("");
        txtHistoriaO.setText("");
        txtExamenC.setText("");
        txtDX.setText("");}
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       if(this.txtMotivoC.getText().length() == 0 || this.lblidc.getText().length() == 0 || this.txtHistoriaM.getText().length() == 0
               || this.txtHistoriaO.getText().length() == 0|| this.txtExamenC.getText().length() == 0 || this.txtDX.getText().length() == 0){
           JOptionPane.showMessageDialog(null, "Debe complementar los campos requeridos");
          
       }else{
           // se crean variables para guardar en ellas los datos recibidos de los jtextfield
        String motivo = this.txtMotivoC.getText().toUpperCase();
        Double total = Double.parseDouble( this.txtpresupuesto.getText());
        String historiam = this.txtHistoriaM.getText().toUpperCase();
        String historiao = this.txtHistoriaO.getText().toUpperCase();
        String examen = this.txtExamenC.getText().toUpperCase();
        String dx = this.txtDX.getText().toUpperCase();
        String tip1=lbid.getText();
        // se crean variables para almacenar en ellas el dia mes y año que se obtienen del control jcalendar  
          String dia = Integer.toString(jfecha.getCalendar().get(Calendar.DAY_OF_MONTH));
      String mes = Integer.toString(jfecha.getCalendar().get(Calendar.MONTH) + 1);
      String year = Integer.toString(jfecha.getCalendar().get(Calendar.YEAR));
      String fechaA = (year + "-" + mes+ "-" + dia);
      String date = fechaA; 
       
        //se crea un objeto de la clase Insertar Datos, en este objeto se almacenaran y enviaran
        //a la clase los parametros obtenidos por los jtextfield
        InsertarDatosBD insertar2 = new InsertarDatosBD();
        insertar2.insertarPacienteGC(motivo, date, total, historiam, historiao, examen, dx,tip1);
        //se manda a llamar el metodo para limpiar los jtextfield despues de cada click en el boton guardar
        limpiarTxt();
          consulta.btnGuardar.setEnabled(false);
        consulta.btneditar.setEnabled(false);
        consulta.txtDX.setEnabled(false);
        consulta.txtExamenC.setEnabled(false);
        consulta.txtHistoriaM.setEnabled(false);
        consulta.txtHistoriaO.setEnabled(false);
        consulta.txtMotivoC.setEnabled(false);
        consulta.txtpresupuesto.setEnabled(false);
        consulta.btnagregarpc.setEnabled(true);
        consulta.btnselecionaredicion.setEnabled(true);
       }
        

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnagregarpcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarpcActionPerformed
        frmvistapacientes_1 fr=new frmvistapacientes_1();
        Dpanel.add(fr);
        fr.show();
    }//GEN-LAST:event_btnagregarpcActionPerformed

    private void btndientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndientesActionPerformed
   if(this.jfecha.getDate()== null){
       JOptionPane.showMessageDialog(null, "Debe ingresar la fecha para continuar");
   }else{
         String dia = Integer.toString(jfecha.getCalendar().get(Calendar.DAY_OF_MONTH));
      String mes = Integer.toString(jfecha.getCalendar().get(Calendar.MONTH) + 1);
      String year = Integer.toString(jfecha.getCalendar().get(Calendar.YEAR));
      String fechaA = (year + "-" + mes+ "-" + dia);
      String date = fechaA; 
        frm_indientes fr=new frm_indientes();
 Dpanel.add(fr);
        fr.show();
    frm_indientes.lbid.setText(lbid.getText());
     frm_indientes.lbnombre.setText(lbnombre.getText());
      frm_indientes.lbfecha.setText(date);
   }
      

    }//GEN-LAST:event_btndientesActionPerformed

    private void btnselecionaredicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselecionaredicionActionPerformed
        frmEditarConsultaG fr=new frmEditarConsultaG();
        Dpanel.add(fr);
        fr.show();
    }//GEN-LAST:event_btnselecionaredicionActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
       if(this.lbnombre.getText().length()!=0 && this.txtHistoriaM.getText().length()!=0 && this.txtHistoriaO.getText().length()!=0
               && this.txtExamenC.getText().length()!=0 && this.txtDX.getText().length()!=0){
           String motivo_consulta = this.txtMotivoC.getText().toUpperCase();
           String Total_pagar = this.txtpresupuesto.getText().toUpperCase();
           String HistoriaM = this.txtHistoriaM.getText().toUpperCase();
           String ExamenC = this.txtExamenC.getText().toUpperCase();
           String DXodon = this.txtDX.getText().toUpperCase();
           int code = Integer.valueOf(this.lblidc.getText());
            ActualizarDatosBD actpaciente = new ActualizarDatosBD();
            
            actpaciente.ActualizarConsultaPG(motivo_consulta, Total_pagar, HistoriaM, HistoriaM, ExamenC, DXodon, code);
            limpiarTxt();
        consulta.btnGuardar.setEnabled(false);
        consulta.btneditar.setEnabled(false);
        consulta.txtDX.setEnabled(false);
        consulta.txtExamenC.setEnabled(false);
        consulta.txtHistoriaM.setEnabled(false);
        consulta.txtHistoriaO.setEnabled(false);
        consulta.txtMotivoC.setEnabled(false);
        consulta.txtpresupuesto.setEnabled(false);
        consulta.btnagregarpc.setEnabled(true);
        consulta.btnselecionaredicion.setEnabled(true);
           
       }else{
          JOptionPane.showMessageDialog(null, "DEBE DE LLENAR TODOS LOS CAMPOS");
      }
    }//GEN-LAST:event_btneditarActionPerformed

    private void ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaActionPerformed
        frmayudaPO ayudaPE = new frmayudaPO();
        frmPrincipal.Dpanel.add(ayudaPE);
        ayudaPE.show();
    }//GEN-LAST:event_ayudaActionPerformed

    private void jfechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jfechaKeyPressed
//        this.jfecha.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
//            java.util.Collections.EMPTY_SET);
//        if (evt.getKeyCode() == KeyEvent.VK_TAB) {
//            txttelefono.requestFocus();
//            this.txttelefono.setBackground(Color.LIGHT_GRAY);
//        }
    }//GEN-LAST:event_jfechaKeyPressed

    private void txtMotivoCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMotivoCKeyPressed
        txtMotivoC.setBackground(Color.WHITE);
        txtMotivoC.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);
        if (evt.getKeyCode() == KeyEvent.VK_TAB){
            this.txtHistoriaM.requestFocus();
            this.txtHistoriaM.setBackground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_txtMotivoCKeyPressed

    private void txtHistoriaMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHistoriaMKeyPressed
        txtHistoriaM.setBackground(Color.WHITE);
        txtHistoriaM.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);
        if (evt.getKeyCode() == KeyEvent.VK_TAB){
            this.txtHistoriaO.requestFocus();
            this.txtHistoriaO.setBackground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_txtHistoriaMKeyPressed

    private void txtHistoriaOKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHistoriaOKeyPressed
         txtHistoriaO.setBackground(Color.WHITE);
        txtHistoriaO.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);
        if (evt.getKeyCode() == KeyEvent.VK_TAB){
            this.txtExamenC.requestFocus();
            this.txtExamenC.setBackground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_txtHistoriaOKeyPressed

    private void txtExamenCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExamenCKeyPressed
         txtExamenC.setBackground(Color.WHITE);
        txtExamenC.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);
        if (evt.getKeyCode() == KeyEvent.VK_TAB){
            this.txtDX.requestFocus();
            this.txtDX.setBackground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_txtExamenCKeyPressed

    private void txtDXKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDXKeyPressed
          txtDX.setBackground(Color.WHITE);
        txtDX.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);
        if (evt.getKeyCode() == KeyEvent.VK_TAB){
            this.txtpresupuesto.requestFocus();
            this.txtpresupuesto.setBackground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_txtDXKeyPressed

    private void txtpresupuestoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpresupuestoKeyPressed
         txtpresupuesto.setBackground(Color.WHITE);
        txtpresupuesto.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);
    }//GEN-LAST:event_txtpresupuestoKeyPressed

    private void txtpresupuestoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpresupuestoKeyTyped
       validaciones val = new validaciones();
        val.validarNum(evt);
    }//GEN-LAST:event_txtpresupuestoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ayuda;
    public static javax.swing.JButton btnGuardar;
    public static javax.swing.JButton btnagregarpc;
    public static javax.swing.JButton btndientes;
    public static javax.swing.JButton btneditar;
    private javax.swing.JButton btnsalir;
    public static javax.swing.JButton btnselecionaredicion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
