/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareacolaspa;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Queue<T> {
    
    ArrayList<T> queue;
    
    public Queue(){
        queue = new ArrayList<>();
    }
    
    
    public boolean is_empty(){
        return queue.isEmpty();
    }
    
    
    public int length(){
        return queue.size();
    }
    
    
    public void enqueue (T element){
        queue.add(element);
    }
    
    
    public T dequeue(){
        T eliminado = queue.get(queue.size());
        queue.remove(queue.size());
        return eliminado;
    }
    
    
    @Override
    public String toString(){
    String edo = "";
    for (T dato: queue){
        edo+= dato;
    }
    
    return edo;
    }
    
}