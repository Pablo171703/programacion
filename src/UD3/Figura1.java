package UD3;

import java.util.Scanner;

public class Figura1 {
	//*
	//**
	//***
	//****

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int filasLeidas,filaCont=1, numAst=1;
		
		System.out.println("Introduce el numero de "
				+ "filas");
		filasLeidas=entrada.nextInt();
		//recorremos filas
		for(filaCont=1;filaCont<=filasLeidas;filaCont++) {
			//pintamos los asteriscos
			for(numAst=1;numAst<=filaCont;numAst++) {
				System.out.print('*');
			}
			System.out.println();
		}
		

	}

}

