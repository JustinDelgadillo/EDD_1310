/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashtableadt;

/**
 *
 * @author user
 */
public class HashTableADT {

    public static void main(String[] args) {
        
        TareaHashTables<String> tabla = new TareaHashTables<>(6);
        
        // Metodo add
        tabla.add(236, "A");
        
        tabla.add(526, "B");
        
        tabla.add(313, "C");
        
        tabla.add(29, "D");
        
        tabla.add(187, "E");
        
        tabla.add(435, "F");

        // Metodo valueOf
        tabla.valueOf(236);
        
        tabla.valueOf(313);
        
        tabla.valueOf(187);

        // Metodo remove
        tabla.remove(526);
        
        tabla.remove(29);
        
        tabla.remove(435);
        
    }
}
