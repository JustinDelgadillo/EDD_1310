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
     private T Data;
     private Nodo<T> Next;
     
     public Nodo(T valor ) {
         this.Data= valor;
    }
     
     public Nodo(T Data, Nodo<T> Next){
     this.Data= Data;
     this.Next=Next;

     }    
    
      public void setData(T Data) {
        this.Data = Data;
    }
      
       public T getData() {
        return Data;
    }

    public Nodo<T> getNext() {
        return Next;
    }

    public void setNext(Nodo<T> Next) {
        this.Next = Next;
    }

    @Override
    public String toString() {
        return "[" + Data + "] ---> ";
    }
     
    
    
}