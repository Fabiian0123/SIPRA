package com.unab.sipra.EstudianteGui;


public class editarTuInformacion extends javax.swing.JFrame {

    
    public editarTuInformacion() {
        initComponents();
        this.setLocationRelativeTo(null);

    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cajaApellidosEditarTuInformacionEstudianteGui = new javax.swing.JTextField();
        cajaNombresEditarTuInformacionEstudianteGui = new javax.swing.JTextField();
        cajaNumeroIdEditarTuInformacionEstudianteGui = new javax.swing.JTextField();
        cajaCorreoEditarTuInformacionEstudianteGui = new javax.swing.JTextField();
        cajaProgramaEditarTuInformacionEstudianteGui = new javax.swing.JTextField();
        botonGuardarEditarEstudianteGui = new javax.swing.JButton();
        botonCerrarEditarTuInformacionEstudianteGui = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Edita Tu Informaición");
        setAlwaysOnTop(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cajaApellidosEditarTuInformacionEstudianteGui.setBackground(new java.awt.Color(255, 255, 255));
        cajaApellidosEditarTuInformacionEstudianteGui.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cajaApellidosEditarTuInformacionEstudianteGui.setForeground(new java.awt.Color(0, 0, 0));
        cajaApellidosEditarTuInformacionEstudianteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(cajaApellidosEditarTuInformacionEstudianteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 370, 30));

        cajaNombresEditarTuInformacionEstudianteGui.setBackground(new java.awt.Color(255, 255, 255));
        cajaNombresEditarTuInformacionEstudianteGui.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cajaNombresEditarTuInformacionEstudianteGui.setForeground(new java.awt.Color(0, 0, 0));
        cajaNombresEditarTuInformacionEstudianteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(cajaNombresEditarTuInformacionEstudianteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 380, 30));

        cajaNumeroIdEditarTuInformacionEstudianteGui.setBackground(new java.awt.Color(255, 255, 255));
        cajaNumeroIdEditarTuInformacionEstudianteGui.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cajaNumeroIdEditarTuInformacionEstudianteGui.setForeground(new java.awt.Color(0, 0, 0));
        cajaNumeroIdEditarTuInformacionEstudianteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        cajaNumeroIdEditarTuInformacionEstudianteGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNumeroIdEditarTuInformacionEstudianteGuiActionPerformed(evt);
            }
        });
        getContentPane().add(cajaNumeroIdEditarTuInformacionEstudianteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 310, 30));

        cajaCorreoEditarTuInformacionEstudianteGui.setBackground(new java.awt.Color(255, 255, 255));
        cajaCorreoEditarTuInformacionEstudianteGui.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cajaCorreoEditarTuInformacionEstudianteGui.setForeground(new java.awt.Color(0, 0, 0));
        cajaCorreoEditarTuInformacionEstudianteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(cajaCorreoEditarTuInformacionEstudianteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 222, 390, 30));

        cajaProgramaEditarTuInformacionEstudianteGui.setBackground(new java.awt.Color(255, 255, 255));
        cajaProgramaEditarTuInformacionEstudianteGui.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cajaProgramaEditarTuInformacionEstudianteGui.setForeground(new java.awt.Color(0, 0, 0));
        cajaProgramaEditarTuInformacionEstudianteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(cajaProgramaEditarTuInformacionEstudianteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 262, 370, 30));

        botonGuardarEditarEstudianteGui.setBackground(new java.awt.Color(102, 0, 0));
        botonGuardarEditarEstudianteGui.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonGuardarEditarEstudianteGui.setForeground(new java.awt.Color(0, 0, 0));
        botonGuardarEditarEstudianteGui.setText("GUARDAR");
        botonGuardarEditarEstudianteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        botonGuardarEditarEstudianteGui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGuardarEditarEstudianteGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarEditarEstudianteGuiActionPerformed(evt);
            }
        });
        getContentPane().add(botonGuardarEditarEstudianteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 120, 40));

        botonCerrarEditarTuInformacionEstudianteGui.setBackground(new java.awt.Color(102, 0, 0));
        botonCerrarEditarTuInformacionEstudianteGui.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonCerrarEditarTuInformacionEstudianteGui.setForeground(new java.awt.Color(0, 0, 0));
        botonCerrarEditarTuInformacionEstudianteGui.setText("CERRAR");
        botonCerrarEditarTuInformacionEstudianteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        botonCerrarEditarTuInformacionEstudianteGui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCerrarEditarTuInformacionEstudianteGui.setFocusable(false);
        botonCerrarEditarTuInformacionEstudianteGui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCerrarEditarTuInformacionEstudianteGuiMouseClicked(evt);
            }
        });
        getContentPane().add(botonCerrarEditarTuInformacionEstudianteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 100, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabia\\OneDrive\\Escritorio\\NetBeansProjects\\SIPRA\\src\\main\\java\\com\\unab\\sipra\\recursos\\editar informacion estudiante imagen.png")); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 4, true));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cajaNumeroIdEditarTuInformacionEstudianteGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNumeroIdEditarTuInformacionEstudianteGuiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNumeroIdEditarTuInformacionEstudianteGuiActionPerformed

    private void botonCerrarEditarTuInformacionEstudianteGuiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarEditarTuInformacionEstudianteGuiMouseClicked
        dispose();
    }//GEN-LAST:event_botonCerrarEditarTuInformacionEstudianteGuiMouseClicked

    private void botonGuardarEditarEstudianteGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarEditarEstudianteGuiActionPerformed
        interfazEstudiante.cajaNombresInterfazEstudiante.setText(cajaNombresEditarTuInformacionEstudianteGui.getText());
        interfazEstudiante.cajaApellidosInterfazEstudiante.setText(cajaApellidosEditarTuInformacionEstudianteGui.getText());
        interfazEstudiante.cajaNumeroIdInterfazEstudiante.setText(cajaNumeroIdEditarTuInformacionEstudianteGui.getText());
        interfazEstudiante.cajaCorreoInterfazEstudiante.setText(cajaCorreoEditarTuInformacionEstudianteGui.getText());
        interfazEstudiante.cajaProgramaInterfazEstudiante.setText(cajaProgramaEditarTuInformacionEstudianteGui.getText());
        this.dispose();  
    }//GEN-LAST:event_botonGuardarEditarEstudianteGuiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(editarTuInformacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editarTuInformacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editarTuInformacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editarTuInformacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editarTuInformacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrarEditarTuInformacionEstudianteGui;
    private javax.swing.JButton botonGuardarEditarEstudianteGui;
    public static javax.swing.JTextField cajaApellidosEditarTuInformacionEstudianteGui;
    public static javax.swing.JTextField cajaCorreoEditarTuInformacionEstudianteGui;
    public static javax.swing.JTextField cajaNombresEditarTuInformacionEstudianteGui;
    public static javax.swing.JTextField cajaNumeroIdEditarTuInformacionEstudianteGui;
    public static javax.swing.JTextField cajaProgramaEditarTuInformacionEstudianteGui;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
