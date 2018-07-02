
package formularios;

import Clases.ConsultarDatosBD;
import Clases.internalFrameImagen;
import static formularios.ExpedienteGeneral.txtapellido;
import static formularios.ExpedienteGeneral.txtdireccion;
import static formularios.ExpedienteGeneral.txtedad;
import static formularios.ExpedienteGeneral.txtnombre;
import static formularios.ExpedienteGeneral.txttelefono;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;

public class frmEditarPG extends internalFrameImagen {
 private TableRowSorter trsFiltro;
    
    public frmEditarPG() {
        initComponents();
        setImagenw("fondo.jpg");
        mostrarpacientes();
    }
private void mostrarpacientes() {
        try {
            DefaultTableModel modelo;
            ConsultarDatosBD Mostrarp = new ConsultarDatosBD();
            modelo = Mostrarp.mostrarPacientes1();
            jtPacientes.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS AL CONSULTAR LOS DATOS DE SERVICIOS");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPacientes = new javax.swing.JTable();
        lblcodigo = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Vista de Pacientes de Odontologia General ");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Buscar");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        jtPacientes = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jtPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtPacientes.getTableHeader().setReorderingAllowed(false);
        jtPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtPacientesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtPacientes);

        lblcodigo.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblcodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblcodigo.setText("codigo");

        lblnombre.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblnombre.setForeground(new java.awt.Color(255, 255, 255));
        lblnombre.setText("nombre");

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 102, 204));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblcodigo)
                        .addGap(52, 52, 52)
                        .addComponent(lblnombre)
                        .addGap(120, 120, 120)
                        .addComponent(btnCancelar)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        //  se utiliza para filtrar los datos mostrados en el jtable
        this.txtBuscar.addKeyListener(new KeyAdapter(){
            public void keyReleased(final KeyEvent e){
                String cadena = (txtBuscar.getText());
                txtBuscar.setText(cadena);
                repaint();
                trsFiltro.setRowFilter(RowFilter.regexFilter(txtBuscar.getText().toUpperCase(), 1));
                jtPacientes.getSelectionModel().setSelectionInterval(0, 0);
            }
        });
        trsFiltro = new TableRowSorter(jtPacientes.getModel());
        jtPacientes.setRowSorter(trsFiltro);

    }//GEN-LAST:event_txtBuscarKeyTyped

    private void jtPacientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPacientesMousePressed
        if(evt.getClickCount()==2){
            int fila =jtPacientes.getSelectedRow();
            String nombre, edad,telefono,direccion;
            String apellido,fecha,id;
            nombre=jtPacientes.getValueAt(fila, 1).toString();
            apellido=jtPacientes.getValueAt(fila, 2).toString();
//            fecha=jtPacientes.getValueAt(fila, 6).toString();
            id=jtPacientes.getValueAt(fila, 0).toString();
            edad = jtPacientes.getValueAt(fila,5).toString();
            telefono = jtPacientes.getValueAt(fila,4).toString();
            direccion = jtPacientes.getValueAt(fila,3).toString();
            

//            ExpedienteGeneral.fecha.setText(fecha);
            ExpedienteGeneral.txtnombre.setText(nombre);
            ExpedienteGeneral.lblid.setText(id);
            ExpedienteGeneral.txtapellido.setText(apellido);
            ExpedienteGeneral.txtedad.setText(edad);
            ExpedienteGeneral.txttelefono.setText(telefono);
            ExpedienteGeneral.txtdireccion.setText(direccion);
            this.dispose();
             ExpedienteGeneral.btneditar.setEnabled(true);
        
        }
        
        
        ExpedienteGeneral.fecha.setEnabled(true);
        ExpedienteGeneral.txtedad.setEnabled(true);
        ExpedienteGeneral.txttelefono.setEnabled(true);
        ExpedienteGeneral.txtnombre.setEnabled(true);
        ExpedienteGeneral.txtapellido.setEnabled(true);
        ExpedienteGeneral.txtdireccion.setEnabled(true);
        ExpedienteGeneral.btneditar.setEnabled(true);
        ExpedienteGeneral.btnbuscaredicion.setEnabled(false);
        ExpedienteGeneral.btnGuardar.setEnabled(false);
   
    }//GEN-LAST:event_jtPacientesMousePressed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtPacientes;
    private javax.swing.JLabel lblcodigo;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
