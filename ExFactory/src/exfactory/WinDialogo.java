/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exfactory;

import javax.swing.JOptionPane;

/**
 *
 * @author aparcerozas
 */
public class WinDialogo extends Dialogo {
    @Override
    public void mostrar(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
