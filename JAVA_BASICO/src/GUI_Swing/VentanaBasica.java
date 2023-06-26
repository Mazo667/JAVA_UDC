package GUI_Swing;
import javax.swing.*;

public class VentanaBasica {

	public static void main(String[] args) {
		JFrame marco = new JFrame("Mi primera GUI");
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setSize(300,300);
		//Añado un boton al panel de contenido del marco 
		JButton boton1 = new JButton("Presione");
		marco.getContentPane().add(boton1);
		marco.setVisible(true);
	}
}
