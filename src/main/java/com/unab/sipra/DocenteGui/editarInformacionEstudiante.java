/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.unab.sipra.DocenteGui;

/**
 *
 * @author fabia
 */
public class editarInformacionEstudiante extends javax.swing.JFrame {

    /**
     * Creates new form editarInformacionEstudiante
     */
    public editarInformacionEstudiante() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edita El Perfil Del Estudiante");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cajaNombresEditarPerfilEstudianteDocenteGui.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cajaNombresEditarPerfilEstudianteDocenteGui.setForeground(new java.awt.Color(255, 255, 255));
        cajaNombresEditarPerfilEstudianteDocenteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(cajaNombresEditarPerfilEstudianteDocenteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 760, 30));

        cajaApellidosEditarPerfilEstudianteDocenteGui.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cajaApellidosEditarPerfilEstudianteDocenteGui.setForeground(new java.awt.Color(255, 255, 255));
        cajaApellidosEditarPerfilEstudianteDocenteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        cajaApellidosEditarPerfilEstudianteDocenteGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaApellidosEditarPerfilEstudianteDocenteGuiActionPerformed(evt);
            }
        });
        getContentPane().add(cajaApellidosEditarPerfilEstudianteDocenteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 142, 760, 30));

        cajaNumieroIdEditarPerfilEstudianteDocenteGui.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cajaNumieroIdEditarPerfilEstudianteDocenteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(cajaNumieroIdEditarPerfilEstudianteDocenteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 192, 650, 30));

        cajaCorreoEditarPerfilEstudianteDocenteGui.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cajaCorreoEditarPerfilEstudianteDocenteGui.setForeground(new java.awt.Color(255, 255, 255));
        cajaCorreoEditarPerfilEstudianteDocenteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(cajaCorreoEditarPerfilEstudianteDocenteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 780, 30));

        cajaProgramaEditarPerfilEstudianteDocenteGui.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cajaProgramaEditarPerfilEstudianteDocenteGui.setForeground(new java.awt.Color(255, 255, 255));
        cajaProgramaEditarPerfilEstudianteDocenteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(cajaProgramaEditarPerfilEstudianteDocenteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 760, 30));

        cajaNombreEmpresaEditarPerfilEstudianteDocenteGui.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cajaNombreEmpresaEditarPerfilEstudianteDocenteGui.setForeground(new java.awt.Color(255, 255, 255));
        cajaNombreEmpresaEditarPerfilEstudianteDocenteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(cajaNombreEmpresaEditarPerfilEstudianteDocenteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 342, 700, 30));

        cajaNombreJefeInmediatoEditarPerfilEstudianteDocenteGui.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cajaNombreJefeInmediatoEditarPerfilEstudianteDocenteGui.setForeground(new java.awt.Color(255, 255, 255));
        cajaNombreJefeInmediatoEditarPerfilEstudianteDocenteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(cajaNombreJefeInmediatoEditarPerfilEstudianteDocenteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 392, 660, 30));

        botonGuardarEditarPerfilEstudianteDocenteGui.setBackground(new java.awt.Color(153, 0, 0));
        botonGuardarEditarPerfilEstudianteDocenteGui.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonGuardarEditarPerfilEstudianteDocenteGui.setForeground(new java.awt.Color(255, 255, 255));
        botonGuardarEditarPerfilEstudianteDocenteGui.setText("GUARDAR");
        botonGuardarEditarPerfilEstudianteDocenteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        botonGuardarEditarPerfilEstudianteDocenteGui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(botonGuardarEditarPerfilEstudianteDocenteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(844, 460, 100, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabia\\OneDrive\\Escritorio\\NetBeansProjects\\SIPRA\\src\\main\\java\\com\\unab\\sipra\\recursos\\imagen editar perfi estudiante.png")); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 4, true));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cajaApellidosEditarPerfilEstudianteDocenteGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaApellidosEditarPerfilEstudianteDocenteGuiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaApellidosEditarPerfilEstudianteDocenteGuiActionPerformed

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