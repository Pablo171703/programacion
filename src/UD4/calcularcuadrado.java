package UD4;

import java.util.Scanner;

public class calcularcuadrado {
	// Función para calcular el cuadrado de un número
    public static int calcularCuadrado(int numero) {
        return numero * numero;
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número
        System.out.print("Por favor, ingrese un número: ");
        int numero = scanner.nextInt();

        // Calcular el cuadrado usando la función calcularCuadrado
        int resultado = calcularCuadrado(numero);

        // Mostrar el resultado en pantalla
        System.out.println("El cuadrado de " + numero + " es: " + resultado);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

