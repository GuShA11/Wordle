/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.daw1.wordle_goncalo.Main;

import org.daw1.wordle_goncalo.Motores.MotorTest;
import org.daw1.wordle_goncalo.Motores.MotorFichero;

/**
 *
 * @author Gonçalo
 */
public class Main_Wordle_goncalo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MotorTest m2 = new MotorTest();
        MotorFichero m3 = new MotorFichero(org.daw1.wordle_goncalo.gui.MainJFrame.file);

        org.daw1.wordle_goncalo.Main.Wordle.lanzar(m3);
    }
}
