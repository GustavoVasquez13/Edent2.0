
package formularios;

import Clases.ConsultarDatosBD;
import Clases.internalFrameImagen;
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
        setImagenw("img2.jpg");
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

        setClosable(true);
        setIconifiable(true);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel5.setText("Vista de Pacientes de Odontologia General a Editar");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(12, 12, 12)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
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
        }
    }//GEN-LAST:event_jtPacientesMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtPacientes;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
