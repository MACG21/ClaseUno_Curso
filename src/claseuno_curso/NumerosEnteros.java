//Ejercicio #1 Clase 31/08/23 Curso de INTECAP
package claseuno_curso;

import java.util.Scanner;

/**
 *
 * @author cgale
 */
public class NumerosEnteros {
    public static void main(String[] args) {
        System.out.println("Ingresa un valor: "); 
        Scanner sn = new Scanner(System.in);
    int valor = sn.nextInt();
    
        System.out.println("Ingresa un segundo Valor: ");
        int valor2 = sn.nextInt();
        System.out.println("Tu primer valor es: "+ valor + "\nTu segndo valor es: " + valor2);
    }
    
    
    
}
