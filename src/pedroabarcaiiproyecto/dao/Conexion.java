/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedroabarcaiiproyecto.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Pedro
 */
public class Conexion {
      
private static final String DRIVER_NAME = "org.postgresql.Driver";
private static final String TIPO_CON = "jdbc:postgresql://";
private static final String SERVIDOR = "localhost";
private static final String PUERTO = "5432";
private static final String BASE_DATOS = "BaseDatosTiendaMusica";
private static final String USUARIO = "postgres";
private static final String CONTRASENNA = "aukesafe08";
   //jdbc siempre para pg
public static Connection conexion() throws Exception{
     Connection c = null;
        Statement stmt = null;
        try {
            Class.forName(DRIVER_NAME);//REVISAR SI EN EL PROYECTO HAY UNA CLASE CON ESE NOMBRE
            c = DriverManager.getConnection(TIPO_CON+SERVIDOR+":"+PUERTO+"/"+BASE_DATOS, USUARIO, CONTRASENNA);//jdbc siempre para pg
            System.out.println("Coneccion Establesida");
            return c;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new IllegalArgumentException("Error al conectar");
        }

    }


    
}
