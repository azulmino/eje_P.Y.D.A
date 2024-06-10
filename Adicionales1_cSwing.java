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
        
public class Adicionales1_cSwing extends JFrame {
    
    public Adicionales1_cSwing(){
        
    setTitle("Adicionales C");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel label_cat_v = new JLabel ("Ingrese el valor del cateto vertical:");
    JTextField text_cat_v = new JTextField(10);
    
    JLabel label_cat_h = new JLabel ("Ingrese el valor del cateto horizontal:");
    JTextField text_cat_h = new JTextField(10);
    
    JButton submitButton = new JButton ("Enviar");
    JLabel resultadoLabel = new JLabel();
    
    submitButton.addActionListener(e -> {
            try {
                double cate_v = Double.parseDouble(text_cat_v.getText());
                double cate_h = Double.parseDouble(text_cat_h.getText());
                
                double hipo = Math.sqrt(cate_v * cate_v + cate_h * cate_h);
                
                resultadoLabel.setText("La Longitud de la Hipotenusa es: " + hipo);
            } catch (NumberFormatException ex) {
                resultadoLabel.setText("Error");
            }
    });
    
    JPanel panel = new JPanel();
    panel.add(label_cat_v);
    panel.add(text_cat_v);
    panel.add(label_cat_h);
    panel.add(text_cat_h);
    panel.add(submitButton);
    panel.add(resultadoLabel);
    
    add(panel);
    pack();
    setLocationRelativeTo(null);
    
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Adicionales1_cSwing ejercicio = new Adicionales1_cSwing();
            ejercicio.setVisible(true);
        });
    }
    
}
