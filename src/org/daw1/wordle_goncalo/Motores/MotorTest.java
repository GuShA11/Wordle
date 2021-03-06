/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.daw1.wordle_goncalo.Motores;

import org.daw1.wordle_goncalo.Motores.IMotorWordle;

/**
 *
 * @author Gonçalo
 */
public class MotorTest implements IMotorWordle {

    public MotorTest() {
    }

    @Override
    public boolean checkPalabra(String string) {
        return true;
    }

    @Override
    public String obtenerPalabraAleatoria() {
        return "CICLO";
    }

    @Override
    public boolean anadirPalabra(String string) {
        return true;
    }

    @Override
    public boolean removePalabra(String string) {
        return true;
    }
}
