
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

public class Controlador implements ActionListener {
    private Modelo modelo;
    private Vista vista;
    
    public Controlador(Modelo modelo, Vista vista){
    this.modelo = modelo;
    this.vista = vista;
    vista.botonSumar.addActionListener(this);
    
    }
    
    public void iniciar(){
        vista.setTitle("MVC Sumar");
        vista.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        modelo.setNumero1(Integer.parseInt(vista.jTextField1.getText()));
        modelo.setNumero2(Integer.parseInt(vista.jTextField2.getText()));
        modelo.sumar();
        
        vista.cajaResultado.setText(String.valueOf(modelo.getCajaResultado()));
    }

    

}
