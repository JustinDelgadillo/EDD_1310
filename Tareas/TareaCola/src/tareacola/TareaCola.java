/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacola;

/**
 *
 * @author user
 */
public class TareaCola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        ColaNodo<Integer> nodeQueue = new ColaNodo<>();
        
        System.out.println("/***COLA NODO***/");
        
        System.out.println("Esta vacia?: " + nodeQueue.isEmpty());
        
        System.out.println("Enqueue(10)");
        nodeQueue.enqueue(10);
        
        System.out.println("Enqueue(20)");
        nodeQueue.enqueue(20);
        
        System.out.println("Enqueue(30)");
        nodeQueue.enqueue(30);
        
        System.out.println(nodeQueue);
        
        System.out.println("Longitud: " + nodeQueue.length());
        
        System.out.println("Esta vacia?: " + nodeQueue.isEmpty());
        
        System.out.println("Frente: " + nodeQueue.frente());
        
        System.out.println("Dequeue: " + nodeQueue.dequeue());
        
        System.out.println("Dequeue: " + nodeQueue.dequeue());
        
        System.out.println("Dequeue: " + nodeQueue.dequeue());
        
        System.out.println("Esta vacia?: " + nodeQueue.isEmpty());

        ColaArray<Integer> arrayCola = new ColaArray<>(5);
        
        System.out.println("/***COLA ARRAY***/");
        
        System.out.println("Esta vacia?: " + arrayCola.isEmpty());
        
        System.out.println("Enqueue(100)");
        arrayCola.enqueue(100);
        
        System.out.println("Enqueue(200)");
        arrayCola.enqueue(200);
        
        System.out.println("Enqueue(300)");
        arrayCola.enqueue(300);
        
        System.out.println(arrayCola);
        
        System.out.println("Longitud: " + arrayCola.length());
        
        System.out.println("Esta vacia?: " + arrayCola.isEmpty());
        
        System.out.println("Frente: " + arrayCola.font());
        
        System.out.println("Dequeue: " + arrayCola.dequeue());
        
        System.out.println("Dequeue: " + arrayCola.dequeue());
        
        System.out.println("Dequeue: " + arrayCola.dequeue());
        
        System.out.println("Esta vacia?: " + arrayCola.isEmpty());
    }
    
}
