
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Carlos Sánchez
 */
public class CalcularMatrices5 {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int matriz1[][] = new int[3][3];
        int matriz2[][] = new int[3][3];

        //Llenar matrices:
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = r.nextInt(10 - 1) + 1; //Random number from 1 to 10 :)
                matriz2[i][j] = r.nextInt(10 - 1) + 1;
            }
        }
        //Imprimir matrices:
        System.out.println("Matriz 1: ");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(" [ " + matriz1[i][j] + " ] ");
            }
            System.out.println("");
        }

        System.out.println("Matriz 2: ");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(" [ " + matriz2[i][j] + " ] ");
            }
            System.out.println("");
        }

        System.out.println("¿Qué desea hacer? ");
        System.out.println("1.- Sumar matrices");
        System.out.println("2.- Restar matrices");
        System.out.println("3.- Multiplicar matrices");
        int seleccion = sc.nextInt();
        int matrizResultado[][];
        switch (seleccion) {
            case 1:
                matrizResultado = sumarMatrices(matriz1, matriz2);
                System.out.println("Suma de matrices: ");
                imprimirMatriz(matrizResultado);
                break;
            case 2:
                matrizResultado = restarMatrices(matriz1, matriz2);
                System.out.println("Resta de matrices: ");
                imprimirMatriz(matrizResultado);
                break;
            case 3:
                matrizResultado = multiplicarMatrices(matriz1, matriz2);
                System.out.println("Multiplicación de matrices: ");
                imprimirMatriz(matrizResultado);
                break;
            default:
                System.out.println("La opción no existe");
                break;
        }
    }

    private static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int[][] matrizResultado = new int[matriz1.length][matriz1.length];

        for (int i = 0; i < matrizResultado.length; i++) {
            for (int j = 0; j < matrizResultado.length; j++) {
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return matrizResultado;
    }

    private static int[][] restarMatrices(int[][] matriz1, int[][] matriz2) {
        int[][] matrizResultado = new int[matriz1.length][matriz1.length];

        for (int i = 0; i < matrizResultado.length; i++) {
            for (int j = 0; j < matrizResultado.length; j++) {
                matrizResultado[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }

        return matrizResultado;
    }

    private static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
          int[][] matrizResultado = new int[matriz1.length][matriz1.length];
          for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                for (int k = 0; k < matriz1[i].length; k++) {
                    matrizResultado[i][j] += matriz1[i][k] * matriz2[k][j];                    
                }
            }
        }
        return matrizResultado;
    }

    private static void imprimirMatriz(int[][] matrizResultado) {
         for (int i = 0; i < matrizResultado.length; i++) {
            for (int j = 0; j < matrizResultado[i].length; j++) {
                System.out.print(" [ " + matrizResultado[i][j] + " ] ");
            }
            System.out.println("");
        }

    }
}

/*
Ejemplo de ejecución escogiendo la multiplicación:
Matriz 1: 
 [ 7 ]  [ 5 ]  [ 9 ] 
 [ 9 ]  [ 2 ]  [ 4 ] 
 [ 5 ]  [ 6 ]  [ 2 ] 
Matriz 2: 
 [ 9 ]  [ 7 ]  [ 6 ] 
 [ 1 ]  [ 2 ]  [ 1 ] 
 [ 3 ]  [ 7 ]  [ 5 ] 
¿Qué desea hacer? 
1.- Sumar matrices
2.- Restar matrices
3.- Multiplicar matrices
3
Multiplicación de matrices: 
 [ 95 ]  [ 122 ]  [ 92 ] 
 [ 95 ]  [ 95 ]  [ 76 ] 
 [ 57 ]  [ 61 ]  [ 46 ]
*/