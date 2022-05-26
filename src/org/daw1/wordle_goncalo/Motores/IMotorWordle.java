/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.daw1.wordle_goncalo.Motores;

/**
 *
 * @author Gonçalo
 */
public interface IMotorWordle {
    
    public boolean checkPalabra(String string);

    public String obtenerPalabraAleatoria();
    
    public boolean anadirPalabra(String string);
    
    public boolean removePalabra(String string);
}
