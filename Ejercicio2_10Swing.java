/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7mo2da;

/**
 *
 * @author Usuario
 */

import javax.swing.*;

public class Ejercicio2_10Swing extends JFrame {
    public Ejercicio2_10Swing (){
        
    setTitle("Ejercicio 2.10");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel pedir = new JLabel ("Ingrese un numero:");
    
    JTextField num = new JTextField (10);
    
    JTextArea resu = new JTextArea (5,5);
    
    JButton submitButton = new JButton ("Enviar");
    
    submitButton.addActionListener(e -> {
            try {
                
                int Num = Integer.parseInt(num.getText());
                int invertir = 0;
                int numero = Num/10 %10;
                invertir = invertir * 10 + numero;
                
                if (Num > 0 && invertir == numero){
                        resu.setText("El número es capicua");
                    }else {
                        resu.setText("el numero no es capicua");
                    }
                
               
                
            } catch (NumberFormatException ex) {
                resu.setText("Error, ingrese un numero entero");
            }
        });
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(pedir);
        panel.add(num);
        panel.add(submitButton);
        panel.add(resu);

        add(panel);
        pack();
        setLocationRelativeTo(null);
        
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ejercicio2_10Swing ejercicio = new Ejercicio2_10Swing();
            ejercicio.setVisible(true);
        });
    }
    
}
