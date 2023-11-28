package UD4;

import java.util.Scanner;

public class leer_5_numeros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int tam;
		System.out.println("Introduce el tamaño del arreglo: ");
		tam = teclado.nextInt();//Definimos el tamaño del arreglo
		int arr[] = new int[tam];//Declaramos un arreglo de tamaño tam
		System.out.println("Ingrese los "+tam+"valores enteros: ");
		for(int i = 0; i < tam; i++)
		{
			arr[i] = teclado.nextInt();//Rellenamos el arreglo
		}
		int aux = 0;
		// Ordenamos los numeros
		for(int j = 0; j < tam; j++)//i=0
		{
			for(int i = 0; i < tam -1; i++)
			{
				if(arr[i]>arr[i+1])
				{
			aux = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = aux;
				}
			}
		}
		int k = 0;
		System.out.println("Numeros ordenados: ");
		while( k < tam)
		{
			System.out.println(arr[k]);
			k++;
		}

	}

}
