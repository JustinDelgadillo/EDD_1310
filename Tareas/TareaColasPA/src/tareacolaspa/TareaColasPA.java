/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacolaspa;


import java.util.ArrayList;

/**
 *
 * @author user
 */
public class TareaColasPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ColaPrioridadAcotada<String> Barco = new ColaPrioridadAcotada<>();
        
        Barco.is_empty();
        
        Barco.length();
        
        Barco.enqueue(1, "Niñas");
        
        Barco.enqueue(2, "Niños");
        
        Barco.enqueue(2, "3era edad");
        
        Barco.enqueue(3, "Mujeres");
        
        Barco.enqueue(3, "Hombres");
        
        Barco.enqueue(4, "Maestre");
        
        Barco.enqueue(4, "Mecanico");
        
        Barco.enqueue(4,"Vigia");
        
        Barco.enqueue(4, "Timonel");
        
        Barco.enqueue(5, "Capitan");
        
        
        Barco.dequeueBPQ();
        
        Barco.dequeueBPQ();
        
        Barco.dequeueBPQ();
        
        Barco.dequeueBPQ();
        
        Barco.dequeueBPQ();
        
        Barco.dequeueBPQ();
        
        Barco.dequeueBPQ();
        
        Barco.dequeueBPQ();
        
        Barco.dequeueBPQ();
        
        Barco.dequeueBPQ();

        Barco.toString();
    }
}
   
    

