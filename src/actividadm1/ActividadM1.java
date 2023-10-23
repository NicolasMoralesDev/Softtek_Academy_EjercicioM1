
package actividadm1;

import javax.swing.JOptionPane;

/**
 *
 * @author Nico Morales
 */
public class ActividadM1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        se utiliza la libreria JoptionPanel para el ingreso de los numeros
   
        int primerNumero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero a sumar:"));
        int segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero a sumar:"));

//        Los valores sumados se guardfan en
//        una variable
                
        int total = primerNumero + segundoNumero;
        
        
//        Se muestra por consola la suma 

        System.out.println("El resultado de la suma de dos numeros es: " + total);
    }
    
}
