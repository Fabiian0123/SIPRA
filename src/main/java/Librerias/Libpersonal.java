/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Librerias;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author fabia
 */
public class Libpersonal {
    public static boolean compExt(String ext) {
        JFileChooser chooser = new JFileChooser();
        if (!"png".equals(ext)||!"jpg".equals(ext) ) { ///condición para solo ser seleccionados csv;
            JOptionPane.showMessageDialog(chooser, "Archivo incompatible");
        } else {
            return false;
        }
        return true;
    }

    public static String getExtensione(String ext) {
        String fileName = ext;
        String fe = "";
        int i = fileName.lastIndexOf('.');
        if (i > 0) {
            fe = fileName.substring(i + 1);
        }
        return fe;
    }
}
