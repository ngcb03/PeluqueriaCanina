package com.mycompany.peluqueriacanina.gui;

import com.mycompany.peluqueriacanina.logica.Cliente;
import com.mycompany.peluqueriacanina.logica.Controladora;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerClientes extends javax.swing.JFrame {

    public VerClientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnElimina = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 56)); // NOI18N
        jLabel1.setText("Visualizar clientes");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Der. reservados: Nicolas Camargo Buelvas");

        btnVolver.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/volver.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaClientes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnEditar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnElimina.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnElimina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnElimina.setText("Eliminar");
        btnElimina.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnElimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnElimina, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel2))))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnElimina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Menu iguMenu = new Menu();
        iguMenu.setVisible(true);
        iguMenu.setLocationRelativeTo(null);
        iguMenu.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaActionPerformed
        
        // control tabla no está vacía
        if(tablaClientes.getRowCount() > 0){
            // control selección registro
            if(tablaClientes.getSelectedRow() != (-1)){
                int num_cliente =  Integer.parseInt(String.valueOf(tablaClientes.getValueAt(
                    tablaClientes.getSelectedRow(), 0)));
                Controladora.getInstance().borrarCliente(num_cliente);
                mensajeEmergente("¡Operación exitosa!", "info", 
                        "¡El cliente a sido eliminado correctamente!");
                cargarTabla();
            } else {
                mensajeEmergente("¡Operación incorrecta!", "error", 
                        "¡No has seleccionado ningún cliente!");
            }
        } else {
            mensajeEmergente("¡Operación incorrecta!", "info", 
                    "¡La existen clientes registrados!");
        }
    }//GEN-LAST:event_btnEliminaActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        // control tabla no está vacía
        if(tablaClientes.getRowCount() > 0){
            // control selección registro
            if(tablaClientes.getSelectedRow() != (-1)){
                int num_cliente =  Integer.parseInt(String.valueOf(tablaClientes.getValueAt(
                    tablaClientes.getSelectedRow(), 0)));
                
                ModClientes modClientes = new ModClientes(num_cliente);
                modClientes.setVisible(true);
                modClientes.setLocationRelativeTo(null);
                modClientes.setResizable(false);
                
                this.dispose();
            } else {
                mensajeEmergente("¡Operación incorrecta!", "error", 
                        "¡No has seleccionado ningún cliente!");
            }
        } else {
            mensajeEmergente("¡Operación incorrecta!", "info", 
                    "¡La existen clientes registrados!");
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void cargarTabla(){
        
        // definir modelo que se quiere que tenga la tabla
        DefaultTableModel auxTablaClientes = new DefaultTableModel() {
            // filas y columnas no editables
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
            
        };
        
        // establecemos nombres de las columnas
        String titulos[] = {"Num" , "Nombre", "Color", "Raza", "Alergico", "At. Esp" , "Observaciones", "Dueño", "Cel"};
        
        // Cargamos lista de titulos para columnas a tabla
        auxTablaClientes.setColumnIdentifiers(titulos);
        
        // carga de datos desde bbdd
        List<Cliente> listaClientes = Controladora.getInstance().traerClientes();
        
        // recorrer las lista y mostrar cada uno de los elementos de la tabla
        if (!listaClientes.isEmpty()){
            for(Cliente cliente: listaClientes){
                Object[] objeto = {cliente.getId() , cliente.getMascota().getNombreMascota(), 
                    cliente.getMascota().getColor(), cliente.getMascota().getRaza(), 
                    cliente.getMascota().getAlergico(), cliente.getAtencionEspecial(), 
                    cliente.getObservaciones(), cliente.getDuenio().getNombreDuenio(), 
                    cliente.getDuenio().getCelDuenio()};
                
                auxTablaClientes.addRow(objeto);
            }
        }
        
        // cargamos modelo con datos a tabla de la interfaz
        tablaClientes.setModel(auxTablaClientes);
        
    }
    
    private static void mensajeEmergente(String titulo, String tipo, String mensaje){
        
        JOptionPane optionPane = new JOptionPane(mensaje);
        
        if(tipo.equalsIgnoreCase("info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if(tipo.equalsIgnoreCase("error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnElimina;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaClientes;
    // End of variables declaration//GEN-END:variables
}
