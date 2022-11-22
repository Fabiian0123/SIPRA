package com.unab.sipra.EstudianteGui;

import Librerias.Libpersonal;
import com.unab.sipra.controladores.ControladorAgregarInformacionEmpresaEstudianteGui;
import com.unab.sipra.controladores.ControladorEditarTuInformacion;
import com.unab.sipra.controladores.ControladorRealizarAutoevaluacionEstudianteGui;
import java.awt.Image;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;

public class interfazEstudiante extends javax.swing.JFrame {
    public static String ruta;
    private static final FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG/JPG", "PNG,JPG");

    public interfazEstudiante() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(interfazEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }

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
        rutaPpa = new javax.swing.JLabel();
        botonCerrarSesionInterfazEstudiante = new javax.swing.JButton();
        botonMinimizarInterfzEstudianteGui = new javax.swing.JLabel();
        rutaFotoPerfil = new javax.swing.JLabel();
        botonSubirFoto = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Interfaz Estudiante");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        botonRealizaAutoevaluacionInterfazEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRealizaAutoevaluacionInterfazEstudianteMouseClicked(evt);
            }
        });
        getContentPane().add(botonRealizaAutoevaluacionInterfazEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 250, 50));

        botonAgregarInformacionEmpresaInterfazDocente.setBackground(new java.awt.Color(153, 0, 0));
        botonAgregarInformacionEmpresaInterfazDocente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonAgregarInformacionEmpresaInterfazDocente.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarInformacionEmpresaInterfazDocente.setText("AGREGAR INFORMACIÓN DE LA EMPRESA");
        botonAgregarInformacionEmpresaInterfazDocente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        botonAgregarInformacionEmpresaInterfazDocente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAgregarInformacionEmpresaInterfazDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAgregarInformacionEmpresaInterfazDocenteMouseClicked(evt);
            }
        });
        getContentPane().add(botonAgregarInformacionEmpresaInterfazDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 350, 50));

        botonAdjuntaPpaInterfazEstudiante.setBackground(new java.awt.Color(153, 0, 0));
        botonAdjuntaPpaInterfazEstudiante.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonAdjuntaPpaInterfazEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        botonAdjuntaPpaInterfazEstudiante.setText("ADJUNTAR PPA");
        botonAdjuntaPpaInterfazEstudiante.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        botonAdjuntaPpaInterfazEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAdjuntaPpaInterfazEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdjuntaPpaInterfazEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(botonAdjuntaPpaInterfazEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 250, 50));

        botonEvaluacionFinalInterfazEstudiante.setBackground(new java.awt.Color(153, 0, 0));
        botonEvaluacionFinalInterfazEstudiante.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonEvaluacionFinalInterfazEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        botonEvaluacionFinalInterfazEstudiante.setText("EVALUACIÓN FINAL");
        botonEvaluacionFinalInterfazEstudiante.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        botonEvaluacionFinalInterfazEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEvaluacionFinalInterfazEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEvaluacionFinalInterfazEstudianteMouseClicked(evt);
            }
        });
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

        rutaPpa.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(rutaPpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 190, 20));

        botonCerrarSesionInterfazEstudiante.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabia\\OneDrive\\Escritorio\\NetBeansProjects\\SIPRA\\src\\main\\java\\com\\unab\\sipra\\recursos\\cerrar-sesion.png")); // NOI18N
        botonCerrarSesionInterfazEstudiante.setBorder(null);
        botonCerrarSesionInterfazEstudiante.setContentAreaFilled(false);
        botonCerrarSesionInterfazEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCerrarSesionInterfazEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCerrarSesionInterfazEstudianteMouseClicked(evt);
            }
        });
        getContentPane().add(botonCerrarSesionInterfazEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 60, 30, 30));

        botonMinimizarInterfzEstudianteGui.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabia\\OneDrive\\Escritorio\\NetBeansProjects\\SIPRA\\src\\main\\java\\com\\unab\\sipra\\recursos\\minimizar (2).png")); // NOI18N
        botonMinimizarInterfzEstudianteGui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMinimizarInterfzEstudianteGui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMinimizarInterfzEstudianteGuiMouseClicked(evt);
            }
        });
        getContentPane().add(botonMinimizarInterfzEstudianteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, -1, 30));

        rutaFotoPerfil.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        getContentPane().add(rutaFotoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 170, 140));

        botonSubirFoto.setBackground(new java.awt.Color(153, 0, 0));
        botonSubirFoto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonSubirFoto.setForeground(new java.awt.Color(255, 255, 255));
        botonSubirFoto.setText("Seleccionar Foto");
        botonSubirFoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonSubirFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSubirFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSubirFotoMouseClicked(evt);
            }
        });
        botonSubirFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSubirFotoActionPerformed(evt);
            }
        });
        getContentPane().add(botonSubirFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 110, -1));

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guardar ");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 110, 20));

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

    private void botonCerrarSesionInterfazEstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarSesionInterfazEstudianteMouseClicked
        int b = JOptionPane.YES_NO_OPTION;
        int mues = JOptionPane.showConfirmDialog(this, "¿ESTA SEGURO QUE DESEA SALIR?", "CERRAR SESIÓN", b);
        if (mues == 0) {
            System.exit(0);
    }//GEN-LAST:event_botonCerrarSesionInterfazEstudianteMouseClicked
    }
    private void botonRealizaAutoevaluacionInterfazEstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRealizaAutoevaluacionInterfazEstudianteMouseClicked
        ControladorRealizarAutoevaluacionEstudianteGui.inicio();
    }//GEN-LAST:event_botonRealizaAutoevaluacionInterfazEstudianteMouseClicked

    private void botonAgregarInformacionEmpresaInterfazDocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarInformacionEmpresaInterfazDocenteMouseClicked
        ControladorAgregarInformacionEmpresaEstudianteGui.inicio();
    }//GEN-LAST:event_botonAgregarInformacionEmpresaInterfazDocenteMouseClicked

    private void botonAdjuntaPpaInterfazEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdjuntaPpaInterfazEstudianteActionPerformed
        JFileChooser jf = new JFileChooser();
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("PDF,DOCS,XLSX", "PDF", "DOCS","XLSX");
        jf.setFileFilter(filtrado);
        jf.showOpenDialog(this);
        File rutaPpa = jf.getSelectedFile();
        if (rutaPpa != null) {
            //rutaPpa.setText(rutaPpa.getAbsolutePath());
            this.rutaPpa.setText(rutaPpa.getAbsolutePath());
        }
    }//GEN-LAST:event_botonAdjuntaPpaInterfazEstudianteActionPerformed

    private void botonEvaluacionFinalInterfazEstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEvaluacionFinalInterfazEstudianteMouseClicked
        ControladorRealizarAutoevaluacionEstudianteGui.inicio();
    }//GEN-LAST:event_botonEvaluacionFinalInterfazEstudianteMouseClicked

    private void botonMinimizarInterfzEstudianteGuiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMinimizarInterfzEstudianteGuiMouseClicked
        this.setState(interfazEstudiante.ICONIFIED);
    }//GEN-LAST:event_botonMinimizarInterfzEstudianteGuiMouseClicked

    private void botonSubirFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSubirFotoMouseClicked
        
        JFileChooser jFileChooser = new JFileChooser();
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("JPG, PNG", "JPG", "PNG");
        jFileChooser.setFileFilter(filtrado);

        int respuesta = jFileChooser.showOpenDialog(this);

        if (respuesta == jFileChooser.APPROVE_OPTION) {
            ruta = jFileChooser.getSelectedFile().getAbsolutePath();
            System.err.println(ruta);
            Image mImagen = new ImageIcon(ruta).getImage();
            ImageIcon mIcon = new ImageIcon(mImagen.getScaledInstance(rutaFotoPerfil.getWidth(), rutaFotoPerfil.getHeight(), Image.SCALE_SMOOTH));
            rutaFotoPerfil.setIcon(mIcon);
        }
    }//GEN-LAST:event_botonSubirFotoMouseClicked

    
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
         if (ruta==null) {
            System.err.println(ruta);

            JOptionPane.showMessageDialog(null, "NO SE HA SELECCIONADO LA IMAGEN");
        } else {
            System.err.print(ruta);
            JOptionPane.showMessageDialog(null, "SE GUARDO CORRECTAMENTE");
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void botonSubirFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSubirFotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSubirFotoActionPerformed

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
    private javax.swing.JLabel botonMinimizarInterfzEstudianteGui;
    private javax.swing.JButton botonRealizaAutoevaluacionInterfazEstudiante;
    private javax.swing.JButton botonSubirFoto;
    private javax.swing.JTextField cajaApellidosInterfazEstudiante;
    private javax.swing.JTextField cajaCorreoInterfazEstudiante;
    private javax.swing.JTextField cajaNombresInterfazEstudiante;
    private javax.swing.JTextField cajaNumeroIdInterfazEstudiante;
    private javax.swing.JTextField cajaProgramaInterfazEstudiante;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel rutaFotoPerfil;
    public javax.swing.JLabel rutaPpa;
    // End of variables declaration//GEN-END:variables
}
