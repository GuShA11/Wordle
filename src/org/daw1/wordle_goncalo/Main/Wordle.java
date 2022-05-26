/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.daw1.wordle_goncalo.Main;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.daw1.wordle_goncalo.gui.MainJFrame;

/**
 *
 * @author Gonçalo
 */
public class Wordle {

    public static void lanzar(org.daw1.wordle_goncalo.Motores.IMotorWordle motor) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainJFrame(motor).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Wordle.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public static void lanzar() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainJFrame().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Wordle.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}
