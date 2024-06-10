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

public class Adicionales2_gSwing extends JFrame {
    
    public Adicionales2_gSwing(){
        
    setTitle("Adicionales 2.G");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel num = new JLabel ("Ingrese el numero de 5 cifras");
    JTextField textnum = new JTextField (10);
    
    JButton submitButton = new JButton ("Enviar");
    JLabel resultadoLabel = new JLabel();
    JLabel resultadoLabel1 = new JLabel();
    JLabel resultadoLabel2 = new JLabel();
    JLabel resultadoLabel3 = new JLabel();
    JLabel resultadoLabel4 = new JLabel();
    
    submitButton.addActionListener(e -> {
            try {
                int Num = Integer.parseInt(textnum.getText());
                
                int centenas = Num / 10000;
                int decenas = (Num / 1000) % 1000;
                int unidades =(Num / 100) % 100;
                int a =(Num / 1) % 1;
                
                
                
                
                resultadoLabel.setText("Centenas: "+ centenas);
                resultadoLabel1.setText("Decenas: " + decenas );
                resultadoLabel2.setText("Unidades: " + unidades);
                resultadoLabel3.setText("Unidades: " + a);
                resultadoLabel4.setText(""+Num);
                
            } catch (NumberFormatException ex) {
                resultadoLabel.setText("Error");
            }
    });
    
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    panel.add(num);
    panel.add(textnum);
    panel.add(submitButton);
    panel.add(resultadoLabel);
    panel.add(resultadoLabel1);
    panel.add(resultadoLabel2);
    panel.add(resultadoLabel3);
    panel.add(resultadoLabel4);
    
    add(panel);
    pack();
    setLocationRelativeTo(null);
        
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Adicionales2_gSwing ejercicio = new Adicionales2_gSwing();
            ejercicio.setVisible(true);
        });
    }
    
}
