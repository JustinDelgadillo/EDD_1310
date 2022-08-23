/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioredessociales;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Justin
 */
public class LectorArchivo {
    
    private BufferedReader lector;
    private String renglon; 
    private String partes[] = null;
    
    public void leerArchivo(String presenciaRedes) {
        try {
            lector = new BufferedReader(new FileReader(presenciaRedes));
            while ((renglon = lector.readLine()) != null) {
                partes = renglon.split(",");
                imprimirLinea();
                System.out.println();
            }
            lector.close();
            renglon = null;
            partes = null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void imprimirLinea() {
        for (int i = 0; i < partes.length; i++) {
            System.out.print(partes[i]+ "  |  ");
        }
    }
}