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
    int tamanio;
    
    /*public ListaLigada<T>{
} 
  */ 
    public boolean estaVacio(){
    return this.head == null;
    }
    
    public int getTamanio(){
    int tamaño = 0;
        Nodo<T> curr = head;

        while(curr != null) {
            curr = curr.getSiguiente();
            tamaño++;
        }
        return tamaño;
    }
    
    public int Buscar(T valor) {
        int indiceDePosicion = 0;
        Nodo<T> recorrido = head;
        while(recorrido != null){
            if(recorrido.getDato() == valor) {
                return indiceDePosicion;
            }
            recorrido = recorrido.getSiguiente();
            indiceDePosicion++;
        }
        return -1;
    }
    
    public void agregarAlInicio(T valor){
     Nodo<T> newNode = new Nodo<>(valor, head);
        head = newNode;
    }
    
    public void agragarAlFInal(T valor) {
        if(estaVacio()) {
            Nodo<T> newNode = new Nodo<>(valor);
            head = newNode;
            return;
        }
         Nodo<T> recorrido = head;
        while(recorrido.getSiguiente()!= null){
            recorrido = recorrido.getSiguiente();
        }
        Nodo<T> newNodo = new Nodo<>(valor );
        recorrido.setSiguiente(newNodo);
}

    public void agragarDespuesDe(T referencia, T valor) {
        if(Buscar(referencia) < 0) return;

        Nodo<T> recorrido = head;
        while(recorrido.getSiguiente()!= null && recorrido.getDato() != referencia){
            recorrido = recorrido.getSiguiente();
        }
        Nodo<T> newNode = new Nodo<>(valor, recorrido.getSiguiente());
        recorrido.setSiguiente(newNode);
    }
       
    
     public void EliminarPorPosicion(int indice) {
        if(this.getTamanio()<= indice || estaVacio()|| indice < 0) return;
        if(indice == 0) {
            EliminarPrimero();
            return;
        }
    int indexPosition = 0;
        Nodo<T> prevNode = null;
        Nodo<T> recorrido = head;

        while(recorrido.getSiguiente()!= null && indexPosition < indice){
            prevNode =recorrido;
            recorrido = recorrido.getSiguiente();
            indexPosition++;
        }
        prevNode.setSiguiente(recorrido.getSiguiente());
     }
     
      public void EliminarPrimero() {
        if(estaVacio()) return;
        head = head.getSiguiente();
    }
     
     public void EliminarUltimo() {
        if(estaVacio()) return;
        if(getTamanio()== 1) {
            EliminarPrimero();
            return;
        }
        Nodo<T> previo = null;
        Nodo<T> recorrido = head;
        while(recorrido.getSiguiente()!= null){
            previo = recorrido;
            recorrido= recorrido.getSiguiente();
        }
        previo.setSiguiente(null);
    }
     
     public void Actualizar(T a_buscar, T valor){
        if(Buscar(a_buscar) < 0) return;

        Nodo<T> recorrido = head;
        while(recorrido != null && recorrido.getDato() != a_buscar){
            recorrido = recorrido.getSiguiente();
        }
        if(recorrido.getDato() != a_buscar) return;
        recorrido.setDato(valor);
    }
     
     /*public void Transversal(){
     Nodo temporal= head;
     
         while (temporal !=null) {
             
             
         }
     
     
     
     }
     */
     
     
     @Override
    public String toString() {
        String ListaLigada = "";
        Nodo<T> recorrido = head;
        while(recorrido != null){
            ListaLigada += recorrido ;
           recorrido = recorrido .getSiguiente();
        }
        return ListaLigada;
    }
     
     
     
}