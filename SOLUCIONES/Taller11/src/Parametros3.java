
import java.util.Scanner;

/**
 *
 * @author Carlos Sánchez
 */
public class Parametros3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double param1, param2, param3, param4;
        
        System.out.println("Ingrese el parámetro 1: ");
        param1 = sc.nextDouble();
        
        System.out.println("Ingrese el parámetro 2: ");
        param2 = sc.nextDouble();
        
        System.out.println("Ingrese el parámetro 3: ");
        param3 = sc.nextDouble();
        
        System.out.println("Ingrese el parámetro 4: ");
        param4 = sc.nextDouble();
        
        System.out.println(generarInforme(param1, param2, param3, param4));
    }

    private static String generarInforme(double param1, double param2, double param3, double param4) {
        double promedio = (param1+param2+param3+param4) / 4;
        String calificativo = "Usted cuenta con un promedio de: " + promedio + "\n";
        
        if(promedio >= 9.1){
            calificativo += "Su promedio es sobresaliente";
        }else if(promedio >= 8.1){
            calificativo += "Su promedio es muy bueno";
        }else if(promedio >= 5.1){
            calificativo += "Su promedio es bueno";
        }else{
            calificativo += "Su promedio es regular";
        }
        return calificativo; 
    }
}
/*
Ejemplo:
Ingrese el parámetro 1: 
10
Ingrese el parámetro 2: 
8
Ingrese el parámetro 3: 
5,5
Ingrese el parámetro 4: 
7
Usted cuenta con un promedio de: 7.625
Su promedio es bueno
*/
