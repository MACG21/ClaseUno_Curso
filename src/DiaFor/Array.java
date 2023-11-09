//ejercicio en clase
package DiaFor;

import java.util.Scanner;

/**
 *
 * @author cgale
 */
public class Array {
    public static void main(String[] args) {
        int numero [][] = new int[3][5];
       Scanner sp = new Scanner(System.in);
       
        for (int[] numero1 : numero) {
            for (int j = 0; j < numero1.length; j++) {
                System.out.println("Ingresa tu numero");
                numero1[j] = sp.nextInt();
            }
        }
        
        for (int[] numero1 : numero) {
            for (int j = 0; j < numero1.length; j++) {
                System.out.print(numero1[j] + " ");
            }
            System.out.println("\n-----------------");
        }
    }

}
