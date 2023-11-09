//numeros pares del 1 al 10
package Tarea3;

/**
 *
 * @author cgale
 */
public class NumerosPares {
    public static void main(String[] args) {
        int pares;
        
        for(pares=1; pares <= 10; pares++){
        if(pares%2 ==0){
            System.out.println(pares);
        }
        }
    }
}
