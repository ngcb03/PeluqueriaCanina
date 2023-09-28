package com.mycompany.peluqueriacanina.gui;

import com.mycompany.peluqueriacanina.logica.Cliente;
import com.mycompany.peluqueriacanina.logica.Controladora;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class ModClientes extends javax.swing.JFrame {

    private static int num_cliente;
    
    public ModClientes(int num_cliente) {
        ModClientes.num_cliente = num_cliente;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtMascota = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtRaza = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbAlergico = new javax.swing.JComboBox<>();
        cmbAtEspecial = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnGuadar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCelDuenio = new javax.swing.JTextField();
        txtDuenio = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 56)); // NOI18N
        jLabel1.setText("Actualizar clientes");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Der. reservados: Nicolas Camargo Buelvas");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Nombre mascota:");

        txtMascota.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Raza:");

        txtRaza.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Color:");

        txtColor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("¿Alergico?:");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("¿At. Especial?:");

        cmbAlergico.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cmbAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SI", "NO" }));

        cmbAtEspecial.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cmbAtEspecial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SI", "NO" }));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Observaciones:");

        txtObservaciones.setColumns(20);
        txtObservaciones.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtObservaciones);

        btnLimpiar.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        btnLimpiar.setText(" Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuadar.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnGuadar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        btnGuadar.setText("Guardar cambios");
        btnGuadar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuadarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("Nombre dueño:");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("Cel. Dueño:");

        txtCelDuenio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtDuenio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imagen_fondo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel6))))
                                    .addGap(29, 29, 29))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addGap(25, 25, 25)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDuenio)
                            .addComponent(txtCelDuenio)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(txtRaza)
                            .addComponent(txtColor)
                            .addComponent(cmbAtEspecial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbAlergico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMascota)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuadar)))
                .addGap(28, 28, 28)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCelDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbAtEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuadar)
                    .addComponent(btnLimpiar))
                .addContainerGap(9, Short.MAX_VALUE))
            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        btnVolver.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/volver.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 33, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnVolver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        ModClientes.cargarRegClientes();
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuadarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuadarActionPerformed
        
        String duenio = txtDuenio.getText();
        String celDuenio = txtCelDuenio.getText();
        String mascota = txtMascota.getText();
        String raza = txtRaza.getText();
        String color = txtColor.getText();
        String alergico = String.valueOf(cmbAlergico.getSelectedItem());
        String atEspecial = String.valueOf(cmbAtEspecial.getSelectedItem());
        String observaciones = String.valueOf(txtObservaciones.getText());
        
        if(duenio.isEmpty() || celDuenio.isEmpty() || mascota.isEmpty() || 
                raza.isEmpty() || color.isEmpty() || alergico.isEmpty() || 
                atEspecial.isEmpty() || observaciones.isEmpty()){
            
            ModClientes.mensajeEmergente("¡Operación incorrecta!", "error", "¡Faltan campos por llenar!");
            
        } else {
            limpiarCampos();
            Controladora.getInstance().modificarCliente(ModClientes.num_cliente, duenio, celDuenio, mascota, raza, color, alergico, atEspecial, observaciones);
            ModClientes.mensajeEmergente("¡Operación exitosa!", "info", "¡El cliente a sido actualizado correctamente!");
            
            VerClientes verClientes = new VerClientes();
            verClientes.setVisible(true);
            verClientes.setLocationRelativeTo(null);
            verClientes.setResizable(false);
            dispose();
            
        }
        
    }//GEN-LAST:event_btnGuadarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        // carga datos cliente a actualizar
        Cliente cliente = Controladora.getInstance().buscarCliente(ModClientes.num_cliente);
        
        txtDuenio.setText(cliente.getDuenio().getNombreDuenio());
        txtCelDuenio.setText(cliente.getDuenio().getCelDuenio());
        txtMascota.setText(cliente.getMascota().getNombreMascota());
        txtRaza.setText(cliente.getMascota().getRaza());
        txtColor.setText(cliente.getMascota().getColor());
        
        if(cliente.getMascota().getAlergico().equals("SI")){
           cmbAlergico.setSelectedIndex(1); 
        } else {
            cmbAlergico.setSelectedIndex(2);
        }
        
        if(cliente.getAtencionEspecial().equals("SI")){
            cmbAtEspecial.setSelectedIndex(1); 
        } else {
            cmbAtEspecial.setSelectedIndex(2);
        }
        
        txtObservaciones.setText(cliente.getObservaciones());
        
    }//GEN-LAST:event_formWindowOpened

    private static void cargarRegClientes (){
        
        VerClientes iguVerClientes = new VerClientes();
        iguVerClientes.setVisible(true);
        iguVerClientes.setLocationRelativeTo(null);
        iguVerClientes.setResizable(false);
        
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
    
    private void limpiarCampos(){
        
        txtDuenio.setText("");
        txtCelDuenio.setText("");
        txtMascota.setText("");
        txtRaza.setText("");
        txtColor.setText("");
        cmbAlergico.setSelectedIndex(0);
        cmbAtEspecial.setSelectedIndex(0);
        txtObservaciones.setText("");
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuadar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbAlergico;
    private javax.swing.JComboBox<String> cmbAtEspecial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCelDuenio;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDuenio;
    private javax.swing.JTextField txtMascota;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables
}
