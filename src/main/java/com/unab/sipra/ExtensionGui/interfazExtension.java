
package com.unab.sipra.ExtensionGui;


public class interfazExtension extends javax.swing.JFrame {

    
    public interfazExtension() {
        initComponents();
       
       
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cajaNumeroIdentificacionSeguimientoEstudianteExtensionGui = new javax.swing.JTextField();
        botonBuscarSeguimientoEstudianteExtensionGui = new javax.swing.JButton();
        botonListaDeEstudiantesSeguimientoEstudiantesExtensionGui = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cajaNumeroIdentificacionSeguimientoDocenteExtensionGui = new javax.swing.JTextField();
        botonBuscarSeguimientoDocenteEntensionGui = new javax.swing.JButton();
        botonListaDocentesSeguimientoDocenteExtensionGui = new javax.swing.JButton();
        botonSalirInterfazExtension = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Interfaz Extensión");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Seguimiento  Al Estudiante");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Escribe El Numero De Indentificación");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        cajaNumeroIdentificacionSeguimientoEstudianteExtensionGui.setBackground(new java.awt.Color(255, 255, 255));
        cajaNumeroIdentificacionSeguimientoEstudianteExtensionGui.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cajaNumeroIdentificacionSeguimientoEstudianteExtensionGui.setForeground(new java.awt.Color(0, 0, 0));
        cajaNumeroIdentificacionSeguimientoEstudianteExtensionGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        cajaNumeroIdentificacionSeguimientoEstudianteExtensionGui.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(cajaNumeroIdentificacionSeguimientoEstudianteExtensionGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 330, 30));

        botonBuscarSeguimientoEstudianteExtensionGui.setBackground(new java.awt.Color(153, 0, 0));
        botonBuscarSeguimientoEstudianteExtensionGui.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonBuscarSeguimientoEstudianteExtensionGui.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscarSeguimientoEstudianteExtensionGui.setText("BUSCAR");
        botonBuscarSeguimientoEstudianteExtensionGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        botonBuscarSeguimientoEstudianteExtensionGui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(botonBuscarSeguimientoEstudianteExtensionGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 120, 40));

        botonListaDeEstudiantesSeguimientoEstudiantesExtensionGui.setBackground(new java.awt.Color(153, 0, 0));
        botonListaDeEstudiantesSeguimientoEstudiantesExtensionGui.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonListaDeEstudiantesSeguimientoEstudiantesExtensionGui.setForeground(new java.awt.Color(255, 255, 255));
        botonListaDeEstudiantesSeguimientoEstudiantesExtensionGui.setText("VER LISTA COMPLETA DE PRACTICANTES");
        botonListaDeEstudiantesSeguimientoEstudiantesExtensionGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        botonListaDeEstudiantesSeguimientoEstudiantesExtensionGui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonListaDeEstudiantesSeguimientoEstudiantesExtensionGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListaDeEstudiantesSeguimientoEstudiantesExtensionGuiActionPerformed(evt);
            }
        });
        getContentPane().add(botonListaDeEstudiantesSeguimientoEstudiantesExtensionGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 320, 50));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("Seguimiento Al Docente");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Escribe El Numero de Identificación");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, -1, -1));

        cajaNumeroIdentificacionSeguimientoDocenteExtensionGui.setBackground(new java.awt.Color(255, 255, 255));
        cajaNumeroIdentificacionSeguimientoDocenteExtensionGui.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cajaNumeroIdentificacionSeguimientoDocenteExtensionGui.setForeground(new java.awt.Color(0, 0, 0));
        cajaNumeroIdentificacionSeguimientoDocenteExtensionGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        getContentPane().add(cajaNumeroIdentificacionSeguimientoDocenteExtensionGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 330, 30));

        botonBuscarSeguimientoDocenteEntensionGui.setBackground(new java.awt.Color(153, 0, 0));
        botonBuscarSeguimientoDocenteEntensionGui.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonBuscarSeguimientoDocenteEntensionGui.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscarSeguimientoDocenteEntensionGui.setText("BUSCAR");
        botonBuscarSeguimientoDocenteEntensionGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        botonBuscarSeguimientoDocenteEntensionGui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonBuscarSeguimientoDocenteEntensionGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarSeguimientoDocenteEntensionGuiActionPerformed(evt);
            }
        });
        getContentPane().add(botonBuscarSeguimientoDocenteEntensionGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 120, 40));

        botonListaDocentesSeguimientoDocenteExtensionGui.setBackground(new java.awt.Color(153, 0, 0));
        botonListaDocentesSeguimientoDocenteExtensionGui.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonListaDocentesSeguimientoDocenteExtensionGui.setForeground(new java.awt.Color(255, 255, 255));
        botonListaDocentesSeguimientoDocenteExtensionGui.setText(" VER LISTA COMPLETA DE DOCENTES");
        botonListaDocentesSeguimientoDocenteExtensionGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        botonListaDocentesSeguimientoDocenteExtensionGui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonListaDocentesSeguimientoDocenteExtensionGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListaDocentesSeguimientoDocenteExtensionGuiActionPerformed(evt);
            }
        });
        getContentPane().add(botonListaDocentesSeguimientoDocenteExtensionGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 320, 50));

        botonSalirInterfazExtension.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabia\\OneDrive\\Escritorio\\NetBeansProjects\\SIPRA\\src\\main\\java\\com\\unab\\sipra\\recursos\\cerrar-sesion.png")); // NOI18N
        botonSalirInterfazExtension.setContentAreaFilled(false);
        botonSalirInterfazExtension.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(botonSalirInterfazExtension, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabia\\OneDrive\\Escritorio\\NetBeansProjects\\SIPRA\\src\\main\\java\\com\\unab\\sipra\\recursos\\imagen interfaz extension.png")); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 4, true));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonListaDeEstudiantesSeguimientoEstudiantesExtensionGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListaDeEstudiantesSeguimientoEstudiantesExtensionGuiActionPerformed
        
    }//GEN-LAST:event_botonListaDeEstudiantesSeguimientoEstudiantesExtensionGuiActionPerformed

    private void botonBuscarSeguimientoDocenteEntensionGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarSeguimientoDocenteEntensionGuiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBuscarSeguimientoDocenteEntensionGuiActionPerformed

    private void botonListaDocentesSeguimientoDocenteExtensionGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListaDocentesSeguimientoDocenteExtensionGuiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonListaDocentesSeguimientoDocenteExtensionGuiActionPerformed

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
            java.util.logging.Logger.getLogger(interfazExtension.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazExtension.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazExtension.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazExtension.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazExtension().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarSeguimientoDocenteEntensionGui;
    private javax.swing.JButton botonBuscarSeguimientoEstudianteExtensionGui;
    private javax.swing.JButton botonListaDeEstudiantesSeguimientoEstudiantesExtensionGui;
    private javax.swing.JButton botonListaDocentesSeguimientoDocenteExtensionGui;
    private javax.swing.JButton botonSalirInterfazExtension;
    private javax.swing.JTextField cajaNumeroIdentificacionSeguimientoDocenteExtensionGui;
    private javax.swing.JTextField cajaNumeroIdentificacionSeguimientoEstudianteExtensionGui;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

    

    


}



