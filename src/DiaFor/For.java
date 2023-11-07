//6/11/2023
package DiaFor;

/**
 *
 * @author cgale
 */
public class For {
    public static void main(String[] args) {
        /*for(int i = 0; i<=10; i++){
            System.out.println("5 X " + i + " = "+ (i*5));
        }*/
        String nombre = "Hola Mundo";
        for(int i = 0; i < nombre.length(); i++){ //length busca la longitud de cada palabra
            System.out.println(nombre.charAt(i)); //charAt selecciona el lugar del caracter
            
        
    }
   
}}
