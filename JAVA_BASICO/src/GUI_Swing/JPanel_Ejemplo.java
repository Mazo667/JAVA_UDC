package GUI_Swing;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class JPanel_Ejemplo {
    public static void main(String[] args) {
        // Crear un JFrame para alojar el JPanel
        JFrame frame = new JFrame("Ejemplo JPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Crear un JPanel
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setPreferredSize(new Dimension(300, 200));
        // Crear un JLabel y establecer el texto
        JLabel label = new JLabel();
        label.setText("¡Hola esto es un Label!");
        // Establecer la fuente del texto
        Font font = new Font("Arial", Font.BOLD, 16);
        label.setFont(font);
        // Alinea el texto al centro horizontalmente
        label.setHorizontalAlignment(SwingConstants.CENTER); 
        // Agrego un borde negro de 2 pixeles
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        label.setBorder(border); 
        //Cambia el color del texto a rojo
        label.setForeground(Color.RED);
        // Permite que el JLabel sea opaco
        label.setOpaque(true); 
        // Cambia el color de fondo a amarillo
        label.setBackground(Color.lightGray);
        // Agregar los componentes al JPanel
        panel.add(label);
        // Agregar el JPanel al JFrame
        frame.getContentPane().add(panel);
        // Ajustar el tamaño del JFrame según el contenido
        frame.pack();
        // Hacer visible el JFrame
        frame.setVisible(true);
    }
}