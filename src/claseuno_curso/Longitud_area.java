
package claseuno_curso;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author cgale
 */
public class Longitud_area {
    public static void main(String[] args) {
        System.out.println("Ingresa el radio de la circunferencia: "); 
        Scanner sn = new Scanner(System.in);
    int radio = sn.nextInt();
        System.out.println("La longitud de la circunferencia es: " + (2*PI*radio) + "cm");
        System.out.println("El area de la circunferencia es: " + (PI*radio*radio)+ "cm²");
    
    }
}
