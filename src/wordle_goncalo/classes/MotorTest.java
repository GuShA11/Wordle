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
        String[] nombres = {"ismae", "samue", "anxoa", "jorge", "gonca", "juana", "marco", "franc", "danie", "xurxo", "aaron", "breix", "alexa", "adria", "silvi", "josea"};
        this.nombre= new java.util.ArrayList<>();
        for (String n : nombres) {
            this.nombre.add(n);
        }

    }

    @Override
    public boolean checkPalabra(String string) {
            return nombre.contains(string.toLowerCase());

    }

    @Override
    public FixedLengthString obtenerPalabraAleatoria() {
        java.util.Random generador = new java.util.Random();
        return new FixedLengthString(nombre.get(generador.nextInt(nombre.size())));
    }
}
