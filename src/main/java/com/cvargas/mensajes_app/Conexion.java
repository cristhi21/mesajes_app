/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvargas.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author crist
 */
public class Conexion {
    
    
    public Connection get_connection(){
        Connection conection = null;
        try{
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app", "root", "");
            if(conection!=null){
                System.out.println("conexion exitosa!");
            }
        }catch(SQLException e){
            System.out.println("Exepcion: " + e);
        }
        return conection;
    }
    
}
