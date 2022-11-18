package com.unab.sipra.DocenteGui;

import com.unab.sipra.controladores.ControladorAgregarEstudianteDocenteGui;
import com.unab.sipra.controladores.ControladorInterfazDocente;
import com.unab.sipra.controladores.ControladorSubirEvidenciasDocenteGui;
import java.awt.Frame;
import javax.swing.JOptionPane;

public class interfazDocente extends javax.swing.JFrame {

    /**
     * Creates new form interfazDocente
     */
    public interfazDocente() {
        initComponents();
        this.setLocationRelativeTo(null);
     

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cajaListaPracticantesInterfazDocenteGui = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        botonAggEstudianteInterfazDocente = new javax.swing.JButton();
        botonCerrarSesionInterfazDocente = new javax.swing.JButton();
        botonEliminarInterfazDocente = new javax.swing.JButton();
        botonBuscarInterfazDocente = new javax.swing.JButton();
        botonEditarInformacionEstudianteInterfazDocente = new javax.swing.JButton();
        botonSubirEvidenciasInterfazDocente = new javax.swing.JButton();
        botonMinimizarInterfazDocente = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Interfaz Docente");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        botonAggEstudianteInterfazDocente.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabia\\OneDrive\\Escritorio\\NetBeansProjects\\SIPRA\\src\\main\\java\\com\\unab\\sipra\\recursos\\agregar.png")); // NOI18N
        botonAggEstudianteInterfazDocente.setBorder(null);
        botonAggEstudianteInterfazDocente.setContentAreaFilled(false);
        botonAggEstudianteInterfazDocente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAggEstudianteInterfazDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAggEstudianteInterfazDocenteMouseClicked(evt);
            }
        });
        getContentPane().add(botonAggEstudianteInterfazDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, -1, 40));

        botonCerrarSesionInterfazDocente.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabia\\OneDrive\\Escritorio\\NetBeansProjects\\SIPRA\\src\\main\\java\\com\\unab\\sipra\\recursos\\cerrar-sesion.png")); // NOI18N
        botonCerrarSesionInterfazDocente.setBorder(null);
        botonCerrarSesionInterfazDocente.setContentAreaFilled(false);
        botonCerrarSesionInterfazDocente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCerrarSesionInterfazDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCerrarSesionInterfazDocenteMouseClicked(evt);
            }
        });
        getContentPane().add(botonCerrarSesionInterfazDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 50, 40, -1));

        botonEliminarInterfazDocente.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabia\\OneDrive\\Escritorio\\NetBeansProjects\\SIPRA\\src\\main\\java\\com\\unab\\sipra\\recursos\\borrar.png")); // NOI18N
        botonEliminarInterfazDocente.setBorder(null);
        botonEliminarInterfazDocente.setContentAreaFilled(false);
        botonEliminarInterfazDocente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(botonEliminarInterfazDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 30, 30));

        botonBuscarInterfazDocente.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabia\\OneDrive\\Escritorio\\NetBeansProjects\\SIPRA\\src\\main\\java\\com\\unab\\sipra\\recursos\\buscar.png")); // NOI18N
        botonBuscarInterfazDocente.setBorder(null);
        botonBuscarInterfazDocente.setContentAreaFilled(false);
        botonBuscarInterfazDocente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(botonBuscarInterfazDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, -1, 30));

        botonEditarInformacionEstudianteInterfazDocente.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabia\\OneDrive\\Escritorio\\NetBeansProjects\\SIPRA\\src\\main\\java\\com\\unab\\sipra\\recursos\\editar.png")); // NOI18N
        botonEditarInformacionEstudianteInterfazDocente.setBorder(null);
        botonEditarInformacionEstudianteInterfazDocente.setContentAreaFilled(false);
        botonEditarInformacionEstudianteInterfazDocente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEditarInformacionEstudianteInterfazDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEditarInformacionEstudianteInterfazDocenteMouseClicked(evt);
            }
        });
        botonEditarInformacionEstudianteInterfazDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarInformacionEstudianteInterfazDocenteActionPerformed(evt);
            }
        });
        getContentPane().add(botonEditarInformacionEstudianteInterfazDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 50, -1, 40));

        botonSubirEvidenciasInterfazDocente.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabia\\OneDrive\\Escritorio\\NetBeansProjects\\SIPRA\\src\\main\\java\\com\\unab\\sipra\\recursos\\subir (2).png")); // NOI18N
        botonSubirEvidenciasInterfazDocente.setBorder(null);
        botonSubirEvidenciasInterfazDocente.setContentAreaFilled(false);
        botonSubirEvidenciasInterfazDocente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSubirEvidenciasInterfazDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSubirEvidenciasInterfazDocenteMouseClicked(evt);
            }
        });
        getContentPane().add(botonSubirEvidenciasInterfazDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, -1, 30));

        botonMinimizarInterfazDocente.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabia\\OneDrive\\Escritorio\\NetBeansProjects\\SIPRA\\src\\main\\java\\com\\unab\\sipra\\recursos\\minimizar (2).png")); // NOI18N
        botonMinimizarInterfazDocente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMinimizarInterfazDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMinimizarInterfazDocenteMouseClicked(evt);
            }
        });
        getContentPane().add(botonMinimizarInterfazDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabia\\OneDrive\\Escritorio\\NetBeansProjects\\SIPRA\\src\\main\\java\\com\\unab\\sipra\\recursos\\interfazDocenteSI.png")); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0), 4));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEditarInformacionEstudianteInterfazDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarInformacionEstudianteInterfazDocenteActionPerformed
        ControladorInterfazDocente.btn_editarInfo();
    }//GEN-LAST:event_botonEditarInformacionEstudianteInterfazDocenteActionPerformed

    private void botonCerrarSesionInterfazDocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarSesionInterfazDocenteMouseClicked
        int a = JOptionPane.YES_NO_OPTION;
        int muestra = JOptionPane.showConfirmDialog(this, "¿ESTA SEGURO QUE DESEA SALIR?","CERRAR SESIÓN",a);
        if(muestra == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_botonCerrarSesionInterfazDocenteMouseClicked

    private void botonEditarInformacionEstudianteInterfazDocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEditarInformacionEstudianteInterfazDocenteMouseClicked
        
    }//GEN-LAST:event_botonEditarInformacionEstudianteInterfazDocenteMouseClicked

    private void botonMinimizarInterfazDocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMinimizarInterfazDocenteMouseClicked
       this.setState(interfazDocente.ICONIFIED);
    }//GEN-LAST:event_botonMinimizarInterfazDocenteMouseClicked

    private void botonSubirEvidenciasInterfazDocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSubirEvidenciasInterfazDocenteMouseClicked
        ControladorSubirEvidenciasDocenteGui.inicio();
    }//GEN-LAST:event_botonSubirEvidenciasInterfazDocenteMouseClicked

    private void botonAggEstudianteInterfazDocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAggEstudianteInterfazDocenteMouseClicked
        ControladorAgregarEstudianteDocenteGui.inicio();
    }//GEN-LAST:event_botonAggEstudianteInterfazDocenteMouseClicked

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
    private javax.swing.JButton botonAggEstudianteInterfazDocente;
    private javax.swing.JButton botonBuscarInterfazDocente;
    private javax.swing.JButton botonCerrarSesionInterfazDocente;
    private javax.swing.JButton botonEditarInformacionEstudianteInterfazDocente;
    private javax.swing.JButton botonEliminarInterfazDocente;
    private javax.swing.JLabel botonMinimizarInterfazDocente;
    private javax.swing.JButton botonSubirEvidenciasInterfazDocente;
    private javax.swing.JPanel cajaListaPracticantesInterfazDocenteGui;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
