package B1;

//Calculadora
//Hacer una calculadora pidiendo 2 datos int al usuario por consola
//Hacer las 4 operaciones Basicas

import java.util.Scanner;

public class Trabajo1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números enteros
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        // Realizar las operaciones y mostrar los resultados
        System.out.println("Suma: " + (numero1 + numero2));
        System.out.println("Resta: " + (numero1 - numero2));
        System.out.println("Multiplicación: " + (numero1 * numero2));

        // Verificar si el segundo número es diferente de cero antes de realizar la división
        if (numero2 != 0) {
            System.out.println("División: " + ((float) numero1 / numero2));
        } else {
            System.out.println("No se puede dividir por cero.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}

