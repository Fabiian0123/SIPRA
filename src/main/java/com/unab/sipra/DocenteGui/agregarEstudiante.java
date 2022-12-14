package com.unab.sipra.DocenteGui;

import static com.unab.sipra.DocenteGui.interfazDocente.tablaInterfazDocente;
import static com.unab.sipra.DocenteGui.perfilEstudiante.barraProgresoEditarPerfilEstudianteDocenteGui;
import com.unab.sipra.ExtensionGui.interfazExtension;
import com.unab.sipra.ExtensionGui.listaCompletaEstudiantes;
import com.unab.sipra.controladores.ContJprogressBar;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.BoundedRangeModel;
import javax.swing.JProgressBar;
import javax.swing.table.DefaultTableModel;

public class agregarEstudiante extends javax.swing.JFrame {

    public agregarEstudiante() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cajaNombresAgregarEstudianteDocenteGui = new javax.swing.JTextField();
        cajaApellidosAgregarEstudianteGui = new javax.swing.JTextField();
        cajaNumeroIdentidadAgregarEstudianteGui = new javax.swing.JTextField();
        cajaCorreoAgregarEstudianteGui = new javax.swing.JTextField();
        cajaProgramaAgregarEstudianteGui = new javax.swing.JTextField();
        cajaNombreEmpresaAgregarEstudianteGui = new javax.swing.JTextField();
        cajaNombreJefeAgregarEstudianteGui = new javax.swing.JTextField();
        botonGuardarAgregarEstudianteGui = new javax.swing.JButton();
        botonCerrarAgregarEstudianteDocenteGui = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agrega Un Nuevo Estudiante");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cajaNombresAgregarEstudianteDocenteGui.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cajaNombresAgregarEstudianteDocenteGui.setForeground(new java.awt.Color(0, 0, 0));
        cajaNombresAgregarEstudianteDocenteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        getContentPane().add(cajaNombresAgregarEstudianteDocenteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 740, 30));

        cajaApellidosAgregarEstudianteGui.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cajaApellidosAgregarEstudianteGui.setForeground(new java.awt.Color(0, 0, 0));
        cajaApellidosAgregarEstudianteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        cajaApellidosAgregarEstudianteGui.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(cajaApellidosAgregarEstudianteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 740, 30));

        cajaNumeroIdentidadAgregarEstudianteGui.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cajaNumeroIdentidadAgregarEstudianteGui.setForeground(new java.awt.Color(0, 0, 0));
        cajaNumeroIdentidadAgregarEstudianteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        cajaNumeroIdentidadAgregarEstudianteGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNumeroIdentidadAgregarEstudianteGuiActionPerformed(evt);
            }
        });
        getContentPane().add(cajaNumeroIdentidadAgregarEstudianteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 630, 30));

        cajaCorreoAgregarEstudianteGui.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cajaCorreoAgregarEstudianteGui.setForeground(new java.awt.Color(0, 0, 0));
        cajaCorreoAgregarEstudianteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        getContentPane().add(cajaCorreoAgregarEstudianteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 760, 30));

        cajaProgramaAgregarEstudianteGui.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cajaProgramaAgregarEstudianteGui.setForeground(new java.awt.Color(0, 0, 0));
        cajaProgramaAgregarEstudianteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        getContentPane().add(cajaProgramaAgregarEstudianteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 740, 30));

        cajaNombreEmpresaAgregarEstudianteGui.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cajaNombreEmpresaAgregarEstudianteGui.setForeground(new java.awt.Color(0, 0, 0));
        cajaNombreEmpresaAgregarEstudianteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        getContentPane().add(cajaNombreEmpresaAgregarEstudianteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 680, 30));

        cajaNombreJefeAgregarEstudianteGui.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cajaNombreJefeAgregarEstudianteGui.setForeground(new java.awt.Color(0, 0, 0));
        cajaNombreJefeAgregarEstudianteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        cajaNombreJefeAgregarEstudianteGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombreJefeAgregarEstudianteGuiActionPerformed(evt);
            }
        });
        getContentPane().add(cajaNombreJefeAgregarEstudianteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 640, 30));

        botonGuardarAgregarEstudianteGui.setBackground(new java.awt.Color(102, 0, 0));
        botonGuardarAgregarEstudianteGui.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonGuardarAgregarEstudianteGui.setForeground(new java.awt.Color(0, 0, 0));
        botonGuardarAgregarEstudianteGui.setText("GUARDAR");
        botonGuardarAgregarEstudianteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        botonGuardarAgregarEstudianteGui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGuardarAgregarEstudianteGui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonGuardarAgregarEstudianteGuiMouseClicked(evt);
            }
        });
        botonGuardarAgregarEstudianteGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarAgregarEstudianteGuiActionPerformed(evt);
            }
        });
        getContentPane().add(botonGuardarAgregarEstudianteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(767, 420, 130, 40));

        botonCerrarAgregarEstudianteDocenteGui.setBackground(new java.awt.Color(102, 0, 0));
        botonCerrarAgregarEstudianteDocenteGui.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonCerrarAgregarEstudianteDocenteGui.setForeground(new java.awt.Color(0, 0, 0));
        botonCerrarAgregarEstudianteDocenteGui.setText("CERRAR");
        botonCerrarAgregarEstudianteDocenteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        botonCerrarAgregarEstudianteDocenteGui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCerrarAgregarEstudianteDocenteGui.setFocusable(false);
        botonCerrarAgregarEstudianteDocenteGui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCerrarAgregarEstudianteDocenteGuiMouseClicked(evt);
            }
        });
        getContentPane().add(botonCerrarAgregarEstudianteDocenteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 100, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabia\\OneDrive\\Escritorio\\NetBeansProjects\\SIPRA\\src\\main\\java\\com\\unab\\sipra\\recursos\\agregar estudiante imagen.png")); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 4));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cajaNumeroIdentidadAgregarEstudianteGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNumeroIdentidadAgregarEstudianteGuiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNumeroIdentidadAgregarEstudianteGuiActionPerformed

    private void botonCerrarAgregarEstudianteDocenteGuiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarAgregarEstudianteDocenteGuiMouseClicked
        this.dispose();
    }//GEN-LAST:event_botonCerrarAgregarEstudianteDocenteGuiMouseClicked
    
    private void botonGuardarAgregarEstudianteGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarAgregarEstudianteGuiActionPerformed
        Object[] mo = new Object[8];
        DefaultTableModel model = (DefaultTableModel) interfazDocente.tablaInterfazDocente.getModel();
        mo[0] = cajaNombresAgregarEstudianteDocenteGui.getText();
        mo[1] = cajaApellidosAgregarEstudianteGui.getText();
        mo[2] = cajaNumeroIdentidadAgregarEstudianteGui.getText();
        mo[3] = cajaCorreoAgregarEstudianteGui.getText();
        mo[4] = cajaProgramaAgregarEstudianteGui.getText();
        mo[5] = cajaNombreEmpresaAgregarEstudianteGui.getText();
        mo[6] = cajaNombreJefeAgregarEstudianteGui.getText();
        mo[7] = "           0%";
        model.addRow(mo);
        this.dispose();
        
    }//GEN-LAST:event_botonGuardarAgregarEstudianteGuiActionPerformed

    private void cajaNombreJefeAgregarEstudianteGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombreJefeAgregarEstudianteGuiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombreJefeAgregarEstudianteGuiActionPerformed

    private void botonGuardarAgregarEstudianteGuiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGuardarAgregarEstudianteGuiMouseClicked
     
    }//GEN-LAST:event_botonGuardarAgregarEstudianteGuiMouseClicked

    
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
            java.util.logging.Logger.getLogger(agregarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agregarEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrarAgregarEstudianteDocenteGui;
    private javax.swing.JButton botonGuardarAgregarEstudianteGui;
    public javax.swing.JTextField cajaApellidosAgregarEstudianteGui;
    public javax.swing.JTextField cajaCorreoAgregarEstudianteGui;
    public javax.swing.JTextField cajaNombreEmpresaAgregarEstudianteGui;
    public javax.swing.JTextField cajaNombreJefeAgregarEstudianteGui;
    public javax.swing.JTextField cajaNombresAgregarEstudianteDocenteGui;
    public javax.swing.JTextField cajaNumeroIdentidadAgregarEstudianteGui;
    public javax.swing.JTextField cajaProgramaAgregarEstudianteGui;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
