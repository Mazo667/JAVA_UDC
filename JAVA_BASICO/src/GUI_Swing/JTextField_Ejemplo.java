package GUI_Swing;

import java.awt.*;
import javax.swing.*;

public class JTextField_Ejemplo {

    public static void main(String[] args) {
        // Crear un JFrame para alojar el JTextField
        JFrame frame = new JFrame("Ejemplo JTextField");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Crear un JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        // Crear un JTextField
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(200, 30));
        // Establecer el texto predeterminado
        textField.setText("Escribe aquí");
        // Establecer el color de fondo y del texto
        textField.setBackground(Color.GRAY);
        textField.setForeground(Color.BLACK);
        // Establecer el alineamiento del texto
        textField.setHorizontalAlignment(JTextField.CENTER);
        // Establecer el tipo de letra
        Font font = new Font("Arial", Font.BOLD, 14);
        textField.setFont(font);
        // Habilitar o deshabilitar la edición del JTextField
        textField.setEditable(true);
        // Agregar el JTextField al JPanel
        panel.add(textField);
        // Agregar el JPanel al JFrame
        frame.getContentPane().add(panel);
        // Ajustar el tamaño del JFrame según el contenido
        frame.pack();
        // Hacer visible el JFrame
        frame.setVisible(true);
    }
}