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

public class Ejercicio4 extends JFrame {
    public Ejercicio4 (){
        
    setTitle("Ejercicio Prueba 2");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel pedir = new JLabel ("Ingrese números o escriba 'fin' para dar el resultado" );
    JTextField numero = new JTextField (10);
    
    JButton submitButton = new JButton ("Enviar");
    
    JTextArea resu = new JTextArea (5,5);
    
    submitButton.addActionListener(e -> {
                int cont = Integer.parseInt(numero.getText());
                int suma = 0;
                for (int i = 1; i <= 99999; i++){
                   if (cont > 0){
                       cont ++;
                       
                   }
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
            Ejercicio4 ejercicio = new Ejercicio4 ();
            ejercicio.setVisible(true);
        });
    }
}
