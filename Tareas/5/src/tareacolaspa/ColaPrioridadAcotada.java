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
public class ColaPrioridadAcotada <T> extends Queue<T>{
    
    ArrayList<T> ColaPr;
    Queue<T> ColaInt;
    T expulsado;
    
    public ColaPrioridadAcotada(){
        super.dequeue();
        super.is_empty();
        super.length();
        ColaInt = new Queue<>();
        ColaPr = new ArrayList<>();
        for (int i = 0; i<6; i++){
            ColaPr.add((T) ColaInt);
        }
    }
    
    public void enqueue(int prioridad, T elemento){
        ColaPr.add(prioridad, elemento);
    }
    
    
    public void dequeueBPQ(){
        ColaPr.remove(expulsado);
        T sacadointerno= ColaPr.get(0);
        sacadointerno.dequeue();
    }
    
    
}