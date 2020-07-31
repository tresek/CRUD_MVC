package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import modelo.ConsultasPersona;
import modelo.Persona;
import vista.VistaPersona;

public class ControladorPersona implements ActionListener {

    private VistaPersona vista;
    private Persona persona;
    private ConsultasPersona modelo;
    // private PreparedStatement;

    public ControladorPersona(VistaPersona vista, Persona persona, ConsultasPersona modelo) {
        this.vista = vista;
        this.persona = persona;
        this.modelo = modelo;
        vista.botonInsertar.addActionListener(this);
        vista.botonLimpiar.addActionListener(this);
        vista.botonBuscar1.addActionListener(this);
        vista.botonModificar.addActionListener(this);
    }

    public void iniciar() {
        vista.setTitle("MVC CRUD");
        vista.setLocationRelativeTo(null);
        vista.cajaId.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.botonInsertar) {
            persona.setClave(vista.cajaClave.getText());
            persona.setNombre(vista.cajaNombre.getText());
            persona.setDomicilio(vista.cajaDomicilio.getText());
            persona.setCelular(vista.cajaCelular.getText());
            persona.setCorreo_electronico(vista.cajaCorreo.getText());
            persona.setFecha_nacimiento(Date.valueOf(vista.cajaFecha.getText()));
            persona.setGenero(vista.comboGenero.getSelectedItem().toString());

            if (modelo.insertar(persona)) {
                JOptionPane.showMessageDialog(null, "Datos Insertados de forma exitosa !!");
                limpiarCaja();
            } else {
                JOptionPane.showMessageDialog(null, "Datos NO Insertados !!");
                limpiarCaja();
            }

        }
        
        if (e.getSource() == vista.botonModificar) {
            persona.setIdPersona(Integer.parseInt(vista.cajaId.getText()));
            persona.setClave(vista.cajaClave.getText());
            persona.setNombre(vista.cajaNombre.getText());
            persona.setDomicilio(vista.cajaDomicilio.getText());
            persona.setCelular(vista.cajaCelular.getText());
            persona.setCorreo_electronico(vista.cajaCorreo.getText());
            persona.setFecha_nacimiento(Date.valueOf(vista.cajaFecha.getText()));
            persona.setGenero(vista.comboGenero.getSelectedItem().toString());

            if(modelo.modificar(persona)){
                JOptionPane.showMessageDialog(null, "Datos Modificados de forma exitosa !!");
                limpiarCaja();
            }else{
                JOptionPane.showMessageDialog(null, "Datos NO modificados !!");
            }
        }
            

        if (e.getSource() == vista.botonLimpiar) {
            limpiarCaja();
        }
        if (e.getSource() == vista.botonBuscar1) {
            persona.setClave(vista.cajaBuscar.getText());
        }
        if(modelo.buscar(persona)){
            vista.cajaId.setText(String.valueOf(persona.getIdPersona()));
            vista.cajaClave.setText(persona.getClave());
            vista.cajaNombre.setText(persona.getNombre());
            vista.cajaDomicilio.setText(persona.getDomicilio());
            vista.cajaCelular.setText(persona.getCelular());
            vista.cajaCorreo.setText(persona.getCorreo_electronico());
            vista.cajaFecha.setText(String.valueOf(persona.getFecha_nacimiento()));
        }else{
            JOptionPane.showMessageDialog(null, "No existe un usuario con la clave ingresada !!");
            limpiarCaja();
        }

    }

    public void limpiarCaja() {
        vista.cajaId.setText(null);
        vista.cajaBuscar.setText(null);
        vista.cajaId.setText(null);
        vista.cajaClave.setText(null);
        vista.cajaNombre.setText(null);
        vista.cajaDomicilio.setText(null);
        vista.cajaCelular.setText(null);
        vista.cajaCorreo.setText(null);
        vista.cajaFecha.setText(null);
        vista.comboGenero.setSelectedIndex(0);
    }

    private Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
