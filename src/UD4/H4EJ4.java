package UD4;

public class H4EJ4 {

	public static void main(String[] args) {
		//definimos el array
		int[] numeros;
		//construimos el array
		numeros = new int [50];
		int num = 2;
		for(int i=0;i<50;i++) {
		numeros[i]=num;
		num = num +2;
		}
		//Leer el array
		for (int i=0;i<50;i++) {
			System.out.print(numeros[i]+" ");
		}

	}

}
