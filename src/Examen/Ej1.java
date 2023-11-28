package Examen;

import java.util.Scanner;

public class Ej1 {
	//*Pedir un nº de 5 cifras, se debe controlar, si no lo es se pide de nuevo. Mostar por pantalla si es capicúa o no.

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        int numero;
        do {
            System.out.print("Introduce un número de 5 cifras: ");
            numero = entrada.nextInt();
        } while (!esNumeroDe5Cifras(numero));

        if (esCapicua(numero)) {
            System.out.println("El número " + numero + " es capicúa.");
        } else {
            System.out.println("El número " + numero + " no es capicúa.");
        }
    }

    // Método para verificar si un número tiene 5 cifras
    public static boolean esNumeroDe5Cifras(int numero) {
        return numero >= 10000 && numero <= 99999;
    }

    // Método para verificar si un número es capicúa
    public static boolean esCapicua(int numero) {
        int original = numero;
        int invertido = 0;

        while (numero > 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }
        return original == invertido;
    }

	}
