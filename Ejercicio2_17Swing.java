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

public class Ejercicio2_17Swing extends JFrame {
    public Ejercicio2_17Swing() {
        
    setTitle("Ejercicio 2.17");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel pedir = new JLabel ("Ingrese la cantidad de la comida diaria:");
    
    JTextField ComidaDiaria = new JTextField(5);
    
    JLabel pedir2 = new JLabel ("Ingrese la cantidad de animales:");
    
    JTextField NumAnimales = new JTextField(5);
    
    JLabel pedir3 = new JLabel ("Ingrese la cantidad de kilos que come cada animal:");
    
    JTextField KilosPorAnimal = new JTextField(5);
    
    JTextArea resu = new JTextArea (5,5);
    
    JButton submitButton = new JButton ("Enviar");
    
    submitButton.addActionListener(e -> {
            try {
                
                int comidadiaria = Integer.parseInt(ComidaDiaria.getText());
                
                int numanimales = Integer.parseInt(NumAnimales.getText());
                
                int kilosxanimal = Integer.parseInt(KilosPorAnimal.getText());
                
                if (kilosxanimal != 0){
                   
                    if (comidadiaria != 0){
                        
                        if (numanimales != 0){
                            
                            double comida= numanimales*kilosxanimal;
                            double resto = comidadiaria - comida;
                            
                            
                            if (comidadiaria >= comida){
                                resu.setText("La comida es suiciente y sobra: "+ resto);
                            } else {
                                double racion = comidadiaria / numanimales;
                                
                                resu.setText("El alimento no es suficiente, la racion diaria tiene que ser: "+ racion+ "KG por animal");
                            }
                            
                        } else{
                            resu.setText("El numero tiene que ser mayor que 0");
                        }
                        
                    }else{
                            resu.setText("El numero tiene que ser mayor que 0");
                        }
                    
                }else{
                            resu.setText("El numero tiene que ser mayor que 0");
                        }
            } catch (NumberFormatException ex) {
                resu.setText("Error, ingrese un numero entero");
            }
        });
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(pedir);
        panel.add(ComidaDiaria);
        panel.add(pedir2);
        panel.add(NumAnimales);
        panel.add(pedir3);
        panel.add(KilosPorAnimal);
        panel.add(submitButton);
        panel.add(resu);

        add(panel);
        pack();
        setLocationRelativeTo(null);
        
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ejercicio2_17Swing ejercicio = new Ejercicio2_17Swing();
            ejercicio.setVisible(true);
        });
    }
}
