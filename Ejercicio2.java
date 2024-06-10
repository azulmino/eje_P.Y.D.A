/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7mo2da;

/**
 *
 * @author Azulverse Corp
 */

import javax.swing.*;

public class Ejercicio2 extends JFrame {

    public Ejercicio2(){
        
    setTitle("Ejercicio Prueba 2");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel pedir = new JLabel ("Ingrese un número");
    JTextField numero = new JTextField (10);
    
    JButton submitButton = new JButton("Enviar");
    
    JTextArea resu = new JTextArea (2,2);
    
    submitButton.addActionListener(e -> {
            try {
                int num = Integer.parseInt(numero.getText());
                String binario = Integer.toBinaryString(num);
                resu.setText("Pasado a binario es: " + binario);
                
            } catch (NumberFormatException ex) {
                resu.setText("Error, ingrese numeros enteros");
            }
    });
    
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    panel.add(pedir);
    panel.add(numero);
    panel.add(submitButton);
    panel.add(resu);
    
    add(panel);
    pack();
    setLocationRelativeTo(null);
        
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ejercicio2 ejercicio = new Ejercicio2();
            ejercicio.setVisible(true);
        });
    }
}
