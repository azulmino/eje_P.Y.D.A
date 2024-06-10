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

public class Ejercicio1 extends JFrame {
    
    public Ejercicio1() {
        
    setTitle("Ejercico Prueba 1");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel pedir = new JLabel ("Ingrese un número:");
    JTextField num = new JTextField(10);
    
    JButton submitButton = new JButton("Enviar");
    
    JTextArea resu = new JTextArea(1,1);
    
    submitButton.addActionListener(e -> {
            try {
                int n = Integer.parseInt(num.getText());
                if (n == 1 || n == 0 ) {
                resu.setText("El resultado es: " + n);
            } else {
                    int resultado = 1;
                    resu.setText("El resultado es: " + resultado);
                    for (int i = 1; i <= n; i++) {
                     resultado *= i;
                    resu.setText("El resultado es: " + resultado);
                        }
                }
            } catch (NumberFormatException ex) {
                resu.setText("Error, ingrese numeros enteros");
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
            Ejercicio1 ejercicio = new Ejercicio1();
            ejercicio.setVisible(true);
        });
    }
    
}
