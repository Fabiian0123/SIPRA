package com.unab.sipra.LoguinGui;

import com.unab.sipra.DocenteGui.interfazDocente;
import com.unab.sipra.controladores.ControladorLoguinSipra;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author fabia
 */
public final class LoguinSipra extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public LoguinSipra() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        this.ocultarContra.setVisible(false);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoRoles = new javax.swing.ButtonGroup();
        cajaUsuarioLoguinSipraGui = new javax.swing.JTextField();
        cajaContraseñaLoguinSipraGui = new javax.swing.JPasswordField();
        cajaCheckEstudianteLoguinSipraGui = new javax.swing.JCheckBox();
        cajaCheckDocenteLoguinSipraGui = new javax.swing.JCheckBox();
        cajaCheckExtensionLoguinSipraGui = new javax.swing.JCheckBox();
        btnEmpezar = new javax.swing.JButton();
        botonOlvidasteUsuarioContraseña = new javax.swing.JLabel();
        verContra = new javax.swing.JLabel();
        ocultarContra = new javax.swing.JLabel();
        botonMinimizar = new javax.swing.JLabel();
        botonCerrar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Loguin Sipra");
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cajaUsuarioLoguinSipraGui.setBackground(new java.awt.Color(255, 255, 255));
        cajaUsuarioLoguinSipraGui.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cajaUsuarioLoguinSipraGui.setForeground(new java.awt.Color(0, 0, 0));
        cajaUsuarioLoguinSipraGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 3, true));
        cajaUsuarioLoguinSipraGui.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(cajaUsuarioLoguinSipraGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 280, 30));

        cajaContraseñaLoguinSipraGui.setBackground(new java.awt.Color(255, 255, 255));
        cajaContraseñaLoguinSipraGui.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cajaContraseñaLoguinSipraGui.setForeground(new java.awt.Color(0, 0, 0));
        cajaContraseñaLoguinSipraGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 3, true));
        cajaContraseñaLoguinSipraGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaContraseñaLoguinSipraGuiActionPerformed(evt);
            }
        });
        getContentPane().add(cajaContraseñaLoguinSipraGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 312, 280, 30));

        grupoRoles.add(cajaCheckEstudianteLoguinSipraGui);
        cajaCheckEstudianteLoguinSipraGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        cajaCheckEstudianteLoguinSipraGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaCheckEstudianteLoguinSipraGuiActionPerformed(evt);
            }
        });
        getContentPane().add(cajaCheckEstudianteLoguinSipraGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 20, 20));

        grupoRoles.add(cajaCheckDocenteLoguinSipraGui);
        cajaCheckDocenteLoguinSipraGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaCheckDocenteLoguinSipraGuiActionPerformed(evt);
            }
        });
        getContentPane().add(cajaCheckDocenteLoguinSipraGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, -1, -1));

        grupoRoles.add(cajaCheckExtensionLoguinSipraGui);
        cajaCheckExtensionLoguinSipraGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaCheckExtensionLoguinSipraGuiActionPerformed(evt);
            }
        });
        getContentPane().add(cajaCheckExtensionLoguinSipraGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, -1, -1));

        btnEmpezar.setBackground(new java.awt.Color(204, 0, 0));
        btnEmpezar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        btnEmpezar.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpezar.setText("EMPEZAR");
        btnEmpezar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        btnEmpezar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpezarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmpezar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 160, 40));

        botonOlvidasteUsuarioContraseña.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        botonOlvidasteUsuarioContraseña.setForeground(new java.awt.Color(0, 0, 0));
        botonOlvidasteUsuarioContraseña.setText("¿Olvidaste tu usuario o contraseña?");
        botonOlvidasteUsuarioContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonOlvidasteUsuarioContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonOlvidasteUsuarioContraseñaMouseClicked(evt);
            }
        });
        getContentPane().add(botonOlvidasteUsuarioContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 180, -1));

        verContra.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabia\\OneDrive\\Escritorio\\NetBeansProjects\\SIPRA\\src\\main\\java\\com\\unab\\sipra\\recursos\\ver.png")); // NOI18N
        verContra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verContraMouseClicked(evt);
            }
        });
        getContentPane().add(verContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, -1, 20));

        ocultarContra.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabia\\OneDrive\\Escritorio\\NetBeansProjects\\SIPRA\\src\\main\\java\\com\\unab\\sipra\\recursos\\oculto.png")); // NOI18N
        ocultarContra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ocultarContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultarContraMouseClicked(evt);
            }
        });
        getContentPane().add(ocultarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, -1, -1));

        botonMinimizar.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabia\\OneDrive\\Escritorio\\NetBeansProjects\\SIPRA\\src\\main\\java\\com\\unab\\sipra\\recursos\\minimizar (1).png")); // NOI18N
        botonMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMinimizar.setMaximumSize(new java.awt.Dimension(35, 35));
        botonMinimizar.setMinimumSize(new java.awt.Dimension(35, 35));
        botonMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMinimizarMouseClicked(evt);
            }
        });
        getContentPane().add(botonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 40, 40));

        botonCerrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabia\\OneDrive\\Escritorio\\NetBeansProjects\\SIPRA\\src\\main\\java\\com\\unab\\sipra\\recursos\\cerca (1).png")); // NOI18N
        botonCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCerrarMouseClicked(evt);
            }
        });
        getContentPane().add(botonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabia\\OneDrive\\Escritorio\\NetBeansProjects\\SIPRA\\src\\main\\java\\com\\unab\\sipra\\recursos\\loginSipra00.png")); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 4, true));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cajaContraseñaLoguinSipraGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaContraseñaLoguinSipraGuiActionPerformed
      
    }//GEN-LAST:event_cajaContraseñaLoguinSipraGuiActionPerformed

    private void cajaCheckEstudianteLoguinSipraGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaCheckEstudianteLoguinSipraGuiActionPerformed
        ControladorLoguinSipra.onCheckRoles(cajaCheckEstudianteLoguinSipraGui, cajaCheckDocenteLoguinSipraGui, cajaCheckExtensionLoguinSipraGui);
        
    }//GEN-LAST:event_cajaCheckEstudianteLoguinSipraGuiActionPerformed

    private void botonOlvidasteUsuarioContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonOlvidasteUsuarioContraseñaMouseClicked
        JOptionPane.showMessageDialog(null, "DIRIGETE AL DEPARTAMENTO DE SISTEMAS");
    }//GEN-LAST:event_botonOlvidasteUsuarioContraseñaMouseClicked

    private void btnEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpezarActionPerformed
       ControladorLoguinSipra.btnEmpezar(cajaCheckEstudianteLoguinSipraGui, cajaCheckDocenteLoguinSipraGui, cajaCheckExtensionLoguinSipraGui);
    }//GEN-LAST:event_btnEmpezarActionPerformed

    private void verContraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verContraMouseClicked
        verContra.setVisible(false);
        ocultarContra.setVisible(true);
        cajaContraseñaLoguinSipraGui.setEchoChar((char)0);
        
    }//GEN-LAST:event_verContraMouseClicked

    private void ocultarContraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultarContraMouseClicked
        verContra.setVisible(true);
        ocultarContra.setVisible(false);
        cajaContraseñaLoguinSipraGui.setEchoChar('●');
    }//GEN-LAST:event_ocultarContraMouseClicked

    private void botonMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMinimizarMouseClicked
       this.setState(LoguinSipra.ICONIFIED);
    }//GEN-LAST:event_botonMinimizarMouseClicked

    private void botonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarMouseClicked
       int a = JOptionPane.YES_NO_OPTION;
        int muestra = JOptionPane.showConfirmDialog(this, "¿ESTA SEGURO QUE DESEA SALIR?","CERRAR SESIÓN",a);
        if(muestra == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_botonCerrarMouseClicked

    private void cajaCheckExtensionLoguinSipraGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaCheckExtensionLoguinSipraGuiActionPerformed
        ControladorLoguinSipra.onCheckRoles(cajaCheckEstudianteLoguinSipraGui, cajaCheckDocenteLoguinSipraGui, cajaCheckExtensionLoguinSipraGui);
        
    }//GEN-LAST:event_cajaCheckExtensionLoguinSipraGuiActionPerformed

    private void cajaCheckDocenteLoguinSipraGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaCheckDocenteLoguinSipraGuiActionPerformed
       ControladorLoguinSipra.onCheckRoles(cajaCheckEstudianteLoguinSipraGui, cajaCheckDocenteLoguinSipraGui, cajaCheckExtensionLoguinSipraGui);
        
    }//GEN-LAST:event_cajaCheckDocenteLoguinSipraGuiActionPerformed
    
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
            java.util.logging.Logger.getLogger(LoguinSipra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoguinSipra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoguinSipra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoguinSipra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoguinSipra().setVisible(true);
            }
        });
    }

    public JPasswordField getCajaContraseñaLoguinSipraGui() {
        return cajaContraseñaLoguinSipraGui;
    }

    public void setCajaContraseñaLoguinSipraGui(JPasswordField cajaContraseñaLoguinSipraGui) {
        this.cajaContraseñaLoguinSipraGui = cajaContraseñaLoguinSipraGui;
    }

    public JTextField getCajaUsuarioLoguinSipraGui() {
        return cajaUsuarioLoguinSipraGui;
    }

    public void setCajaUsuarioLoguinSipraGui(JTextField cajaUsuarioLoguinSipraGui) {
        this.cajaUsuarioLoguinSipraGui = cajaUsuarioLoguinSipraGui;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonCerrar;
    private javax.swing.JLabel botonMinimizar;
    private javax.swing.JLabel botonOlvidasteUsuarioContraseña;
    private javax.swing.JButton btnEmpezar;
    private javax.swing.JCheckBox cajaCheckDocenteLoguinSipraGui;
    private javax.swing.JCheckBox cajaCheckEstudianteLoguinSipraGui;
    private javax.swing.JCheckBox cajaCheckExtensionLoguinSipraGui;
    private javax.swing.JPasswordField cajaContraseñaLoguinSipraGui;
    private javax.swing.JTextField cajaUsuarioLoguinSipraGui;
    private javax.swing.ButtonGroup grupoRoles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel ocultarContra;
    private javax.swing.JLabel verContra;
    // End of variables declaration//GEN-END:variables

    private static class image {

        public image() {
        }
    }
}
