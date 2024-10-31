/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package software;

import javax.swing.JFrame;


/**
 *
 * @author rafap
 */
public class Software {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     // Create an instance of the main JFrame (your Mainscreen class)
        Mainscreen mainScreen = new Mainscreen();
        
        // Set default close operation and window size
        mainScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainScreen.setSize(465, 310);  // Set an appropriate size for your application
        mainScreen.setResizable(false);  // Make the window resizable if necessary
        mainScreen.setVisible(true);    // Show the main window
        
    }
    
}
