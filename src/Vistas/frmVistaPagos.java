package Vistas;

import Clases.ConsultarDatosBD2;
import Clases.internalFrameImagen;
import Modelo.mpago;
import static formularios.ExpedienteGeneral.fecha;
import formularios.frmPrincipal;
import formulariosAyuda.frmayudaVP;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class frmVistaPagos extends internalFrameImagen {
    private TableRowSorter trsFiltro;
    
    public frmVistaPagos() {
        initComponents();
        setImagenw("fondo.jpg");
        //mostrarPago("SERVICIO");
        this.jdinicio.setDate(null);
        this.jdfin.setDate(null);
    }

    private void mostrarPago(String tipo,String consulta,String tipoP,String costo,String fecha){
        try{
            //String estado = this.cmbEstado.getSelectedItem().toString();
            DefaultTableModel modelo;
            ConsultarDatosBD2 mosEmpl = new ConsultarDatosBD2();
            modelo = mosEmpl.mostrarPago(tipo,consulta,tipoP,costo,fecha);
            jtPagos.setModel(modelo);
            Totalizar();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "PROBLEMAS AL CONSULTAR LOS DATOS DEL EMPLEADO");
        }
    }
    
    //metodo para calcular el total
    private void Totalizar(){
        double t = 0;
        double p = 0;
        if(this.jtPagos.getRowCount()!=0){
            for (int i = 0; i < this.jtPagos.getRowCount(); i++) {
                p = Double.parseDouble(this.jtPagos.getValueAt(i, 1).toString());
                t=t+p;
            }
            this.txtTotal.setText(String.valueOf(t));
        }else{
        //Sin Acciones
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPagos = new javax.swing.JTable();
        cmbTipoPago = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        txtTotal = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jdinicio = new com.toedter.calendar.JDateChooser();
        jdfin = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mostrar Pagos Realizados");

        jtPagos = new javax.swing.JTable(){
            public boolean isCellEditable(int fila, int columna){
                return false;
            }
        };
        jtPagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtPagos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtPagos);

        cmbTipoPago.setFont(new java.awt.Font("Baskerville Old Face", 0, 11)); // NOI18N
        cmbTipoPago.setForeground(new java.awt.Color(255, 255, 255));
        cmbTipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "SERVICIOS BASICOS", "EMPLEADOS", "MATERIALES", "REPARACIONES", "EQUIPO" }));
        cmbTipoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoPagoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione el tipo de Vista");

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

        txtTotal.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total Pagado");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Buscar");

        jdinicio.setDateFormatString("yyyy-MM-dd");

        jdfin.setDateFormatString("yyyy-MM-dd");

        jLabel12.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Fecha Inicio");

        jLabel13.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Fecha Fin");

        jButton1.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/reporte.png"))); // NOI18N
        jButton1.setText("Generar Reporte");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/help (1).png"))); // NOI18N
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(28, 28, 28)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addGap(12, 12, 12))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jdinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(115, 115, 115)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jdfin, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jdinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addComponent(jdfin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(59, 59, 59))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void cmbTipoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoPagoActionPerformed
        SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd");
        Date fInicio = ((this.jdinicio.getDate()));
        Date fFin = ((this.jdfin.getDate()));
        if(this.cmbTipoPago.getSelectedItem().toString()=="SERVICIOS BASICOS"){
            String serv = "SERVICIO";
            String Servicio="nombre_servicio";
            String costo="costo_servicio";
            String fecha="fechaPago_servicio";
            if(this.jdinicio.getDate()==null || this.jdfin.getDate()==null){
                String sSQL = "select nombre_servicio,costo_servicio,fechaPago_servicio from serviciobasico " +
                    "inner join tiposervicio on TipoServicio_id_tipoServicio=id_tipoServicio;";
                mostrarPago(serv,sSQL,Servicio,costo,fecha);
            }else{
                String sSQL = "select nombre_servicio,costo_servicio,fechaPago_servicio from serviciobasico " +
                "inner join tiposervicio on TipoServicio_id_tipoServicio=id_tipoServicio "
                        + "where fechaPago_servicio BETWEEN CAST('"+formatofecha.format(fInicio)+"' AS DATE) AND CAST('"+formatofecha.format(fFin)+"' AS DATE);";
                mostrarPago(serv,sSQL,Servicio,costo,fecha);
            }
        }else if(this.cmbTipoPago.getSelectedItem().toString()=="MATERIALES"){
            String mater = "MATERIAL";
            String material="nombre_material";
            String costo="pagomateriales.costo_material";
            String fecha="fechaPago_material";
            if(this.jdinicio.getDate()==null || this.jdfin.getDate()==null){
                String sSQL = "select nombre_material,pagomateriales.costo_material,fechaPago_material from pagomateriales\n" +
                                "inner join  materiales on Materiales_id_material=id_material;";
                mostrarPago(mater,sSQL,material,costo,fecha);
            }else{
                String sSQL = "select nombre_material,pagomateriales.costo_material,fechaPago_material from pagomateriales\n" +
                            "inner join  materiales on Materiales_id_material=id_material "
                       + "where fechaPago_material BETWEEN CAST('"+formatofecha.format(fInicio)+"' AS DATE) AND CAST('"+formatofecha.format(fFin)+"' AS DATE);";
                mostrarPago(mater,sSQL,material,costo,fecha); 
            }
            
        }else if(this.cmbTipoPago.getSelectedItem().toString()=="EMPLEADOS"){
            String emple = "EMPLEADO";
            String emplea="nombre_empl";
            String costo="pagoempleado.sueldo_empl";
            String fecha="fechaPago_empl";
            if(this.jdinicio.getDate()==null || this.jdfin.getDate()==null){
                String sSQL = "select nombre_empl,apellido_empl,pagoempleado.sueldo_empl,fechaPago_empl from pagoempleado\n" +
                                "inner join empleado on Empleado_id_empleado=id_empleado;";
                mostrarPago(emple,sSQL,emplea,costo,fecha);
            }else{
                String sSQL = "select nombre_empl,apellido_empl,pagoempleado.sueldo_empl,fechaPago_empl from pagoempleado\n" +
                                "inner join empleado on Empleado_id_empleado=id_empleado "
                        + "where fechaPago_empl BETWEEN CAST('"+formatofecha.format(fInicio)+"' AS DATE) AND CAST('"+formatofecha.format(fFin)+"' AS DATE);";
                mostrarPago(emple,sSQL,emplea,costo,fecha);
            }
        }else if(this.cmbTipoPago.getSelectedItem().toString()=="REPARACIONES"){
            String repa = "REPARACION";
            String emplea="tipo_reparacion";
            String costo="costo_repa";
            String fecha="fechaPago_repa";
            if(this.jdinicio.getDate()==null || this.jdfin.getDate()==null){
                String sSQL = "select tipo_reparacion,costo_repa,fechaPago_repa from pagoreparacion\n" +
                                "inner join reparacionclinica on ReparacionClinica_id_raparaClinica=id_raparaClinica;";
                mostrarPago(repa,sSQL,emplea,costo,fecha);
            }else{
                String sSQL = "select tipo_reparacion,costo_repa,fechaPago_repa from pagoreparacion\n" +
                                "inner join reparacionclinica on ReparacionClinica_id_raparaClinica=id_raparaClinica "
                        + "where fechaPago_repa BETWEEN CAST('"+formatofecha.format(fInicio)+"' AS DATE) AND CAST('"+formatofecha.format(fFin)+"' AS DATE);";
                mostrarPago(repa,sSQL,emplea,costo,fecha);
            }
        }else if(this.cmbTipoPago.getSelectedItem().toString()=="EQUIPO"){
            String eq = "EQUIPO";
            String equipo="tipo_equipo";
            String costo="costo_equipo";
            String fecha="fechaPago_equuipo";
            if(this.jdinicio.getDate()==null || this.jdfin.getDate()==null){
                String sSQL = "select tipo_equipo,costo_equipo,fechaPago_equuipo from pagoequipo\n" +
                                "inner join  equipo on Equipo_id_equipo=id_equipo;";
                mostrarPago(eq,sSQL,equipo,costo,fecha);
            }else{
                String sSQL = "select tipo_equipo,costo_equipo,fechaPago_equuipo from pagoequipo\n" +
                                "inner join  equipo on Equipo_id_equipo=id_equipo "
                        + "where fechaPago_equuipo BETWEEN CAST('"+formatofecha.format(fInicio)+"' AS DATE) AND CAST('"+formatofecha.format(fFin)+"' AS DATE);";
                mostrarPago(eq,sSQL,equipo,costo,fecha);
            }
        }
    }//GEN-LAST:event_cmbTipoPagoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        // mostrar dato buscado desde el textbox
        txtBuscar.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtBuscar.getText().toUpperCase());
                txtBuscar.setText(cadena);
                repaint();
                trsFiltro.setRowFilter(RowFilter.regexFilter(txtBuscar.getText(), 0));
                jtPagos.getSelectionModel().setSelectionInterval(0,0);
            }
        });
        trsFiltro = new TableRowSorter(jtPagos.getModel());
        jtPagos.setRowSorter(trsFiltro);
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(this.jdinicio.getDate()!=null && this.jdfin.getDate()!=null && this.cmbTipoPago.getSelectedItem()!="SELECCIONAR"){
            mpago em;
            List<mpago> lista=new ArrayList();
            String dia = Integer.toString(jdinicio.getCalendar().get(Calendar.DAY_OF_MONTH));
            String mes = Integer.toString(jdinicio.getCalendar().get(Calendar.MONTH) + 1);
            String year = Integer.toString(jdinicio.getCalendar().get(Calendar.YEAR));
            String fechaA = (year + "-" + mes+ "-" + dia);
            String date = fechaA; 
            String dia1 = Integer.toString(jdfin.getCalendar().get(Calendar.DAY_OF_MONTH));
            String mes1 = Integer.toString(jdfin.getCalendar().get(Calendar.MONTH) + 1);
            String year1 = Integer.toString(jdfin.getCalendar().get(Calendar.YEAR));
            String fechaA1 = (year + "-" + mes+ "-" + dia);
            String date1 = fechaA1; 
            String fecha1=date;
            String fecha2=date1;
            String servicio=String.valueOf(cmbTipoPago.getSelectedItem());
            String total=txtTotal.getText();
            String fileName = System.getProperty("user.dir") +"/src/Reportes/reportePago.jasper";

            for(int i=0; i<jtPagos.getRowCount();i++)
            {
                em=new mpago(jtPagos.getValueAt(i, 0).toString(),jtPagos.getValueAt(i, 1).toString(),jtPagos.getValueAt(i, 2).toString());
                lista.add(em);
            }

            // Instaciamos el objeto reporte
            //Ponemos la localizacion del reporte creado
            try {
                File theFile = new File(fileName);
                JasperReport reporte;  
                reporte = (JasperReport) JRLoader.loadObject(theFile);
                Map parametro=new HashMap();
                //JOptionPane.showMessageDialog(rootPane, "error" + fecha1+fecha2+servicio+total);
                parametro.put("fecha1", fecha1);
                parametro.put("fecha2",fecha2);
                parametro.put("servicio",servicio);
                parametro.put("total",total);
                parametro.put("logo",this.getClass().getResourceAsStream("/iconos/logo.jpeg"));
                JasperPrint jp = JasperFillManager.fillReport(reporte, parametro,new JRBeanCollectionDataSource(lista));  

                JasperViewer jv = new JasperViewer(jp, false);
                jv.show();
                // Se declara con dispose_on_close para que no se cierre el programa cuando se cierre el reporte
                //Se vizualiza el reporte
            } catch (JRException ex) {
               JOptionPane.showMessageDialog(rootPane, "error" + ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "DEBE DE INGRESAR LOS CAMPOS DE FECHAS Y SELECCIONAR UN TIPO DE PAGO");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        frmayudaVP ayudaVP = new frmayudaVP();
        frmPrincipal.Dpanel.add(ayudaVP);
        ayudaVP.show();
    }//GEN-LAST:event_btnAyudaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cmbTipoPago;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdfin;
    private com.toedter.calendar.JDateChooser jdinicio;
    private javax.swing.JTable jtPagos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JFormattedTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
