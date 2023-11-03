//Ejercicio #1 Clase 31/08/23 Curso de INTECAP
package claseuno_curso;

import java.util.Scanner;

/**
 *
 * @author cgale
 */
public class Nombres {
    public static void main(String[] args) {
        System.out.println("Escribe tu nombre: ");
        Scanner sn = new Scanner (System.in);
        String nombre = sn.nextLine();
        System.out.println("Buenos dias " + nombre);
        
    }
}
