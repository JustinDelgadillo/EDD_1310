/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarealistassimplementeligadas;

/**
 *
 * @author Justin
 */
public class Nodo <T> {
     private T Dato;
     private Nodo<T> Siguiente;
     
     public Nodo(T valor ) {
         this.Dato= valor;
    }
     
     public Nodo(T Dato, Nodo<T> Sguiente){
     this.Dato= Dato;
     this.Siguiente=Sguiente;

     }    
    
      public void setDato(T Dato) {
        this.Dato = Dato;
    }
      
       public T getDato() {
        return Dato;
    }

    public Nodo<T> getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo<T> Siguiente) {
        this.Siguiente = Siguiente;
    }

    @Override
    public String toString() {
        return "[" + Dato + "] ---> ";
    }
     
    
    
}