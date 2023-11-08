package EJEMPLOS;

public class Ejemplo3 {

	public static void main(String[] args) {
        int count = 0;  // Variable para contar los múltiplos
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.println(i);  // Muestra el número que es múltiplo de 2 o 3
                count++;  // Incrementa el contador
            }
        }
        System.out.println("Total de números múltiplos de 2 o 3 entre 1 y 100: " + count);
    }
}