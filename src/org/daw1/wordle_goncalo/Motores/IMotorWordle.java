/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.daw1.wordle_goncalo.Motores;

import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author Gonçalo
 */
public interface IMotorWordle {

    public boolean checkPalabra(String string);

    public String obtenerPalabraAleatoria() throws SQLException;

    public boolean anadirPalabra(String string) throws IOException, SQLException;

    public boolean removePalabra(String string) throws SQLException;
}
