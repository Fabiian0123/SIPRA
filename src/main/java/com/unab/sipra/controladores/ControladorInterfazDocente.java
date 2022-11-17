
package com.unab.sipra.controladores;

import com.unab.sipra.DocenteGui.interfazDocente;


public class ControladorInterfazDocente {
    static interfazDocente ventanaDos = new interfazDocente();
    
    public static void inicio(){
        ventanaDos.setVisible(true);
    }
    
    public static void btn_editarInfo() {
        ControladorEditarInforEstudianteInterfazDocente.inicio();
    }
}
