import java.util.Scanner;

public class Trabajo4{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir arreglos para almacenar nombres, teléfonos y promedios
        String[] nombres = new String[5];
        String[] telefonos = new String[5];
        double[] promedios = new double[5];
        String[] grado = new String[5];

        // Capturar datos de cada estudiante
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese los datos del estudiante " + (i + 1) + ":");
            System.out.print("Nombre: ");
            nombres[i] = scanner.next();

            System.out.print("Teléfono: ");
            telefonos[i] = scanner.next();

            System.out.print("Grado: ");
            grado[i] = scanner.next();

            System.out.print("Promedio de nota: ");
            promedios[i] = scanner.nextDouble();
        }

        // Mostrar los datos ingresados
        System.out.println("\n Datos de los estudiantes:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Estudiante " + (i + 1) + ":");
            System.out.println("Nombre: " + nombres[i]);
            System.out.println("Teléfono: " + telefonos[i]);
            System.out.println("Grado: " + grado[i]);
            System.out.println("Promedio de nota: " + promedios[i]);
            System.out.println();
        }

        // Calcular y mostrar el promedio general
        double promedioGeneral = calcularPromedioGeneral(promedios);
        System.out.println("Promedio general de notas: " + promedioGeneral);

        // Cerrar el scanner
        scanner.close();
    }

    // Método para calcular el promedio general
    private static double calcularPromedioGeneral(double[] promedios) {
        double suma = 0;

        for (double promedio : promedios) {
            suma += promedio;
        }

        return suma / promedios.length;
    }
}
