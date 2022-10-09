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
        
        System.out.println("Contiene algo la lista?:\t "+ lista.estaVacio());
        
        System.out.println("El tamaño es de:\t "+ lista.tamanio);
        
        System.out.println("Al inicio añadimos el valor 63");
        lista.agregarAlInicio(63);
        System.out.println(lista);
        System.out.println("Al inicio añadimos el valor 78");
        lista.agregarAlInicio(78);
        System.out.println(lista);
        System.out.println("Al inicio añadimos el valor 16");
        lista.agregarAlInicio(16);
        System.out.println(lista);
        System.out.println("Al inicio añadimos el valor 93");
        lista.agregarAlInicio(93);
        System.out.println(lista); 
        
        System.out.println("**********");        
        
        System.out.println("Al final añadimos el valor 21");
        lista.agragarAlFInal(21);
        System.out.println(lista);
        System.out.println("Al final añadimos el valor 33");
        lista.agragarAlFInal(33);
        System.out.println(lista);
        System.out.println("Al final añadimos el valor 89");
        lista.agragarAlFInal(89);
        System.out.println(lista);
        
        System.out.println("**********");  
        
        System.out.println("Al final añadimos el valor 20 despues de 33");
        lista.agragarDespuesDe(33, 20);
        System.out.println(lista);
        System.out.println("Al final añadimos el valor 10 despues de 16");
        lista.agragarDespuesDe(16, 10);
        System.out.println(lista);
        System.out.println("Al final añadimos el valor 18 despues de 78");
        lista.agragarDespuesDe(78, 18);
        System.out.println(lista);
        
        System.out.println("**********");  
        
        System.out.println("El valor de la posición 3 será eliminado");
        lista.EliminarPorPosicion(3);
        System.out.println(lista);
        
        System.out.println("Borraremos al inicio");
        lista.EliminarPrimero();
        System.out.println(lista);
        
        System.out.println("Borraremos al final");
        lista.EliminarUltimo();
        System.out.println(lista);
        
        System.out.println("**********"); 
        
        System.out.println("Busca el valor 18");
        System.out.println("Esta en la posición: "+ lista.Buscar(18));
        
        System.out.println("**********"); 
        
        System.out.println("Actualizaremos el valor 10 por el 50");
        lista.Actualizar(10, 50);
        System.out.println(lista);
        
        
        
        
        
        
        
    }
    
}
