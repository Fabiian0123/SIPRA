/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.unab.sipra.DocenteGui;

/**
 *
 * @author fabia
 */
public class interfazDocente extends javax.swing.JFrame {

    /**
     * Creates new form interfazDocente
     */
    public interfazDocente() {
        setVisible(true);
        this.setLocationRelativeTo(null);
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAgregarEstudianteInterfazDocenteGui = new javax.swing.JButton();
        botonEliminarEstudianteInterfazDocenteGui = new javax.swing.JButton();
        botonSubirEvidenciasInterfazDocenteGui = new javax.swing.JButton();
        botonCerrarSesionInterfazDocenteGui = new javax.swing.JButton();
        botonBuscarEstudianteInterfazDocenteGui = new javax.swing.JButton();
        botonEditarInterfazDocenteGui = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cajaListaPracticantesInterfazDocenteGui = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Interfaz Docente");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonAgregarEstudianteInterfazDocenteGui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/unab/sipra/recursos/agregar.png"))); // NOI18N
        botonAgregarEstudianteInterfazDocenteGui.setContentAreaFilled(false);
        botonAgregarEstudianteInterfazDocenteGui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAgregarEstudianteInterfazDocenteGui.setFocusable(false);
        botonAgregarEstudianteInterfazDocenteGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarEstudianteInterfazDocenteGuiActionPerformed(evt);
            }
        });
        getContentPane().add(botonAgregarEstudianteInterfazDocenteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 50, 40, -1));

        botonEliminarEstudianteInterfazDocenteGui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/unab/sipra/recursos/borrar.png"))); // NOI18N
        botonEliminarEstudianteInterfazDocenteGui.setContentAreaFilled(false);
        botonEliminarEstudianteInterfazDocenteGui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(botonEliminarEstudianteInterfazDocenteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 50, 30, 40));

        botonSubirEvidenciasInterfazDocenteGui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/unab/sipra/recursos/subir (2).png"))); // NOI18N
        botonSubirEvidenciasInterfazDocenteGui.setContentAreaFilled(false);
        botonSubirEvidenciasInterfazDocenteGui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(botonSubirEvidenciasInterfazDocenteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 50, 40, 40));

        botonCerrarSesionInterfazDocenteGui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/unab/sipra/recursos/cerrar-sesion.png"))); // NOI18N
        botonCerrarSesionInterfazDocenteGui.setContentAreaFilled(false);
        botonCerrarSesionInterfazDocenteGui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(botonCerrarSesionInterfazDocenteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 50, 40, 40));

        botonBuscarEstudianteInterfazDocenteGui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/unab/sipra/recursos/buscar.png"))); // NOI18N
        botonBuscarEstudianteInterfazDocenteGui.setContentAreaFilled(false);
        botonBuscarEstudianteInterfazDocenteGui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(botonBuscarEstudianteInterfazDocenteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, 40, 40));

        botonEditarInterfazDocenteGui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/unab/sipra/recursos/editar.png"))); // NOI18N
        botonEditarInterfazDocenteGui.setContentAreaFilled(false);
        botonEditarInterfazDocenteGui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(botonEditarInterfazDocenteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 40, 40));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombres y Apellidos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 190, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Numero de Documento");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 210, 20));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Avance");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, -1, -1));

        cajaListaPracticantesInterfazDocenteGui.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 956, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel3);

        javax.swing.GroupLayout cajaListaPracticantesInterfazDocenteGuiLayout = new javax.swing.GroupLayout(cajaListaPracticantesInterfazDocenteGui);
        cajaListaPracticantesInterfazDocenteGui.setLayout(cajaListaPracticantesInterfazDocenteGuiLayout);
        cajaListaPracticantesInterfazDocenteGuiLayout.setHorizontalGroup(
            cajaListaPracticantesInterfazDocenteGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
        );
        cajaListaPracticantesInterfazDocenteGuiLayout.setVerticalGroup(
            cajaListaPracticantesInterfazDocenteGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cajaListaPracticantesInterfazDocenteGuiLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(cajaListaPracticantesInterfazDocenteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 970, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabia\\OneDrive\\Escritorio\\NetBeansProjects\\SIPRA\\src\\main\\java\\com\\unab\\sipra\\recursos\\interfazDocenteSI.png")); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0), 4));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarEstudianteInterfazDocenteGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarEstudianteInterfazDocenteGuiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAgregarEstudianteInterfazDocenteGuiActionPerformed

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
            java.util.logging.Logger.getLogger(interfazDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazDocente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarEstudianteInterfazDocenteGui;
    private javax.swing.JButton botonBuscarEstudianteInterfazDocenteGui;
    private javax.swing.JButton botonCerrarSesionInterfazDocenteGui;
    private javax.swing.JButton botonEditarInterfazDocenteGui;
    private javax.swing.JButton botonEliminarEstudianteInterfazDocenteGui;
    private javax.swing.JButton botonSubirEvidenciasInterfazDocenteGui;
    private javax.swing.JPanel cajaListaPracticantesInterfazDocenteGui;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
