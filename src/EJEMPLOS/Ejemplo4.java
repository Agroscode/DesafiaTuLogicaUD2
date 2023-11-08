package EJEMPLOS;

import java.util.Scanner;

public class Ejemplo4 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar 3 números
        System.out.println("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número: ");
        int numero3 = scanner.nextInt();

        // Solicitar al usuario el orden de ordenamiento
        System.out.println("Seleccione el orden de ordenamiento:");
        System.out.println("1. Ascendente (de menor a mayor)");
        System.out.println("2. Descendente (de mayor a menor)");
        int opcion = scanner.nextInt();

        // Ordenar y mostrar los números según la opción seleccionada
        if (opcion == 1) {
            // Ordenar en orden ascendente
            if (numero1 > numero2) {
                int temp = numero1;
                numero1 = numero2;
                numero2 = temp;
            }
            if (numero2 > numero3) {
                int temp = numero2;
                numero2 = numero3;
                numero3 = temp;
            }
            if (numero1 > numero2) {
                int temp = numero1;
                numero1 = numero2;
                numero2 = temp;
            }
            System.out.println("Números en orden ascendente: " + numero1 + ", " + numero2 + ", " + numero3);
        } else if (opcion == 2) {
            // Ordenar en orden descendente
            if (numero1 < numero2) {
                int temp = numero1;
                numero1 = numero2;
                numero2 = temp;
            }
            if (numero2 < numero3) {
                int temp = numero2;
                numero2 = numero3;
                numero3 = temp;
            }
            if (numero1 < numero2) {
                int temp = numero1;
                numero1 = numero2;
                numero2 = temp;
            }
            System.out.println("Números en orden descendente: " + numero1 + ", " + numero2 + ", " + numero3);
        } else {
            System.out.println("Opción no válida. Por favor, seleccione 1 o 2.");
        }
    }
}


