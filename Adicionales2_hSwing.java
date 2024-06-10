/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7mo2da;

/**
 *
 * @author Azul
 */

import javax.swing.*;

public class Adicionales2_hSwing extends JFrame {
    
    public Adicionales2_hSwing() {
        
    setTitle("Adicionales 2.H");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel fecha = new JLabel ("Ingrese su fecha de nacimiento");
    JLabel dia = new JLabel ("Dia: ");
    JTextField textdia = new JTextField (10);
    JLabel mes = new JLabel ("Mes: ");
    JTextField textmes = new JTextField (10);
    JLabel año = new JLabel ("Año: ");
    JTextField textaño = new JTextField (10);
    
    JButton submitButton = new JButton ("Enviar");
    JLabel suerte = new JLabel ();
    
    submitButton.addActionListener(e -> {
            try {
                int sumadia = Integer.parseInt(textdia.getText());
                int sumames = Integer.parseInt(textdia.getText());
                int sumaaño = Integer.parseInt(textdia.getText());
                
                int suma = (sumadia + sumames)+ sumaaño ;
                
                int cifra1 = suma/1000;
                int cifra2 = suma/100%10;
                int cifra3 = suma/10%10;
                int cifra4 = suma%10; 
                
                int total = (cifra1 + cifra2)+ (cifra3 + cifra4);
                
                suerte.setText("Tu numero de la suerte es: " + total);
                
            } catch (NumberFormatException ex) {
                suerte.setText("Error");
            }
    });
    
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    panel.add(fecha);
    panel.add(dia);
    panel.add(textdia);
    panel.add(mes);
    panel.add(textmes);
    panel.add(año);
    panel.add(textaño);
    panel.add(submitButton);
    panel.add(suerte);
    
    add(panel);
    pack();
    setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Adicionales2_hSwing ejercicio = new Adicionales2_hSwing();
            ejercicio.setVisible(true);
        });
    }
}
