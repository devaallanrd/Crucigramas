/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedroabarcaiiproyecto.dao;

import java.util.ArrayList;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;
import pedroabarcaiiproyecto.entidades.Jugador;

/**
 *
 * @author Pedro
 */
public class JugadorDAO {
    
    Conexion connect ;

    public JugadorDAO() {
    }

    public JugadorDAO(Conexion connect) {
        this.connect = connect;
    }
    
    public Jugador buscarJugador(String name){
        
        return null;
    }
    
    public ArrayList<Jugador> buscarTodos(){
        return null;
    }
    
}
