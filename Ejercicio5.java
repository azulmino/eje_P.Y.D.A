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

public class Ejercicio5 extends JFrame {
    public Ejercicio5() {
    
    JLabel pedir = new JLabel ("Ingrese una contraseña");
    
    JTextField contra = new JTextField (10);
    
    JButton submitButton = new JButton ("Enviar");
    JLabel ingresar = new JLabel ("Validar tu contraseña");
    JTextField validar = new JTextField(10);
    JTextArea resu = new JTextArea (5,5);
    
    submitButton.addActionListener(e -> {
            try {
                double con = Double.parseDouble(contra.getText());
                double val = Double.parseDouble(validar.getText());
                
                if (con == val ){
                    resu.setText("La contraseña es correcta");
                    
                } else {
                    resu.setText ("La contraseña es incorrecta");
                }
                
            } catch (NumberFormatException ex) {
                resu.setText("Error, ingrese numeros enteros");
            }
    });
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    panel.add(pedir);
    panel.add(contra);
    panel.add(submitButton);
    panel.add(ingresar);
    panel.add(validar);
    panel.add(resu);
    
    add(panel);
    pack();
    setLocationRelativeTo(null);
}
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ejercicio5 ejercicio = new Ejercicio5();
            ejercicio.setVisible(true);
        });
    }
}
