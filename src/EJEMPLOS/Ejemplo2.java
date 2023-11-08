package EJEMPLOS;

import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numero;
		
		do {
			System.out.print("Introduce un número positivo: ");
			numero=scanner.nextInt();
			
			if (numero <=0) {
				System.out.println("El número debe ser positivo. Intenta de nuevo");
			}
		} while (numero <=0);
		
		System.out.println("Los primeros 20 números sucesivos a " + numero + " son:");
		for (int n=1; n<=20; n++) {
			System.out.println(numero + n);
		}
	}

}
