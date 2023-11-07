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
       
    System.out.println("Ingresa el mes con minusculas");
    String mes = sn.nextLine();     
         
    System.out.println("Ingresa el día: "); 
    int dia = sn.nextInt();     
          
        
    System.out.println("Ingresa el año: "); 
    int anio = sn.nextInt();
    
    if (dia <=31){
         switch (mes){
        case "enero" :
            System.out.println("La fecha ingresada " + dia + " de "+mes+" de "+anio + " es correcta");
            System.out.println("Y es un mes de 31 días");
            break;
        case "marzo":
        System.out.println("La fecha ingresada " + dia + " de "+mes+" de "+anio + " es correcta");
        System.out.println("Y es un mes de 31 días");
        break;
        case "mayo":
        System.out.println("La fecha ingresada " + dia + " de "+mes+" de "+anio + " es correcta");
        System.out.println("Y es un mes de 31 días");
        break;
        case "julio":
        System.out.println("La fecha ingresada " + dia + " de "+mes+" de "+anio + " es correcta");
        System.out.println("Y es un mes de 31 días");
        break;
        case "agosto":
        System.out.println("La fecha ingresada " + dia + " de "+mes+" de "+anio + " es correcta");
        System.out.println("Y es un mes de 31 días");
        break;
        case "octubre":
        System.out.println("La fecha ingresada " + dia + " de "+mes+" de "+anio + " es correcta");
        System.out.println("Y es un mes de 31 días");
    break;
        case "diciembre":
        System.out.println("La fecha ingresada " + dia + " de "+mes+" de "+anio + " es correcta");
        System.out.println("Y es un mes de 31 días");
    break;
        case "febrero":
            if(dia>28){
                System.out.println("debes ingresar un dia valido para febrero");
            }else if(dia<=28){
                System.out.println("La fecha ingresada " + dia + " de "+mes+" de "+anio + " es correcta");
        System.out.println("Y es un mes de 28 días");
            }
        break;
        case "abril":
        System.out.println("La fecha ingresada " + dia + " de "+mes+" de "+anio + " es correcta");
        System.out.println("Y es un mes de 30 días");
        break;
        case "junio":
        System.out.println("La fecha ingresada " + dia + " de "+mes+" de "+anio + " es correcta");
        System.out.println("Y es un mes de 30 días");
        break;
        case "septiembre":
        System.out.println("La fecha ingresada " + dia + " de "+mes+" de "+anio + " es correcta");
        System.out.println("Y es un mes de 30 días");
        break;
        case "noviembre":
        System.out.println("La fecha ingresada " + dia + " de "+mes+" de "+anio + " es correcta");
        System.out.println("Y es un mes de 30 días");
        break;
        default:
            System.out.println("Ingresa un mes correcto o revisa tu escritura");
         }
    }else{
        System.out.println("Debes ingresar un día correcto");
    } 
    }
}
