/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.daw1.wordle_goncalo.Motores;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Gonçalo
 */
public class MotorFichero implements IMotorWordle {

    public static File file;
    private static Set<String> almacen;

    public MotorFichero(File f) {
        file = f;
        almacen = new HashSet<>();
        colocarPalabrasFicheroEnAlmacen();
    }

    private boolean colocarPalabrasFicheroEnAlmacen() {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linea = br.readLine();
            while (linea != null) {
                almacen.add(linea);
                linea = br.readLine();
            }
            return true;
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
        return false;
    }

    private boolean colocarPalabrasAlmacenEnFichero() {
        if (!file.exists()) {
            crearFile();
        }
        try (Writer wr = new BufferedWriter(new FileWriter(file))) {
            wr.write("");
        } catch (IOException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
        try (Writer wr = new BufferedWriter(new FileWriter(file, true))) {
            StringBuilder sb = new StringBuilder();
            for (String aux : almacen) {
                sb.append(aux).append("\n");
            }
            wr.write(sb.toString());
            return true;
        } catch (IOException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
        return false;
    }

    private boolean existsFile() {
        return file.exists();
    }

    private void crearFile() {
        if (!existsFile()) {
            file.getParentFile().mkdirs();
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(MotorFichero.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public boolean removePalabra(String s) {
        if (checkPalabra(s.toUpperCase())) {
            if (!file.exists()) {
                crearFile();
            }
            colocarPalabrasAlmacenEnFichero();
            if (almacen.contains(s.toUpperCase())) {
                if (almacen.remove(s.toUpperCase())) {
                    colocarPalabrasAlmacenEnFichero();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String obtenerPalabraAleatoria() {
        if (!file.exists()) {
            crearFile();
        }
        String string = "";
        java.util.Random generador = new java.util.Random();
        int n = generador.nextInt(almacen.size());
        int contador = 0;
        for (String s : almacen) {
            if (contador == n) {
                return s;
            }
            contador++;
        }
        return string;
    }

    @Override
    public boolean anadirPalabra(String string) {
        if (!existsFile()) {
            crearFile();
        }
        try (BufferedWriter w = new BufferedWriter(new FileWriter(file, true))) {
            if (!checkPalabra(string)) {
                w.append(string + "\n");
                return true;
            } else {
                return false;
            }
        } catch (IOException ex) {
            Logger.getLogger(MotorFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean checkPalabra(String string) {
        if (string.matches("[ñÑa-zA-Z]{5}")) {
            colocarPalabrasFicheroEnAlmacen();
            return almacen.contains(string.toUpperCase());
        } else {
            return false;
        }
    }
}
