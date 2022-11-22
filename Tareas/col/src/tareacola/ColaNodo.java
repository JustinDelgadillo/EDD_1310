/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareacola;

/**
 *
 * @author user
 */
public class ColaNodo <T> {
    
    private Nodo<T> frente;
    private Nodo<T> atras;
    private int longitud;

    public ColaNodo() {
        frente = atras = null;
        longitud = 0;
    }

    
    public boolean isEmpty() {
        return frente == null && longitud == 0;
    }

    
    public int length() {
        return longitud;
    }

    
    public T dequeue() {
        if(isEmpty()) {
            return null;
        }

        
        if(frente == atras) {
            atras = null;
        }

        
        T topValue = frente.getDat();
        frente = frente.getSig();
        longitud--;
        return topValue;
    }

    
    public T frente() {
        if(isEmpty()) {
            return null;
        }

        return frente.getDat();
    }

    
    public void enqueue(T val) {
        
        Nodo<T> nuevoNodo = new Nodo<T>(val);
        
        if(isEmpty()) {
            frente = atras = nuevoNodo;
            
        } else {
            atras.setSig(nuevoNodo);
            atras = nuevoNodo;
        }
        longitud++;
    }

    
    
    @Override
    public String toString() {
        String pilaString = "";
        Nodo<T> iNodo = frente;
        while(iNodo!= null){
            pilaString += iNodo;
            iNodo = iNodo.getSig();
        }
        return pilaString;
    }
    
    
}
    

