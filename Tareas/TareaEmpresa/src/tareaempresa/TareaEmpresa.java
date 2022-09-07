/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareaempresa;

import java.io.IOException;

/**
 *
 * @author Justin
 */
public class TareaEmpresa {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws IOException {
        NominaEmpresa nomina = new NominaEmpresa("junio.dat", "EDD");
        nomina.calcularSalario();
        System.out.println("-----------------------------------------------------");
        nomina.obtenerMaxMin();
    }
}