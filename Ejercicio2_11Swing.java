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

public class Ejercicio2_11Swing extends JFrame {
    public Ejercicio2_11Swing (){
        
        setTitle("Ejercicio 2.11");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        JLabel pedir = new JLabel ("Ingrese una nota:");

        JTextField num = new JTextField (10);

        JTextArea resu = new JTextArea (2,2);
        
        JButton submitButton = new JButton ("Enviar");
    
    submitButton.addActionListener(e -> {
            try {
                
                int Num = Integer.parseInt(num.getText());
                
                if (Num == 10 || Num == 9){
                    resu.setText("Nota Sobresaliente");
                } else if (Num == 8 || Num == 7) {
                    resu.setText ("Nota Notable");
                } else if (Num == 6){
                    resu.setText("Nota Bien");
                } else if (Num == 5){
                    resu.setText("Nota Suficiente");
                } else if (Num <= 4 || Num >= 0){
                    resu.setText("Nota Insuficiente");
                }
                
            } catch (NumberFormatException ex) {
                resu.setText("Error, ingrese un numero entero");
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
            Ejercicio2_11Swing ejercicio = new Ejercicio2_11Swing();
            ejercicio.setVisible(true);
        });
    }
    
    
}
