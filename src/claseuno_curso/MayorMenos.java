//perdir dos numeros y mostrarlos ordenados de mayor a menor
package claseuno_curso;

import java.util.Scanner;

/**
 *
 * @author cgale
 */
public class MayorMenos {
    public static void main(String[] args) {
        System.out.println("Ingresa un numero: "); 
        Scanner sn = new Scanner(System.in);
    int numUno = sn.nextInt();
  
    System.out.println("Ingresa un segundo numero");
    int numDos = sn.nextInt();
    
    if (numUno > numDos){
    System.out.println("ORDEN:\n" + numUno + "\n" + numDos);
    }else{
        System.out.println("ORDEN:\n" + numDos + "\n" + numUno);
    }
        }
    
}
