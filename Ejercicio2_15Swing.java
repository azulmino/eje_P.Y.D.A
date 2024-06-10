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

public class Ejercicio2_15Swing extends JFrame {
    public Ejercicio2_15Swing (){
        
    setTitle("Ejercicio 2.15");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel pedir = new JLabel ("Ingrese un numero:");
    
    JTextField num = new JTextField (10);
    
    JTextArea resu = new JTextArea (5,5);
    
    JButton submitButton = new JButton ("Enviar");
    
    submitButton.addActionListener(e -> {
            try {
                
                int Num = Integer.parseInt(num.getText());
                
                if (Num <7){
                switch (Num){
                    case 1 -> {
                        resu.setText("Lunes");
                        break;
                    }
                    case 2 -> {
                        resu.setText("Martes");
                        break;
                    }
                    case 3 -> {
                        resu.setText("Miercoles");
                        break;
                    }
                    case 4 -> {
                        resu.setText("Jueves");
                        break;
                    }
                    case 5 -> {
                        resu.setText("Viernes");
                        break;
                    }
                    case 6 -> {
                        resu.setText("Sabado");
                        break;
                    }
                    case 7 -> {
                        resu.setText("Domingo");
                        break;
                    }
                }
                }else {
                    resu.setText("El numero tiene que ser menor de 7");
                }
                
            } catch (NumberFormatException ex) {
                resu.setText("Error, ingrese un numero menor a 7");
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
            Ejercicio2_15Swing ejercicio = new Ejercicio2_15Swing();
            ejercicio.setVisible(true);
        });
    }
}
