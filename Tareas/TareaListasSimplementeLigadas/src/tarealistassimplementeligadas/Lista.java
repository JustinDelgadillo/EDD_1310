/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarealistassimplementeligadas;

/**
 *
 * @author Justin
 */
public class Lista <T>{
    private Nodo<T> head;
    int Longitud;
    
    /*public ListaLigada<T>{
} 
  */ 
    public boolean itsEmpty(){
    return this.head == null;
    }
    
    public int getLongitud(){
    int longitud = 0;
        Nodo<T> curr = head;

        while(curr != null) {
            curr = curr.getNext();
            longitud++;
        }
        return longitud;
    }
    
    public int Search(T valor) {
        int iP = 0;
        Nodo<T> r = head;
        while(r != null){
            if(r.getData() == valor) {
                return iP;
            }
            r = r.getNext();
            iP++;
        }
        return -1;
    }
    
    public void addI(T valor){
     Nodo<T> newNode = new Nodo<>(valor, head);
        head = newNode;
    }
    
    public void addF (T valor) {
        if(itsEmpty()) {
            Nodo<T> newNode = new Nodo<>(valor);
            head = newNode;
            return;
        }
         Nodo<T> r = head;
        while(r.getNext()!= null){
            r = r.getNext();
        }
        Nodo<T> newNodo = new Nodo<>(valor );
        r.setNext(newNodo);
}

    public void addD(T ref, T valor) {
        if(Search(ref) < 0) return;

        Nodo<T> r = head;
        while(r.getNext()!= null && r.getNext() != ref){
            r = r.getNext();
        }
        Nodo<T> newNode = new Nodo<>(valor, r.getNext());
        r.setNext(newNode);
    }
       
    
     public void deleteP(int indice) {
        if(this.getLongitud()<= indice || itsEmpty()|| indice < 0) return;
        if(indice == 0) {
            DeleteFirst();
            return;
        }
    int indexPosition = 0;
        Nodo<T> prevNode = null;
        Nodo<T> recorrido = head;

        while(recorrido.getNext()!= null && indexPosition < indice){
            prevNode =recorrido;
            recorrido = recorrido.getNext();
            indexPosition++;
        }
        prevNode.setNext(recorrido.getNext());
     }
     
      public void DeleteFirst() {
        if(itsEmpty()) return;
        head = head.getNext();
    }
     
     public void DeleteLast() {
        if(itsEmpty()) return;
        if(getLongitud()== 1) {
            DeleteFirst();
            return;
        }
        Nodo<T> p = null;
        Nodo<T> r = head;
        while(r.getNext()!= null){
            p = r;
            r= r.getNext();
        }
        p.setNext(null);
    }
     
     public void Refresh (T a_search, T valor){
        if(Search(a_search) < 0) return;

        Nodo<T> r = head;
        while(r != null && r.getData() != a_search){
            r = r.getNext();
        }
        if(r.getData() != a_search) return;
        r.setData(valor);
    }
       
     @Override
    public String toString() {
        String Lista = "";
        Nodo<T> r = head;
        while(r != null){
            Lista += r ;
           r = r .getNext();
        }
        return Lista;
    }
     
     
     
}