/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareacola;

/**
 *
 * @author user
 */
public class ColaArray <T> {
    
    private T[] queue;
    private int frente, cola, longitud;

    public ColaArray(int tamanio) {
        queue = (T[]) new Object[tamanio];
        frente = cola = -1;
        longitud = 0;
    }

    
    public boolean isEmpty() {
        return frente == -1;
    }

    
    public int length() {
        return longitud;
    }

    
    public T dequeue() {
        T elemento = null;
        if(!isEmpty()) {
            elemento = queue[frente];
            if (frente == cola) {
                frente = cola = -1;
            } else {
                frente = move(frente);
            }
        }
        return elemento;
    }

    
    public T font() {
        if (isEmpty()) {
            return null;
        }
        return queue[frente];
    }

    
    public void enqueue(T elemento) throws Exception {
        if (!isFull()) {
            cola = move(cola);
            if (isEmpty()) {
                frente++;
            }
            queue[cola] = elemento;
        }
        longitud++;
    }

    
    
    public boolean isFull() {
        return  move(cola) == frente;
    }

    
    private int move(int num) {
        return (num + 1) % queue.length;
    }

    
    public String toString() {
        String resultado = "";
        if (!isEmpty()) {
            int auxiliar = frente;
            do {
                resultado += queue[auxiliar] + " ";
                auxiliar = move(auxiliar);
            } while (auxiliar != move(cola));
        } else {
            resultado += "null";
        }
        return resultado;
    }
    
}
    

