/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordle_goncalo.classes;

/**
 *
 * @author Gonçalo
 */
public class FixedLengthString {
    private static final int LENGTH = 5;
    private final String value;
    
    public FixedLengthString(String value) {
        checkFixedLengthString(value);
        this.value=value;
    }

    private void checkFixedLengthString(String s){
        if(!(s.length()== LENGTH)){
            throw new IllegalArgumentException("La longitud de la palabra debe ser igual a \"5\"");
        }
    }
            
    public String getValue() {
        return value;
    }
}
