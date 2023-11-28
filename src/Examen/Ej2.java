package Examen;

import java.util.Scanner;

public class Ej2 {
	// Programa dos métodos estáticos. Public static boolean esValido(int num), [0,10].Public static void multiplica(int num). Public static main.1) Comprueba num[0,10]; Si no pedir de nuevo. 2) Mostrar tabla multiplicar
	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);

	        int num;

	        do {
	            System.out.print("Ingrese un número entre 0 y 10: ");
	            num = entrada.nextInt();
	        } while (!esValido(num));

	        System.out.println("Tabla de multiplicar del " + num + ":");
	        multiplica(num);
	    }

	    // Método para verificar si un número es válido (entre 0 y 10)
	    public static boolean esValido(int num) {
	        return num >= 0 && num <= 10;
	    }

	    // Método para mostrar la tabla de multiplicar de un número
	    public static void multiplica(int num) {
	        for (int i = 1; i <= 10; i++) {
	            int resultado = num * i;
	            System.out.println(num + " * " + i + " = " + resultado);
	        }
	    }
}
