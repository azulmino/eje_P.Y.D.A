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

public class Ejercicio2_5Swing extends JFrame {
    
    public Ejercicio2_5Swing() {
    
    setTitle("ejercicio 2.5");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel pedir = new JLabel ("Ingrese un numero");
    
    JTextField num = new JTextField(10);
    
    JButton submitButton = new JButton ("Enviar");
    JLabel resu = new JLabel();
    
         submitButton.addActionListener(e -> {
            try {
                double Num1 = Double.parseDouble(num.getText());
                
                if (Num1 == 0) {
                        resu.setText("El número es cero.");
                    } else if (Math.abs(Num1) < 1) {
                        resu.setText("El número es casi-cero.");
                    } else {
                        resu.setText("El número no es casi-cero.");
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
            Ejercicio2_5Swing ejercicio = new Ejercicio2_5Swing();
            ejercicio.setVisible(true);
        });
    }
    
}
