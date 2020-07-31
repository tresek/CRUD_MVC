package com.mycompany.cursojava2;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Ventana extends JFrame{
    
    public Ventana(){
        setSize(500, 500); //Hacemos visible la ventana 
       
        setTitle("Menu Principal"); // establecemos titulo 
        //setLocation(400, 100);  // establecemos la posicion imicial de la ventana
        setLocationRelativeTo(null); // establecemos la ventana al mesio
        setMinimumSize(new Dimension (200, 200)); // Establecemos el tamaño minimo
        
        this.getContentPane().setBackground(Color.GREEN); //Establecer el color
         setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
        
}
