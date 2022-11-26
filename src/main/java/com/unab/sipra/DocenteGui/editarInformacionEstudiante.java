package com.unab.sipra.DocenteGui;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class editarInformacionEstudiante extends javax.swing.JFrame {
    
    
   
    public editarInformacionEstudiante() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cajaNombresEditarPerfilEstudianteDocenteGui = new javax.swing.JTextField();
        cajaApellidosEditarPerfilEstudianteDocenteGui = new javax.swing.JTextField();
        cajaNumieroIdEditarPerfilEstudianteDocenteGui = new javax.swing.JTextField();
        cajaCorreoEditarPerfilEstudianteDocenteGui = new javax.swing.JTextField();
        cajaProgramaEditarPerfilEstudianteDocenteGui = new javax.swing.JTextField();
        cajaNombreEmpresaEditarPerfilEstudianteDocenteGui = new javax.swing.JTextField();
        cajaNombreJefeInmediatoEditarPerfilEstudianteDocenteGui = new javax.swing.JTextField();
        botonGuardarEditarPerfilEstudianteDocenteGui = new javax.swing.JButton();
        botonCancelarEditarInformacionEstudianteDocenteGui = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edita El Perfil Del Estudiante");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cajaNombresEditarPerfilEstudianteDocenteGui.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cajaNombresEditarPerfilEstudianteDocenteGui.setForeground(new java.awt.Color(0, 0, 0));
        cajaNombresEditarPerfilEstudianteDocenteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(cajaNombresEditarPerfilEstudianteDocenteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 760, 30));

        cajaApellidosEditarPerfilEstudianteDocenteGui.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cajaApellidosEditarPerfilEstudianteDocenteGui.setForeground(new java.awt.Color(0, 0, 0));
        cajaApellidosEditarPerfilEstudianteDocenteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        cajaApellidosEditarPerfilEstudianteDocenteGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaApellidosEditarPerfilEstudianteDocenteGuiActionPerformed(evt);
            }
        });
        getContentPane().add(cajaApellidosEditarPerfilEstudianteDocenteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 142, 760, 30));

        cajaNumieroIdEditarPerfilEstudianteDocenteGui.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cajaNumieroIdEditarPerfilEstudianteDocenteGui.setForeground(new java.awt.Color(0, 0, 0));
        cajaNumieroIdEditarPerfilEstudianteDocenteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(cajaNumieroIdEditarPerfilEstudianteDocenteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 192, 650, 30));

        cajaCorreoEditarPerfilEstudianteDocenteGui.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cajaCorreoEditarPerfilEstudianteDocenteGui.setForeground(new java.awt.Color(0, 0, 0));
        cajaCorreoEditarPerfilEstudianteDocenteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(cajaCorreoEditarPerfilEstudianteDocenteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 780, 30));

        cajaProgramaEditarPerfilEstudianteDocenteGui.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cajaProgramaEditarPerfilEstudianteDocenteGui.setForeground(new java.awt.Color(0, 0, 0));
        cajaProgramaEditarPerfilEstudianteDocenteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(cajaProgramaEditarPerfilEstudianteDocenteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 760, 30));

        cajaNombreEmpresaEditarPerfilEstudianteDocenteGui.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cajaNombreEmpresaEditarPerfilEstudianteDocenteGui.setForeground(new java.awt.Color(0, 0, 0));
        cajaNombreEmpresaEditarPerfilEstudianteDocenteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(cajaNombreEmpresaEditarPerfilEstudianteDocenteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 342, 700, 30));

        cajaNombreJefeInmediatoEditarPerfilEstudianteDocenteGui.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cajaNombreJefeInmediatoEditarPerfilEstudianteDocenteGui.setForeground(new java.awt.Color(0, 0, 0));
        cajaNombreJefeInmediatoEditarPerfilEstudianteDocenteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(cajaNombreJefeInmediatoEditarPerfilEstudianteDocenteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 392, 660, 30));

        botonGuardarEditarPerfilEstudianteDocenteGui.setBackground(new java.awt.Color(102, 0, 0));
        botonGuardarEditarPerfilEstudianteDocenteGui.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonGuardarEditarPerfilEstudianteDocenteGui.setForeground(new java.awt.Color(0, 0, 0));
        botonGuardarEditarPerfilEstudianteDocenteGui.setText("GUARDAR");
        botonGuardarEditarPerfilEstudianteDocenteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        botonGuardarEditarPerfilEstudianteDocenteGui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGuardarEditarPerfilEstudianteDocenteGui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonGuardarEditarPerfilEstudianteDocenteGuiMouseClicked(evt);
            }
        });
        getContentPane().add(botonGuardarEditarPerfilEstudianteDocenteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(844, 460, 100, 40));

        botonCancelarEditarInformacionEstudianteDocenteGui.setBackground(new java.awt.Color(102, 0, 0));
        botonCancelarEditarInformacionEstudianteDocenteGui.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonCancelarEditarInformacionEstudianteDocenteGui.setForeground(new java.awt.Color(0, 0, 0));
        botonCancelarEditarInformacionEstudianteDocenteGui.setText("CANCELAR");
        botonCancelarEditarInformacionEstudianteDocenteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        botonCancelarEditarInformacionEstudianteDocenteGui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCancelarEditarInformacionEstudianteDocenteGui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCancelarEditarInformacionEstudianteDocenteGuiMouseClicked(evt);
            }
        });
        getContentPane().add(botonCancelarEditarInformacionEstudianteDocenteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabia\\OneDrive\\Escritorio\\NetBeansProjects\\SIPRA\\src\\main\\java\\com\\unab\\sipra\\recursos\\imagen editar perfi estudiante.png")); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 4, true));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cajaApellidosEditarPerfilEstudianteDocenteGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaApellidosEditarPerfilEstudianteDocenteGuiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaApellidosEditarPerfilEstudianteDocenteGuiActionPerformed

    private void botonGuardarEditarPerfilEstudianteDocenteGuiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGuardarEditarPerfilEstudianteDocenteGuiMouseClicked
        JOptionPane.showMessageDialog(null, "SE HA GUARDADO CORRECTAMENTE");
    }//GEN-LAST:event_botonGuardarEditarPerfilEstudianteDocenteGuiMouseClicked

    private void botonCancelarEditarInformacionEstudianteDocenteGuiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarEditarInformacionEstudianteDocenteGuiMouseClicked
        this.dispose();
    }//GEN-LAST:event_botonCancelarEditarInformacionEstudianteDocenteGuiMouseClicked

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
            java.util.logging.Logger.getLogger(editarInformacionEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editarInformacionEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editarInformacionEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editarInformacionEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editarInformacionEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelarEditarInformacionEstudianteDocenteGui;
    private javax.swing.JButton botonGuardarEditarPerfilEstudianteDocenteGui;
    private javax.swing.JTextField cajaApellidosEditarPerfilEstudianteDocenteGui;
    private javax.swing.JTextField cajaCorreoEditarPerfilEstudianteDocenteGui;
    private javax.swing.JTextField cajaNombreEmpresaEditarPerfilEstudianteDocenteGui;
    private javax.swing.JTextField cajaNombreJefeInmediatoEditarPerfilEstudianteDocenteGui;
    private javax.swing.JTextField cajaNombresEditarPerfilEstudianteDocenteGui;
    private javax.swing.JTextField cajaNumieroIdEditarPerfilEstudianteDocenteGui;
    private javax.swing.JTextField cajaProgramaEditarPerfilEstudianteDocenteGui;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

   
}
