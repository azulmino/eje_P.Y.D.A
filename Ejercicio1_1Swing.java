package ejercicio1_1swing;

import javax.swing.*;

public class Ejercicio1_1Swing extends JFrame {

    public Ejercicio1_1Swing() {
        setTitle("Ejercicio 1.1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField inputField = new JTextField(10);
        JButton submitButton = new JButton("Enviar");
        JLabel resultLabel = new JLabel("El número introducido es: ");

        submitButton.addActionListener(e -> {
            try {
                int num = Integer.parseInt(inputField.getText());
                resultLabel.setText("El número introducido es: " + num);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Entrada inválida. Introduce un número válido.");
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Escriba un número: "));
        panel.add(inputField);
        panel.add(submitButton);
        panel.add(resultLabel);

        add(panel);
        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ejercicio1_1Swing ejercicio = new Ejercicio1_1Swing();
            ejercicio.setVisible(true);
        });
    }
}
