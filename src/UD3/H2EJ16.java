package UD3;

import java.util.Scanner;

public class H2EJ16 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int num;
		int i;
		char aste = '*';
		System.out.println("Introduce un numero");
		num = entrada.nextInt();
		for (i= 0; i < num; i++) {
			System.out.print(aste);

		}
	}
}
