/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7mo2da;

/**
 *
 * @author Usuario
 */
import javax.swing.*;

public class Ejercicio1_2Swing extends JFrame {

    public Ejercicio1_2Swing() {
        setTitle("Ejercicio 1.1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel resultLabel = new JLabel("¿Cuantos años tendras el año que viene?");
        JTextField inputField = new JTextField(10);
        JButton submitButton = new JButton("Enviar");


        submitButton.addActionListener(e -> {
            try {
                int num = Integer.parseInt(inputField.getText());
                num=num+1;
                resultLabel.setText("Tendras " + num + " años");
            } catch (NumberFormatException ex) {
                resultLabel.setText("Entrada inválida. Introduce un número válido.");
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Ingrese su edad: "));
        panel.add(inputField);
        panel.add(submitButton);
        panel.add(resultLabel);

        add(panel);
        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ejercicio1_2Swing ejercicio = new Ejercicio1_2Swing();
            ejercicio.setVisible(true);
        });
    }
}

