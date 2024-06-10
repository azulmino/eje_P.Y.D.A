/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7mo2da;

/**
 *
 * @author EEST Nº2
 */
import javax.swing.*;

public class Ejercicio1_7Swing extends JFrame {
    
    public Ejercicio1_7Swing(){
    
    setTitle("Ejercicio 1.7");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel instruccionLabel = new JLabel ("Ingrese el numero que quiere redondear");
    JTextField numeroField = new JTextField(10);
    JButton submitButton = new JButton ("Enviar");
    JLabel resultadoLabel = new JLabel();
    
    submitButton.addActionListener(e -> {
            try {
                double decimalValue = Double.parseDouble(numeroField.getText());
                int integerValue = (int) Math.round(decimalValue);
                resultadoLabel.setText("El redonde es: " + integerValue );
            } catch (NumberFormatException ex) {
                resultadoLabel.setText("Entrada inválida. Introduce un número entero.");
            }
    });
    
    JPanel panel = new JPanel();
    panel.add(instruccionLabel);
    panel.add(numeroField);
    panel.add(submitButton);
    panel.add(resultadoLabel);
    
    add(panel);
    pack();
    setLocationRelativeTo(null);
    }
     public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ejercicio1_7Swing ejercicio = new Ejercicio1_7Swing();
            ejercicio.setVisible(true);
        });
    }
}
