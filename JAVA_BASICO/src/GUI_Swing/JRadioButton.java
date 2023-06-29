package GUI_Swing;

import javax.swing.*;

public class JRadioButton {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Ejemplo de JRadioButton");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		JComponent radioBt1 = new JRadioButton("SA");
		JRadioButton radioBt2 = new JRadioButton();
		JRadioButton radioBt3 = new JRadioButton();
		
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioBt1);
        buttonGroup.add(radioBt2);
        buttonGroup.add(radioBt3);
        
		panel.add(radioBt1);
		panel.add(radioBt2);
		panel.add(radioBt3);
		
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
	}

}
