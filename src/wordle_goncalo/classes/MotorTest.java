/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordle_goncalo.classes;

import java.util.List;

/**
 *
 * @author Gonçalo
 */
public class MotorTest implements IMotorWordle{
    
     private List<String> nombre;

    public MotorTest() {

    }

    @Override
    public boolean checkPalabra(String string) {
            return true;

    }

    @Override
    public String obtenerPalabraAleatoria() {
        return "ANXOA";
    }
}
