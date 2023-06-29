package GUI_Swing;
import javax.swing.*;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.*;  

public class JPasswordField {
    public static void main(String[] args) {    
    	JFrame frame = new JFrame("Ejemplo JPasswordField");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

     // create new object
        JPasswordField contra = new JPasswordField(10);
        
         
        // add to the container
        frame.add(passwordField);
         
        // get the password
        char[] password = passwordField.getPassword();

        frame.pack();
        frame.setVisible(true);
    }
}






