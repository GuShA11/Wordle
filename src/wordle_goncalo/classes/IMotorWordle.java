/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package wordle_goncalo.classes;
import wordle_goncalo.classes.*;

/**
 *
 * @author Gonçalo
 */
public interface IMotorWordle {
    
    public boolean checkPalabra(String string);

    public FixedLengthString obtenerPalabraAleatoria();
}
