
import java.util.Random;

/**
 *
 * @author Carlos Sánchez
 */
public class Matriz1 {

    public static void main(String[] args) {
        int matrizNumeros[][] = new int[5][5];
        llenarMatriz(matrizNumeros);
        imprimirMatriz(matrizNumeros);

        System.out.println("Numeros impares: ");
        imprimirPares(matrizNumeros);
        System.out.println("Numeros pares: ");
        imprimirImpares(matrizNumeros);

        System.out.println("El promedio del arreglo es: " + calcularPromedioMatriz(matrizNumeros));
    }

    private static void llenarMatriz(int[][] matrizNumeros) {
        Random r = new Random();
        for (int i = 0; i < matrizNumeros.length; i++) {
            for (int j = 0; j < matrizNumeros[i].length; j++) {
                matrizNumeros[i][j] = r.nextInt(20 - 1) + 1; //Random number from 1 to 20 :)
            }
        }
    }

    private static void imprimirMatriz(int[][] matrizNumeros) {
        for (int i = 0; i < matrizNumeros.length; i++) {
            for (int j = 0; j < matrizNumeros[i].length; j++) {
                System.out.print(" [ " + matrizNumeros[i][j] + " ] ");
            }
            System.out.println("");
        }
    }

    private static void imprimirImpares(int[][] matrizNumeros) {
        for (int i = 0; i < matrizNumeros.length; i++) {
            for (int j = 0; j < matrizNumeros[i].length; j++) {
                int numero = matrizNumeros[i][j];

                if (numero % 2 == 0) {
                    System.out.print(numero + ", ");
                }

            }

        }
        System.out.println("");
    }

    private static void imprimirPares(int[][] matrizNumeros) {
        for (int i = 0; i < matrizNumeros.length; i++) {
            for (int j = 0; j < matrizNumeros[i].length; j++) {
                int numero = matrizNumeros[i][j];

                if (numero % 2 != 0) {
                    System.out.print(numero + ", ");
                }

            }

        }
        System.out.println("");
    }

    private static int calcularPromedioMatriz(int[][] matrizNumeros) {
        int totalNumeros = 0;
        for (int i = 0; i < matrizNumeros.length; i++) {
            for (int j = 0; j < matrizNumeros[i].length; j++) {
                totalNumeros += matrizNumeros[i][j];
            }

        }
        return totalNumeros / (matrizNumeros.length * matrizNumeros.length);
    }
}
/*
Ejemplo de ejecución: 
 [ 16 ]  [ 9 ]  [ 15 ]  [ 2 ]  [ 7 ] 
 [ 14 ]  [ 17 ]  [ 15 ]  [ 2 ]  [ 16 ] 
 [ 7 ]  [ 11 ]  [ 11 ]  [ 19 ]  [ 4 ] 
 [ 17 ]  [ 9 ]  [ 16 ]  [ 5 ]  [ 15 ] 
 [ 11 ]  [ 3 ]  [ 11 ]  [ 11 ]  [ 1 ] 
Numeros impares: 
9, 15, 7, 17, 15, 7, 11, 11, 19, 17, 9, 5, 15, 11, 3, 11, 11, 1, 
Numeros pares: 
16, 2, 14, 2, 16, 4, 16, 
El promedio del arreglo es: 10
*/