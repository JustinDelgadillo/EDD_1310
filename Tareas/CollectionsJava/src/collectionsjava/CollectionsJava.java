/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collectionsjava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author justin
 */
public class CollectionsJava {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        Map<Integer, String> map2 = new TreeMap<>();
        Map<String, String> map3 = new LinkedHashMap<String, String>();
        
        //HashMap
        System.out.println("/****HashMap****/");
        
        //Metodo isEmpty
        System.out.println("Esta vacia?: " + map1.isEmpty());
        
        //Metodo put
        map1.put(1, "Ecuaciones Diferenciales");
        map1.put(2, "Metodos Numericos");
        map1.put(3, "Electricidad y Magnetismo");
        map1.put(4, "Emprendimiento 2");
        map1.put(5, "Estructura de Datos");
        map1.put(6, "Emprendimiento 1");
        
        //Metodo keySet
        System.out.println("Cual es el conjutno de claves del mapa?: " + map1.keySet());
        System.out.println("/****Lista de Materias del Tercer Semestre****/");
        
        //Metodo values
        for(String valor: map1.values()) {
            System.out.println(">>>  "+ valor + " ");
        }
        
        //Metodo containsKey
        System.out.println("Contiene la clave 1?: " + map1.containsKey(1));
        System.out.println("Contiene la clave 7?: " + map1.containsKey(7));
        
        //Metodo containsValue
        System.out.println("Contiene el valor Ecuaciones Diferenciales?: " + map1.containsValue("Ecuaciones Diferenciales"));
        System.out.println("Contiene el valor Algebra Lineal?: " + map1.containsValue("Algebra Lineal"));
        
        //Metodo size
        System.out.println("Cual es el numero de elementos?: " + map1.size());
        
        System.out.println("Se ha detectado una materia incorrecta");
        System.out.println("/****Lista de Materias del Tercer Semestre Actualizada****/");
        
        //Metodo remove
        map1.remove(6, "Emprendimiento 1");
        
        //Metodo values
        for(String valor: map1.values()) {
            System.out.println(">>>  "+ valor + " ");
        }
        
        //Metodo isEmpty
        System.out.println("Esta vacia?: " + map1.isEmpty());
        
        //Metodo get
        System.out.println("Dame el valor de la clave 1: " + map1.get(1));
        System.out.println("Dame el valor de la clave 3: " + map1.get(3));
        System.out.println("Dame el valor de la clave 5: " + map1.get(5));
        
        //Metodo size
        System.out.println("Cual es el numero de elementos?: " + map1.size());
        
        //Metodo entrySet
        System.out.println("Cuales son los valores de entrada del mapa?: " + map1.entrySet());
        
        //Metodo clear
        map1.clear();
        System.out.println("-----Limpiar valores-----");
        
        //Metodo isEmpty
        System.out.println("Esta vacia?: " + map1.isEmpty());
        System.out.println();
        System.out.println();  
        
        
        
        //TreeMap
        System.out.println("/****TreeMap****/");
        
        //Metodo isEmpty
        System.out.println("Esta vacia?: " + map2.isEmpty());
        
        //Metodo put
        map2.put(1, "E");
        map2.put(2, "L");
        map2.put(3, "B");
        map2.put(4, "I");
        map2.put(5, "C");
        map2.put(6, "H");
        map2.put(7, "O");
        map2.put(8, "S");
        map2.put(9, "I");
        map2.put(10, "U");
        
        //Metodo keySet
        System.out.println("Cual es el conjutno de claves del mapa?: " + map2.keySet());
        
        //Metodo values
        for(String valor: map2.values()) {
            System.out.print("| "+ valor + " ");
        }
        System.out.println();
        
        //Metodo containsKey
        System.out.println("Contiene la clave 5?: " + map2.containsKey(5));
        System.out.println("Contiene la clave 11?: " + map2.containsKey(11));
        
        //Metodo containsValue
        System.out.println("Contiene el valor E?: " + map2.containsValue("E"));
        System.out.println("Contiene el valor A?: " + map2.containsValue("A"));
        
        //Metodo size
        System.out.println("Cual es el numero de elementos?: " + map2.size());
        
        //Metodo remove
        map2.remove(8, "S");
        map2.remove(9, "I");
        map2.remove(10, "U");
        
        //Metodo values
        for(String valor: map2.values()) {
            System.out.print("| "+ valor + " ");
        }
        System.out.println();
        
        //Metodo isEmpty
        System.out.println("Esta vacia?: " + map2.isEmpty());
        
        //Metodo get
        System.out.println("Dame el valor de la clave 3: " + map2.get(3));
        System.out.println("Dame el valor de la clave 4: " + map2.get(4));
        System.out.println("Dame el valor de la clave 5: " + map2.get(5));
        System.out.println("Dame el valor de la clave 6: " + map2.get(6));
        System.out.println("Dame el valor de la clave 7: " + map2.get(7));
        System.out.println("jejeje, siuuuuuu");
        
        //Metodo entrySet
        System.out.println("Cuales son los valores de entrada del mapa?: " + map2.entrySet());
        
        //Metodo replace
        System.out.println("-----Reemplazar valores-----");
        map2.replace(1, "C");
        map2.replace(2, "R");
        map2.replace(3, "7");
        map2.replace(4, "G");
        map2.replace(5, "O");
        map2.replace(6, "A");
        map2.replace(7, "T");
        
        //Metodo values
        for(String valor: map2.values()) {
            System.out.print("| "+ valor + " ");
        }
        System.out.println();
        
        //Metodo clear
        map2.clear();
        System.out.println("-----Limpiar valores-----");
        
        //Metodo isEmpty
        System.out.println("Esta vacia?: " + map2.isEmpty());
        System.out.println();
        System.out.println();  
        
        
        
        //LinkedHashMap
        System.out.println("/****LinkedHashMap****/");
        
        //Metodo isEmpty
        System.out.println("Esta vacia?: " + map3.isEmpty());
        
        //Metodo put
        map3.put("Elefante", "Elephant");
        map3.put("Cebra", "Zebra");
        map3.put("Leon", "Lion");
        map3.put("Jirafa", "Giraffe");
        map3.put("Hiena", "Hyena");
        
        //Metodo keySet
        System.out.println("Cual es el conjutno de claves del mapa?: " + map3.keySet());
        System.out.println("/****Traduccion al ingles de animales de la sabana Africana****/");
        
        //Metodo values
        for(String valor: map3.values()) {
            System.out.println(">>>  "+ valor + " ");
        }

        //Metodo containsKey
        System.out.println("Contiene la clave Jirafa?: " + map3.containsKey("Jirafa"));
        System.out.println("Si lo conteine, ya que forma parte de nuestro mapa");
        System.out.println("Contiene la clave Oso?: " + map3.containsKey("Oso"));
        System.out.println("No lo contiene, ya que el Oso no forma parte de la sabana Africana");
        
        //Metodo containsValue
        System.out.println("Contiene el valor Elephant?: " + map3.containsValue("Elephant"));
        System.out.println("Si lo contiene, ya que es una traduccion de nuestro mapa");
        System.out.println("Contiene el valor Bear?: " + map3.containsValue("Bear"));
        System.out.println("No lo contiene, ya que no es ninguna traduccion de nuestro mapa");
        
        //Metodo size
        System.out.println("Cual es el numero de elementos?: " + map3.size());
        
        //Metodo remove
        map3.remove("Cebra", "Zebra");
        map3.remove("Hiena", "Hyena");
        
         //Metodo values
        for(String valor: map3.values()) {
            System.out.println(">>>  "+ valor + " ");
        }
        
        //Metodo isEmpty
        System.out.println("Esta vacia?: " + map3.isEmpty());
        
        //Metodo get
        System.out.println("Cual es la traduccion de Leon? Su traduccion es: " + map3.get("Leon"));
        System.out.println("Cual es la traduccion de Elefante? Su traduccion es: " + map3.get("Elefante"));
        System.out.println("Cual es la traduccion de Jirafa? Su traduccion es: " + map3.get("Jirafa"));
        
        //Metodo entrySet
        System.out.println("Cuales son los valores de entrada del mapa?: " + map3.entrySet());
        
        //Metodo clear
        map3.clear();
        System.out.println("-----Limpiar valores-----");
        
        //Metodo put
        map3.put("Gato", "Cat");
        map3.put("Perro", "Dog");
        map3.put("Raton", "Mouse");
        
        //Metodo keySet
        System.out.println("Cual es el conjutno de claves del mapa?: " + map3.keySet());
        System.out.println("/****Traduccion al ingles de animales del hogar****/");
        
        //Metodo values
        for(String valor: map3.values()) {
            System.out.println(">>>  "+ valor + " ");
        }
        
        //Metodo isEmpty
        System.out.println("Esta vacia?: " + map3.isEmpty());
        
        //Metodo get
        System.out.println("Cual es la traduccion de Gato? Su traduccion es: " + map3.get("Gato"));
        System.out.println("Cual es la traduccion de Perro? Su traduccion es: " + map3.get("Perro"));
        System.out.println("Cual es la traduccion de Raton? Su traduccion es: " + map3.get("Raton"));
    }
    
}
