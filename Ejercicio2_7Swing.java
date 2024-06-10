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

public class Ejercicio2_7Swing extends JFrame {
    
    public Ejercicio2_7Swing () {
        
    setTitle("Ejercicio 7");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    JLabel pedir = new JLabel ("Ingrese tres numeros:");

    JTextField textnum1 = new JTextField (10);
    
    JTextField textnum2 = new JTextField (10);
    
    JTextField textnum3 = new JTextField (10);
    
    JButton submitButton = new JButton ("Enviar");
    JTextArea resu = new JTextArea(5,10);
    
    
    submitButton.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(textnum1.getText());
                double num2 = Double.parseDouble(textnum2.getText());
                double num3 = Double.parseDouble(textnum3.getText());
                //321
                if (num1 < num2 && num1 < num3) {
                    if (num2 < num3 && num2 > num1) {
                        resu.setText("Mayor: " + num3 + "Medio: " + num2 + "Menor: "+ num1);   
                    } else {
                    //123 
                    if (num1 > num2 && num2 > num3) {
                        if (num1 > num3 && num3 < num2) {
                            resu.setText("Mayor: " + num1 + "Medio: " + num2 + "Menor: "+ num3);   
                            }
                        }else {
                            //132
                            if (num1 > num2 && num3 > num2) {
                                if (num1 > num3 && num2 < num3) {
                                    resu.setText("Mayor: " + num1 + "Medio: " + num3 + "Menor: "+ num2);   
                                }   
                            } else {
                                //213
                                if (num2 > num1 && num1 > num3) {
                                    if (num2 > num3 && num3 < num1) {
                                    resu.setText("Mayor: " + num2 + "Medio: " + num1 + "Menor: "+ num3);   
                                    }   
                                } else {
                                    //231
                                    if (num2 > num3 && num3 > num1) {
                                        if (num2 > num1 && num1 < num3) {
                                            resu.setText("Mayor: " + num2 + "Medio: " + num3 + "Menor: "+ num1);   
                                        }   
                                    } else{
                                        if (num3 > num1 && num1 > num2) {
                                            if (num3 > num2 && num2 < num1) {
                                                resu.setText("Mayor: " + num3 + "Medio: " + num1 + "Menor: "+ num2);   
                                            }   
                                        }
                                    }
                                }
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
    panel.add(textnum1);
    panel.add(textnum2);
    panel.add(textnum3);
    panel.add(submitButton);
    panel.add(resu);
    
    add(panel);
    pack();
    setLocationRelativeTo(null);
    
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ejercicio2_7Swing ejercicio = new Ejercicio2_7Swing();
            ejercicio.setVisible(true);
        });
    }
    
}
