/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilasadt;

/**
 *
 * @author Justin
 */
public class PilaNodo<T> {
    
    private Nodo<T> top;
    private int length;

    
    public PilaNodo() {
        top = null;
        length = 0;
    }

    
    public boolean isEmpty() {
        return top == null && length == 0;
    }

    
    public int length() {
        return length;
    }

    
    public T pop() {
        
        if(isEmpty()) {
            return null;
        }

        
        T topValue = top.getData();
        top = top.getNext();
        return topValue;
    }

    
    public T peek() {
        
        if(isEmpty()) {
            return null;
        }

        
        length--;
        return top.getData();
    }

    
    public void push(T value) {
        Nodo<T> nuevoNodo = new Nodo<T>(value);
        nuevoNodo.setNext(top);
        top = nuevoNodo;
        length++;
    }

    
    
    @Override
    public String toString() {
        String pilaString = "";
        
        Nodo<T> iteradorNodo = top;
        
        while(iteradorNodo != null){
            pilaString += iteradorNodo;
            iteradorNodo = iteradorNodo.getNext();
        }
        return pilaString;
    }
}
    

