package UD4;

import java.util.Scanner;

public class ejemploArrays {
//Que pida 10 notas y muestre la media
//Además deberá mostrar las notas pedidas
	public static void main(String[] args) {
		//Habilito entrada por teclado
		Scanner entrada=new Scanner(System.in);
		//1. Definimos el array de notas
		int [] notas;
		int suma=0;
		//2. Construimos el array de 10 posiciones
		notas=new int[10];
		//3. Metemos 10 notas en el array
		for (int i=0;i<10;i++) {
			System.out.println("Introduce un valor:");
			notas [i]=entrada.nextInt();
			suma=suma+notas[i];
		}
		//4. Las mostramos
		for (int i=0;i<10;i++) {
			System.out.println(notas[i]);
		}
		System.out.println("La media es:"+(suma/10));
	}

}
