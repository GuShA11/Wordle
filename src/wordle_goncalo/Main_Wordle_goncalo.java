/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wordle_goncalo;

import wordle_goncalo.Motores.*;
import wordle_goncalo.classes.MotorTest;
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
        
        wordle_goncalo.Wordle.lanzar(m2);
    }
}
    

