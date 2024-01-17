
import java.util.Scanner;

/**
 *
 * @author Carlos Sánchez
 */
public class Figuras2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciona que quieres calcular");
        System.out.println("1.- Cuadrado");
        System.out.println("2.- Triángulo");
        System.out.println("3.- Rectángulo");
        int seleccion = sc.nextInt();
        switch (seleccion) {
            case 1:
                System.out.println("Ingresa un lado del cuadrado");
                double lado = sc.nextDouble();

                System.out.println("El área del cuadrado es: " + obtenerAreaCuadrado(lado));
                break;
            case 2:
                System.out.println("Ingresa la base del triángulo");
                double baseTriangulo = sc.nextDouble();
                System.out.println("Ingresa la altura del triángulo");
                double alturaTriangulo = sc.nextDouble();

                System.out.println("El área del triángulo es: " + obtenerAreaTriangulo(baseTriangulo, alturaTriangulo));
                break;
            case 3:
                System.out.println("Ingresa la base del rectángulo");
                double baseRectangulo = sc.nextDouble();
                System.out.println("Ingresa la altura del rectángulo");
                double alturaRectangulo = sc.nextDouble();

                System.out.println("El área del triángulo es: " + obtenerAreaRectangulo(baseRectangulo, alturaRectangulo));
                break;
            default:
                System.out.println("La opción no existe");
        }
    }

    private static double obtenerAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    private static double obtenerAreaCuadrado(double lado) {
        return lado*lado;
    }

    private static double obtenerAreaRectangulo(double baseRectangulo, double alturaRectangulo) {
        return baseRectangulo*alturaRectangulo;
    }
}


/*
Ejemplo calculando un triángulo:

Selecciona que quieres calcular
1.- Cuadrado
2.- Triángulo
3.- Rectángulo
2
Ingresa la base del triángulo
20
Ingresa la altura del triángulo
10
El área del triángulo es: 100.0
*/