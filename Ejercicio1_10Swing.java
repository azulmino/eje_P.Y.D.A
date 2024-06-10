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

public class Ejercicio1_10Swing extends JFrame {
    public Ejercicio1_10Swing(){
        
    setTitle("Ejercicio 1.10");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel labelradio = new JLabel ("Ingrese el valor de radio:");
    JTextField Textradio = new JTextField(10);
    
    JButton submitButton = new JButton ("Enviar");
    JLabel resultadoLabel = new JLabel();
    
    submitButton.addActionListener(e -> {
            try {
                double radio = Double.parseDouble(Textradio.getText());
                
                double longitud = 2 * Math.PI * radio;
                double area = Math.PI * Math.pow(radio, 2);
                
                resultadoLabel.setText("Longitud de la circunferencia: " + longitud + " Área de la circunferencia: " + area);
            } catch (NumberFormatException ex) {
                resultadoLabel.setText("Error");
            }
    });
    
    JPanel panel = new JPanel();
    panel.add(labelradio);
    panel.add(Textradio);
    panel.add(submitButton);
    panel.add(resultadoLabel);
    
    add(panel);
    pack();
    setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ejercicio1_10Swing ejercicio = new Ejercicio1_10Swing();
            ejercicio.setVisible(true);
        });
    }
}
