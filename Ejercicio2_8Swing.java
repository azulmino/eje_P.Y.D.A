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

public class Ejercicio2_8Swing extends JFrame {
    
    public Ejercicio2_8Swing() {

        setTitle("Ejercicio 2.8");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel pedira = new JLabel ("Ingrese un número (A):");
        JTextField numa = new JTextField (10); 
        JLabel pedirb = new JLabel ("Ingrese un número (B):");
        JTextField numb = new JTextField (10);
        JLabel pedirc = new JLabel ("Ingrese un número (C):");
        JTextField numc = new JTextField (10);
        
        JButton submitButton = new JButton ("Enviar");
        JTextArea resu = new JTextArea(5,5);
        
        submitButton.addActionListener(e -> {
            try {
                double numA = Double.parseDouble(numa.getText());
                double numB = Double.parseDouble(numb.getText());
                double numC = Double.parseDouble(numc.getText());
                
                double raiz = numB * numB - 4 * numA * numC;
                
                if (raiz > 0){
                    double SolucionMas = (-numB + Math.sqrt(raiz)) / (2*numA);
                    double SolucionMenos = (-numB - Math.sqrt(raiz)) / (2*numA);
                    
                    resu.setText("Los resultados son:");
                    resu.setText("Mas: "+ SolucionMas);
                    resu.setText("Menos: "+ SolucionMenos);
                } else {
                    if (raiz == 0) {
                        double SolucionReal = (-numB / (2*numA));
                        
                        resu.setText("El resultado real es:");
                        resu.setText("" + SolucionReal);
                    } else {
                        resu.setText("No tiene solucion");
                    }
                }
                
            } catch (NumberFormatException ex) {
                resu.setText("Error");
            }
        });
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(pedira);
        panel.add(numa);
        panel.add(pedirb);
        panel.add(numb);
        panel.add(pedirc);
        panel.add(numc);
        panel.add(submitButton);
        panel.add(resu);

        add(panel);
        pack();
        setLocationRelativeTo(null);
        
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ejercicio2_8Swing ejercicio = new Ejercicio2_8Swing();
            ejercicio.setVisible(true);
        });
    }

}
