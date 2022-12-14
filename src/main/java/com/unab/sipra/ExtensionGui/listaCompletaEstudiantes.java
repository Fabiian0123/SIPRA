
package com.unab.sipra.ExtensionGui;

import com.unab.sipra.controladores.ControladorPerfilEstudianteAvance;
import com.unab.sipra.controladores.ControladorPerfilEstudianteDocenteGui;
import javax.swing.table.DefaultTableModel;


public class listaCompletaEstudiantes extends javax.swing.JFrame {
    DefaultTableModel mod;

  
    public listaCompletaEstudiantes() {
        initComponents();
        this.setLocationRelativeTo(null);
        mod = (DefaultTableModel) tablaListaCompletaEstudiantes.getModel();
    }
    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonCerrarListaCompletaEstudianteExtensionGui = new javax.swing.JButton();
        cajaListaEstudiantesExtensionGui = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        tablaListaCompletaEstudiantes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista Completa De Estudiantes");
        setAlwaysOnTop(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonCerrarListaCompletaEstudianteExtensionGui.setBackground(new java.awt.Color(153, 0, 0));
        botonCerrarListaCompletaEstudianteExtensionGui.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonCerrarListaCompletaEstudianteExtensionGui.setForeground(new java.awt.Color(255, 255, 255));
        botonCerrarListaCompletaEstudianteExtensionGui.setText("CERRAR");
        botonCerrarListaCompletaEstudianteExtensionGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        botonCerrarListaCompletaEstudianteExtensionGui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCerrarListaCompletaEstudianteExtensionGui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCerrarListaCompletaEstudianteExtensionGuiMouseClicked(evt);
            }
        });
        getContentPane().add(botonCerrarListaCompletaEstudianteExtensionGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 80, 30));

        scroll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        scroll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scrollMouseClicked(evt);
            }
        });

        tablaListaCompletaEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Numero Id", "Correo", "Programa", "Nombre Empresa", "Jefe Inmediato", "Avance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scroll.setViewportView(tablaListaCompletaEstudiantes);
        if (tablaListaCompletaEstudiantes.getColumnModel().getColumnCount() > 0) {
            tablaListaCompletaEstudiantes.getColumnModel().getColumn(0).setResizable(false);
            tablaListaCompletaEstudiantes.getColumnModel().getColumn(1).setResizable(false);
            tablaListaCompletaEstudiantes.getColumnModel().getColumn(2).setResizable(false);
            tablaListaCompletaEstudiantes.getColumnModel().getColumn(3).setResizable(false);
            tablaListaCompletaEstudiantes.getColumnModel().getColumn(4).setResizable(false);
            tablaListaCompletaEstudiantes.getColumnModel().getColumn(5).setResizable(false);
            tablaListaCompletaEstudiantes.getColumnModel().getColumn(6).setResizable(false);
            tablaListaCompletaEstudiantes.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout cajaListaEstudiantesExtensionGuiLayout = new javax.swing.GroupLayout(cajaListaEstudiantesExtensionGui);
        cajaListaEstudiantesExtensionGui.setLayout(cajaListaEstudiantesExtensionGuiLayout);
        cajaListaEstudiantesExtensionGuiLayout.setHorizontalGroup(
            cajaListaEstudiantesExtensionGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
        );
        cajaListaEstudiantesExtensionGuiLayout.setVerticalGroup(
            cajaListaEstudiantesExtensionGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );

        getContentPane().add(cajaListaEstudiantesExtensionGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 890, 370));

        jButton1.setBackground(new java.awt.Color(102, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("AGREGAR");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabia\\OneDrive\\Escritorio\\NetBeansProjects\\SIPRA\\src\\main\\java\\com\\unab\\sipra\\recursos\\fondo lista de estudiantes seguimineto al estudiante interfaz extension.png")); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 4, true));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCerrarListaCompletaEstudianteExtensionGuiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarListaCompletaEstudianteExtensionGuiMouseClicked
        dispose();
    }//GEN-LAST:event_botonCerrarListaCompletaEstudianteExtensionGuiMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     Object[] fi = new Object[8];
      fi[0]="";
      fi[1]="";
      fi[2]="";
      fi[3]="";
      fi[4]="";
      fi[5]="";
      fi[6]="";
      fi[7]="";
      
      
      mod.addRow(fi);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
      
    }//GEN-LAST:event_jButton1MouseClicked

    private void scrollMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scrollMouseClicked
        if (evt.getClickCount()== 1){
             ControladorPerfilEstudianteAvance.inicio();
        }
    }//GEN-LAST:event_scrollMouseClicked

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
            java.util.logging.Logger.getLogger(listaCompletaEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listaCompletaEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listaCompletaEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listaCompletaEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listaCompletaEstudiantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrarListaCompletaEstudianteExtensionGui;
    public static javax.swing.JPanel cajaListaEstudiantesExtensionGui;
    public static javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JScrollPane scroll;
    public static javax.swing.JTable tablaListaCompletaEstudiantes;
    // End of variables declaration//GEN-END:variables
}
