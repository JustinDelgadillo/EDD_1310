/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilasadt;

/**
 *
 * @author Justin
 */
public class PilasADT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
    
        PilaNodo<Integer> nodeStack = new PilaNodo<>();
        System.out.println("Pila emplando nodos");
        
        System.out.println("isEmpty(): " + nodeStack.isEmpty());
        
        System.out.println("length(): " + nodeStack.length());
        
        System.out.println("push(0)");
        nodeStack.push(0);
        
        System.out.println("push(1)");
        nodeStack.push(1);
        
        System.out.println("push(2)");
        nodeStack.push(2);
        
        System.out.println(nodeStack);
        
        System.out.println("peek(): " + nodeStack.peek());
        
        System.out.println("pop(): " + nodeStack.pop());
        
        System.out.println(nodeStack);

        PilaArray<Integer> arrayStack = new PilaArray<>(5);
        
        System.out.println("|********************|");
        
        System.out.println("Pila empleando Array");
        
        System.out.println("isEmpty(): " + arrayStack.isEmpty());
        
        System.out.println("length(): " + arrayStack.length());
        
        System.out.println("push(11)");
        arrayStack.push(11);
        
        System.out.println("push(12)");
        arrayStack.push(12);
        
        System.out.println("push(13)");
        arrayStack.push(13);
        
        System.out.println("push(14)");
        arrayStack.push(14);
        
        System.out.println("push(15)");
        arrayStack.push(15);
        
        System.out.println("isFull(): " + arrayStack.isFull());
        
        System.out.println(arrayStack);
        
        System.out.println("peek(): " + arrayStack.peek());
        
        System.out.println("pop(): " + arrayStack.pop());
        
        System.out.println(arrayStack);
    }
    }
    
    

