//Ingreso de tres numeros y ordenarlos de mayor a menor
package claseuno_curso;

import java.util.Scanner;

/**
 *
 * @author cgale
 */
public class TresNumOrdenados {
    public static void main(String[] args) {
        System.out.println("Ingresa un numero: "); 
        Scanner sn = new Scanner(System.in);
    int numUno = sn.nextInt();
  
    System.out.println("Ingresa un segundo numero");
    int numDos = sn.nextInt();
    
    System.out.println("Ingresa un tercer numero numero");
    int numTres = sn.nextInt();
    
    if(numUno > numDos){
        if(numDos>numTres){
        System.out.println("El Orden de los numeros es el siguiente: " + numUno +"\n"+ numDos+"\n"+ numTres);
        }
    }else if(numDos > numUno){
        if(numUno > numTres){
        System.out.println("El Orden de los numeros es el siguiente: " + numDos +"\n"+ numUno+"\n"+ numTres);
        }else{
        System.out.println("El Orden de los numeros es el siguiente: " + numDos +"\n"+ numTres+"\n"+ numUno);
        }
    }else if(numTres>numDos){
        if (numDos>numUno){
        System.out.println("El Orden de los numeros es el siguiente: " + numTres +"\n"+ numDos+"\n"+ numUno);

        }
    }
    }
}
