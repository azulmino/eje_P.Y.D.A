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

public class Adicionales1_bSwing extends JFrame {
    
    public Adicionales1_bSwing() {
        
    setTitle("Adicionales B");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel labelvelo = new JLabel ("Ingrese la velocidad (Km/h):");
    JTextField textvelo = new JTextField(10);
    
    JButton submitButton = new JButton ("Enviar");
    JLabel resultadoLabel = new JLabel();
    
    submitButton.addActionListener(e -> {
            try {
                double km_h = Double.parseDouble(textvelo.getText());
                
                double m_s = (km_h*1000)/3600;
                
                resultadoLabel.setText("El resultado es: " + m_s);
            } catch (NumberFormatException ex) {
                resultadoLabel.setText("Error");
            }
    });
    
    JPanel panel = new JPanel();
    panel.add(labelvelo);
    panel.add(textvelo);
    panel.add(submitButton);
    panel.add(resultadoLabel);
    
    add(panel);
    pack();
    setLocationRelativeTo(null);
    
        
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Adicionales1_bSwing ejercicio = new Adicionales1_bSwing();
            ejercicio.setVisible(true);
        });
    }
    
}
