/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarealistassimplementeligadas;



/**
 *
 * @author Justin
 */
public class TareaListasSimplementeLigadas {
    
    public static void main(String[] args) {
        Lista<Integer> lista = new Lista<>();
        System.out.println(lista);
        
        System.out.println("Contiene algo la lista?:\t "+ lista.itsEmpty());
        
        System.out.println("El tamaño es de:\t "+ lista.Longitud);
        
        System.out.println("Al inicio añadimos el valor 63");
        lista.addI(63);
        System.out.println(lista);
        System.out.println("Al inicio añadimos el valor 78");
        lista.addI(78);
        System.out.println(lista);
        System.out.println("Al inicio añadimos el valor 16");
        lista.addI(16);
        System.out.println(lista);
        System.out.println("Al inicio añadimos el valor 93");
        lista.addI(93);
        System.out.println(lista); 
        
        System.out.println("**********");        
        
        System.out.println("Al final añadimos el valor 21");
        lista.addF(21);
        System.out.println(lista);
        System.out.println("Al final añadimos el valor 33");
        lista.addF(33);
        System.out.println(lista);
        System.out.println("Al final añadimos el valor 89");
        lista.addF(89);
        System.out.println(lista);
        
        System.out.println("**********");  
        
        System.out.println("Al final añadimos el valor 20 despues de 89");
        lista.addD(89, 20);
        System.out.println(lista);
        System.out.println("Al final añadimos el valor 10 despues de 20");
        lista.addD(20, 10);
        System.out.println(lista);
        System.out.println("Al final añadimos el valor 18 despues de 10");
        lista.addD(10, 18);
        System.out.println(lista);
        
        System.out.println("**********");  
        
        System.out.println("El valor de la posición 3 será eliminado");
        lista.deleteP(3);
        System.out.println(lista);
        
        System.out.println("Borraremos al inicio");
        lista.DeleteFirst();
        System.out.println(lista);
        
        System.out.println("Borraremos al final");
        lista.DeleteLast();
        System.out.println(lista);
        
        System.out.println("**********"); 
        
        System.out.println("Busca el valor 21");
        System.out.println("Esta en la posición: "+ lista.Search(21));
        
        System.out.println("**********"); 
        
        System.out.println("Actualizaremos el valor 10 por el 50");
        lista.Refresh(10, 50);
        System.out.println(lista);
        
        
        
        
        
        
        
    }
    
}
