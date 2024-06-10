/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7mo2da;

/**
 *
 * @author Azul
 */

import javax.swing.*;

public class Ejercicio1_4Swing {
    public static void main(String[] args) {

        short valorMaximo = Short.MAX_VALUE;
        short valorMinimo = Short.MIN_VALUE;

        short siguienteAlMaximo = (short) (valorMaximo + 1);
        short anteriorAlMinimo = (short) (valorMinimo - 1);

        boolean esCiclico = (siguienteAlMaximo == valorMinimo);

        String mensaje = "El valor siguiente al máximo (" + siguienteAlMaximo + ") es igual al mínimo (" + valorMinimo + "): " + esCiclico;

        JOptionPane.showMessageDialog(null, mensaje, "Comportamiento Cíclico del tipo short", JOptionPane.INFORMATION_MESSAGE);
    }
}