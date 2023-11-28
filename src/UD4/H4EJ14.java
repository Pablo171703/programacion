package UD4;

import java.util.Scanner;

public class H4EJ14 {

	public static void main(String[] args) {
		//Definición de constantes
		final int TAMANO=4;
		
		//Declaración
		int[] numeros = new int[TAMANO];
		int numBuscado=0;
		boolean numEncontrado=false;
		int pos=0;
		Scanner entrada= new Scanner(System.in);
		//Que rellene un array con 20 numeros
		for(int i=0;i<TAMANO;i++) {
			System.out.println("Introduce un numero");
			numeros[i]=entrada.nextInt();
		}
		//pedimos un numero
		System.out.println("Introduce el numero a buscar");
		numBuscado=entrada.nextInt();
		do {
			//Si el numero se ha encontrado y es la primera ocurrencia
			if ((numBuscado==numeros[pos])&&(numEncontrado==false)) {
				System.out.println("La posición del numero es:"
					+(pos+1));
				numEncontrado=true;
			}
			pos++;
			//mientras No se encuentre Y no se llegue al final del array
		}while ((numEncontrado==true)&&(pos<TAMANO));
		//en caso de que el numero no se ha encontrado
		if (numEncontrado==false){
			System.out.println("Numero no encontrado");
		}
		
		}
}

		
