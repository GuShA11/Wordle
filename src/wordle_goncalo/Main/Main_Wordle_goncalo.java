/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wordle_goncalo.Main;

import wordle_goncalo.Motores.*;

/**
 *
 * @author Gonçalo
 */
public class Main_Wordle_goncalo {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
         Motor1 m1 = new Motor1();
         MotorTest m2= new MotorTest();
         MotorFichero m3= new MotorFichero(wordle_goncalo.gui.MainJFrame.file);
        
        wordle_goncalo.Main.Wordle.lanzar(m3);
    }
}
    

