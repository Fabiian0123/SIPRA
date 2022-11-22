
package com.unab.sipra.DocenteGui;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;


public class subirEvidencias extends javax.swing.JFrame {

    
    public subirEvidencias() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(subirEvidencias.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(subirEvidencias.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(subirEvidencias.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(subirEvidencias.class.getName()).log(Level.SEVERE, null, ex);
                }
        
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calendarioFecha2 = new com.toedter.calendar.JDateChooser();
        calendarioFecha3 = new com.toedter.calendar.JDateChooser();
        calendarioFecha4 = new com.toedter.calendar.JDateChooser();
        calendarioFecha5 = new com.toedter.calendar.JDateChooser();
        calendarioFecha6 = new com.toedter.calendar.JDateChooser();
        calendarioFecha1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        botonSubirFoto1 = new javax.swing.JButton();
        botonSubirFoto2 = new javax.swing.JButton();
        botonSubirFoto3 = new javax.swing.JButton();
        botonSubirFoto4 = new javax.swing.JButton();
        botonSubirFoto5 = new javax.swing.JButton();
        botonSubirFoto6 = new javax.swing.JButton();
        botonGuardarSubirEvidenciasDocenteGui = new javax.swing.JButton();
        rutaFotoUno = new javax.swing.JLabel();
        rutaFotoTres = new javax.swing.JLabel();
        rutaFotoDos = new javax.swing.JLabel();
        rutaFotoCuatro = new javax.swing.JLabel();
        rutaFotoCinco = new javax.swing.JLabel();
        rutaFotoSeis = new javax.swing.JLabel();
        botonCancelarSubirEvidenciasDocenteGui = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Subir Evidencias ");
        setAutoRequestFocus(false);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calendarioFecha2.setBackground(new java.awt.Color(255, 255, 255));
        calendarioFecha2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        calendarioFecha2.setForeground(new java.awt.Color(255, 255, 255));
        calendarioFecha2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(calendarioFecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 120, 30));

        calendarioFecha3.setBackground(new java.awt.Color(255, 255, 255));
        calendarioFecha3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        calendarioFecha3.setForeground(new java.awt.Color(255, 255, 255));
        calendarioFecha3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(calendarioFecha3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 120, 30));

        calendarioFecha4.setBackground(new java.awt.Color(255, 255, 255));
        calendarioFecha4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        calendarioFecha4.setForeground(new java.awt.Color(255, 255, 255));
        calendarioFecha4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(calendarioFecha4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 120, 30));

        calendarioFecha5.setBackground(new java.awt.Color(255, 255, 255));
        calendarioFecha5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        calendarioFecha5.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(calendarioFecha5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 120, 30));

        calendarioFecha6.setBackground(new java.awt.Color(255, 255, 255));
        calendarioFecha6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        calendarioFecha6.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(calendarioFecha6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 120, 30));

        calendarioFecha1.setBackground(new java.awt.Color(255, 255, 255));
        calendarioFecha1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        calendarioFecha1.setForeground(new java.awt.Color(255, 255, 255));
        calendarioFecha1.setFocusable(false);
        calendarioFecha1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(calendarioFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 120, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("FECHA 2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("FECHA 3");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("FECHA 4");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("FECHA 5");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("FECHA 6");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("FECHA 1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, 20));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Foto 1");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Foto 2");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Foto 3");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Foto 4");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Foto 5");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Foto 6");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, -1, -1));

        botonSubirFoto1.setBackground(new java.awt.Color(102, 0, 0));
        botonSubirFoto1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonSubirFoto1.setForeground(new java.awt.Color(255, 255, 255));
        botonSubirFoto1.setText("Subir Foto");
        botonSubirFoto1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSubirFoto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSubirFoto1ActionPerformed(evt);
            }
        });
        getContentPane().add(botonSubirFoto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, -1, -1));

        botonSubirFoto2.setBackground(new java.awt.Color(102, 0, 0));
        botonSubirFoto2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonSubirFoto2.setForeground(new java.awt.Color(255, 255, 255));
        botonSubirFoto2.setText("Subir Foto");
        botonSubirFoto2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSubirFoto2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSubirFoto2MouseClicked(evt);
            }
        });
        getContentPane().add(botonSubirFoto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, -1, -1));

        botonSubirFoto3.setBackground(new java.awt.Color(102, 0, 0));
        botonSubirFoto3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonSubirFoto3.setForeground(new java.awt.Color(255, 255, 255));
        botonSubirFoto3.setText("Subir Foto");
        botonSubirFoto3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSubirFoto3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSubirFoto3MouseClicked(evt);
            }
        });
        getContentPane().add(botonSubirFoto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, -1, -1));

        botonSubirFoto4.setBackground(new java.awt.Color(102, 0, 0));
        botonSubirFoto4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonSubirFoto4.setForeground(new java.awt.Color(255, 255, 255));
        botonSubirFoto4.setText("Subir Foto");
        botonSubirFoto4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSubirFoto4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSubirFoto4MouseClicked(evt);
            }
        });
        getContentPane().add(botonSubirFoto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, -1, -1));

        botonSubirFoto5.setBackground(new java.awt.Color(102, 0, 0));
        botonSubirFoto5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonSubirFoto5.setForeground(new java.awt.Color(255, 255, 255));
        botonSubirFoto5.setText("Subir Foto");
        botonSubirFoto5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSubirFoto5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSubirFoto5MouseClicked(evt);
            }
        });
        getContentPane().add(botonSubirFoto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, -1, -1));

        botonSubirFoto6.setBackground(new java.awt.Color(102, 0, 0));
        botonSubirFoto6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonSubirFoto6.setForeground(new java.awt.Color(255, 255, 255));
        botonSubirFoto6.setText("Subir Foto");
        botonSubirFoto6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSubirFoto6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSubirFoto6MouseClicked(evt);
            }
        });
        getContentPane().add(botonSubirFoto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, -1, -1));

        botonGuardarSubirEvidenciasDocenteGui.setBackground(new java.awt.Color(102, 0, 0));
        botonGuardarSubirEvidenciasDocenteGui.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonGuardarSubirEvidenciasDocenteGui.setForeground(new java.awt.Color(0, 0, 0));
        botonGuardarSubirEvidenciasDocenteGui.setText("GUARDAR");
        botonGuardarSubirEvidenciasDocenteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        botonGuardarSubirEvidenciasDocenteGui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(botonGuardarSubirEvidenciasDocenteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, 110, 40));
        getContentPane().add(rutaFotoUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 140, 20));
        getContentPane().add(rutaFotoTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, 140, 20));
        getContentPane().add(rutaFotoDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 140, 20));
        getContentPane().add(rutaFotoCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 140, 20));
        getContentPane().add(rutaFotoCinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 140, 20));
        getContentPane().add(rutaFotoSeis, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 140, 20));

        botonCancelarSubirEvidenciasDocenteGui.setBackground(new java.awt.Color(102, 0, 0));
        botonCancelarSubirEvidenciasDocenteGui.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonCancelarSubirEvidenciasDocenteGui.setForeground(new java.awt.Color(0, 0, 0));
        botonCancelarSubirEvidenciasDocenteGui.setText("CANCELAR");
        botonCancelarSubirEvidenciasDocenteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        botonCancelarSubirEvidenciasDocenteGui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCancelarSubirEvidenciasDocenteGui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCancelarSubirEvidenciasDocenteGuiMouseClicked(evt);
            }
        });
        getContentPane().add(botonCancelarSubirEvidenciasDocenteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabia\\OneDrive\\Escritorio\\NetBeansProjects\\SIPRA\\src\\main\\java\\com\\unab\\sipra\\recursos\\imagen subir evidencias docente gui.png")); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 4, true));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarSubirEvidenciasDocenteGuiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarSubirEvidenciasDocenteGuiMouseClicked
    this.dispose();
    }//GEN-LAST:event_botonCancelarSubirEvidenciasDocenteGuiMouseClicked

    private void botonSubirFoto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSubirFoto1ActionPerformed
        JFileChooser ab= new JFileChooser();
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("JPG, PNG", "JPG", "PNG");
       ab.showOpenDialog(this);
       File rutaFotoUno = ab.getSelectedFile();
       if(rutaFotoUno != null){
         this.rutaFotoUno.setText(rutaFotoUno.getAbsolutePath());
    }//GEN-LAST:event_botonSubirFoto1ActionPerformed
    }
    private void botonSubirFoto2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSubirFoto2MouseClicked
        JFileChooser cd = new JFileChooser();
        cd.showOpenDialog(this);
        File rutaFotoDos = cd.getSelectedFile();
        if (rutaFotoDos != null){
            this.rutaFotoDos.setText(rutaFotoDos.getAbsolutePath());
        }
    }//GEN-LAST:event_botonSubirFoto2MouseClicked

    private void botonSubirFoto3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSubirFoto3MouseClicked
        JFileChooser ab = new JFileChooser();
        ab.showOpenDialog(this);
        File rutaFotoTres = ab.getSelectedFile();
        if(rutaFotoTres !=null){
            this.rutaFotoTres.setText(rutaFotoTres.getAbsolutePath());
        }
    }//GEN-LAST:event_botonSubirFoto3MouseClicked

    private void botonSubirFoto4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSubirFoto4MouseClicked
        JFileChooser ax = new JFileChooser();
        ax.showOpenDialog(this);
        File rutaFotoCuatro = ax.getSelectedFile();
        if(rutaFotoCuatro != null){
            this.rutaFotoCuatro.setText(rutaFotoCuatro.getAbsolutePath());
        }
    }//GEN-LAST:event_botonSubirFoto4MouseClicked

    private void botonSubirFoto5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSubirFoto5MouseClicked
        JFileChooser pa = new JFileChooser();
        pa.showOpenDialog(this);
        File rutaFotoCinco = pa.getSelectedFile();
        if (rutaFotoCinco != null){
            this.rutaFotoCinco.setText(rutaFotoCinco.getAbsolutePath());
        }
    }//GEN-LAST:event_botonSubirFoto5MouseClicked

    private void botonSubirFoto6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSubirFoto6MouseClicked
        JFileChooser ma = new JFileChooser();
        ma.showOpenDialog(this);
        File rutaFotoSeis = ma.getSelectedFile();
        if(rutaFotoSeis != null){
            this.rutaFotoSeis.setText(rutaFotoSeis.getAbsolutePath());
        }
    }//GEN-LAST:event_botonSubirFoto6MouseClicked
    
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
            java.util.logging.Logger.getLogger(subirEvidencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(subirEvidencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(subirEvidencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(subirEvidencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new subirEvidencias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelarSubirEvidenciasDocenteGui;
    private javax.swing.JButton botonGuardarSubirEvidenciasDocenteGui;
    private javax.swing.JButton botonSubirFoto1;
    private javax.swing.JButton botonSubirFoto2;
    private javax.swing.JButton botonSubirFoto3;
    private javax.swing.JButton botonSubirFoto4;
    private javax.swing.JButton botonSubirFoto5;
    private javax.swing.JButton botonSubirFoto6;
    private com.toedter.calendar.JDateChooser calendarioFecha1;
    private com.toedter.calendar.JDateChooser calendarioFecha2;
    private com.toedter.calendar.JDateChooser calendarioFecha3;
    private com.toedter.calendar.JDateChooser calendarioFecha4;
    private com.toedter.calendar.JDateChooser calendarioFecha5;
    private com.toedter.calendar.JDateChooser calendarioFecha6;
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
    private javax.swing.JLabel rutaFotoCinco;
    private javax.swing.JLabel rutaFotoCuatro;
    private javax.swing.JLabel rutaFotoDos;
    private javax.swing.JLabel rutaFotoSeis;
    private javax.swing.JLabel rutaFotoTres;
    private javax.swing.JLabel rutaFotoUno;
    // End of variables declaration//GEN-END:variables
}
