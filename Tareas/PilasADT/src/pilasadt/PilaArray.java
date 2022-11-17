/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilasadt;

/**
 *
 * @author Justin
 */
public class PilaArray<T> {
    
    private T[] pila;
    private int top;

    public PilaArray(int size) {
        pila = (T[]) new Object[size];
        top = -1;
    }

    
    public boolean isEmpty() {
        return top == -1;
    }

    
    public int length() {
        return top + 1;
    }

    
    public T pop() {
        
        if (isEmpty()) {
            return null;
        }
        
        T element = pila[top];
        top--;
        return element;
    }

    
    public T peek() {
        
        if (isEmpty()) {
            return null;
        }
        
        return pila[top];
    }

    
    public void push(T element) throws Exception {
        
        if (isFull()) {
            throw new Exception("Error, la longitud maxima se ha alcanzado");
        }
        
        top++;
        pila[top] = element;
    }

    
    public boolean isFull() {
        return top == pila.length - 1;
    }

    
    public String toString() {
        
        String pilaString = "";
        
        for (int i = 0; i <= top; i++) {
            pilaString += "|" + pila[i] + "| ---> ";
        }
        
        return pilaString;
    }
}

