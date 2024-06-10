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

public class Ejercicio3 extends JFrame {
    public Ejercicio3(){
        
    setTitle("Ejercicio Prueba 2");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel pedir = new JLabel ("Adivina el número");
    JTextField numero = new JTextField(10);
    
    JButton submitButton = new JButton ("Enviar");
    
    JTextArea resu = new JTextArea (5,5);
    
    submitButton.addActionListener(e -> {
            try {
                int num = Integer.parseInt(numero.getText());
                int random = (int) ((Math.random()*100)+1);
                
                for (int i = 1; i <= 99999; i++){
                if (num == random ) {
                    resu.setText("Adivinaste el número!! en " + i + " intentos");
                } else if (num < random){
                    resu.setText("El número es muy chico");
                    } else {
                    resu.setText ("El número es muy grande");
                    }    
                }
                
                
            } catch (NumberFormatException ex) {
                resu.setText("Error, ingrese numeros enteros");
            }
    });
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    panel.add(pedir);
    panel.add(numero);
    panel.add(submitButton);
    panel.add(resu);
    
    add(panel);
    pack();
    setLocationRelativeTo(null);
        
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ejercicio3 ejercicio = new Ejercicio3();
            ejercicio.setVisible(true);
        });
    }
}
