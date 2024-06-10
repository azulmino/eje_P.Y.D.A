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

public class Ejercicio2_13Swing extends JFrame {
    public Ejercicio2_13Swing (){
        
        setTitle("Ejercicio 2.13");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        JLabel pedir = new JLabel ("Ingrese una hora:");
        JLabel nombre = new JLabel ("(hs/min/seg)");

        JTextField hora = new JTextField (10);
        
        JTextField minutos = new JTextField (10);
        
        JTextField segundos = new JTextField (10);

        JTextArea resu = new JTextArea (2,2);
        
        JButton submitButton = new JButton ("Enviar");
        
        submitButton.addActionListener(e -> {
            try {
                int hs = Integer.parseInt(hora.getText());
                int min = Integer.parseInt(minutos.getText());
                int seg = Integer.parseInt(segundos.getText());
                
                if (hs <= 12 && min == 59 && seg == 59 ) {
                    hs++;
                    min=0;
                    seg=0;
                    
                    resu.setText("0"+ hs + ":"+min+":"+seg + "0");
                } else if (min <= 59 && seg == 59){
                    min++;
                    seg=0;
                    resu.setText("0"+ hs + ":"+ min +":"+  seg + "0");
                } else if (seg <= 58) {
                    seg++;
                    resu.setText(""+ hs + ":"+ min +":"+  seg + "");
                }
                
            } catch (NumberFormatException ex) {
                resu.setText("Error, la hora tiene que ser menor que 12");
            }
        });
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(pedir);
        panel.add(nombre);
        panel.add(hora);
        panel.add(minutos);
        panel.add(segundos);
        panel.add(submitButton);
        panel.add(resu);

        add(panel);
        pack();
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ejercicio2_13Swing ejercicio = new Ejercicio2_13Swing();
            ejercicio.setVisible(true);
        });
    }
}
