package UD4;

public class EjemploFunción {
		//funcion principal. Es la UNICA funcion
		//que se ejecuta en un programa
	public static void main(String[] args) {
		int sum=suma(5,4);
		System.out.println(sum);
		sum=suma(9,10);
	}
	//Definimos una función
	// 1. DEfinimos la cabecera
	public static int suma(int a,int b) {
		return a+b; //2. Cuerpo de una función
	}
}
