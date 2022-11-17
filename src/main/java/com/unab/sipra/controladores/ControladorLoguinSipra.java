package com.unab.sipra.controladores;

import com.unab.sipra.LoguinGui.LoguinSipra;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;


public class ControladorLoguinSipra {
    static  LoguinSipra ventanaUno = new LoguinSipra();
    
    public static void inicio(){
        ventanaUno.setVisible(true);
    }
    
    public static void hidden(){
        ventanaUno.setVisible(false);
    }
    
    public static void btnEmpezar(JCheckBox checkEstudiante, JCheckBox checkDocente, JCheckBox checkExtension){
        String Usuario, Contraseña;
        Usuario= ventanaUno.getCajaUsuarioLoguinSipraGui().getText();
        Contraseña=ventanaUno.getCajaContraseñaLoguinSipraGui().getText();
        if(Usuario.equals("admin") && Contraseña.equals("admin")){
            
            if (checkEstudiante.isSelected()){
            
            } else if (checkDocente.isSelected()) {
                hidden();
                ControladorInterfazDocente.inicio();
            } else if (checkExtension.isSelected()) { 
            
            } else {
                JOptionPane.showMessageDialog(ventanaUno,"POR FAVOR SELECCIONE UN ROL");
            }
        }else{
            JOptionPane.showMessageDialog(ventanaUno,"CONTRASEÑA O USUARIO INCORRECTA");
        }
    }
   
    public static void onCheckRoles(JCheckBox checkEstudiante, JCheckBox checkDocente, JCheckBox checkExtension) {
        int rol = (checkEstudiante.isSelected()) ? 1 :
                (checkDocente.isSelected()) ? 2 :
                (checkExtension.isSelected()) ? 3 : 0;
        
        checkEstudiante.setSelected(false);
        checkDocente.setSelected(false);
        checkExtension.setSelected(false);
                
        if (rol == 1)
            checkEstudiante.setSelected(true);        
        if (rol == 2)
            checkDocente.setSelected(true);        
        if (rol == 3)
            checkExtension.setSelected(true);
        
    }
    
}
