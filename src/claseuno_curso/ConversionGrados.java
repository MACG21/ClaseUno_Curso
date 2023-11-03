
package claseuno_curso;

import java.util.Scanner;

/**
 *
 * @author cgale
 */
public class ConversionGrados {
    public static void main(String[] args) {
        System.out.println("Ingresa los grados centigrados: "); 
        Scanner sn = new Scanner(System.in);
    int c = sn.nextInt();
    /*int f;
    f = 32+(9*c/5);
    System.out.println("Los grados en Fahrenheit son: " + f);*/
    
    System.out.println("Los grados en Fahrenheit son: " + (32+(9*c/5)));
    
    }
}
