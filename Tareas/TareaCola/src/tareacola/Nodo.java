/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareacola;

/**
 *
 * @author user
 */
public class Nodo <T> {
    
    private T dat;
    private Nodo<T> sig;

    public Nodo() {
    }

    
    public Nodo(T val) {
        this.dat = val;
    }

    
    public Nodo(T dat, Nodo<T> sig) {
        this.dat = dat;
        this.sig = sig;
    }

    
    public T getDat() {
        return dat;
    }

    
    public void setDat(T dat) {
        this.dat = dat;
    }

    
    public Nodo<T> getSig() {
        return sig;
    }

    public void setSig(Nodo<T> sig) {
        this.sig = sig;
    }

    
    
    @Override
        public String toString() {
        return "|" + dat + "| --> ";
    }
    
}
    

