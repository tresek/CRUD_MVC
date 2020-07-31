package com.mycompany.aplicacion;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion extends javax.swing.JPanel {
    public static final String URL = "jdbc:mysql://localhost:3306/tienda";
    public static final String USUARIO = "root";
    public static final String PASSWORD = "";



    public Conexion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonConectar = new javax.swing.JButton();

        botonConectar.setText("Conectar");
        botonConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addComponent(botonConectar)
                .addGap(156, 156, 156))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(botonConectar)
                .addContainerGap(147, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConectarActionPerformed
               Connection conexion = getConnection();
    }                                             

    public Connection getConnection(){
        Connection conexion = null;
        try{
           Class.forName("com.mysql.jdbc.Driver");
           conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
           JOptionPane.showMessageDialog(null,"Coneccion exitosa !!");
                   
        }catch(HeadlessException | ClassNotFoundException | SQLException ex){
            System.err.print("Error, " + ex);
        }
        return conexion;
    
    }//GEN-LAST:event_botonConectarActionPerformed

public static void main (String [] args){
    System.out.println("Hola ");

}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonConectar;
    // End of variables declaration//GEN-END:variables
}

