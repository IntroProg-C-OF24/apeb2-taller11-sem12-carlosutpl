
import java.util.Scanner;

/**
 *
 * @author Carlos Sánchez
 */
public class Facturas4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombreCliente = sc.nextLine();

        System.out.println("Ingrese su número de cédula: ");
        String numeroCedula = sc.nextLine();

        System.out.println("1.- Calcular plantilla de luz");
        System.out.println("2.- Calcular precio de un bien inmueble");
        int seleccion = sc.nextInt();

        switch (seleccion) {
            case 1:
                System.out.println("Ingrese el valor del kilovatio: ");
                double precioKilovatio = sc.nextDouble();
                System.out.println("Ingrese la cantidad de kilovatios consumidos en el mes: ");
                double kilovatiosConsumidos = sc.nextDouble();

                System.out.println(calcularPlantillaLuz(nombreCliente, numeroCedula, precioKilovatio, kilovatiosConsumidos));
                break;
            case 2:
                System.out.println("Ingrese el valor del inmueble: ");
                double precioInmueble = sc.nextDouble();
                
                System.out.println(calcularPrecioInmueble(nombreCliente, numeroCedula, precioInmueble));
                break;
            default:
                System.out.println("La opción no existe");
                break;
        }
    }

    private static String calcularPlantillaLuz(String nombreCliente, String numeroCedula, double precioKilovatio, double kilovatiosConsumidos) {
        return "Cliente: " + nombreCliente + " con número de cédula: " + numeroCedula + " debe cancelar el valor de: "
                + "$" + (precioKilovatio * kilovatiosConsumidos);
    }

    private static String calcularPrecioInmueble(String nombreCliente, String numeroCedula, double precioInmueble) {
        return "Cliente: " + nombreCliente + " con número de cédula " + numeroCedula + " tiene un inmueble valorado en: $" + precioInmueble
         + " y debe de pagar: $" + (precioInmueble * 0.02);
    }
}

/*

Ejemplo calculando inmueble: 

Ingrese su nombre: 
Carlos
Ingrese su número de cédula: 
1105506514
1.- Calcular plantilla de luz
2.- Calcular precio de un bien inmueble
2
Ingrese el valor del inmueble: 
3500
Cliente: Carlos con número de cédula 1105506514 tiene un inmueble valorado en: $3500.0 y debe de pagar: $70.0
*/