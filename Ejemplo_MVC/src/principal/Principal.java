package principal;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

public class Principal {
   public static void main(String [] args){
       Vista vista = new Vista();
       Modelo modelo = new Modelo();
       Controlador controlador = new Controlador(modelo, vista);
       
       controlador.iniciar();
       vista.setVisible(true);
       
   
   } 
}
