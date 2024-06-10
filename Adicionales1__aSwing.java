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

public class Adicionales1__aSwing extends JFrame {
    
    public Adicionales1__aSwing(){
        
        setTitle("Adicional A");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel labelgrado = new JLabel ("Ingrese los Grados");
        JTextField Textgrado = new JTextField(10);
        
        JButton submitButton = new JButton ("Enviar");
        JLabel resultadoLabel = new JLabel();
        
        submitButton.addActionListener(e -> {
            try {
                double centigrados = Double.parseDouble(Textgrado.getText());
                
                double fahrenheit = 32 + ( 9 * centigrados / 5);
                
                resultadoLabel.setText("Los grados: " + centigrados + " pasaron a: "+ fahrenheit + " Fahrenheit");
            } catch (NumberFormatException ex) {
                resultadoLabel.setText("Error");
            }
    });
        
    JPanel panel = new JPanel();
    panel.add(labelgrado);
    panel.add(Textgrado);
    panel.add(submitButton);
    panel.add(resultadoLabel);
    
    add(panel);
    pack();
    setLocationRelativeTo(null);
        
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Adicionales1__aSwing ejercicio = new Adicionales1__aSwing();
            ejercicio.setVisible(true);
        });
    }
    
}
