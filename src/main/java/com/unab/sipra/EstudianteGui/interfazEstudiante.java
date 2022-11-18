package com.unab.sipra.EstudianteGui;

import com.unab.sipra.controladores.ControladorEditarTuInformacion;


public class interfazEstudiante extends javax.swing.JFrame {

    
    public interfazEstudiante() {
        initComponents();
        this.setLocationRelativeTo(null);
    
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cajaFotoInterfazEstudiante = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cajaNombresInterfazEstudiante = new javax.swing.JTextField();
        cajaApellidosInterfazEstudiante = new javax.swing.JTextField();
        cajaNumeroIdInterfazEstudiante = new javax.swing.JTextField();
        cajaCorreoInterfazEstudiante = new javax.swing.JTextField();
        cajaProgramaInterfazEstudiante = new javax.swing.JTextField();
        botonEditarInterfazEstudiante = new javax.swing.JButton();
        botonRealizaAutoevaluacionInterfazEstudiante = new javax.swing.JButton();
        botonAgregarInformacionEmpresaInterfazDocente = new javax.swing.JButton();
        botonAdjuntaPpaInterfazEstudiante = new javax.swing.JButton();
        botonEvaluacionFinalInterfazEstudiante = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        barraAvanceInterfazEstudiante = new javax.swing.JProgressBar();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nombreDelPPA = new javax.swing.JLabel();
        botonCerrarSesionInterfazEstudiante = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Interfaz Estudiante");
        setAlwaysOnTop(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cajaFotoInterfazEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        cajaFotoInterfazEstudiante.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        javax.swing.GroupLayout cajaFotoInterfazEstudianteLayout = new javax.swing.GroupLayout(cajaFotoInterfazEstudiante);
        cajaFotoInterfazEstudiante.setLayout(cajaFotoInterfazEstudianteLayout);
        cajaFotoInterfazEstudianteLayout.setHorizontalGroup(
            cajaFotoInterfazEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 152, Short.MAX_VALUE)
        );
        cajaFotoInterfazEstudianteLayout.setVerticalGroup(
            cajaFotoInterfazEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
        );

        getContentPane().add(cajaFotoInterfazEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 160, 150));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Tu Información");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Apellidos:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Numero de Identidad:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Correo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Programa:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombres:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        cajaNombresInterfazEstudiante.setEditable(false);
        cajaNombresInterfazEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        cajaNombresInterfazEstudiante.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cajaNombresInterfazEstudiante.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(cajaNombresInterfazEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 220, -1));

        cajaApellidosInterfazEstudiante.setEditable(false);
        cajaApellidosInterfazEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        cajaApellidosInterfazEstudiante.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cajaApellidosInterfazEstudiante.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(cajaApellidosInterfazEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 220, -1));

        cajaNumeroIdInterfazEstudiante.setEditable(false);
        cajaNumeroIdInterfazEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        cajaNumeroIdInterfazEstudiante.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cajaNumeroIdInterfazEstudiante.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        cajaNumeroIdInterfazEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNumeroIdInterfazEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(cajaNumeroIdInterfazEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 140, -1));

        cajaCorreoInterfazEstudiante.setEditable(false);
        cajaCorreoInterfazEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        cajaCorreoInterfazEstudiante.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cajaCorreoInterfazEstudiante.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(cajaCorreoInterfazEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 230, -1));

        cajaProgramaInterfazEstudiante.setEditable(false);
        cajaProgramaInterfazEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        cajaProgramaInterfazEstudiante.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cajaProgramaInterfazEstudiante.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(cajaProgramaInterfazEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 210, -1));

        botonEditarInterfazEstudiante.setBackground(new java.awt.Color(153, 0, 0));
        botonEditarInterfazEstudiante.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonEditarInterfazEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        botonEditarInterfazEstudiante.setText("EDITAR");
        botonEditarInterfazEstudiante.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        botonEditarInterfazEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEditarInterfazEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEditarInterfazEstudianteMouseClicked(evt);
            }
        });
        getContentPane().add(botonEditarInterfazEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 90, 30));

        botonRealizaAutoevaluacionInterfazEstudiante.setBackground(new java.awt.Color(153, 0, 0));
        botonRealizaAutoevaluacionInterfazEstudiante.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonRealizaAutoevaluacionInterfazEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        botonRealizaAutoevaluacionInterfazEstudiante.setText("REALIZAR AUTOEVALUACIÓN");
        botonRealizaAutoevaluacionInterfazEstudiante.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        botonRealizaAutoevaluacionInterfazEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(botonRealizaAutoevaluacionInterfazEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 250, 50));

        botonAgregarInformacionEmpresaInterfazDocente.setBackground(new java.awt.Color(153, 0, 0));
        botonAgregarInformacionEmpresaInterfazDocente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonAgregarInformacionEmpresaInterfazDocente.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarInformacionEmpresaInterfazDocente.setText("AGREGAR INFORMACIÓN DE LA EMPRESA");
        botonAgregarInformacionEmpresaInterfazDocente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        botonAgregarInformacionEmpresaInterfazDocente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(botonAgregarInformacionEmpresaInterfazDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 350, 50));

        botonAdjuntaPpaInterfazEstudiante.setBackground(new java.awt.Color(153, 0, 0));
        botonAdjuntaPpaInterfazEstudiante.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonAdjuntaPpaInterfazEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        botonAdjuntaPpaInterfazEstudiante.setText("ADJUNTAR PPA");
        botonAdjuntaPpaInterfazEstudiante.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        botonAdjuntaPpaInterfazEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(botonAdjuntaPpaInterfazEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 250, 50));

        botonEvaluacionFinalInterfazEstudiante.setBackground(new java.awt.Color(153, 0, 0));
        botonEvaluacionFinalInterfazEstudiante.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonEvaluacionFinalInterfazEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        botonEvaluacionFinalInterfazEstudiante.setText("EVALUACIÓN FINAL");
        botonEvaluacionFinalInterfazEstudiante.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        botonEvaluacionFinalInterfazEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(botonEvaluacionFinalInterfazEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 250, 50));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tus Opciones");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Tu Avance");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, -1, -1));

        barraAvanceInterfazEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        barraAvanceInterfazEstudiante.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        getContentPane().add(barraAvanceInterfazEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 370, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("0%");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("100%");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 460, -1, -1));

        nombreDelPPA.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nombreDelPPA.setForeground(new java.awt.Color(153, 153, 153));
        nombreDelPPA.setText("No adjuntado");
        getContentPane().add(nombreDelPPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 90, 20));

        botonCerrarSesionInterfazEstudiante.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabia\\OneDrive\\Escritorio\\NetBeansProjects\\SIPRA\\src\\main\\java\\com\\unab\\sipra\\recursos\\cerrar-sesion.png")); // NOI18N
        botonCerrarSesionInterfazEstudiante.setContentAreaFilled(false);
        botonCerrarSesionInterfazEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(botonCerrarSesionInterfazEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 50, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabia\\OneDrive\\Escritorio\\NetBeansProjects\\SIPRA\\src\\main\\java\\com\\unab\\sipra\\recursos\\interfaz estudiante imagen.png")); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 4, true));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cajaNumeroIdInterfazEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNumeroIdInterfazEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNumeroIdInterfazEstudianteActionPerformed

    private void botonEditarInterfazEstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEditarInterfazEstudianteMouseClicked
       ControladorEditarTuInformacion.inicio();
    }//GEN-LAST:event_botonEditarInterfazEstudianteMouseClicked

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
            java.util.logging.Logger.getLogger(interfazEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraAvanceInterfazEstudiante;
    private javax.swing.JButton botonAdjuntaPpaInterfazEstudiante;
    private javax.swing.JButton botonAgregarInformacionEmpresaInterfazDocente;
    private javax.swing.JButton botonCerrarSesionInterfazEstudiante;
    private javax.swing.JButton botonEditarInterfazEstudiante;
    private javax.swing.JButton botonEvaluacionFinalInterfazEstudiante;
    private javax.swing.JButton botonRealizaAutoevaluacionInterfazEstudiante;
    private javax.swing.JTextField cajaApellidosInterfazEstudiante;
    private javax.swing.JTextField cajaCorreoInterfazEstudiante;
    private javax.swing.JPanel cajaFotoInterfazEstudiante;
    private javax.swing.JTextField cajaNombresInterfazEstudiante;
    private javax.swing.JTextField cajaNumeroIdInterfazEstudiante;
    private javax.swing.JTextField cajaProgramaInterfazEstudiante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel nombreDelPPA;
    // End of variables declaration//GEN-END:variables
}
