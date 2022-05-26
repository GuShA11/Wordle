/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.daw1.wordle_goncalo.Motores;

import java.io.IOException;
import java.sql.*;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Gonçalo
 */
public class MotorBBDD implements IMotorWordle {

    private static final String URL = "jdbc:sqlite:data/dbwordle.db";
    private static String lang;
    private Set<String> almacen = new TreeSet<>();

    public MotorBBDD(String lang) {
        this.lang = lang;
    }

    private void colocarPalabrasFicheroEnAlmacen() {
        try (Connection conn = DriverManager.getConnection(URL);
                PreparedStatement ps = conn.prepareStatement("SELECT palabra FROM palabras WHERE lang = ?")) {
            ps.setString(1, lang);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    String string = rs.getString("palabra");
                    almacen.add(string);
                }
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

    @Override
    public boolean checkPalabra(String string) {
        colocarPalabrasFicheroEnAlmacen();
        string = string.toUpperCase().trim();
        return almacen.contains(string.toUpperCase());
    }

    @Override
    public String obtenerPalabraAleatoria() throws SQLException {
        try (Connection conn = DriverManager.getConnection(URL);
                PreparedStatement ps = conn.prepareStatement("SELECT palabra FROM palabras WHERE lang = ? ORDER BY RANDOM() LIMIT 1")) {
            ps.setString(1, lang);
            String palabra;
            try (ResultSet rs = ps.executeQuery()) {
                palabra = rs.getString("palabra");
                return palabra;
            }
        }
    }

    @Override
    public boolean anadirPalabra(String string) throws IOException, SQLException {
        colocarPalabrasFicheroEnAlmacen();
        try (Connection conn = DriverManager.getConnection(URL);
                PreparedStatement ps = conn.prepareStatement("INSERT INTO palabras (palabra, lang) VALUES(?, ?)")) {
            ps.setString(1, string.toUpperCase());
            ps.setString(2, lang);
            int insertadas = ps.executeUpdate();
            return insertadas > 0;
        }
    }

    @Override
    public boolean removePalabra(String string) throws SQLException {
        colocarPalabrasFicheroEnAlmacen();
        try (Connection conn = DriverManager.getConnection(URL);
                PreparedStatement ps = conn.prepareStatement("DELETE FROM palabras WHERE palabra = ?")) {
            ps.setString(1, string.toUpperCase().trim());
            int borradas = ps.executeUpdate();
            almacen.remove(string.toUpperCase());
            return borradas > 0;
        }
    }
}
