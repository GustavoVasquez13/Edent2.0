package FormulariosPagos;

import Clases.ConsultarDatosBD;
import Clases.IsertarDatosBD2;
import Clases.internalFrameImagen;
import Clases.validaciones;
import formularios.frmEmpleados;
import formularios.frmPrincipal;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class frmPagoEmpleado extends internalFrameImagen {
    private TableRowSorter trsFiltro;
    
    public frmPagoEmpleado() {
        initComponents();
        setImagenw("img2.jpg");
        mostEmple();
    }

    //metodo para mostrar los empleados registrados en la tabla
    private void mostEmple(){
        try{
            DefaultTableModel modelo;
            ConsultarDatosBD MEmpl = new ConsultarDatosBD();
            modelo = MEmpl.mostrarEmpleado();
            this.jtEmple.setModel(modelo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "PROBLEMAS AL CONSULTAR LOS DATOS DEL EMPLEADO "+e);
        }
    }
    
    //metodo para limpiar los controles de cajas de texto
    private void limpiar(){
        this.txtNombre.setText("");
        this.txtDui.setText("");
        this.txtTotalPago.setText("");
        this.jdFechaPago.setDate(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        btnAggNS = new javax.swing.JButton();
        txtDui = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTotalPago = new javax.swing.JFormattedTextField();
        txtBuscar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jdFechaPago = new com.toedter.calendar.JDateChooser();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEmple = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("Dui");

        btnAggNS.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnAggNS.setForeground(new java.awt.Color(0, 102, 153));
        btnAggNS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevo.png"))); // NOI18N
        btnAggNS.setText("Agregar Nuevo Empleado");
        btnAggNS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAggNS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAggNS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggNSActionPerformed(evt);
            }
        });

        txtDui.setEditable(false);

        btnActualizar.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(0, 102, 153));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar Tabla");
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("Total a pagar");

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setText("Buscar");

        txtTotalPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalPagoKeyTyped(evt);
            }
        });

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("Fecha de pago");

        jdFechaPago.setDateFormatString("yyyy-MM-dd");

        btnRegistrar.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(0, 102, 153));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/pago.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 102, 153));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jtEmple = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jtEmple.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtEmple.getTableHeader().setReorderingAllowed(false);
        jtEmple.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtEmpleMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtEmple);

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Pagos de Empleados");

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("Nombre");

        txtNombre.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(15, 15, 15)
                                .addComponent(jdFechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTotalPago, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDui, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2)
                        .addGap(14, 14, 14)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6)
                        .addGap(12, 12, 12)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(279, 279, 279))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btnRegistrar)
                .addGap(58, 58, 58)
                .addComponent(btnAggNS)
                .addGap(41, 41, 41)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDui, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(txtTotalPago, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jdFechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrar)
                    .addComponent(btnAggNS)
                    .addComponent(btnActualizar)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAggNSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggNSActionPerformed
        frmEmpleados formEmp = new frmEmpleados();
        frmPrincipal.Dpanel.add(formEmp);
        formEmp.show();
    }//GEN-LAST:event_btnAggNSActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        mostEmple();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtTotalPagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalPagoKeyTyped
        validaciones val = new validaciones();
        val.validarNum(evt);
    }//GEN-LAST:event_txtTotalPagoKeyTyped

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        // mostrar dato buscado desde el textbox
        txtBuscar.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtBuscar.getText().toUpperCase());
                txtBuscar.setText(cadena);
                repaint();
                trsFiltro.setRowFilter(RowFilter.regexFilter(txtBuscar.getText(), 0));
                jtEmple.getSelectionModel().setSelectionInterval(0,0);
            }
        });
        trsFiltro = new TableRowSorter(jtEmple.getModel());
        jtEmple.setRowSorter(trsFiltro);
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if(this.txtNombre.getText().length()!=0 && this.txtDui.getText().length()!=0 && this.txtTotalPago.getText().length()!=0
            && this.jdFechaPago.getDate()!=null){
            String nombre = this.txtNombre.getText();
            String dui = this.txtDui.getText();
            double totalPagar = Double.parseDouble(this.txtTotalPago.getText());
            SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd");
            String pasofecha = (formatofecha.format(jdFechaPago.getDate()));

            IsertarDatosBD2 insertPago = new IsertarDatosBD2();
            insertPago.insertPagoEmple(nombre, dui, totalPagar, pasofecha);
            limpiar();
        }else{
            JOptionPane.showMessageDialog(null, "SELECCIONE UN REGISTRO DE LA TABLA Y COMPLETE TODOS LOS CAMPOS");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jtEmpleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtEmpleMousePressed
        if(evt.getClickCount()==1){
            if (jtEmple.getSelectedRowCount() != 0)
            {
                int filaSelect = jtEmple.getSelectedRow();
                String serv = (String)jtEmple.getValueAt(filaSelect, 0);
                String prov = (String)jtEmple.getValueAt(filaSelect, 4);
                this.txtNombre.setText(serv);
                this.txtDui.setText(prov);
            }else{
                JOptionPane.showMessageDialog(null, "SELECCIONE UN REGISTRO DE LA TABLA");
            }
        }
    }//GEN-LAST:event_jtEmpleMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAggNS;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdFechaPago;
    private javax.swing.JTable jtEmple;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDui;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JFormattedTextField txtTotalPago;
    // End of variables declaration//GEN-END:variables
}
