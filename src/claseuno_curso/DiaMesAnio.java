//Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta. con meses de 28,30,31 días sin años bisiestos 
package claseuno_curso;

import java.util.Scanner;

/**
 *
 * @author cgale
 */
public class DiaMesAnio {
    public static void main(String[] args) {
         Scanner sn = new Scanner(System.in);
            
    System.out.println("Ingresa el día: "); 
    int dia = sn.nextInt();   
    System.out.println("Ingresa el numero de mes");
    int mes = sn.nextInt();
           
    System.out.println("Ingresa el año: "); 
    int anio = sn.nextInt();
    
    switch (mes){
        case 4:
        case 6:
        case 11:
            System.out.println("¡La fecha ingresada es correcta!");
            System.out.println("El mes de: "+ dia+ "/"+mes+"/"+anio+ ", tiene 30 dias.");
    break;
        case 2:
            if(dia >28){
                System.out.println("Ingresa un numero de día correcto para febrero.");
            }else{
            System.out.println("¡La fecha ingresada es correcta!");
            System.out.println("El mes de: "+ dia+ "/"+mes+"/"+anio+ ", tiene 28 dias.");
            } 
            break;
        default: 
            System.out.println("¡La fecha ingresada es correcta!");
            System.out.println("El mes de: "+ dia+ "/"+mes+"/"+anio+ ", tiene 31 dias.");
    }
    
    }
}