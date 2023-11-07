
package claseuno_curso;

import java.util.Scanner;

/**
 *
 * @author cgale
 */
public class PositivoNegativo {
    public static void main(String[] args) {
        System.out.println("Ingresa un numero: "); 
        Scanner sn = new Scanner(System.in);
    double numero = sn.nextDouble();
    
    if (numero > 0){
        System.out.println("El numero es positivo");
    }else{
        System.out.println("El numero es negativo");
    }
    }
}
