/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conjuntoadt;

/**
 *
 * @author Justin
 */
public class ConjuntoADT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Conjunto<Integer> Conjunto1 = new Conjunto();
        Conjunto<Integer> Conjunto2= new Conjunto();

        Conjunto1.add(7);
        Conjunto1.add(8);
        Conjunto1.add(6);
        Conjunto1.add(9);
        Conjunto1.add(0);
        Conjunto1.add(4);
        Conjunto1.add(3);
        Conjunto1.add(5);
        Conjunto1.add(1);
        
        Conjunto2.add(4);
        Conjunto2.add(2);
        Conjunto2.add(1);
        Conjunto2.add(0);
        Conjunto2.add(9);
        Conjunto2.add(3);
        Conjunto2.add(7);

      
        System.out.println("La longitud del primer conjunto es:\t" + Conjunto1.length());
        System.out.println("La longitud del segundo conjunto es:\t" + Conjunto2.length());
        System.out.println("");
        
        System.out.println("Conjuntos");
        System.out.println("Conjunto1: \t"+Conjunto1);
        System.out.println("Conjunto2: \t"+Conjunto2);
        System.out.println("");
                

       
        System.out.println("¿Conjunto1 contiene al número 1? \t" + Conjunto1.contains(1));
        System.out.println("¿Conjunto1 contiene al número 2? \t" + Conjunto1.contains(2));
        System.out.println("¿Conjunto2 contiene al número 4? \t" + Conjunto2.contains(4));
        System.out.println("¿Conjunot2 contiene al número 11? \t" + Conjunto2.contains(11));
        System.out.println("");

        // Eliminar
        Conjunto1.remove(7);

        // Método Equals
        System.out.println("Conjunto1 igual a Conjunto2 :\t" + Conjunto1.equals(Conjunto2));

        //Método Subconjunto
        System.out.println("Conjunto2 es subconjunto de Conjunto1:\t" + Conjunto2.isSubset(Conjunto1));
        System.out.println("");
        
        // Método de Unión
        Conjunto1.union(Conjunto2);
        System.out.println("Conjunto1 U Conjunto2 " + Conjunto1); 
        
        // Método de intersección
        Conjunto<Integer> conjunto_intersection = Conjunto1.intersection(Conjunto2);
        System.out.println("Intersección entre Conjunto1 y Conjunto2:\t" + conjunto_intersection);

        // Método de diferencia
        Conjunto<Integer> conjunto_difference = Conjunto1.difference(Conjunto2);
        System.out.println("Diferencia entre Conjunto1 y Conjunto2:\t" + conjunto_difference);
        System.out.println("");

        
        
    }
    
}