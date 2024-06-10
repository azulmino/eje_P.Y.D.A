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

public class Ejercicio1_3Swing extends JFrame {

    public Ejercicio1_3Swing() {
        setTitle("Ejercicio 1.3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel resultLabel = new JLabel("");
        JTextField inputField = new JTextField(10);
        JLabel edadLabel = new JLabel("¿En que año naciste?");
        JTextField edadField = new JTextField(10);
        JButton submitButton = new JButton("Enviar");


        submitButton.addActionListener(e -> {
            try {
                int edad;
                int año_actual = Integer.parseInt(edadField.getText());
                int año_nacimiento = Integer.parseInt(inputField.getText());
                edad= año_nacimiento-año_actual;
                resultLabel.setText("Tenes o cumplirias " + edad);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Entrada inválida. Introduce un número válido.");
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("¿Que año es?"));
        panel.add(inputField);
        panel.add(edadLabel);
        panel.add(edadField);
        panel.add(submitButton);
        panel.add(resultLabel);

        add(panel);
        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ejercicio1_3Swing ejercicio = new Ejercicio1_3Swing();
            ejercicio.setVisible(true);
        });
    }
}