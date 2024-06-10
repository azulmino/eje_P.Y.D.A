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

public class Ejercicio2_12Swing extends JFrame {
    public Ejercicio2_12Swing (){
        
        setTitle("Ejercicio 2.12");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        JLabel pedir = new JLabel ("Ingrese una fecha (en numeros):");
        
        JLabel nombre = new JLabel ("Dia/Mes/año");
        JTextField dia  = new JTextField (5);
        
        JTextField mes  = new JTextField (5);
        
        JTextField año  = new JTextField (5);

        JTextArea resu = new JTextArea (2,2);
        
        JButton submitButton = new JButton ("Enviar");
    
        submitButton.addActionListener(e -> {
            try {
                
                int Dia = Integer.parseInt(dia.getText());
                int Mes = Integer.parseInt(mes.getText());
                int Año = Integer.parseInt(año.getText());
                
                if (Año <= 2024){
                switch (Mes) {
                    case 1 -> {
                        if (Dia <1 || Dia <= 31) {
                            resu.setText("La fecha es correcta");
                        } else {
                            resu.setText("La fecha no es correcta");
                        }
                        break;
                    }
                    case 2 -> {
                        if (Dia <1 || Dia <= 28) {
                            resu.setText("La fecha es correcta");
                        } else {
                            resu.setText("La fecha no es correcta");
                        }
                        break;
                    }
                    case 3 -> {
                        if (Dia <1 || Dia <= 31) {
                            resu.setText("La fecha es correcta");
                        } else {
                            resu.setText("La fecha no es correcta");
                        }
                        break;
                    }
                    case 4 -> {
                        if (Dia <1 || Dia <= 30) {
                            resu.setText("La fecha es correcta");
                        } else {
                            resu.setText("La fecha no es correcta");
                        }
                        break;
                    }
                    case 5 -> {
                        if (Dia <1 || Dia <= 31) {
                            resu.setText("La fecha es correcta");
                        } else {
                            resu.setText("La fecha no es correcta");
                        }
                        break;
                    }
                    case 6 -> {
                        if (Dia <1 || Dia <= 30) {
                            resu.setText("La fecha es correcta");
                        } else {
                            resu.setText("La fecha no es correcta");
                        }
                        break;
                    }
                    case 7 -> {
                        if (Dia <1 || Dia <= 31) {
                            resu.setText("La fecha es correcta");
                        } else {
                            resu.setText("La fecha no es correcta");
                        }
                        break;
                    }
                    case 8 -> {
                        if (Dia <1 || Dia <= 31) {
                            resu.setText("La fecha es correcta");
                        } else {
                            resu.setText("La fecha no es correcta");
                        }
                        break;
                    }
                    case 9 -> {
                        if (Dia <1 || Dia <= 30) {
                            resu.setText("La fecha es correcta");
                        } else {
                            resu.setText("La fecha no es correcta");
                        }
                        break;
                    }
                    case 10 -> {
                        if (Dia <1 || Dia <= 31) {
                            resu.setText("La fecha es correcta");
                        } else {
                            resu.setText("La fecha no es correcta");
                        }
                        break;
                    }
                    case 11 -> {
                        if (Dia <1 || Dia <= 30) {
                            resu.setText("La fecha es correcta");
                        } else {
                            resu.setText("La fecha no es correcta");
                        }
                        break;
                    }
                    case 12 -> {
                        if (Dia <1 || Dia <= 31) {
                            resu.setText("La fecha es correcta");
                        } else {
                            resu.setText("La fecha no es correcta");
                        }
                        break;
                    }
                    
                        
                }
                }else {
                    resu.setText("El Año tiene que ser menor a 2024");
                }
                
                
                
                
            } catch (NumberFormatException ex) {
                resu.setText("Error, ingrese un numero entero");
            }
        });
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(pedir);
        panel.add(nombre);
        panel.add(dia);
        panel.add(mes);
        panel.add(año);
        panel.add(submitButton);
        panel.add(resu);

        add(panel);
        pack();
        setLocationRelativeTo(null);
        
        }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ejercicio2_12Swing ejercicio = new Ejercicio2_12Swing();
            ejercicio.setVisible(true);
        });
    }
    }
