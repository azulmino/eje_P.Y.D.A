/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7mo2da;

/**
 *
 * @author EEST Nº2
 */
import javax.swing.*;

public class Ejercicio1_8Swing extends JFrame {
    public Ejercicio1_8Swing(){
        
    setTitle("Ejercicio 1.8");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel LabelManzanas = new JLabel("Ventas de manzanas de cada trimestre (kg):");
    JTextField TextManzanas1 = new JTextField(10);
    JTextField TextManzanas2 = new JTextField(10);
    JTextField TextManzanas3 = new JTextField(10);
    JTextField TextManzanas4 = new JTextField(10);
    
    JLabel LabelPeras = new JLabel("Ventas de manzanas de cada trimestre (kg):");
    JTextField TextPeras1 = new JTextField(10);
    JTextField TextPeras2 = new JTextField(10);
    JTextField TextPeras3 = new JTextField(10);
    JTextField TextPeras4 = new JTextField(10);
    
    JButton submitButton = new JButton ("Enviar");
    JLabel resultadoLabel = new JLabel();
    
    submitButton.addActionListener(e -> {
            try {
                
                double ventasManzanas1 = Double.parseDouble(TextManzanas1.getText());
                double ventasManzanas2 = Double.parseDouble(TextManzanas1.getText());
                double ventasManzanas3 = Double.parseDouble(TextManzanas1.getText());
                double ventasManzanas4 = Double.parseDouble(TextManzanas1.getText());
                double ventasPeras1 = Double.parseDouble(TextPeras1.getText());
                double ventasPeras2 = Double.parseDouble(TextPeras1.getText());
                double ventasPeras3 = Double.parseDouble(TextPeras1.getText());
                double ventasPeras4 = Double.parseDouble(TextPeras1.getText());
                
                double ventasManzanas = ventasManzanas1 + ventasManzanas2 + ventasManzanas3 + ventasManzanas4;
                double ventasPeras = ventasPeras1 + ventasPeras2 + ventasPeras3 + ventasPeras4;
                
                double importeTotal = (ventasManzanas * 2.35) + (ventasPeras * 1.95);
                
                resultadoLabel.setText("Importe total: " + importeTotal + " euros");
            } catch (NumberFormatException ex) {
                resultadoLabel.setText("Entrada inválida. Introduce un número entero.");
            }
    });
    
    JPanel panel = new JPanel();
    panel.add(LabelManzanas);
    panel.add(TextManzanas1);
    panel.add(TextManzanas2);
    panel.add(TextManzanas3);
    panel.add(TextManzanas4);
    panel.add(LabelPeras);
    panel.add(TextPeras1);
    panel.add(TextPeras2);
    panel.add(TextPeras3);
    panel.add(TextPeras4);
    panel.add(submitButton);
    panel.add(resultadoLabel);
    
    add(panel);
    pack();
    setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ejercicio1_8Swing ejercicio = new Ejercicio1_8Swing();
            ejercicio.setVisible(true);
        });
    }
}
