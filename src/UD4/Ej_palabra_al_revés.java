package UD4;

import java.util.Scanner;

public class Ej_palabra_al_revés {

	public static void main(String[] args) {
		//Cte. tamaño array
				final int TAM = 4;
				
				//Habilitar entrada por teclado
				Scanner entrada = new Scanner(System.in);
				//Declarar variables
				char[] palabra = new char[TAM], palabraReves = new char[TAM];
				int i;
				
				//Pedir y leer la palabra
				for(i = 0; i < TAM; i++) {
					System.out.print("Introduce una letra: ");
					palabra[i] = entrada.nextLine().charAt(0);
				}
				
				//Transformar la palabra en su palíndromo
				for(i = 0; i < TAM; i++) {
					palabraReves[i] = palabra [(TAM - 1) - i];
				}
				
				//Imprimir la palabra original
				for(i = 0; i < TAM; i++) {
					System.out.print(palabra[i]);
				}
				System.out.println();
				//Imprimir el palíndromo
				for(i = 0; i < TAM; i++) {
					System.out.print(palabraReves[i]);
				}

	}

}
