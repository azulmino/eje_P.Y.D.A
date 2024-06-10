/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7mo2da;

/**
 *
 * @author Azulverse Corp
 */

import static java.lang.Math.*;
import javax.swing.*;

public class Adicionales1_dSwing extends JFrame {
    
    public Adicionales1_dSwing (){
        
    setTitle("Adicionales D");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel labelradio = new JLabel ("Ingrese la logitud del radio de la esfera:");
    JTextField textradio = new JTextField(10);
    
    JButton submitButton = new JButton ("Enviar");
    JLabel resultadoLabel = new JLabel();
    
    submitButton.addActionListener(e -> {
            try {
                double radio = Double.parseDouble(textradio.getText());
                
                double v = (1.3)*PI*(radio*radio*radio);
                
                resultadoLabel.setText("El volumen de la esfera es: " + v);
            } catch (NumberFormatException ex) {
                resultadoLabel.setText("Error");
            }
    });
    JPanel panel = new JPanel();
    panel.add(labelradio);
    panel.add(textradio);
    panel.add(submitButton);
    panel.add(resultadoLabel);
    
    add(panel);
    pack();
    setLocationRelativeTo(null);
        
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Adicionales1_dSwing ejercicio = new Adicionales1_dSwing();
            ejercicio.setVisible(true);
        });
    }
    
}
