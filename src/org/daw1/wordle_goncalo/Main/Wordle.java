/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.daw1.wordle_goncalo.Main;

import org.daw1.wordle_goncalo.gui.MainJFrame;
/**
 *
 * @author Gonçalo
 */
public class Wordle {
    public static void lanzar(org.daw1.wordle_goncalo.Motores.IMotorWordle motor){
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