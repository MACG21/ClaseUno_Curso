//programa que genera piramide con asteriscos
package Tarea3;

/**
 *
 * @author cgale
 */
public class Piramide {
    public static void main(String[] args) {
        
        String asterisco = "*";
        for (int i = 0; i < 10; i++){
            System.out.println(asterisco);
            asterisco += "*";
        }
    }
}
