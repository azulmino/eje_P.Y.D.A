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

public class Ejercicio2_16Swing extends JFrame {
    public Ejercicio2_16Swing() {
        
    setTitle("Ejercicio 2.16");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel pedir = new JLabel ("Ingrese un numero:");
    
    JTextField num = new JTextField (10);
    
    JTextArea resu = new JTextArea (5,5);
    
    JButton submitButton = new JButton ("Enviar");
    
    submitButton.addActionListener(e -> {
            try {
                
                int Num = Integer.parseInt(num.getText());
                
                if (Num >0 && Num <100){
                    switch (Num){
                        case 1 -> {
                            resu.setText("Uno");
                            break;
                        }
                        case 2 -> {
                            resu.setText("Dos");
                            break;
                        }
                        case 3 -> {
                            resu.setText("Tres");
                            break;
                        }
                        case 4 -> {
                            resu.setText("Cuatro");
                            break;
                        }
                        case 5 -> {
                            resu.setText("Cinco");
                            break;
                        }
                        case 6 -> {
                            resu.setText("Seis");
                            break;
                        }
                        case 7 -> {
                            resu.setText("Siete");
                            break;
                        }
                        case 8 -> {
                            resu.setText("Ocho");
                            break;
                        }
                        case 9 -> {
                            resu.setText("Nueve");
                            break;
                        }
                        case 10 -> {
                            resu.setText("Diez");
                            break;
                        }
                        case 11 -> {
                            resu.setText("Once");
                            break;
                        }
                        case 12 -> {
                            resu.setText("Doce");
                            break;
                        }
                        case 13 -> {
                            resu.setText("Trece");
                            break;
                        }
                        case 14 -> {
                            resu.setText("Catorce");
                            break;
                        }
                        case 15 -> {
                            resu.setText("Quince");
                            break;
                        }
                        case 16 -> {
                            resu.setText("Dieciseis");
                            break;
                        }
                        case 17 -> {
                            resu.setText("Diecisiete");
                            break;
                        }
                        case 18 -> {
                            resu.setText("Dieciocho");
                            break;
                        }
                        case 19 -> {
                            resu.setText("Diecinueve");
                            break;
                        }
                        case 20 -> {
                            resu.setText("Veinte");
                            break;
                        }
                        case 21 -> {
                            resu.setText("Ventiuno");
                            break;
                        }
                        case 22 -> {
                            resu.setText("Ventidos");
                            break;
                        }
                        case 23 -> {
                            resu.setText("Ventitres");
                            break;
                        }
                        case 24 -> {
                            resu.setText("Venticuatro");
                            break;
                        }
                        case 25 -> {
                            resu.setText("Venticinco");
                            break;
                        }
                        case 26 -> {
                            resu.setText("Ventiseis");
                            break;
                        }
                        case 27 -> {
                            resu.setText("Ventisiete");
                            break;
                        }
                        case 28 -> {
                            resu.setText("Ventiocho");
                            break;
                        }
                        case 29 -> {
                            resu.setText("Veintinueve");
                            break;
                        }
                        case 30 -> {
                            resu.setText("Treinta");
                            break;
                        }
                        case 31 -> {
                            resu.setText("Treinta y uno");
                            break;
                        }
                        case 32 -> {
                            resu.setText("Treinta y dos");
                            break;
                        }
                        case 33 -> {
                            resu.setText("Treinta y tres");
                            break;
                        }
                        case 34 -> {
                            resu.setText("Treinta y cuatro");
                            break;
                        }
                        case 35 -> {
                            resu.setText("Treinta y cinco");
                            break;
                        }
                        case 36 -> {
                            resu.setText("Treinta y seis");
                            break;
                        }
                        case 37 -> {
                            resu.setText("Treinta y siete");
                            break;
                        }
                        case 38 -> {
                            resu.setText("Treinta y ocho");
                            break;
                        }
                        case 39 -> {
                            resu.setText("Treinta y nueve");
                            break;
                        }
                        case 40 -> {
                            resu.setText("Cuarenta");
                            break;
                        }
                        case 41 -> {
                            resu.setText("Cuarenta y uno");
                            break;
                        }
                        case 42 -> {
                            resu.setText("Cuarenta y dos");
                            break;
                        }
                        case 43 -> {
                            resu.setText("Cuarenta y tres");
                            break;
                        }
                        case 44 -> {
                            resu.setText("Cuarenta y cuatro");
                            break;
                        }
                        case 45 -> {
                            resu.setText("Cuarenta y cinco");
                            break;
                        }
                        case 46 -> {
                            resu.setText("Cuarenta y seis");
                            break;
                        }
                        case 47 -> {
                            resu.setText("Cuarenta y siete");
                            break;
                        }
                        case 48 -> {
                            resu.setText("Cuarenta y ocho");
                            break;
                        }
                        case 49 -> {
                            resu.setText("Cuarenta y nueve");
                            break;
                        }
                        case 50 -> {
                            resu.setText("Cincuenta");
                            break;
                        }
                        case 51 -> {
                            resu.setText("Cincuenta y uno");
                            break;
                        }
                        case 52 -> {
                            resu.setText("Cincuenta y dos");
                            break;
                        }
                        case 53 -> {
                            resu.setText("Cincuenta y tres");
                            break;
                        }
                        case 54 -> {
                            resu.setText("Cincuenta y cuatro");
                            break;
                        }
                        case 55 -> {
                            resu.setText("Cincuenta y cinco");
                            break;
                        }
                        case 56 -> {
                            resu.setText("Cincuenta y seis");
                            break;
                        }
                        case 57 -> {
                            resu.setText("Cincuenta y siete");
                            break;
                        }
                        case 58 -> {
                            resu.setText("Cincuenta y ocho");
                            break;
                        }
                        case 59 -> {
                            resu.setText("Cincuenta y nueve");
                            break;
                        }
                        case 60 -> {
                            resu.setText("Sesenta");
                            break;
                        }
                        case 61 -> {
                            resu.setText("Sesenta y uno");
                            break;
                        }
                        case 62 -> {
                            resu.setText("Sesenta y dos");
                            break;
                        }
                        case 63 -> {
                            resu.setText("Sesenta y tres");
                            break;
                        }
                        case 64 -> {
                            resu.setText("Sesenta y cuatro");
                            break;
                        }
                        case 65 -> {
                            resu.setText("Sesenta y cinco");
                            break;
                        }
                        case 66 -> {
                            resu.setText("Sesenta y seis");
                            break;
                        }
                        case 67 -> {
                            resu.setText("Sesenta y siete");
                            break;
                        }
                        case 68 -> {
                            resu.setText("Sesenta y ocho");
                            break;
                        }
                        case 69 -> {
                            resu.setText("Sesenta y nueve");
                            break;
                        }
                        case 70 -> {
                            resu.setText("Setenta");
                            break;
                        }
                        case 71 -> {
                            resu.setText("Setenta y uno");
                            break;
                        }
                        case 72 -> {
                            resu.setText("Setenta y dos");
                            break;
                        }
                        case 73 -> {
                            resu.setText("Setenta y tres");
                            break;
                        }
                        case 74 -> {
                            resu.setText("Setenta y cuatro");
                            break;
                        }
                        case 75 -> {
                            resu.setText("Setenta y cinco");
                            break;
                        }
                        case 76 -> {
                            resu.setText("Setenta y seis");
                            break;
                        }
                        case 77 -> {
                            resu.setText("Setenta y siete");
                            break;
                        }
                        case 78 -> {
                            resu.setText("Setenta y ocho");
                            break;
                        }
                        case 79 -> {
                            resu.setText("Setenta y nueve");
                            break;
                        }
                        case 80 -> {
                            resu.setText("Ochenta");
                            break;
                        }
                        case 81 -> {
                            resu.setText("Ochenta y uno");
                            break;
                        }
                        case 82 -> {
                            resu.setText("Ochenta y dos");
                            break;
                        }
                        case 83 -> {
                            resu.setText("Ochenta y tres");
                            break;
                        }
                        case 84 -> {
                            resu.setText("Ochenta y cuatro");
                            break;
                        }
                        case 85 -> {
                            resu.setText("Ochenta y cinco");
                            break;
                        }
                        case 86 -> {
                            resu.setText("Ochenta y seis");
                            break;
                        }
                        case 87 -> {
                            resu.setText("Ochenta y siete");
                            break;
                        }
                        case 88 -> {
                            resu.setText("Ochenta y ocho");
                            break;
                        }
                        case 89 -> {
                            resu.setText("Ochenta y nueve");
                            break;
                        }
                        case 90 -> {
                            resu.setText("Noventa");
                            break;
                        }
                        case 91 -> {
                            resu.setText("Noventa y uno");
                            break;
                        }
                        case 92 -> {
                            resu.setText("Noventa y dos");
                            break;
                        }
                        case 93 -> {
                            resu.setText("Noventa y tres");
                            break;
                        }
                        case 94 -> {
                            resu.setText("Noventa y cuatro");
                            break;
                        }
                        case 95 -> {
                            resu.setText("Noventa y cinco");
                            break;
                        }
                        case 96 -> {
                            resu.setText("Noventa y seis");
                            break;
                        }
                        case 97 -> {
                            resu.setText("Noventa y siete");
                            break;
                        }
                        case 98 -> {
                            resu.setText("Noventa y ocho");
                            break;
                        }
                        case 99 -> {
                            resu.setText("Noventa y nueve");
                            break;
                        }
                        
                        
                            
                    }
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
            Ejercicio2_16Swing ejercicio = new Ejercicio2_16Swing();
            ejercicio.setVisible(true);
        });
    }
}
