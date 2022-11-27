package com.unab.sipra.DocenteGui;

import com.unab.sipra.controladores.ControladorAgregarEstudianteDocenteGui;
import com.unab.sipra.controladores.ControladorEditarInforEstudianteInterfazDocente;

import com.unab.sipra.controladores.ControladorInterfazDocente;
import com.unab.sipra.controladores.ControladorPerfilEstudianteDocenteGui;
import com.unab.sipra.controladores.ControladorSubirEvidenciasDocenteGui;
import java.awt.Frame;
import java.time.Clock;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


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

        cajaListaPracticantesInterfazDocenteGui = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaInterfazDocente = new javax.swing.JTable();
        botonAggEstudianteInterfazDocente = new javax.swing.JButton();
        botonCerrarSesionInterfazDocente = new javax.swing.JButton();
        botonEliminarInterfazDocente = new javax.swing.JButton();
        botonBuscarInterfazDocente = new javax.swing.JButton();
        botonSubirEvidenciasInterfazDocente = new javax.swing.JButton();
        botonMinimizarInterfazDocente = new javax.swing.JLabel();
        panelBuscadorInterfazDocenteGui = new javax.swing.JPanel();
        buscadorInterfazDocenteGui = new javax.swing.JTextField();
        botonBuscarBuscadorInterfazDocenteGui = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Interfaz Docente");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cajaListaPracticantesInterfazDocenteGui.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        tablaInterfazDocente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        tablaInterfazDocente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tablaInterfazDocente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellidos", "Numero Id", "Correo", "Programa", "Nombre Empresa", "Jefe Inmediato", "Avance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaInterfazDocente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaInterfazDocente.setRowHeight(30);
        tablaInterfazDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaInterfazDocenteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaInterfazDocente);
        if (tablaInterfazDocente.getColumnModel().getColumnCount() > 0) {
            tablaInterfazDocente.getColumnModel().getColumn(0).setResizable(false);
            tablaInterfazDocente.getColumnModel().getColumn(0).setHeaderValue("Nombre");
            tablaInterfazDocente.getColumnModel().getColumn(1).setResizable(false);
            tablaInterfazDocente.getColumnModel().getColumn(1).setHeaderValue("Apellidos");
            tablaInterfazDocente.getColumnModel().getColumn(2).setResizable(false);
            tablaInterfazDocente.getColumnModel().getColumn(2).setHeaderValue("Numero Id");
            tablaInterfazDocente.getColumnModel().getColumn(3).setHeaderValue("Correo");
            tablaInterfazDocente.getColumnModel().getColumn(4).setResizable(false);
            tablaInterfazDocente.getColumnModel().getColumn(4).setHeaderValue("Programa");
            tablaInterfazDocente.getColumnModel().getColumn(5).setResizable(false);
            tablaInterfazDocente.getColumnModel().getColumn(5).setHeaderValue("Nombre Empresa");
            tablaInterfazDocente.getColumnModel().getColumn(6).setResizable(false);
            tablaInterfazDocente.getColumnModel().getColumn(6).setHeaderValue("Jefe Inmediato");
            tablaInterfazDocente.getColumnModel().getColumn(7).setResizable(false);
            tablaInterfazDocente.getColumnModel().getColumn(7).setHeaderValue("Avance");
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 962, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel3);

        javax.swing.GroupLayout cajaListaPracticantesInterfazDocenteGuiLayout = new javax.swing.GroupLayout(cajaListaPracticantesInterfazDocenteGui);
        cajaListaPracticantesInterfazDocenteGui.setLayout(cajaListaPracticantesInterfazDocenteGuiLayout);
        cajaListaPracticantesInterfazDocenteGuiLayout.setHorizontalGroup(
            cajaListaPracticantesInterfazDocenteGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        cajaListaPracticantesInterfazDocenteGuiLayout.setVerticalGroup(
            cajaListaPracticantesInterfazDocenteGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cajaListaPracticantesInterfazDocenteGuiLayout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        getContentPane().add(cajaListaPracticantesInterfazDocenteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 970, 430));

        botonAggEstudianteInterfazDocente.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabia\\OneDrive\\Escritorio\\NetBeansProjects\\SIPRA\\src\\main\\java\\com\\unab\\sipra\\recursos\\agregar.png")); // NOI18N
        botonAggEstudianteInterfazDocente.setBorder(null);
        botonAggEstudianteInterfazDocente.setContentAreaFilled(false);
        botonAggEstudianteInterfazDocente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAggEstudianteInterfazDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAggEstudianteInterfazDocenteMouseClicked(evt);
            }
        });
        botonAggEstudianteInterfazDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAggEstudianteInterfazDocenteActionPerformed(evt);
            }
        });
        getContentPane().add(botonAggEstudianteInterfazDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, -1, 40));

        botonCerrarSesionInterfazDocente.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabia\\OneDrive\\Escritorio\\NetBeansProjects\\SIPRA\\src\\main\\java\\com\\unab\\sipra\\recursos\\cerrar-sesion.png")); // NOI18N
        botonCerrarSesionInterfazDocente.setBorder(null);
        botonCerrarSesionInterfazDocente.setContentAreaFilled(false);
        botonCerrarSesionInterfazDocente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCerrarSesionInterfazDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCerrarSesionInterfazDocenteMouseClicked(evt);
            }
        });
        botonCerrarSesionInterfazDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionInterfazDocenteActionPerformed(evt);
            }
        });
        getContentPane().add(botonCerrarSesionInterfazDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 50, 40, -1));

        botonEliminarInterfazDocente.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabia\\OneDrive\\Escritorio\\NetBeansProjects\\SIPRA\\src\\main\\java\\com\\unab\\sipra\\recursos\\borrar.png")); // NOI18N
        botonEliminarInterfazDocente.setBorder(null);
        botonEliminarInterfazDocente.setContentAreaFilled(false);
        botonEliminarInterfazDocente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEliminarInterfazDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEliminarInterfazDocenteMouseClicked(evt);
            }
        });
        botonEliminarInterfazDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarInterfazDocenteActionPerformed(evt);
            }
        });
        getContentPane().add(botonEliminarInterfazDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 50, 30, 30));

        botonBuscarInterfazDocente.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabia\\OneDrive\\Escritorio\\NetBeansProjects\\SIPRA\\src\\main\\java\\com\\unab\\sipra\\recursos\\buscar.png")); // NOI18N
        botonBuscarInterfazDocente.setBorder(null);
        botonBuscarInterfazDocente.setContentAreaFilled(false);
        botonBuscarInterfazDocente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonBuscarInterfazDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonBuscarInterfazDocenteMouseClicked(evt);
            }
        });
        getContentPane().add(botonBuscarInterfazDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 50, -1, 30));

        botonSubirEvidenciasInterfazDocente.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabia\\OneDrive\\Escritorio\\NetBeansProjects\\SIPRA\\src\\main\\java\\com\\unab\\sipra\\recursos\\subir (2).png")); // NOI18N
        botonSubirEvidenciasInterfazDocente.setBorder(null);
        botonSubirEvidenciasInterfazDocente.setContentAreaFilled(false);
        botonSubirEvidenciasInterfazDocente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSubirEvidenciasInterfazDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSubirEvidenciasInterfazDocenteMouseClicked(evt);
            }
        });
        getContentPane().add(botonSubirEvidenciasInterfazDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, -1, 30));

        botonMinimizarInterfazDocente.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabia\\OneDrive\\Escritorio\\NetBeansProjects\\SIPRA\\src\\main\\java\\com\\unab\\sipra\\recursos\\minimizar (2).png")); // NOI18N
        botonMinimizarInterfazDocente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMinimizarInterfazDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMinimizarInterfazDocenteMouseClicked(evt);
            }
        });
        getContentPane().add(botonMinimizarInterfazDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, -1, 30));

        panelBuscadorInterfazDocenteGui.setBackground(new java.awt.Color(255, 255, 255));
        panelBuscadorInterfazDocenteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        buscadorInterfazDocenteGui.setBackground(new java.awt.Color(255, 255, 255));
        buscadorInterfazDocenteGui.setForeground(new java.awt.Color(0, 0, 0));
        buscadorInterfazDocenteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        botonBuscarBuscadorInterfazDocenteGui.setBackground(new java.awt.Color(153, 0, 0));
        botonBuscarBuscadorInterfazDocenteGui.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscarBuscadorInterfazDocenteGui.setText("BUSCAR");
        botonBuscarBuscadorInterfazDocenteGui.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        botonBuscarBuscadorInterfazDocenteGui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelBuscadorInterfazDocenteGuiLayout = new javax.swing.GroupLayout(panelBuscadorInterfazDocenteGui);
        panelBuscadorInterfazDocenteGui.setLayout(panelBuscadorInterfazDocenteGuiLayout);
        panelBuscadorInterfazDocenteGuiLayout.setHorizontalGroup(
            panelBuscadorInterfazDocenteGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscadorInterfazDocenteGuiLayout.createSequentialGroup()
                .addComponent(buscadorInterfazDocenteGui, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonBuscarBuscadorInterfazDocenteGui)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        panelBuscadorInterfazDocenteGuiLayout.setVerticalGroup(
            panelBuscadorInterfazDocenteGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBuscadorInterfazDocenteGuiLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelBuscadorInterfazDocenteGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscadorInterfazDocenteGui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarBuscadorInterfazDocenteGui)))
        );

        getContentPane().add(panelBuscadorInterfazDocenteGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 350, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabia\\OneDrive\\Escritorio\\NetBeansProjects\\SIPRA\\src\\main\\java\\com\\unab\\sipra\\recursos\\interfazDocenteSI.png")); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0), 4));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void botonCerrarSesionInterfazDocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarSesionInterfazDocenteMouseClicked
        int a = JOptionPane.YES_NO_OPTION;
        int muestra = JOptionPane.showConfirmDialog(this, "¿ESTA SEGURO QUE DESEA SALIR?","CERRAR SESIÓN",a);
        if(muestra == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_botonCerrarSesionInterfazDocenteMouseClicked

    private void botonMinimizarInterfazDocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMinimizarInterfazDocenteMouseClicked
       this.setState(interfazDocente.ICONIFIED);
    }//GEN-LAST:event_botonMinimizarInterfazDocenteMouseClicked

    private void botonSubirEvidenciasInterfazDocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSubirEvidenciasInterfazDocenteMouseClicked
        ControladorSubirEvidenciasDocenteGui.inicio();
    }//GEN-LAST:event_botonSubirEvidenciasInterfazDocenteMouseClicked

    private void botonAggEstudianteInterfazDocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAggEstudianteInterfazDocenteMouseClicked
        ControladorAgregarEstudianteDocenteGui.inicio();
    }//GEN-LAST:event_botonAggEstudianteInterfazDocenteMouseClicked

    private void botonCerrarSesionInterfazDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionInterfazDocenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCerrarSesionInterfazDocenteActionPerformed

    private void botonBuscarInterfazDocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarInterfazDocenteMouseClicked
       
        int cou = 0;
        if(evt.getClickCount() == 1 && cou == 0 ){
             //ControladorInterfazDocente.btn_Mostrar();
            panelBuscadorInterfazDocenteGui.setVisible(true);
            cou++;
        }else{
            panelBuscadorInterfazDocenteGui.setVisible(false);
        }
        System.out.println(cou);
    }//GEN-LAST:event_botonBuscarInterfazDocenteMouseClicked

    private void botonEliminarInterfazDocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarInterfazDocenteMouseClicked
        JOptionPane.showMessageDialog(null, "NO SE HA SELECCIONADO UN ESTUDIANTE");
    }//GEN-LAST:event_botonEliminarInterfazDocenteMouseClicked

    private void botonAggEstudianteInterfazDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAggEstudianteInterfazDocenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAggEstudianteInterfazDocenteActionPerformed

    private void tablaInterfazDocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaInterfazDocenteMouseClicked
        if (evt.getClickCount()== 2){
            ControladorPerfilEstudianteDocenteGui.inicio();
        }
    }//GEN-LAST:event_tablaInterfazDocenteMouseClicked

    private void botonEliminarInterfazDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarInterfazDocenteActionPerformed
      if (tablaInterfazDocente.getSelectedRow()>=0){
          DefaultTableModel tm = (DefaultTableModel)tablaInterfazDocente.getModel();
          int r = JOptionPane.showConfirmDialog(this, "¿ESTAS SEGURO QUE QUIERES ELIMINAR ESTE REGISTRO?","SISTEMA",JOptionPane.INFORMATION_MESSAGE);
          if(r==JOptionPane.YES_OPTION){
              tm.removeRow(tablaInterfazDocente.getSelectedRow());
          }
      }else{
          JOptionPane.showMessageDialog(this, "NO HAZ SELECCIONADO UN REGITRO");
   
    }//GEN-LAST:event_botonEliminarInterfazDocenteActionPerformed
    }
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

    public JButton getBotonBuscarInterfazDocente() {
        return botonBuscarInterfazDocente;
    }

    public void setBotonBuscarInterfazDocente(JButton botonBuscarInterfazDocente) {
        this.botonBuscarInterfazDocente = botonBuscarInterfazDocente;
    }

    public JPanel getPanelBuscadorInterfazDocenteGui() {
        return panelBuscadorInterfazDocenteGui;
    }

    public void setPanelBuscadorInterfazDocenteGui(JPanel panelBuscadorInterfazDocenteGui) {
        this.panelBuscadorInterfazDocenteGui = panelBuscadorInterfazDocenteGui;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAggEstudianteInterfazDocente;
    private javax.swing.JButton botonBuscarBuscadorInterfazDocenteGui;
    private javax.swing.JButton botonBuscarInterfazDocente;
    private javax.swing.JButton botonCerrarSesionInterfazDocente;
    private javax.swing.JButton botonEliminarInterfazDocente;
    private javax.swing.JLabel botonMinimizarInterfazDocente;
    private javax.swing.JButton botonSubirEvidenciasInterfazDocente;
    private javax.swing.JTextField buscadorInterfazDocenteGui;
    private javax.swing.JPanel cajaListaPracticantesInterfazDocenteGui;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelBuscadorInterfazDocenteGui;
    public static javax.swing.JTable tablaInterfazDocente;
    // End of variables declaration//GEN-END:variables
}
