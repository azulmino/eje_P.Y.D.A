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

public class Ejercicio2_9Swing extends JFrame {
    public Ejercicio2_9Swing (){
    
        setTitle("Ejercicio 2.9");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel pedir = new JLabel ("Ingrese un numero:");
        
        JTextField num = new JTextField (10);
        
        JTextArea resu = new JTextArea (5,5);
        
        JButton submitButton = new JButton ("Enviar");
        
        submitButton.addActionListener(e -> {
            try {
                
                int Num = Integer.parseInt(num.getText());
                
                if (Num < 99.999 && Num >= 10.000){
                    resu.setText("El numero tiene 5 cifras");
                } else {
                    if (Num < 9.999 && Num >= 1.000) {
                        resu.setText("El numero tiene 4 cofras");
                    } else {
                        if (Num < 999 && Num >= 100){
                            resu.setText("El numero tiene 3 cifras");
                        } else {
                            if (Num < 99 && Num >= 10){
                                resu.setText("El numero tiene 2 cifras");
                            } else {
                                resu.setText("El numero tiene 1 cifra");
                            }
                        }
                    }
                }
                
               
                
            } catch (NumberFormatException ex) {
                resu.setText("Error");
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
            Ejercicio2_9Swing ejercicio = new Ejercicio2_9Swing();
            ejercicio.setVisible(true);
        });
    }
    
}
