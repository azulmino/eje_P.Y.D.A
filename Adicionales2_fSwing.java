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

public class Adicionales2_fSwing extends JFrame {
    
    public Adicionales2_fSwing (){
        
    setTitle("Adicionales 2.F");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel num = new JLabel ("Ingrese el numero de 3 cifras");
    JTextField textnum = new JTextField (10);
    
    JButton submitButton = new JButton ("Enviar");
    JLabel resultadoLabel = new JLabel();
    
    submitButton.addActionListener(e -> {
            try {
                int Num = Integer.parseInt(textnum.getText());
                
                int centenas = Num / 100;
                int decenas = (Num / 10) % 10;
                int unidades = Num % 10;
                
                
                resultadoLabel.setText("Centenas: "+ centenas + ", Decenas: " + decenas + " y Unidades: " + unidades);
            } catch (NumberFormatException ex) {
                resultadoLabel.setText("Error");
            }
    });
    
    JPanel panel = new JPanel();
    panel.add(num);
    panel.add(textnum);
    panel.add(submitButton);
    panel.add(resultadoLabel);
    
    add(panel);
    pack();
    setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Adicionales2_fSwing ejercicio = new Adicionales2_fSwing();
            ejercicio.setVisible(true);
        });
    }
    
}
