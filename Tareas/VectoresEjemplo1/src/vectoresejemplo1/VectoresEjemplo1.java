/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectoresejemplo1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Justin
 */
public class VectoresEjemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vec1[]=new int[2];
        int vec2[]=new int[2];
        int vec3[]=new int[2];
        int vec4[]=new int[2];
        
        int op=0;
        String menu="***** SUMA DE VECTORES *****\n";
        menu+="1.- Llenar vectores\n";
        menu+="2.- Suma de vectores\n";
        menu+="3.- Salir\n";
        menu+="Digita una opción";
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op){
                case 1:
                    for(int i=0;i<vec1.length;i++){
                        vec1[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de los componentes x, y del Vector 1"+"["+i+"]"));
                    }
                    for(int i=0;i<vec2.length;i++){
                        vec2[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de los componentes x, y del Vector 2"+"["+i+"]"));
                    }
                    for(int i=0;i<vec3.length;i++){
                        vec3[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de los componentes x, y del Vector 3"+"["+i+"]"));
                    }
                    //Imprime los vectores
                    String cad1="", cad2="", cad3="";
                    for(int i=0;i<vec1.length;i++){
                        cad1+=vec1[i]+" ";
                        cad2+=vec2[i]+" ";
                        cad3+=vec3[i]+" ";
                    }
                    System.out.println("vec1: "+cad1);
                    System.out.println("vec2: "+cad2);
                    System.out.println("vec3: "+cad3);
                    break;
                case 2:
                    //Suma de vectores
                    System.out.println("La suma es de: ");
                    for(int i=0;i<vec1.length;i++){
                        vec4[i]=vec1[i] + vec2[i] + vec3[i];
                        System.out.print(vec4[i]+" ");
                    }
                    System.out.println();
                    break;
                
                
            }
        }while(op!=3);
    }
}
                    
        
        
        
                
    
    
    

