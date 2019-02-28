/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exfactory;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author aparcerozas
 */
public class IO {

    /**
     * Constante estática y pública usada para referenciar un número a través
     * del nombre CONSOLA
     */
    public static final int CONSOLA = 1;

    /**
     * Constante estática y pública usada para referenciar un número a través
     * del nombre VENTANA
     */
    public static final int VENTANA = 2;
    
    /**
     * Método para guardar un int introducido por consola o ventana
     * en una variable
     * @param opcion
     * @param mensaje
     * @return
     */
    public static int introducirEntero(int opcion, String mensaje){
        int num = 0;
        switch (opcion) {
            case CONSOLA: System.out.println(mensaje);
                    Scanner teclado = new Scanner(System.in);
                    num = Integer.parseInt(teclado.nextLine());
                    break;
            case VENTANA: num = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
                    break;
        }
        return num;
    }
    
    /**
     * Método para guardar un String introducido por consola o ventana
     * en una variable
     * @param opcion
     * @param mensaje
     * @return
     */
    public static String introducirString(int opcion, String mensaje){
        String quote = "";
        switch (opcion) {
            case CONSOLA: System.out.println(mensaje);
                    Scanner teclado = new Scanner(System.in);
                    quote = teclado.nextLine();
                    break;
            case VENTANA: quote = JOptionPane.showInputDialog(mensaje);
                    break;
        }
        return quote;
    }
    
    /**
     * Método para mostrar por consola o ventana un int introducido como
     * parámetro
     * @param opcion
     * @param numero
     */
    public static void imprimir(int opcion, int numero){
        switch (opcion) {
            case CONSOLA: System.out.println(numero);
                    break;
            case VENTANA: JOptionPane.showMessageDialog(null, numero);
                    break;
        }
    }
    
    /**
     * Método para mostrar por consola o ventana un String introducido como
     * parámetro
     * @param opcion
     * @param frase
     */
    public static void imprimir(int opcion, String frase){
        switch (opcion) {
            case CONSOLA: System.out.println(frase);
                    break;
            case VENTANA: JOptionPane.showMessageDialog(null, frase);
                    break;
        }
    }
    
}
