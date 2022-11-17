package com.unab.sipra.controladores;

import com.unab.sipra.LoguinGui.LoguinSipra;
import javax.swing.JOptionPane;


public class ControladorLoguinSipra {
    static  LoguinSipra ventanaUno = new LoguinSipra();
    
    public static void inicio(){
        ventanaUno.setVisible(true);
        
    }
    public static void btnEmpezar(){
        String Usuario, Contraseña;
        Usuario= ventanaUno.getCajaUsuarioLoguinSipraGui().getText();
        Contraseña=ventanaUno.getCajaContraseñaLoguinSipraGui().getText();
        if(Usuario.equals("admin") && Contraseña.equals("admin")){
            ControladorInterfazDocente.inicio();
           
        }else{
            JOptionPane.showMessageDialog(ventanaUno,"CONTRASEÑA O USUARIO INCORRECTA");
        }
    }
   
    
}
