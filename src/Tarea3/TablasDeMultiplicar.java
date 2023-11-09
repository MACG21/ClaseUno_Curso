// tablas de multiplicar con while
package Tarea3;

/**
 *
 * @author cgale
 */
public class TablasDeMultiplicar {
    public static void main(String[] args) {
        int factor1;
        
        
        System.out.println("TABLAS DE MULTIPLICAR");
        
        for(factor1 = 1; factor1 <= 10; factor1++){
            System.out.println("Tabla de multiplicar del " + factor1);
            int factor2 = 1;
        while(factor2 <=10){
        System.out.println(factor1 + " X " + factor1 + " = " + factor1 * factor2 ); 
        factor2++;
                }
        System.out.println("-------------------------");
        }
        
    }
}
