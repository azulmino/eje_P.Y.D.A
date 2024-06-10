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

public class Ejercicio1_6Swing extends JFrame {
    
    public Ejercicio1_6Swing(){
        
        setTitle("Ejercicio 1.6");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTextField nota1Field = new JTextField(10);
        JTextField nota2Field = new JTextField(10);
        JTextField nota3Field = new JTextField(10);
        JButton submitButton = new JButton("Enviar");
        JLabel instruccionLabel = new JLabel("Ingrese las dos notas:");
        JLabel resultadoLabel = new JLabel();
        
        submitButton.addActionListener(e -> {
            try {
                float nota1 = Integer.parseInt(nota1Field.getText());
                float nota2 = Integer.parseInt(nota2Field.getText());
                float nota3 = Integer.parseInt(nota3Field.getText());
                float total;
                total = (nota1+nota2+nota3)/3;
                
                resultadoLabel.setText("El Promedio de las notas es: " + total);
            } catch (NumberFormatException ex) {
                resultadoLabel.setText("Entrada inválida. Introduce un número entero.");
            }
        });
        
        JPanel panel = new JPanel();
        panel.add(instruccionLabel);
        panel.add(nota1Field);
        panel.add(nota2Field);
        panel.add(nota3Field);
        panel.add(submitButton);
        panel.add(resultadoLabel);
        
        add(panel);
        pack();
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ejercicio1_6Swing ejercicio = new Ejercicio1_6Swing();
            ejercicio.setVisible(true);
        });
    }
    
}
