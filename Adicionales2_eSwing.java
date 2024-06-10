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

public class Adicionales2_eSwing extends JFrame {
    
    public Adicionales2_eSwing() {
    
    setTitle("Adicionales 2.E");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel lado_a = new JLabel ("Ingrese el lado A");
    JTextField text_lado_a = new JTextField(10);
    
    JLabel lado_b = new JLabel ("Ingrese el lado B");
    JTextField text_lado_b = new JTextField(10);
    
    JLabel lado_c = new JLabel ("Ingrese el lado C");
    JTextField text_lado_c = new JTextField(10);
    
    JButton submitButton = new JButton ("Enviar");
    JLabel resultadoLabel = new JLabel();
    
    submitButton.addActionListener(e -> {
            try {
                double a = Double.parseDouble(text_lado_a.getText());
                double b = Double.parseDouble(text_lado_a.getText());
                double c = Double.parseDouble(text_lado_a.getText());
                
                double p = (a+b+c)/2;
                double Area = Math.sqrt((p*(p-a)*(p-b)*(p-c)));
                
                resultadoLabel.setText("El resultado es: " + Area);
            } catch (NumberFormatException ex) {
                resultadoLabel.setText("Error");
            }
    });

    JPanel panel = new JPanel();
    panel.add(lado_a);
    panel.add(text_lado_a);
    panel.add(lado_b);
    panel.add(text_lado_b);
    panel.add(lado_c);
    panel.add(text_lado_c);
    panel.add(submitButton);
    panel.add(resultadoLabel);
    
    add(panel);
    pack();
    setLocationRelativeTo(null);
    
}
 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Adicionales2_eSwing ejercicio = new Adicionales2_eSwing();
            ejercicio.setVisible(true);
        });
    }
    
}
