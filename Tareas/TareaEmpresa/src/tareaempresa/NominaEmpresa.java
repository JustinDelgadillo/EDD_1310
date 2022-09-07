/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaempresa;

/**
 *
 * @author Justin
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

public class NominaEmpresa {
    private String nombreCompania;
    private Arreglo<Empleado> empleados;
    private String rutaArchivo;
    public static String SEPARADOR_SALTO_DE_LINEA = "\n";
    public static String SEPARADOR_COMA = ",";
    private BufferedReader lector;
    private String renglon; 
    private String partes[] = null;

    public NominaEmpresa(String rutaArchivo, String nombreCompania) throws IOException {
        this.nombreCompania = nombreCompania;
        this.rutaArchivo = rutaArchivo;
        int contador = 0;
        String line, fileContent = "";
        BufferedReader bufferLectura = new BufferedReader(new FileReader(this.rutaArchivo));

        bufferLectura.readLine();
        while((line = bufferLectura.readLine()) != null) {
            fileContent += line + "\n";
            contador++;
        }
        bufferLectura.close();

        String[] separadoPorSaltosDeLinea = fileContent.split(SEPARADOR_SALTO_DE_LINEA);

        empleados = new Arreglo<>(contador);

        for(int i = 0; i < separadoPorSaltosDeLinea.length; i++) {
            String[] lineaSeparadaPorComas = separadoPorSaltosDeLinea[i].split(SEPARADOR_COMA);
            Empleado trabajadorTemp = new Empleado();
            trabajadorTemp.setNumeroEmpleado(parseInt(lineaSeparadaPorComas[0]));
            trabajadorTemp.setNombre(lineaSeparadaPorComas[1]);
            trabajadorTemp.setPaterno(lineaSeparadaPorComas[2]);
            trabajadorTemp.setMaterno(lineaSeparadaPorComas[3]);
            trabajadorTemp.setHorasExtra(parseInt(lineaSeparadaPorComas[4]));
            trabajadorTemp.setSalarioBase(parseInt(lineaSeparadaPorComas[5]));
            trabajadorTemp.setAnioIngreso(parseInt(lineaSeparadaPorComas[6]));
            empleados.setItem(i, trabajadorTemp);
        }
    }
    
    public void imprimirLinea() {
        for (int i = 0; i < partes.length; i++) {
            System.out.print(partes[i]+ "  |  ");
        }
    }

    public void calcularSalario() {
        for(int i = 0; i < empleados.getLength(); i++){
            System.out.println(empleados.getItem(i));
            System.out.println("Salario total: " + empleados.getItem(i).calcularSueldo());
        }
    }

    public void obtenerMaxMin() {
        Empleado maxEmpleado = empleados.getItem(0);
        Empleado minEmpleado = empleados.getItem(0);
        for(Empleado currTrabajador : empleados) {
            if(currTrabajador.getAnioIngreso() > maxEmpleado.getAnioIngreso()) {
                maxEmpleado = currTrabajador;
            }
            if(currTrabajador.getAnioIngreso() < minEmpleado.getAnioIngreso()) {
                minEmpleado = currTrabajador;
            }
        }

        System.out.println("Empleados con mayor y menor antiguedad en: " + nombreCompania);
        System.out.println("Primer empleado encontrado con menor antiguedad: ");
        System.out.println(minEmpleado);
        System.out.println("Primer empleado encontrado con mayor antiguedad: ");
        System.out.println(maxEmpleado);
    }
}