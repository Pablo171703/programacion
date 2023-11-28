package UD4;
//1. Que rellene un array con los 100 primeros
//números enteros y los muestre en
//pantalla en orden ascendente: 1,2..100.
import java.util.Scanner;

public class H4EJ1 {

	public static void main(String[] args) {
		//
		int[] num = new int[100];
		//
		int numero=1;
		//
		for(int i=0;i<100;i++) {
			num[i]=numero;
			numero++;		
		}
		//
		for (int i=0;i<100;i++) {
			System.out.print(num[i]+" ");
		}
		

	}

}
