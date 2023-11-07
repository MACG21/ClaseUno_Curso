
package claseuno_curso;

import java.util.Scanner;

/**
 *
 * @author cgale
 */
public class Igualdad {
    public static void main(String[] args) {
        System.out.println("Ingresa un numero: "); 
        Scanner sn = new Scanner(System.in);
    int numUno = sn.nextInt();
     
        System.out.println("Ingresa un segundo numero");
    int numDos = sn.nextInt();
    
    if (numUno == numDos){
        System.out.println("Los números son iguales");
    }else{
        System.out.println("Los números no son iguales");
    }
    }
}
