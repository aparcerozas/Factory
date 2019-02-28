/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exfactory;

/**
 *
 * @author aparcerozas
 */
abstract class Dialogo implements MetodosComunes {
    static final int VENTANA = 0;
    static final int CONSOLA = 1;
    
    @Override
    public void mostrar(String mensaje){
        
    }
    
    static public Dialogo crearDialogo(int opcion){
        Dialogo dialogoCreado;
        switch(opcion){
            case VENTANA:
                dialogoCreado = new WinDialogo();
                break;
            case CONSOLA:
                dialogoCreado = new ConDialogo();
                break;
            default:
                dialogoCreado = null;
                break;
        }
        return dialogoCreado;
    }
}
