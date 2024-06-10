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

public class Ejercicio2_2Swing extends JFrame {
    
    public Ejercicio2_2Swing() {
        
    setTitle("Ejercico 2.2");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel pedir = new JLabel ("Ingrese dos numeros enteros");
    
    JTextField num1 = new JTextField(10);
    JTextField num2 = new JTextField(10);
    
    JButton submitButton = new JButton ("Enviar");
    JLabel resu = new JLabel();
    
     submitButton.addActionListener(e -> {
            try {
                int Num1 = Integer.parseInt(num1.getText());
                int Num2 = Integer.parseInt(num2.getText());
                
                if (Num1 == Num2 ) {
                    resu.setText("Los numeros: " + Num1 + " y " + Num2 + " son iguales");
                } else {
                    resu.setText("Los numeros: " + Num1 + " y " + Num2 + " no son iguales");
                }
                
            } catch (NumberFormatException ex) {
                resu.setText("Error, ingrese numeros enteros");
            }
    });
     
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    panel.add(pedir);
    panel.add(num1);
    panel.add(num2);
    panel.add(submitButton);
    panel.add(resu);
    
    add(panel);
    pack();
    setLocationRelativeTo(null);
       
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ejercicio2_2Swing ejercicio = new Ejercicio2_2Swing();
            ejercicio.setVisible(true);
        });
    }
    
}
