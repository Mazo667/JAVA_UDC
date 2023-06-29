package GUI_Swing;
import java.awt.*;
import javax.swing.*;

public class JTextArea {
	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Ejemplo JTextArea");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        JTextArea textArea = new JTextArea();
	        JScrollPane scrollPane = new JScrollPane();

	        frame.getContentPane().add(scrollPane);

	        frame.pack();
	        frame.setVisible(true);
	    }
	}

