/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordle_goncalo;

import wordle_goncalo.gui.MainJFrame;
import wordle_goncalo.classes.IMotorWordle.*;
/**
 *
 * @author Gonçalo
 */
public class Wordle {
    public static void lanzar(wordle_goncalo.classes.IMotorWordle motor){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame(motor).setVisible(true);
            }
        });
    }
    public static void lanzar(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }    
    
}