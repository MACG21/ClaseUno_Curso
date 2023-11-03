
package claseuno_curso;

import java.util.Scanner;

/**
 *
 * @author cgale
 */
public class Numero {
    public static void main(String[] args) {
        System.out.println("Ingresa un numero: "); 
        Scanner sn = new Scanner(System.in);
    int numero = sn.nextInt();
    int doble =numero * 2;
    int triple = numero * 3;
        System.out.println("El numero es: " + numero + "\nSu doble es: " + doble + "\nY su triple es: " + triple);
    }
}
